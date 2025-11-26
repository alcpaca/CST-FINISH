package Dragonfly;

import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;
import java.security.spec.ECGenParameterSpec;
import java.util.Arrays;

public class DragonFlyRealV2 {

    // ---------------------------------------------------------
    // Helfer: Bytes → Hex für schöne Ausgabe
    // ---------------------------------------------------------
    static String hex(byte[] data) {
        StringBuilder sb = new StringBuilder();
        for (byte b : data) sb.append(String.format("%02x", b));
        return sb.toString();
    }

    // ---------------------------------------------------------
    // Echter HMAC-SHA256
    // ---------------------------------------------------------
    static byte[] hmac(byte[] key, String msg) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(key, "HmacSHA256"));
            return mac.doFinal(msg.getBytes());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static void sep() { System.out.println("--------------------------------------------------------------------"); }
    static void big() { System.out.println("===================================================================="); }

    // ==========================================================
    // Hauptprogramm
    // ==========================================================
    public static void main(String[] args) throws Exception {

        big();
        System.out.println("                kryptographischer Handshake");
        big();

        // ==========================================================
        // 1. Schlüsselpaar auf einer echten elliptischen Kurve erzeugen
        // ==========================================================
        sep();
        System.out.println("SCHRITT 1: Alice und Bob erzeugen ECC-Schlüsselpaar");
        System.out.println("Erklärung:");
        System.out.println("- Die Kurve 'secp256r1' ist eine echte standardisierte Kurve.");
        System.out.println("- Jeder erzeugt:");
        System.out.println("    privater Schlüssel = große Zufallszahl k");
        System.out.println("    öffentlicher Schlüssel = k * G  (G = Generator-Punkt)");
        sep();

        KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC");
        kpg.initialize(new ECGenParameterSpec("secp256r1")); // echte Kurve

        KeyPair alicePair = kpg.generateKeyPair();
        KeyPair bobPair   = kpg.generateKeyPair();

        PublicKey alicePub = alicePair.getPublic();
        PublicKey bobPub   = bobPair.getPublic();

        PrivateKey alicePriv = alicePair.getPrivate();
        PrivateKey bobPriv   = bobPair.getPrivate();

        System.out.println("Alice PUBLIC key: " + hex(alicePub.getEncoded()));
        System.out.println("Bob   PUBLIC key: " + hex(bobPub.getEncoded()));
        System.out.println();
        System.out.println("→ Diese Punkte liegen auf der elliptischen Kurve.");
        System.out.println();

        // ==========================================================
        // 2. ECDH (Elliptic Curve Diffie-Hellman)
        // ==========================================================
        sep();
        System.out.println("SCHRITT 2: Beide führen ECDH aus");
        System.out.println("Erklärung:");
        System.out.println("- Alice berechnet: kA * (kB * G)");
        System.out.println("- Bob berechnet:   kB * (kA * G)");
        System.out.println("- Mathematisch identisch → beide bekommen denselben Shared Secret");
        sep();

        KeyAgreement aliceKA = KeyAgreement.getInstance("ECDH");
        aliceKA.init(alicePriv);
        aliceKA.doPhase(bobPub, true);
        byte[] aliceSecret = aliceKA.generateSecret();

        KeyAgreement bobKA = KeyAgreement.getInstance("ECDH");
        bobKA.init(bobPriv);
        bobKA.doPhase(alicePub, true);
        byte[] bobSecret = bobKA.generateSecret();

        System.out.println("Alice Shared Secret: " + hex(aliceSecret));
        System.out.println("Bob   Shared Secret: " + hex(bobSecret));
        System.out.println();

        // ==========================================================
        // 3. Confirm Phase via HMAC
        // ==========================================================
        sep();
        System.out.println("SCHRITT 3: Beide erzeugen einen HMAC über das Transcript");
        System.out.println("Erklärung:");
        System.out.println("- Beide Seiten kennen nun denselben geheimen Schlüssel (Shared Secret).");
        System.out.println("- Sie beweisen dies, indem sie denselben HMAC erzeugen.");
        System.out.println("- Transcript enthält wichtige Teile des Handshakes.");
        sep();

        String transcript =
                "AlicePub=" + hex(alicePub.getEncoded()) +
                        "|BobPub="   + hex(bobPub.getEncoded());

        byte[] hmacAlice = hmac(aliceSecret, transcript);
        byte[] hmacBob   = hmac(bobSecret, transcript);

        System.out.println("Transcript: " + transcript);
        System.out.println("Alice HMAC: " + hex(hmacAlice));
        System.out.println("Bob   HMAC: " + hex(hmacBob));
        System.out.println();

        // ==========================================================
        // 4. Vergleich
        // ==========================================================
        sep();
        System.out.println("SCHRITT 4: Vergleich der Confirm-Werte");
        sep();

        if (Arrays.equals(hmacAlice, hmacBob)) {
            System.out.println("Beide HMAC-Werte sind identisch.");
            System.out.println("Beide Seiten besitzen denselben Schlüssel.");
            System.out.println("Handshake erfolgreich abgeschlossen.");
        } else {
            System.out.println("HMAC-Werte unterscheiden sich — Handshake fehlgeschlagen.");
        }

        big();
        System.out.println("ECHTER Handshake abgeschlossen.");
        big();
    }
}