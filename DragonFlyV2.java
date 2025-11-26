package Dragonfly;

public class DragonFlyV2 {

    // ---------------------------------------------------------
    //  Basisparameter (Demo, NICHT echte Kryptographie)
    // ---------------------------------------------------------
    static final int P = 5;   // "Punkt" aus dem Passwort abgeleitet (hier nur eine Zahl)

    // Geheimnisse von Alice
    static final int rA = 6;  // echter Schlüsselanteil von Alice
    static final int mA = 4;  // Tarnzahl von Alice

    // Geheimnisse von Bob
    static final int rB = 3;  // echter Schlüsselanteil von Bob
    static final int mB = 8;  // Tarnzahl von Bob

    // ---------------------------------------------------------
    // Hilfsfunktionen
    // ---------------------------------------------------------
    static int maskedScalar(int r, int m) {
        return r + m;           // s = r + m
    }

    static int maskingElement(int m) {
        return -m * P;          // E = -m * P
    }

    static int publicKeyFromCommit(int s, int E) {
        return s * P + E;       // s * P + E  (Maske hebt sich auf)
    }

    // "Fake-HMAC" für Demo-Zwecke
    static int fakeHMAC(int key, int sA, int EA, int sB, int EB) {
        return (key + sA + EA + sB + EB) % 1000;
    }

    static void separator() {
        System.out.println("------------------------------------------------------------");
    }

    static void bigSeparator() {
        System.out.println("============================================================");
    }

    // ---------------------------------------------------------
    //  Demo-Ablauf
    // ---------------------------------------------------------
    public static void main(String[] args) {

        bigSeparator();
        System.out.println("        Dragonfly / SAE Handshake – einfache Demo");
        bigSeparator();
        System.out.println("Hinweis: Alle Werte sind kleine Ganzzahlen, nur zur Veranschaulichung.");
        System.out.println("P ist hier einfach eine Zahl (im echten Dragonfly: Punkt auf elliptischer Kurve).");
        System.out.println();

        // Schritt 1: Alice und Bob wählen ihre Geheimnisse
        separator();
        System.out.println("SCHRITT 1: Alice und Bob wählen geheime Zahlen (r = Schlüssel, m = Tarnung)");
        separator();

        System.out.println("Alice wählt:");
        System.out.println("  r_A = " + rA + "  (geheimer Schlüsselanteil)");
        System.out.println("  m_A = " + mA + "  (Tarnzahl)");
        System.out.println();

        System.out.println("Bob wählt:");
        System.out.println("  r_B = " + rB + "  (geheimer Schlüsselanteil)");
        System.out.println("  m_B = " + mB + "  (Tarnzahl)");
        System.out.println();

        // Schritt 2: Commit-Werte berechnen
        separator();
        System.out.println("SCHRITT 2: Beide berechnen ihre Commit-Werte (s und E)");
        separator();

        int sA = maskedScalar(rA, mA);
        int EA = maskingElement(mA);

        int sB = maskedScalar(rB, mB);
        int EB = maskingElement(mB);

        System.out.println("Alice berechnet:");
        System.out.println("  s_A = r_A + m_A = " + rA + " + " + mA + " = " + sA);
        System.out.println("  E_A = -m_A * P  = -" + mA + " * " + P + " = " + EA);
        System.out.println();

        System.out.println("Bob berechnet:");
        System.out.println("  s_B = r_B + m_B = " + rB + " + " + mB + " = " + sB);
        System.out.println("  E_B = -m_B * P  = -" + mB + " * " + P + " = " + EB);
        System.out.println();

        System.out.println("Diese Werte werden ausgetauscht:");
        System.out.println("  Alice --> Bob : (s_A, E_A)");
        System.out.println("  Bob   --> Alice : (s_B, E_B)");
        System.out.println();

        // Schritt 3: Öffentliche Schlüsselanteile rekonstruieren
        separator();
        System.out.println("SCHRITT 3: Aus (s, E) wird der öffentliche Schlüsselanteil rekonstruiert");
        separator();

        int pubKeyAlice = publicKeyFromCommit(sA, EA);
        int pubKeyBob   = publicKeyFromCommit(sB, EB);

        System.out.println("Bob erhält von Alice: s_A = " + sA + ", E_A = " + EA);
        System.out.println("Bob berechnet: s_A * P + E_A = " +
                sA + " * " + P + " + " + EA + " = " + pubKeyAlice);
        System.out.println("--> Das entspricht r_A * P (Alices öffentlicher Anteil)");
        System.out.println();

        System.out.println("Alice erhält von Bob: s_B = " + sB + ", E_B = " + EB);
        System.out.println("Alice berechnet: s_B * P + E_B = " +
                sB + " * " + P + " + " + EB + " = " + pubKeyBob);
        System.out.println("--> Das entspricht r_B * P (Bobs öffentlicher Anteil)");
        System.out.println();

        // Schritt 4: Gemeinsamen Schlüssel ableiten
        separator();
        System.out.println("SCHRITT 4: Beide leiten aus den Anteilen den gemeinsamen Schlüssel K ab");
        separator();

        int bobKey   = rB * pubKeyAlice; // K_B = r_B * (r_A * P)
        int aliceKey = rA * pubKeyBob;   // K_A = r_A * (r_B * P)

        System.out.println("Bob berechnet:  K_B = r_B * (r_A * P) = "
                + rB + " * " + pubKeyAlice + " = " + bobKey);
        System.out.println("Alice berechnet: K_A = r_A * (r_B * P) = "
                + rA + " * " + pubKeyBob   + " = " + aliceKey);
        System.out.println();

        System.out.println("Ergebnis:");
        System.out.println("  K_A = " + aliceKey);
        System.out.println("  K_B = " + bobKey);
        System.out.println("--> Beide erhalten denselben gemeinsamen Schlüssel K.");
        System.out.println();

        // Schritt 5: Fake-HMAC als Confirm-Phase
        separator();
        System.out.println("SCHRITT 5: \"Confirm\" – beide berechnen einen Fake-HMAC über alle Werte");
        separator();

        int aliceConfirm = fakeHMAC(aliceKey, sA, EA, sB, EB);
        int bobConfirm   = fakeHMAC(bobKey,   sA, EA, sB, EB);

        System.out.println("Transcript (vereinfacht): (s_A, E_A, s_B, E_B)");
        System.out.println("Fake-HMAC-Funktion: (K + s_A + E_A + s_B + E_B) mod 1000");
        System.out.println();

        System.out.println("Alice berechnet: c_A = " + aliceConfirm);
        System.out.println("Bob   berechnet: c_B = " + bobConfirm);
        System.out.println();

        if (aliceConfirm == bobConfirm) {
            System.out.println("--> Beide Confirm-Werte sind gleich.");
            System.out.println("==> Beide Seiten haben denselben Schlüssel und den gleichen Ablauf gesehen.");
        } else {
            System.out.println("--> FEHLER: Confirm-Werte unterscheiden sich – etwas stimmt nicht.");
        }

        bigSeparator();
        System.out.println("Demo beendet.");
        bigSeparator();
    }
}