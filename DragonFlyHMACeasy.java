package Dragonfly;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;

public class DragonFlyHMACeasy {

    // ---------------------------------------------------------
    //  Basisparameter (Demo, KEINE echte Kryptographie)
    // ---------------------------------------------------------
    static final int P = 5;   // "Punkt" aus Passwort abgeleitet (hier: eine Zahl)

    // Geheimnisse von Alice
    static final int rA = 6;  // Schlüsselanteil
    static final int mA = 4;  // Tarnzahl

    // Geheimnisse von Bob
    static final int rB = 3;
    static final int mB = 8;

    // ---------------------------------------------------------
    // Hilfsfunktionen
    // ---------------------------------------------------------

    // s = r + m
    static int maskedScalar(int r, int m) {
        return r + m;
    }

    // E = -m * P
    static int maskingElement(int m) {
        return -m * P;
    }

    // öffentlicher Anteil = s * P + E  (Maske hebt sich weg)
    static int publicKeyFromCommit(int s, int E) {
        return s * P + E;
    }

    // int -> byte[] (für echten HMAC)
    static byte[] intToBytes(int val) {
        return new byte[] {
                (byte)(val >>> 24),
                (byte)(val >>> 16),
                (byte)(val >>> 8),
                (byte) val
        };
    }

    // echter HMAC-SHA256
    static byte[] realHMAC(int key, String message) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            SecretKeySpec sk = new SecretKeySpec(intToBytes(key), "HmacSHA256");
            mac.init(sk);
            return mac.doFinal(message.getBytes());
        } catch (Exception e) {
            throw new RuntimeException("HMAC Fehler", e);
        }
    }

    // hübsche Hex-Ausgabe
    static String toHex(byte[] data) {
        StringBuilder sb = new StringBuilder();
        for (byte b : data) sb.append(String.format("%02x", b));
        return sb.toString();
    }

    static void sep()    { System.out.println("-----------------------------------------------------------------"); }
    static void bigsep() { System.out.println("================================================================="); }

    // ---------------------------------------------------------
    //  Demo-Ablauf
    // ---------------------------------------------------------
    public static void main(String[] args) {

        bigsep();
        System.out.println("           Dragonfly / SAE – Demo mit echtem HMAC-SHA256");
        bigsep();
        System.out.println("Hinweis: Mathe stark vereinfacht, Fokus auf Protokoll-Ablauf.");
        System.out.println();

        // Schritt 1: Geheimnisse
        sep();
        System.out.println("SCHRITT 1: Alice und Bob wählen geheime Zahlen (r = Schlüssel, m = Tarnung)");
        sep();

        System.out.println("Alice: rA = " + rA + ", mA = " + mA);
        System.out.println("Bob:   rB = " + rB + ", mB = " + mB);
        System.out.println();

        // Schritt 2: Commit-Werte
        sep();
        System.out.println("SCHRITT 2: Beide berechnen Commit-Werte (s und E)");
        sep();

        int sA = maskedScalar(rA, mA);
        int EA = maskingElement(mA);

        int sB = maskedScalar(rB, mB);
        int EB = maskingElement(mB);

        System.out.println("Alice: sA = " + sA + ", EA = " + EA);
        System.out.println("Bob:   sB = " + sB + ", EB = " + EB);
        System.out.println();
        System.out.println("→ Werte werden ausgetauscht.");
        System.out.println();

        // Schritt 3: Öffentliche Schlüsselanteile
        sep();
        System.out.println("SCHRITT 3: Beide rekonstruieren den öffentlichen Anteil des anderen");
        sep();

        // KORREKT: Bob nutzt Alice's Commit (sA, EA)
        int pubKeyAlice = publicKeyFromCommit(sA, EA);

        // KORREKT: Alice nutzt Bob's Commit (sB, EB)
        int pubKeyBob   = publicKeyFromCommit(sB, EB);

        System.out.println("Bob erhält: sA = " + sA + ", EA = " + EA +
                " → berechnet rA*P = " + pubKeyAlice);
        System.out.println("Alice erhält: sB = " + sB + ", EB = " + EB +
                " → berechnet rB*P = " + pubKeyBob);
        System.out.println();

        // Schritt 4: Gemeinsamer Schlüssel
        sep();
        System.out.println("SCHRITT 4: Beide leiten denselben gemeinsamen Schlüssel K ab");
        sep();

        int bobKey   = rB * pubKeyAlice; // rB * (rA * P)
        int aliceKey = rA * pubKeyBob;   // rA * (rB * P)

        System.out.println("Bob berechnet K = rB * (rA * P) = " + bobKey);
        System.out.println("Alice berechnet K = rA * (rB * P) = " + aliceKey);
        System.out.println();

        // Schritt 5: Echter HMAC
        sep();
        System.out.println("SCHRITT 5: Confirm-Phase mit echtem HMAC-SHA256");
        sep();

        String transcript = sA + "," + EA + "," + sB + "," + EB;

        System.out.println("Transcript: \"" + transcript + "\"");
        System.out.println("--> Beiden Seiten benutzen denselben Text und ihren Schlüssel K.");
        System.out.println();

        byte[] cA = realHMAC(aliceKey, transcript);
        byte[] cB = realHMAC(bobKey, transcript);

        System.out.println("Alice HMAC: " + toHex(cA));
        System.out.println("Bob   HMAC: " + toHex(cB));
        System.out.println();

        if (Arrays.equals(cA, cB)) {
            System.out.println("✔ HMACs identisch --> beide besitzen denselben Schlüssel.");
            System.out.println("✔ Protokoll korrekt durchlaufen.");
        } else {
            System.out.println("HMACs unterschiedlich → Fehler im Ablauf.");
        }

        bigsep();
        System.out.println("Demo beendet.");
        bigsep();
    }
}