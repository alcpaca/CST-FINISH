# CST-FINISH
Studienleistung für CST

# 1. Einführung
Kritische Infrastrukturen sind Grundlage für Funktionieren moderner, leistungsfähiger Gesellschaften.
Energie- & Wasserversorgung 
Transport & Verkehr
Informationstechnik & Telekomunikation 

KRITIS Definition nach Bundesregierung: 
>"Kritische Infrastrukturen (KRITIS) sind Organisationen oder Einrichtungen mit wichtiger Bedeutung für das staatliche Gemeinwesen, bei deren Ausfall oder Beeinträchtigung nachhaltig wirkende Versorgungsengpässe, erhebliche Störungen der öffentlichen Sicherheit oder andere dramatische Folgen eintreten würden."

[KRITIS](https://www.bmi.bund.de/DE/themen/bevoelkerungsschutz/schutz-kritischer-infrastrukturen/schutz-kritischer-infrastrukturen-node.html)

### Was ist Infrastruktursicherheit? 
- Schutz kritischer Systeme und Assets vor Bedrohungen (physisch & cyber)
- aus IT-Sicht: Hard-/Softwareressourcen, Endgeräte, Ressourcen im Rechenzentrum, Netzwerksysteme, Cloud-Ressourcen 
- Schutz der Technologierinfrastruktur = Schutz des Unternehmens (weil Unternehmen auf ihre Technologieressourcen angewiesen sind) 
    - z.B. Verlust proprietärer Daten hat gravierende Auswirkungen (= direkt vom Nutzer stammende Daten --> hohe Relevanz & Genauigkeit)
        - proprietäre Daten = Infos, die einer Organisation von ihrer Zielgruppe (Kunden, Besucher, Abonennten, ...) bereitgestellt werden oder mit Einwillingung erfasst werden (direkt) 
  
[proprietäre Daten](https://blog.hubspot.de/marketing/proprietaere-daten);
[Infrastruktursicherheit](https://www.hpe.com/de/de/what-is/infrastructure-security.html)

## Bedrohungsmodelle für IT-Infrastruktur
| **Bedrohungsmodell** | **Funktion** | **Beispiel** |
|:--------------------:|:------------:|:------------:|
| Rogue Devices        | Nicht autorisierte Geräte, die mit einem Netzwerk verbunden werden und ein erhebliches Risiko darstellen | USB-Drop Attack; unbekannte Geräte im LAN; Bots als Kollektiv von Zombies  |
| Routing-Manipulation | Veränderungen/Beeinflussung von Routing-Infos oder -entscheidungen in einem Netzwerk, um Datenverkehr zu manipulieren und zu lenken | Abfangen von Daten (Sniffing); Umgehen von Firewalls |
| Timing-Attacks       | Ausnutzen zeitlicher Unterschiede in Abläufen, um vertrauliche Informationen abzuleiten | Cache-Timing-Attack |
| IoT-Takeover         | Übernahme ungesicherter oder schlecht gesicherter IoT-Geräte | Mirai-Botnet; DDoS |

[Rouge Devices](https://www.prosoft.de/blog/glossar/rogue-device/); 
[Routing-Manipulation](https://de.wikipedia.org/wiki/Routing); 
[Timing-Attack](https://itsecblog.de/timing-angriffe-und-deren-auswirkungen/); 
[IoT-Takeover](https://www.myrasecurity.com/de/knowledge-hub/mirai/)

## Typische Angreiferprofile 
| **Profil** | **Bedeutung/Beispiel** |
| :--------: | :----------: |
| Script Kiddies | Person, die mit wenig Informatikwissen & mit Hilfe von vorgefertigten Sktipten versucht, in fremde Computer eindringt und Schaden anrichtet |
| APTs | Advances Persistent Threat = hochentwickelte, anhaltende Bedrohung, die oft von staatlich gesteuerten Gruppen ausgeführt wird und darauf abzielt sensible Infos zu stehlen oder zu sabotieren |
| IMSI-Catcher-Betreiber | Geräte, die eingesetzt werden, um Mobilfunkgeräte zu identifizieren und Standorte zu verfolgen |
| Nahe-Distanz-Angreifer | durch kritische Bluetooth-Schwachstellen können Angreifer Geräte im nahezu unmittelbaren Umkreis übernehmen, ohne vorherige Paarung oder Zustimmung |
| Nation-State | komplexe Operationen, die von staatlich unterstützten Akteuren gegen andere Regierungen, Organisationen oder Einzelpersonen durchgeführt werden und oft strategische Ziele wie Spionage, Störung oder die Verbreitung politischer Botschaften verfolgen |
| RF-Sniffer | = Gerät/Software, das drahtlose Signale in verschiedenen Frequenzbändern abhört und analysiert |
| Insider | Risiken, die von Personen ausgehen, die innerhalb einer Organisation tätig sind und autorisierten Zugriff auf Netzwerke, Systeme oder sensible Daten haben 

[Script Kiddies](https://www.okta.com/de-de/identity-101/script-kiddie/); 
[APT](https://www.gdata.de/ratgeber/was-sind-eigentlich-advanced-persistent-threats-apts); 
[IMSI-Catcher](https://www.sea-gmbh.com/produkt/imsi-catcher-detektor/); 
[Nahe-Distanz-Angreifer](https://www.crowdstrike.com/de-de/cybersecurity-101/cyberattacks/common-cyberattacks/); 
[Nation-State](https://de.isms.online/cyber-security/how-nation-state-attacks-are-shaping-cybersecurity/); 
[RF-Sniffer](https://www.kismetwireless.net/); 
[Insider](https://www.fortinet.com/de/resources/cyberglossary/insider-threats)

## Überblick über Funktechnologien
| **Funktechnologie** | **Definition** |
| :--------: | :----------: |
| LTE | = Long Term Evolution ist ein Mobilfunkstandard der 4. Generation & basiert ausschließlich auf dem Internet-Protokoll (IP): sämtliche Daten werden in IP-Pakete verpackt --> vereinfachte Netzwerkarchitektur |
| 5G | ist eine Weiterentwicklung des LTE, es nutzt eine neue Schnittstelle und ein modernes Kernnetzwerk. Sie arbeitet mit höheren Frequenzen und bietet mehr Bandbreite --> schnellere Datenübertragungsraten |
| WLAN | = Wireless Local Area Network, ist ein drahtloses lokales Netzwerk, das die Kommunikation zwischen Geräten über Funkwellen ermöglicht, ohne physische Kabelverbindungen zu benötigen |
| Bluetooth | ist Industriestandard für drahtlose Übertragung über kurze Distanzen und basiert auf IEEE 802.15.1 Standard. Hauptzweck ist Ersetzen von Kabeln 

[LTE](https://www.elektronik-kompendium.de/sites/kom/1608191.htm); 
[5G](https://www.fortinet.com/de/resources/cyberglossary/what-is-5g); 
[WLAN](https://ausbildung-in-der-it.de/lexikon/wlan); 
[Bluetooth](https://www.conrad.de/de/ratgeber/buero-vernetzung/kommunikationsstandards/bluetooth.html)

# 2. Grundlagen der Netzwerksicherheit 
## OSI-Modell 
= von international Organization for Standardization entwickeltes konzeptionelles Modell, das es verschiedenen Systemen ermöglicht, über Standardprotokolle zu kommunizieren. 
- kann als universelle Sprache für Computervernetzung gesehen werden 
- basiert auf Konzept der Aufteilung eines Kommmunikationssystems in 7 abstrakte Ebenen 
- jede Ebene hat bestimmte Funktionalität und kommuniziert mit den umliegenden Schichten 

### Wiederholung der 7 Layer des OSI-Modells 
1. **Application Layer**
- einzige Ebene, die mit Userdaten interagiert 
- Softwareanwendungen verlassen sich auf bei Einleitung der Kommunikation auf die Anwendungebene 
- Client-Softwareanwendungen sind kein Teil des Application Layers --> das Layer ist für Protokolle und Datenmanipulationen verantwortlich 
- es gehören HTTP, SMTP zur Anwendungebene 
2. **Presentation Layer**
- Daten so aufzubereiten, dass die vom Application Layer verabreitet werden können 
- für Übersetzung, Verschlüsselung und Komprimierung von Daten verantwortlich 
- Komprimierung der Daten, die vom Application Layer kommen um diese an Layer 5 weiterzuleiten (Effizienz, Geschwindigkeit, Menge) 
3. **Session Layer**
- Öffnen und Schließen der Kommunikation zwischen beiden Geräten 
 - Zeit zwischen Öffnen und Schließen = Session 
 - Sicherstellung, dass Session lang genug offen bleibt, um alle Daten zu übertragen 
 - Synachronisation mit Chackpints: z.B. bei Übertragung von 100mB kann alle 5mB ein Checkpoint gesetzt werden, so dass nach einem Absturz vom letzten Checkpoint weiterübertragen werden kann 
4. **Transport Layer**
 - End-to-End Kommunikation 
 - Daten vom Session Layer in Segmente teilen, um sie an Layer 3 zu senden 
 - Transport Layer des Empfangsgeräts setzt sie Segments wieder zusammen 
 - für Fluss- und Fehlersteuerung zuständig
 - bestimmung der optimalen Übertragungsgeschwindigkeit, dass ein schneller Sender einen langsamen nicht überfordert
 - Sicherstellung der Vollständigkeit der Daten (sonst Anfrage auf erneute Übertragung)
- Protokolle: TCP, UDP
5. **Network Layer**
- Erleichterung des Datenstransfers zwischen zwei Netzwerken 
- teilt Segmente der Transportebene in kleinere Einheiten (Pakete) und fügt sie auf Empfängergerät wieder zusammen 
- es wird der beste physikalische Pfad genutzt = Routing 
6. **Data Link Layer**
- ähnlich der Vermittlungsebene, nur erleichtert sie Datentransfer im *selben* Netzwerk
- Sicherungsebene nimmt Pakete von der Vermittlungsebene und zerlegt sie in Frames 
- Fluss- & Fehlerkontrolle in der netzinternen Kommunikation 
7. **Physical Layer**
- beinhaltet die physikalischen Geräte (Kabel, Switches)
- Daten in einen Bitstrom umwandeln 
Damit (für Menschen lesbare) Daten über ein Netzwerk von Sender zum Empfänger übertragen werden können, müssen die Daten die 7 Layer durchlaufen.

[OSI-Layer WDH](https://www.cloudflare.com/de-de/learning/ddos/glossary/open-systems-interconnection-model-osi/)

### Sicherheitsprobleme pro Layer
| OSI-Schicht | Typisches Sicherheitsproblem | Kurz erklärt |
|:-----------:|:----------------------------:|:------------:|
| **1. Bitübertragungsschicht** | Abfangen von Signalen | Kabel/Funk wird heimlich mitgehört |
| | Jamming | Funksignale werden gestört |
| | Physische Manipulation | Gerät wird beschädigt oder verändert |
| | Unbefugter Zugang | Angreifer kommt an Hardware ran |
| **2. Sicherungsschicht** | MAC-Spoofing | Gerät gibt falsche Identität vor |
| | ARP-Spoofing | Falsche Zuordnungen im Netzwerk werden erzeugt |
| | CAM-Overflow | Switch wird überlastet und unsicher |
| | VLAN-Hopping | Angreifer springt in fremde Netzbereiche |
| **3. Netzwerkschicht** | IP-Spoofing | Gefälschte Absenderadresse |
| | Routing-Manipulation | Falsche Wege für Daten eingeschleust |
| | DDoS | Server mit Anfragen überflutet |
| | Fragmentation-Attack | Datenpakete werden missbraucht |
| | ICMP-Missbrauch | Netzwerkdiagnose wird als Angriff genutzt |
| **4. Transportschicht** | SYN-Flood | Verbindungen halb geöffnet, Server blockiert |
| | Session-Hijacking | Sitzung wird übernommen |
| | Port-Scanning | Offene Türen im System gesucht |
| | UDP-Flooding | Server mit UDP-Paketen überladen |
| | TLS/SSL-Probleme | Verschlüsselung falsch umgesetzt |
| **5. Sitzungsschicht** | Session-Hijacking | Sitzung eines Users geklaut |
| | Session-Fixation | Alte Sitzungs-ID wird erzwungen |
| | Schwache Session-IDs | Leicht zu erraten oder zu stehlen |
| | Unverschlüsselte Sitzungen | Daten können abgefangen werden |
| **6. Präsentationsschicht** | Unsichere Formate | Fehler in Dateien nutzbar |
| | Schwache Verschlüsselung | Daten leicht aufzubrechen |
| | Encoding-Angriffe | Filter durch Sonderzeichen umgangen |
| | Deserialization-Attacks | Präparierte Objekte verursachen Schaden |
| **7. Anwendungsschicht** | SQL Injection | Datenbank-Befehle eingeschleust |
| | XSS | Schadcode in Webseiten eingeschleust |
| | CSRF | Nutzer wird zu ungewollten Aktionen gebracht |
| | Command Injection | Betriebssystembefehle eingeschleust |
| | Broken Access Control | Zugriffssperren funktionieren nicht |
| | Unsichere APIs | Schnittstellen leicht angreifbar |
| | Auth-Fehler | Login/Passwort-Systeme unsicher |
| | DNS-Angriffe | Verkehr auf falsche Seiten umgeleitet |--: | :----------: |
| 

[Sicherheitsprobleme in den Schichten](https://medium.com/%40kavib/security-challenges-across-network-layers-osi-model-d03d5d187c7); 
[Sicherheit in den Schichten 5,6,7](https://vercara.digicert.com/resources/osi-model?); 
[Angriffe auf Schicht 7](https://www.qrcsolutionz.com/blog/understanding-osi-from-security-view-application-layer?);
[typische Angriffsarten auf alle Schichten](https://www.stackscale.com/blog/osi-model/?)

## Relevante Angriffsarten 
### MitM - Man in the Middle
= Angriffsform in Rechnernetzen, bei der ein Angreifer sich zwischen zwei Kommunikationspartner positioniert und Daten abfängt, einsieht oder manipuliert 
#### Beispiel
A und R unterhalten sich, E möchte unbemerkt mithören. E sagt A, sie sei R. A ist nun der Meinung sie spricht mit R, obwohl sie mit E das gespräch freigibt. E könnte Informationen sammeln, Antworten ändern und diese an R leiten, der denkt er würde mit A sprechen. 
#### Arten von MitM-Angriffen 
| MitM-Angriff | Kurzbeschreibung |
|:------------:|------------------|
| **Rogue Access Point** | Angreifer stellt eigenen WLAN-AP (Access Point) bereit, Geräte verbinden sich automatisch → kompletter Datenverkehr abfangbar. |
| **ARP Spoofing** | Angreifer täuscht falsche MAC-Adresse vor → Datenverkehr zwischen Geräten wird umgeleitet. |
| **mDNS Spoofing** | Falsche lokale Namensauflösung per mDNS → Geräte verbinden sich mit Adresse, die der Angreifer kontrolliert. |
| **DNS Spoofing** | Manipulierte DNS-Antworten → Opfer wird auf gefälschte Webseiten/Server umgeleitet. |
#### MitM-Angriffsmethoden 
| Angriff | Kurzbeschreibung |
|:-------:|------------------|
| **Sniffing** | Pakete werden mitgelesen, indem das Gerät in den Promiscuous-/Monitor-Modus versetzt wird. |
| **Paketinjektion** | Angreifer schleust manipulierte Pakete in den Datenfluss ein, die wie legitime Kommunikation aussehen. |
| **Session Hijacking** | Sitzungs-Token eines Nutzers wird abgefangen und der Angreifer übernimmt die laufende Sitzung. |
| **SSL Stripping** | HTTPS-Verbindung wird auf HTTP herabgestuft, damit Daten unverschlüsselt abgefangen werden können. |

[Man in the Middle](https://www.rapid7.com/de/cybersecurity-grundlagen/man-in-the-middle-attacks/)

### Replay
Ein Replay Attack ist ein Angriff, bei dem ein Angreifer zuvor abgefangene Daten — meist Authentifizierungsdaten — exakt wieder abspielt, um sich als jemand anderes auszugeben. Dadurch kann er sich unberechtigt Zugang verschaffen.
| Beispiel | Kurzbeschreibung |
|:--------:|------------------|
| **Funkfernbedienungen (Auto, Garage, Alarmanlage, etc.)** | Aufgezeichnetes Funksignal wird erneut abgespielt, um Türen/ Geräte zu öffnen – funktioniert bei Systemen mit Static-Code. |
| **WLAN (Deauthentication)** | Gesniffte Deauth-Pakete werden wiederholt an den Router gesendet, um Clients aus dem WLAN zu werfen. |
| **Sprachsteuerung (Smart Speaker, IoT)** | Aufgenommene Sprachbefehle wie „Alexa, öffne die Haustür“ werden abgespielt, um Geräte oder Türen zu steuern. |
| **GPS** | Gespeicherte GPS-Signale werden wiedergegeben, um falsche Positionen oder Routen vorzutäuschen. |

[Replay](https://it-forensik.fiw.hs-wismar.de/index.php/Replay_Attack)

### Downgrade
Downgrade Angriffe nutzen Systemschwachstellen und zwingen das System veraltete Protokolle zu nutzen um Daten zu klauen oder sogar das gesamte System zu übernehmen 
Angreifer nutzen Schwachstellen in diesen veralteten Protokollen aus 
#### Wie funktioniert ein Downgrade Angriff? 
Der Angreifer positioniert sich zwischen Client und Server (MITM).
Während des TLS/SSL-Handshakes manipuliert er die Liste der verfügbaren Protokolle und Cipher Suites.
Sichere Optionen werden entfernt, sodass der Browser glaubt, nur veraltete oder schwache Verschlüsselung sei verfügbar.
Der Client wählt deshalb eine unsichere Variante (z. B. SSL 3.0, Export-RSA, schwache DH-Parameter).
Die Verbindung bleibt äußerlich funktionsfähig, ist jedoch leicht angreifbar.
    - Der Angreifer kann danach Daten entschlüsseln, mitlesen oder verändern.
| Angriff | Beschreibung | Ziel / Schwachstelle | Schutzmaßnahme |
|--------|--------------|----------------------|----------------|
| **POODLE** | Downgrade-Angriff auf SSL 3.0; ermöglicht Entschlüsselung sensibler Daten. | Padding-Schwäche in SSL 3.0 | SSL 3.0 deaktivieren; nur TLS 1.2/1.3 nutzen. |
| **FREAK** | Erzwingt Nutzung schwacher „Export-RSA“-Schlüssel; Angreifer kann sie faktorisieren. | Alte Export-RSA-Verschlüsselung | Export-Cipher deaktivieren; moderne TLS-Konfiguration. |
| **SLOTH** | Erzwingt verkürzte Hash-Funktionen wie MD5/SHA-1; ermöglicht Kollisionen. | Schwache / veraltete Hash-Algorithmen | Starke Hashes wie SHA-256+ nutzen; alte Algorithmen deaktivieren. |
| **Logjam** | Downgrade auf schwache Diffie-Hellman-Parameter; Angreifer berechnet diskreten Logarithmus. | Schwache DH-Primzahlen / DHE_EXPORT | Starke DH-Parameter, keine Export-DHE-Cipher, Updates einspielen. |
| **BEAST** | Angriff auf CBC-Modus in SSL/TLS; ermöglicht Cookie-Entschlüsselung. | CBC-Schwachstelle in alten TLS-Versionen | Systeme aktualisieren; moderne Verschlüsselungsmodi nutzen. |

[Downgrade](https://www.ssldragon.com/de/blog/was-ist-downgrade-angriff/)

### Jamming
Störung der drahtlosen Kommunikation eines Kommunikationskanals mit unterwünschten Signalen
- Jamming Angriffe senden Störsignale auf der selben Frequenz wie legitime Kommunikation 
- Folgen: Verbindungsabbrüche, langsame Datenraten, vollständiger Kommunikationsverlust
- Typen von Störsendern: 
    - **Hardware-Störsender**: einfache Geräte für feste Frequenzbereiche
    - **SDR-basierte Störsender**: flexibel, können mehrere Frequenzen gleichzeitig stören
- Risiken besonders für kritische Infrastrukturen (Flugsicherung, Notdienste, Energienetze)
- Können auch genutzt werden, um Daten abzufangen oder Sicherheitsmechanismen zu umgehen.
- Gegenmaßnahmen:
    - **Frequenzsprungverfahren (FHSS)**: regelmäßiges Wechseln der Frequenz.
    - **Spreizspektrumtechniken (DSSS)**: Verteilen des Signals über breite Frequenzbereiche

[Jamming](https://cctv-check.de/wissensdatenbank/jamming/)

## Kryptographie in Infrastrukturprotokollen 
Kryptographisceh Protokolle sind entscheident für die Sicherheit von IT-Infrastrukturen. Sie gewährleisten Vertraulichkeit, Integrität und Authentizität von Daten. 
Sie werden in verschiedenen Netzwerkprotokollen eingesetzt, um sichere Kommunikation über unsichere Netzwerke zu ermöglichen. 
Wichtigeste kryptographische Protokolle: **Transport Layer Security (TLS), Internet Protocol Security (IPsec), Secure Shell (SSH)**

[Kryptographie](https://www.elektronik-kompendium.de/sites/net/0908071.htm)
### Symmetrische Kyrptographie
**Grundprinzip:** es wird ein einziger gemeinsamer Schlüssel zum Ver- und Entschlüsseln verwendet. Diese Verfahren sind schnell und sicher, wenn der Schlüssel lang genug ist.
**Hauptproblem: der Schlüsselaustausch**
Bevor Daten ausgetauscht werden können, müssen sich beide Parteien auf einen gemeinsamen Schlüssel einigen. Dabei entstehen Risiken: 
- wenn der Schlüssel über den selben Kommunikationskanal versendet wird wie die Daten später, kann ein Angreifer ihn stehlen (MitM)
- hat ein Angreifer den Schlüssel, kann er Daten lesen oder gefälschte Nachrichten verschlüsseln 
- unischere Aufbewahrung erhöht auch das Risiko 

Sichere Übergabe gelingt nur, wenn der Schlüssel auf einem anderen Weg übermittelt wird – etwa persönlich oder per Brief (Email ist ungeeignet)<br>
--> Da die sichere Übergabe heute schwer ist, werden meißt mehrere Verfahren kombiniert (symmetrisch & asymmetrisch)

#### Moderne symmetrische Verfahren
- XOR-Verknüpfung (häufig verwendete Basisoperation)
- Permutation (Bits werden umgeordnet)
- Substitution (Bits werden durch andere ersetzt)
diese Schritte werden zu mehreren Runden kombiniert, wodurch eine sehr starke Verschlüsselung entsteht

#### Angriffe auf symmetrische Verschlüsselung

| Angriff | Kurzbeschreibung |
|:--------:|------------------|
| Ciphertext-Only-Angriff | Nur der Geheimtext ist bekannt –  klassischer Rateversuch |
| Known-Plaintext-Angriff | Teile des Klartexts sind bekannt |
| Chosen-Plaintext-Angriff | Angreifer kann Klartexte auswählen und die passenden Geheimtexte erhalten, um daraus Rückschlüsse auf den Schlüssel zu ziehen |

[Symmetrische Kryptographie](https://www.elektronik-kompendium.de/sites/net/1910101.htm)

### Asymmetrische Kryptographie 
**Grundidee:** Bei asymmetrischen Verfahren gibt es zwei Schlüssel, die zusammengehören:
- **Öffentlicher Schlüssel (Public Key):** darf jeder kennen
- **Privater Schlüssel (Private Key):** muss geheim bleiben<br>
Was mit dem öffentlichen Schlüssel verschlüsselt wird, kann nur der private Schlüssel entschlüsseln.

**Wie funktioniert das in der Praxis?**<br>
Der Sender holt sich den öffentlichen Schlüssel des Empfängers.
Damit verschlüsselt er die Daten.
Nur der Empfänger kann die Nachricht lesen, weil nur er den privaten Schlüssel besitzt.
Wird der private Schlüssel gestohlen ist ein neues Schlüsselpaar nötig.

**Hauptproblem: Verteilung der öffentlichen Schlüssel**<br>
Man muss sicherstellen, dass der erhaltene öffentliche Schlüssel wirklich zum gewünschten Kommunikationspartner gehört.
Identitätsprüfung ist entscheidend.

**Rechenaufwand**<br>
Asymmetrische Verfahren sind sehr langsam.
Beispiel: RSA ist etwa 1000-mal langsamer als AES.
Deshalb werden sie meist nur zum Austausch von Schlüsseln eingesetzt, nicht für die eigentliche Datenverschlüsselung.

**Warum funktionieren asymmetrische Verfahren?**<br>
Die Sicherheit basiert auf Einwegfunktionen:
- In eine Richtung einfach zu berechnen
- In die andere Richtung extrem schwer umzudrehen
- Wichtige mathematische Grundlagen:
    - **Faktorisierungsproblem:** Produkt zweier großer Primzahlen ist leicht zu berechnen, aber extrem schwer wieder in die Faktoren zu zerlegen.
    - **Diskreter Logarithmus:** Vorwärts leicht, rückwärts praktisch unmöglich.<br>
Diese Probleme sorgen dafür, dass ein Angreifer die Verschlüsselung nicht einfach rückgängig machen kann.

#### Angriffe auf asymmetrische Verschlüsselung
| Angriff | Kurzbeschreibung |
|:--------:|------------------|
| Public-Key-Only-Angriff | Angreifer hat den öffentlichen Schlüssel und kann zumindest verschlüsseln |
| Chosen-Ciphertext-Angriff | Angreifer schickt manipulierte Daten zum Entschlüsseln |
| Shor-Algorithmus | Quantencomputer könnten RSA, Diffie-Hellman und ECC eines Tages brechen |

[asymmetrische Kryptographie](https://www.elektronik-kompendium.de/sites/net/1910111.htm)

### AEAD - Authenticated Encryption with Associated Data
Ist ein kryptografisches Verfahren, das sowohl Vertraulichkeit als auch Authentizität und Integrität von Daten sicherstellt

**Wie funktioniert AEAD?**<br>
AEAD erhält Eingaben in mehreren Teilen:
- Klartext: Die eigentlichen Daten, die verschlüsselt werden sollen.
- AAD (Associated Authenticated Data): Zusatzinformationen, die nicht verschlüsselt, aber mitgeschützt werden. **Beispiele:** Header einer Nachricht, Protokollinformationen, IP-Adressen.
- Nonce / IV: Ein Wert, der sicherstellt, dass jede Verschlüsselung einzigartig bleibt.
- Schlüssel: Symmetrischer Schlüssel, wie bei AES.

Das Ergebnis besteht aus:<br>
- **Ciphertext:** Verschlüsselte Daten.
- **Authenticity Tag (MAC / Tag):** Prüfsumme, die nachweist, dass Daten und AAD unverändert sind.

**Wichtig:**<br>
Wenn die Integritätsprüfung (Tag) fehlschlägt, wird nichts entschlüsselt → Schutz vor Manipulation.

## Network Segmentation 
Ist eine Sicherheitsstrategie, bei der ein großes Netzwerk in kleinere, seperate Abschnitte (Subnetzt oder Segmente) unterteilt wird, um die Ausbreitung von Sicherheitsverletzungen zu stoppen. 
Jedes Segment ist eigenständiges Netzwerk mit eigenen Sicherheitsrichtlinien und Protokollen.

**Vorteile der Netzwerksegmentierung**
- bessere Sicherheit 
    - Stoppt Ausbreitung von Angriffen 
    - Schützt kritische Daten 
    - Steigert zero Trust
    - Reduziert Risiko 
- Einfachere Einhaltung der Vorschriften 
    - Erfüllung der Vorschriften 
    - Ressourcenersparnis 
- Steigert Netzwerkleistung 
    - besserer Verkehrsfluss
    - schnellere Reaktionszeiten 
    - intelligente Ressourcennutzung 
- einfachere Verwaltung 
    - schnellere Wiederherstellung 
    - bessere Überwachung
    - mehr Kontrolle 
- reduziertes Risiko von lateralen Bewegungen 
    - stoppt Ausbreitung von Malware 
    - sorgt für die Sicherheit von Legacy-Systemen 
    - schützt IoT-Geräte 
- Skalierbarkeit und Flexibilität
    - Funktioniert mit verschiedenen Umgebungen 

[Network Segmentation](https://www.illumio.com/de/cybersecurity-101/network-segmentation)

## Least Privilege
Ist ein zentrales Konzept der Cybersicherheit, das besagt, dass Benutzern nur die Zugriffsrechte eingeräumt werden sollten, die für die Ausübung ihrer spezifischen Aufgaben unbedingt erforderlich sind

**Vorteile des Least Privilege Prinzips**<br>
- Minimierung der Angriffsfläche 
- Senkung des Risikos für Malware-Angriffe
- Verbesserung des betrieblichen Effizienz
- Schutz vor Insiderbedrohungen 

[Least Privilege](https://www.paloaltonetworks.de/cyberpedia/what-is-the-principle-of-least-privilege)

## Zero Trust für Netz- und Infrastrukturbereiche
Zero Trust ist ein Sicherheitskonzept, das davon ausgeht, dass nichts und niemand innerhalb oder außerhalb eines Netzwerks grundsätzlich vertrauenswürdig ist, und daher jeder Zugriff auf Ressourcen stets authentifiziert, autorisiert und kontinuierlich validiert werden muss

**Warum braucht man Zero Trust?**<br>
Frühere Sicherheitsmodelle haben versucht, das Unternehmen durch einen starken äußeren Schutzwall zu sichern.
Problem dabei:<br>
- Innerhalb des Netzwerks wurde automatisch vertraut.
- Gelang ein Angreifer einmal hinein, konnte er sich leicht seitlich ausbreiten und großen Schaden anrichten.
- Interne Bedrohungen und kompromittierte Geräte wurden oft nicht erkannt.

**Was macht Zero Trust anders?**<br>
Zero Trust geht immer vom Schlimmsten aus:
Jeder Benutzer, jedes Gerät und jede Anwendung könnte kompromittiert sein.

Daher gilt:<br>
- Zugriff wird erst nach Prüfung gewährt („never trust, always verify“).
- Schutz wird nicht nur außen aufgebaut, sondern direkt um sensible Ressourcen (Mikroperimeter).
- Laterale Bewegungen im Netzwerk werden stark eingeschränkt.
- Die Angriffsfläche wird deutlich reduziert.

**Wie setzt man Zero Trust um?**<br>
Segmentierung:<br>
- Der Zugriff wird in viele kleine, klar kontrollierte Bereiche aufgeteilt. Nur wer wirklich berechtigt ist, kommt hinein.

[Zero Trust](https://www.akamai.com/de/glossary/what-is-zero-trust-network)

## Logging, Monitoring & SIEM 
**Logging:** Sammeln von Ereignissen wie Anmeldeversuchen, Dateiänderungen, Netzwerkaktivitäten oder Konfigurationsänderungen.<br>
**Monitoring:** Überwachen und Auswerten dieser Daten, oft in Echtzeit, um verdächtige Aktivitäten früh zu erkennen.<br>

**Warum ist das wichtig?**
- Angriffe werden immer ausgefeilter – ohne Logs bleiben sie oft unbemerkt.
- Logs helfen, Angriffe schnell zu erkennen und Schäden zu begrenzen.
- Sie dienen der Forensik (z. B. zur Rekonstruktion eines Vorfalls).
- Viele Gesetze und Standards verlangen eine ordentliche Protokollierung (z. B. ISO 27001, GDPR).

**Wie funktioniert es?**
1. Ereignisse erfassen: Daten aus Servern, Endgeräten, Netzwerkkomponenten, Cloud-Diensten usw.
2. Zentral speichern: Manipulationssicher und oft verschlüsselt.
3. Analysieren & korrelieren: Muster erkennen, Anomalien aufspüren, oft mit KI-Unterstützung.
4. Alarmieren: Sicherheitsverantwortliche sofort informieren.
5. Reporting: Regelmäßige Auswertungen zur Verbesserung der Sicherheitsstrategie.<br>

**Wo wird es eingesetzt?**<br>
In fast allen IT-Umgebungen – Unternehmen, Behörden, Gesundheitswesen, Finanzwelt. Besonders hilfreich bei komplexen Netzwerken und kritischen Daten.<br>

**Best Practices**
- Zentrale Log-Sammlung (z. B. über SIEM-Systeme).
- Vollständige, manipulationssichere Protokollierung.
- Klare Aufbewahrungsfristen.
- Automatisierte Alarmierung und regelmäßige Auswertung.

**Herausforderungen**
- Sehr große Datenmengen effizient speichern und auswerten.
- Systeme müssen skalierbar sein und selbst vor Manipulation geschützt werden.
- Kontinuierliche Anpassung an neue Bedrohungen.

[Logging & Monitoring](https://www.sectepe.de/glossar/security-logging-monitoring)

### SIEM - Security Information and Event Management
Ist eine umfassende Cybersecurity-Lösung, die es Unternehmen ermöglicht, Sicherheitsvorfälle effizient zu erkennen, zu analysieren, darauf zu reagieren und Compliance-Anforderungen zu erfüllen<br>
Es kombiniert zwei Bereiche:
- **SIM (Security Information Management):** sammelt und speichert Log-Daten langfristig – wichtig für Forensik & Compliance.
- **SEM (Security Event Management):** überwacht Ereignisse in Echtzeit – erkennt Anomalien und alarmiert sofort.
<br>
Zusammen ergeben sie ein umfassendes System zur Überwachung und Analyse der gesamten IT-Umgebung.<br>

**Wie funktioniert SIEM?**<br>
**Ein SIEM-System:**
- sammelt Log-Daten aus allen relevanten Quellen (Server, Endgeräte, Cloud, Netzwerk, Anwendungen).
- korreliert & analysiert diese Daten in Echtzeit, oft mit KI-Unterstützung.
- erkennt ungewöhnliches oder schädliches Verhalten (z. B. viele fehlgeschlagene Logins).
- alarmiert sofort bei Verdacht auf einen Sicherheitsvorfall.
- unterstützt die Reaktion auf Angriffe durch automatisierte oder manuelle Maßnahmen.
- erstellt Berichte, z. B. für ISO 27001 oder andere Compliance-Vorgaben.

**Vorteile von SIEM:**
- Echtzeit-Erkennung von Bedrohungen
- Fortgeschrittene Analyse durch KI
- Erkennen interner & externer Angriffe
- Schnelle Reaktion bei Vorfällen
- Zentrale Sicht auf die gesamte IT
- Langzeit-Analysen & Forensik
- Unterstützung bei Compliance
- Verarbeitung großer Datenmengen

**Herausforderungen:**
- Aufwendige Implementierung und Konfiguration
- Hohe Datenmengen und mögliche Überlastung
- Kosten für Betrieb und Pflege
- Risiko von Fehlalarmen (False Positives/Negatives)
- Erfordert gut geschultes Sicherheitspersonal

**Ausblick**<br>
Moderne SIEM-Systeme setzen verstärkt auf künstliche Intelligenz, um Bedrohungen schneller und genauer zu erkennen.
Mit wachsender Cloud-, IoT- und Mobile-Nutzung muss SIEM künftig noch größere und vielfältigere Datenmengen verarbeiten. KI wird hierbei eine Schlüsselrolle spielen.

[SIEM](https://evoila.com/de/ratgeber/security/siem/)

# 3. WLAN-Sicherheit 
## 3.1 Architektur & Standards
### 802.11 a/b/g/n/ac/ax Überblick
| Standard        | Erscheinungsjahr | Frequenzband(e)            | Maximale Datenrate     | Merkmale |
|-----------------|------------------|-----------------------------|-------------------------|----------|
| **IEEE 802.11a** | 1999             | 5 GHz                       | bis 54 Mbit/s           | - Weniger überfülltes 5-GHz-Band → geringere Interferenzen<br>- Höhere Geschwindigkeit als 802.11b<br>- Kürzere Reichweite & schlechtere Hindernisdurchdringung<br>- Geringe Kompatibilität mit älteren 2,4-GHz-Geräten |
| **IEEE 802.11b** | 1999             | 2,4 GHz                     | bis 11 Mbit/s           | - Weit verbreitet & kompatibel<br>- Größere Reichweite, aber langsam<br>- Anfällig für Interferenzen (Mikrowellen, Bluetooth)<br>- Sehr günstige Hardware |
| **IEEE 802.11g** | 2003             | 2,4 GHz                     | bis 54 Mbit/s           | - Kombiniert 802.11a-Geschwindigkeit mit 802.11b-Reichweite<br>- Rückwärtskompatibel zu 802.11b<br>- Anfällig für 2,4-GHz-Interferenzen<br>- Gute Heimnutzer-Lösung ohne neue Hardware |
| **IEEE 802.11n** | 2009             | 2,4 & 5 GHz (Dualband)      | bis 600 Mbit/s          | - MIMO-Technologie<br>- Deutlich höhere Geschwindigkeit & Reichweite<br>- Kanalbündelung (40 MHz)<br>- Rückwärtskompatibel mit a/b/g |
| **IEEE 802.11ac** | 2013            | 5 GHz                       | bis 6,9 Gbit/s          | - Wi-Fi 5<br>- MU-MIMO, verbessertes MIMO<br>- Breitere Kanäle (80/160 MHz)<br>- Beamforming<br>- Kein 2,4-GHz-Support (aber häufig in Dualband-Routern) |
| **IEEE 802.11ax** | 2019            | 2,4 & 5 GHz (plus 6 GHz bei Wi-Fi 6E) | bis 9,6 Gbit/s | - Wi-Fi 6 / Wi-Fi 6E<br>- OFDMA für effizientere Kanalnutzung<br>- Energiesparfunktion TWT<br>- Sehr gut für hohe Gerätedichten<br>- Rückwärtskompatibel, aber optimale Leistung mit Wi-Fi-6-Geräten |

- Frequenzbänder
    - 2,4 GHz: Große Reichweite, aber relativ langsam und stark störanfällig (z. B. durch Bluetooth oder Mikrowellen).
    - 5 GHz: Schneller und stabiler, da weniger Geräte dieses Band nutzen – jedoch geringere Reichweite.
    - 6 GHz: Sehr schnell und kaum ausgelastet, eingeführt mit Wi-Fi 6E; ideal für moderne Geräte, aber kurze Reichweite.

- MIMO (Multiple Input Multiple Output)
    - Nutzt mehrere Antennen, um mehrere Datenströme gleichzeitig zu senden/empfangen.
    - Führt zu höherem Datendurchsatz und besserer Reichweite.

- MU-MIMO (Multi-User MIMO)
    - Weiterentwicklung von MIMO.
    - Mehrere Geräte können gleichzeitig Daten empfangen/senden, ohne sich gegenseitig auszubremsen.

- Beamforming
    - Richtet das WLAN-Signal gezielt auf ein bestimmtes Gerät.
    - Ergebnis: stärkere Verbindung, höhere Geschwindigkeit und weniger Störungen.

- OFDMA (Orthogonal Frequency Division Multiple Access)
    - Teilt einen Kanal in viele kleine Unterkanäle auf.
    - Gleichzeitig können mehrere Geräte effizienter versorgt werden → weniger Latenz und höhere Geschwindigkeit.

- Target Wake Time (TWT)
    - Feature von Wi-Fi 6.
    - Geräte „verabreden“ feste Zeiten zum Senden/Empfangen.
    - Dadurch schlafen sie länger → weniger Energieverbrauch und längere Akkulaufzeit.

[WLAN Standards](https://www.socialsolutions.group/was-bedeuten-die-wlan-standards-wie-802-11a-b-g-n-ac-ax/)

### WPA2 vs WPA3 (PSK und Enterprise) 
**WPA2**
Das Sicherheitsprotokoll 802.11i wurde 2004 veröffentlicht und brachte eine entscheidende Neuerung: WPA2 nutzt AES, einen Verschlüsselungsstandard, der sogar für „streng geheime“ Regierungsdaten zugelassen ist. Damit bietet WPA2 grundsätzlich ein sehr hohes Sicherheitsniveau – auch für private WLANs.<br>

**WPA3**
WPA3 ist der neueste WLAN-Sicherheitsstandard und wurde entwickelt, um Heimnetzwerke und öffentliche Hotspots deutlich sicherer zu machen. Er schließt mehrere Schwachstellen seines Vorgängers WPA2 und schützt Nutzer besser – selbst dann, wenn sie unsichere Passwörter verwenden.<br>

#### Vergleich WPA2 & WPA3
| Thema                              | WPA2                                               | WPA3                                                      |
|------------------------------------|-----------------------------------------------------|-----------------------------------------------------------|
| **Passwortsicherheit**             | 4-Wege-Handshake, anfällig für Offline-Wörterbuchangriffe | SAE-Handshake, verhindert Offline-Passwortangriffe       |
| **Schutz bei Passwortdiebstahl**   | Alter Datenverkehr kann entschlüsselt werden       | Forward Secrecy: alter Datenverkehr bleibt geschützt      |
| **Verschlüsselung**                | AES (sehr stark), aber veraltete Protokollmechanik | AES + modernisierte Sicherheitsmechanismen               |
| **Öffentliche WLANs**              | Keine automatische Verschlüsselung, sniffbar       | OWE: individuelle, automatische Verschlüsselung pro Nutzer |
| **IoT-/Geräteeinbindung**          | WPS: unsicher, in 2–14 Stunden knackbar            | Wi-Fi Easy Connect: QR-Code-basierte sichere Einbindung  |
| **Angriffe im Netzwerk**           | Angreifer im WLAN können interne Schlüssel abgreifen | Deutlich besser geschützt, selbst bei schwachen Passwörtern |
| **Hauptschwachstellen**            | WPS, schwache Passwörter, Offline-Angriffe         | Keine bekannten äquivalenten Schwächen der Vorgängerversion |
| **Verfügbarkeit**                  | Seit 2004 Standard, auf alten Routern              | Seit 2020 Pflicht für neue Wi-Fi-CERTIFIED™ Geräte       |
| **Sicherheitsniveau**              | Gut, aber mit relevanten Altlasten                 | Sehr hoch, zukunftssicher und moderner Standard          |

[WPA2 & WPA3](https://www.netspotapp.com/de/blog/wifi-security/wifi-encryption-and-security.html#WPA2)

#### Vergleich PSK & Enterprise
Bei WLAN-Sicherheitsmodi unterscheidet man grundsätzlich zwischen PSK (Pre-Shared Key) und Enterprise. PSK ist der klassische Heimnetz-Standard, bei dem alle Geräte dasselbe WLAN-Passwort nutzen. Enterprise dagegen setzt auf ein professionelles Authentifizierungsverfahren (802.1X) und ermöglicht jedem Nutzer ein eigenes Login, wodurch wesentlich höhere Sicherheit erreicht wird. Für Unternehmen, Schulen und Organisationen ist Enterprise die empfohlene Wahl, während PSK vor allem im privaten Umfeld ausreicht.

| Thema                       | PSK (Pre-Shared Key)                                 | Enterprise (802.1X / RADIUS)                                         |
|-----------------------------|--------------------------------------------------------|----------------------------------------------------------------------|
| **Authentifizierung**       | Ein gemeinsames WLAN-Passwort für alle Nutzer         | Individuelle Benutzerkonten (Benutzername/Passwort, Zertifikate)     |
| **Sicherheitsniveau**       | Gut für Privathaushalte, aber bei Passwort-Weitergabe unsicher | Sehr hoch – jeder Nutzer wird separat authentifiziert                |
| **Angriffsrisiko**          | Passwort kann geteilt, erraten oder abgefangen werden | Kompromittierter Nutzer = nur ein Konto betroffen                    |
| **Zugriffskontrolle**       | Keine Nutzertrennung                                  | Zugriff lässt sich pro Nutzer, Gruppe oder Gerät steuern             |
| **Verschlüsselungsschlüssel** | Alle teilen denselben WPA-Schlüssel                 | Jeder erhält individuelle Sitzungs-Schlüssel                         |
| **Verwaltung**              | Sehr einfach, keine Infrastruktur nötig               | Benötigt RADIUS-Server oder Cloud-Authentifizierung                  |
| **Einsatzgebiet**           | Heimnetzwerke, kleine Umgebungen                      | Unternehmen, Bildungseinrichtungen, Behörden                         |

[PSK & Enterprise](https://www.cloudradius.com/types-of-wpa2-authentication/?)

## 3.2 Authentisierung & Verschlüsselung 
### WPA 4-Way Handshake
Der 4-Way Handshake ist ein zentraler Bestandteil der WLAN-Sicherheit. Er stellt sicher, dass sowohl der Access Point (AP) als auch das Client-Gerät tatsächlich das richtige WLAN-Passwort besitzen, bevor verschlüsselte Kommunikation aufgebaut wird. Gleichzeitig werden dabei neue Sitzungsschlüssel erzeugt, die anschließend für den Schutz aller übertragenen Daten verwendet werden.


1.	**Initiale Herausforderung durch den AP**
    - Der Access Point sendet einen zufälligen Wert an den Client, um den Austausch zu starten. Diese erste Nachricht ist noch ungeschützt. Wird sie manipuliert, bricht der Handshake einfach ab.
2.	**Berechnung eines gemeinsamen Sitzungsschlüssels**
    - Der Client kombiniert diesen zufälligen Wert mit seinen eigenen Informationen und dem WLAN-Passwort. Auf dieser Basis berechnet er einen eindeutigen Sicherheitsschlüssel, der nur ihm und dem AP bekannt ist.
3.	**Authentifizierung des Clients**
    - Anschließend sendet der Client eine Antwort mit einer Art „digitaler Signatur“. Diese Signatur belegt, dass er das korrekte Passwort besitzt und den richtigen Schlüssel berechnet hat.
4.	**Prüfung durch den Access Point**
    - Der AP überprüft diese Signatur. Stimmt sie überein, ist sichergestellt, dass beide Seiten denselben geheimen Schlüssel abgeleitet haben und somit vertrauenswürdig sind.
5.	**Austausch der finalen Informationen**
    - Der AP schickt daraufhin eine weitere Nachricht, die den Client auffordert, die Schlüssel zu installieren. Zusätzlich wird ein Gruppenschlüssel übermittelt, der für Broadcast-Daten im WLAN verwendet wird.
6.	**Abschluss und Aktivierung der Verschlüsselung**
    - Der Client bestätigt den Erhalt und installiert die Schlüssel. Der AP überprüft diese Bestätigung. Sind alle Integritätsprüfungen korrekt, gilt der Handshake als abgeschlossen und die verschlüsselte Kommunikation beginnt.

**Ergebnis**<br>
Nach Abschluss des 4-Way Handshakes:
- verfügen AP und Client über identische Sitzungsschlüssel,
- ist die Authentizität beider Kommunikationspartner bestätigt,
- und wird jeglicher nachfolgende Datenverkehr verschlüsselt übertragen.

Damit bildet der 4-Way Handshake die Grundlage für die Vertraulichkeit und Integrität moderner WLAN-Verbindungen.

[4-Way Handshake](https://networklessons.com/wireless/wpa-and-wpa2-4-way-handshake)

### WPA3 SAE Handshake (DragonFly Handshake) 
Der Dragonfly-Handshake ersetzt den unsicheren WPA2-Handshake. Beide Kommunikationspartner – Client und Access Point – beweisen sich gegenseitig, dass sie das richtige Passwort besitzen, ohne es jemals direkt preiszugeben. Gleichzeitig entsteht ein völlig neuer, einzigartiger Schlüssel für die Sitzung.
	
**Ablauf:**
1.	**Beide Seiten wählen Zufallszahlen**<br>
Diese dienen als Grundlage für den Schlüsselaustausch.
2.	**Beide senden sich berechnete Werte, die keine Rückschlüsse auf das Passwort erlauben**
3.	**Beide berechnen denselben geheimen Schlüssel, aber auf unterschiedlichen Wegen**<br>
→ Dieser Schlüssel entsteht mathematisch, ohne dass jemand ihn abfangen kann.
4.	**Beide bestätigen sich gegenseitig über HMAC, dass sie denselben Schlüssel besitzen**
5.	**Danach werden die Sitzungsschlüssel aktiviert und die verschlüsselte Kommunikation beginnt**

**Vorteile gegenüber WPA2:**
- Keine Offline-Wörterbuchangriffe
- Forward Secrecy (alter Datenverkehr bleibt geschützt)
- Stärkere kryptografische Grundlagen (elliptische Kurven)
- Sicherer und moderner Aufbau

[DragonFly Handshake](https://asecuritysite.com/golang/go_dragon)

### Enterprise-Authentisierung (EAP-TLS, PEAP, TTLS)
**Was ist Enterprise-Authentisierung?**<br>
Enterprise-Authentisierung stellt sicher, dass nur autorisierte Personen oder Geräte Zugang zu sensiblen Unternehmensressourcen erhalten. Durch klare Identitätsprüfung schützt sie Organisationen vor unbefugtem Zugriff und möglichen Sicherheitsvorfällen.

**Warum ist sie wichtig?**
- verhindert Datenlecks und unerlaubten Zugriff
- schützt interne Systeme, Anwendungen und Netzwerke
- stellt sicher, dass nur verifizierte Identitäten arbeiten dürfen

**Typische Methoden**
-Organisationen setzen verschiedene etablierte Verfahren ein, um den Zugang sicher zu gestalten:
- **SSO (Single Sign-On):**
    - Einmal anmelden, mehrere Systeme nutzen – reduziert Passwortrisiken und verbessert die Nutzerfreundlichkeit.
- **FIM (Federated Identity Management):**
    - Ermöglicht Identitätsprüfung über Unternehmensgrenzen hinweg, z. B. bei Kooperationen oder Cloud-Diensten.
- **2FA (Two-Factor Authentication):**
    - Kombination aus Passwort + zusätzlichem Faktor (Token, App, SMS) erhöht die Sicherheit erheblich.

**Nutzen für Unternehmen**
- zentralisiertes, konsistentes Identitätsmanagement
- starke Schutzmechanismen für interne und externe Zugriffe
- Einhaltung von Sicherheitsstandards und Compliance-Vorgaben

[Enterprise-Autorisierung](https://www.anonybit.io/blog/enterprise-authentication/)

#### EAP
Das Extensible Authentication Protocol (EAP) ist ein flexibles Rahmenwerk zur Durchführung von Authentisierungsverfahren in Netzwerken. Es dient nicht selbst als einzelnes Verfahren, sondern ermöglicht es, verschiedene Authentisierungsmethoden über eine gemeinsame Struktur einzusetzen. Dadurch ist EAP besonders in Unternehmensnetzwerken, WLANs und Mobilfunknetzen weit verbreitet.

#### EAP-TLS
EAP-TLS ist eines der sichersten WLAN-Authentisierungsverfahren. Es basiert vollständig auf TLS-Verschlüsselung und nutzt Zertifikate, um sowohl die Identität des Servers als auch des Clients eindeutig nachzuweisen. Dadurch bietet EAP-TLS echte gegenseitige Authentisierung und verhindert effektiv Man-in-the-Middle-Angriffe.

**Kernprinzipien**
- Serverzertifikat: Beweist dem Client die Echtheit des Netzwerks.
- Clientzertifikat: Beweist dem Server die Echtheit des Geräts oder Nutzers.
- Mutual Authentication: Beide Seiten überprüfen sich gegenseitig.
- TLS-Verschlüsselung: Schutz vor Abhören, Manipulation und Identitätsdiebstahl.
- Asymmetrische Kryptografie: Nutzung von öffentlichem und privatem Schlüssel.

| Kategorie       | Punkte                                                                                               |
|-----------------|-------------------------------------------------------------------------------------------------------|
| **Vorteile**    | - Höchstes Sicherheitsniveau aller EAP-Verfahren<br>- Keine sensiblen Passwörter notwendig<br>- Starker Schutz vor MITM-, Replay- und Credential-Angriffen<br>- Ideal für Zero-Trust-Strategien und passwortlose Anmeldung |
| **Nachteile**   | - Hohe Komplexität durch PKI-Verwaltung<br>- Aufwand beim Ausstellen, Verteilen und Widerrufen von Zertifikaten<br>- Clientzertifikate können Kompatibilitätsprobleme verursachen<br>- Höherer organisatorischer und technischer Aufwand |
| **Lösungsansätze** | - Nutzung von Managed PKI Services (z. B. SecureW2), um Infrastruktur- und Verwaltungsaufwand zu reduzieren<br>- Vorteilhaft für Unternehmen ohne eigene PKI-Expertise<br>- Schnelle, cloudbasierte Bereitstellung ermöglicht passwortlose Authentisierung ohne großen Implementierungsaufwand |

[EAP & EAP-TLS](https://www.securew2.com/blog/eap-tls-vs-eap-ttls-pap)

#### PEAP - Protected Extensible Authentication Protocol
Das Protected Extensible Authentication Protocol (PEAP) ist eine Erweiterung von EAP und wurde entwickelt, um die Authentisierung in WLANs sicherer und robuster zu machen. Es wird im Standard IEEE 802.1X empfohlen und ermöglicht eine geschützte Benutzeranmeldung über verschiedene Verfahren wie Nutzername/Passwort, Zertifikate oder SIM-basierte Authentisierung.

**Warum PEAP notwendig wurde**<br>
Das ursprüngliche EAP setzt einen bereits gesicherten Kanal voraus – in drahtlosen Netzwerken ist dieser jedoch nicht garantiert. PEAP behebt diese Schwachstelle, indem es die Übertragung sensibler Login-Daten in einen TLS-verschlüsselten Tunnel legt.
Wesentliche Punkte:
- Aufbau eines sicheren TLS-Tunnels zwischen Client und Server
- Server-Authentisierung über ein digitales Zertifikat
- Jeder Client erhält eigene Sitzungsschlüssel, was Abhörangriffe erschwert
- Funktioniert ähnlich wie EAP-TLS, aber ohne Clientzertifikat

**Historische Bedeutung**<br>
PEAP wurde unter anderem von Cisco, Microsoft und RSA Security entwickelt, um Schwächen des frühen WLAN-Standards WEP auszugleichen.
WEP war anfällig, weil:
- der Initialisierungsvektor nur 24 Bit lang war,
- derselbe Schlüssel für Authentisierung und Datenverschlüsselung genutzt wurde.

Ein kompromittierter WEP-Schlüssel ermöglichte sowohl die Anmeldung am Netzwerk als auch das Mitlesen des Traffics.

**PEAP in WPA/WPA2**<br>
In WPA und WPA2 sind zwei Varianten von PEAP definiert:
- PEAPv0 – meist verbunden mit MS-CHAPv2
- PEAPv1 – unterstützt weitere Methoden, z. B. Token-basierte oder SIM-basierte Authentisierung

Beide arbeiten nach dem gleichen Grundprinzip: erst TLS-Tunnel, dann eigentliche Authentisierung im Schutz dieses Tunnels<br>
[PEAP](https://www.computerweekly.com/de/definition/PEAP-Protected-Extensible-Authentication-Protocol)

#### EAP-TTLS - Tunneles Transport Layer Security
**Was ist EAP-TTLS?**<br>
EAP-TTLS (Extensible Authentication Protocol – Tunneled TLS) ist ein Authentifizierungsverfahren, das einen sicheren TLS-Tunnel nutzt, um Anmeldedaten geschützt zu übertragen. Es wurde als Erweiterung von EAP-TLS entwickelt, um mehr Flexibilität zu bieten und auch klassische Nutzername-/Passwort-Methoden sicher verwenden zu können.
EAP-TTLS wird vor allem in Unternehmen, Universitäten und größeren WLAN-Umgebungen eingesetzt, in denen sicheren Zugriff ohne zwingende Client-Zertifikate benötigt wird.

**Wie funktioniert EAP-TTLS?**
1. Phase: Aufbau eines TLS-Tunnels
    - Der Client verbindet sich mit dem Authentifizierungsserver (z. B. RADIUS).
    - Der Server weist sich mit einem Serverzertifikat (X.509) aus.
    - Es entsteht ein verschlüsselter TLS-Tunnel → alle weiteren Daten werden vertraulich übertragen.

2. Phase: Authentisierung im Tunnel
    - Im geschützten Tunnel sendet der Client seine Zugangsdaten, z. B.
    - Benutzername + Passwort
    - PAP, CHAP, MS-CHAP, MS-CHAPv2
    - Der Server prüft die Daten und entscheidet, ob der Zugriff erlaubt wird.

**Wichtig:** Clientzertifikate können, müssen aber nicht verwendet werden.

**Vor- und Nachteile von EAP-TTLS**
| **Vorteile** | **Nachteile** |
|---------------------------|----------------------------|
| Sicherer TLS-Tunnel schützt Zugangsdaten vor Abhören und MITM-Angriffen | Sicherheit hängt stark von der Qualität der verwendeten Passwortverfahren ab (z. B. PAP = schwach) |
| Unterstützt viele interne Authentisierungsverfahren (flexibel) | Serverzertifikat muss korrekt geprüft werden, sonst Gefahr von MITM |
| Kein Clientzertifikat notwendig → einfacher Rollout | Schwache Passwörter bleiben trotz Tunnel ein Risiko |
| Gut geeignet für große, heterogene Geräteumgebungen | Falsche Implementierung oder Konfiguration kann den Schutz schwächen |
| Unterstützt ältere Systeme & verschiedene Passwortmechanismen | Weniger sicher als EAP-TLS (keine verpflichtende Clientzertifikats-Authentisierung) |

**EAP-TTLS vs. EAP-TLS (Kurzvergleich)**
| **EAP-TTLS** | **EAP-TLS** |
|--------------|-------------|
| TLS-Tunnel + Passwortverfahren | TLS-Tunnel + Client- **und** Serverzertifikat |
| Flexible und breit kompatible Lösung | Höchste Sicherheit durch Mutual Authentication |
| Weniger sicher, da passwortabhängig | Erfordert vollständige PKI-Verwaltung |
| Kein Clientzertifikat notwendig | Ideal für Managed Devices und Zero-Trust-Umgebungen |

**Zertifikate in EAP-TTLS**
- Serverzertifikat (Pflicht)
- Vom RADIUS-Server bereitgestellt
- Muss vom Client geprüft werden
- Grundlage für den sicheren TLS-Tunnel
- Clientzertifikat (Optional)
- Nur nötig, wenn Mutual Authentication gewünscht ist
- Wird von einer vertrauenswürdigen CA ausgestellt

Beide Zertifikatstypen basieren auf dem X.509-Standard.

[EAP-TTLS](https://www.portnox.com/cybersecurity-101/eap-ttls/)

## 3.3 Typische Angriffe
### Rogue AP und Evil Twin 
**Vergleich Rogue AP & Evil Twin**
| **Merkmal** | **Rogue Access Point** | **Evil Twin Access Point** |
|-------------|-------------------------|-----------------------------|
| **Definition** | Nicht autorisierter, unkontrollierter Access Point im Netzwerk | Bösartiger AP, der ein legitimes WLAN imitiert |
| **Hauptziel** | Unbefugter Netzwerkzugang (absichtlich oder versehentlich) | Nutzer täuschen, um Daten abzufangen |
| **Entstehung** | Kann unbeabsichtigt entstehen (Mitarbeiter richtet eigenen AP ein) | Wird gezielt von Angreifern aufgebaut |
| **Tarnung** | Muss nicht getarnt sein; oft klar erkennbar | Imitiert SSID & Sicherheitseinstellungen eines echten AP |
| **Angriffsmodus** | Technische Schwachstelle → ungesicherter Zugangspunkt | Täuschungsangriff (Social Engineering + Technik) |
| **Gefahren** | MITM-Angriffe, Malware, unbefugter Zugriff, Datenlecks | Abhören, Phishing, Credential Theft, interne Netzangriffe |
| **Ausnutzung** | Nutzt Sicherheitslücken im Netzwerk aus | Nutzt das Vertrauen der Nutzer aus (Psychologie) |
| **Erkennung** | Durch Netzwerk-Scanning & Monitoring auffindbar | Schwerer erkennbar, da SSID identisch erscheint |
| **Gegenmaßnahmen** | Netzwerksegmentierung, IDS, starke Authentisierung, User-Awareness | VPN, SSID-Überprüfung, Monitoring, Benutzeraufklärung |
| **Typische Orte** | Unternehmensnetzwerke, Bürogebäude | Öffentliche WLANs (Café, Flughafen, Hotel) |
### Rogue AP
**Was ist ein Rogue Access Point?**<br>
**Rogue Access Points** sind unerlaubte oder unkontrollierte WLAN-Zugangspunkte in einem Netzwerk. Sie können physische Geräte wie Router sein oder virtuelle Access Points, die auf einem vorhandenen Gerät laufen. Da sie nicht durch die IT-Abteilung eingerichtet wurden, umgehen sie Sicherheitsrichtlinien und stellen ein erhebliches Risiko dar.

**Warum sind sie gefährlich?**
- Keine Prüfung oder Verwaltung durch die IT
- Häufig falsch konfiguriert
- Schwache oder keine Authentisierung
- Ermöglichen unbefugten Zugriff auf das Netzwerk
- Können als Eintrittspunkt für Angriffe dienen

**Nicht immer bösartig**<br>
Nicht jeder Rogue Access Point entsteht aus böswilliger Absicht. Oft richten Mitarbeitende unabsichtlich einen eigenen WLAN-Router ein, um die Verbindung zu verbessern. Diese „gut gemeinten“ APs können trotzdem Sicherheitsprobleme, Netzwerkstörungen und Compliance-Verstöße verursachen.

### Evil Twin
**Was ist ein Evil Twin?**<br>
Ein **Evil Twin** ist ein manipuliertes WLAN, das sich als legitimes Netzwerk ausgibt. Angreifer erstellen einen Access Point mit nahezu identischer SSID und ähnlichen Sicherheitseinstellungen, um Nutzer zu täuschen. Die Opfer verbinden sich versehentlich mit dem falschen Netzwerk – und geben damit ihre Daten preis.

**Wie funktioniert der Angriff?**
- Angreifer imitiert SSID und Sicherheit des echten WLANs
- Nutzer erkennen den Unterschied nicht und verbinden sich
- Der gesamte Datenverkehr läuft über den Angreifer
- Der Angreifer kann Daten manipulieren, protokollieren oder weiterleiten

Besonders gefährlich in öffentlichen WLANs (Cafés, Flughäfen, Hotels).

**Welche Daten können abgegriffen werden?**
- Passwörter
- Login-Daten
- Zahlungsinformationen
- Persönliche Daten
- Netzwerkdaten wie IP- oder MAC-Adressen

**Warum ist das für das gesamte Netzwerk gefährlich?**<br>
Ein Evil Twin ist nicht nur ein Risiko für Benutzer – er kann auch ein Einstiegspunkt für tiefere Angriffe sein:
- Erbeuten von Netzwerkinformationen (z. B. interne Adressen)
- Vorbereitung weiterer Angriffe
- Identitätsdiebstahl gegenüber Netzwerkdiensten
- Angriff auf interne Geräte oder Server

Ein Evil Twin dient damit als Fuß in der Tür, um sich später weiter ins Netzwerk vorzuarbeiten.

**Schwachstellen und Gegenmaßnahmen**
| **Kategorie** | **Risiken / Schwachstellen** | **Gegenmaßnahmen** |
|---------------|------------------------------|---------------------|
| **Rogue Access Points** | - Unautorisierte Zugangspunkte<br>- Datenlecks & Manipulation<br>- MITM-Angriffe<br>- Schwache/fehlende Authentisierung<br>- Malware & unbefugter Zugriff | - Regelmäßiges Monitoring & Scans<br>- Starke Authentisierung & Verschlüsselung<br>- Netzwerksegmentierung<br>- IDS/IPS einsetzen<br>- Nutzer über Risiken & verbotene private APs aufklären |
| **Evil Twin Access Points** | - Imitieren legitimer SSIDs<br>- Täuschung der Nutzer<br>- Abfangen sensibler Daten<br>- Phishing & Credential-Theft<br>- Ausgangspunkt für spätere Angriffe | - Sichere WLAN-Protokolle nutzen<br>- Monitoring ungewöhnlicher Signale<br>- SSID-Prüfung & VPN-Verwendung<br>- Nutzeraufklärung über Fake-WLANs<br>- Awareness gegen Phishing & Social Engineering |

[Rogue AP und Evil Twin](https://www.baeldung.com/cs/rogue-access-points-evil-twins)

### Deauthentication Attacks
Der Deauthentication-Angriff („Deauth Attack“) ist eine einfache, aber wirkungsvolle Methode, um WLAN-Verbindungen gezielt zu unterbrechen. Angreifer senden dabei spezielle Deauthentication-Pakete, die einem oder allen WLAN-Clients mitteilen, dass sie vom Netzwerk getrennt wurden. Die Geräte melden sich daraufhin ab – oft ohne dass der Nutzer es bemerkt.
Da WLAN-Clients automatisch versuchen, sich erneut zu verbinden, führt ein einfacher Deauth-Angriff meist nur zu kurzfristigen Ausfällen. Dennoch zeigt dieser Angriff, wie leicht sich Nutzer oder ganze WLAN-Netze stören lassen.

**Ziele des Angriffs**
- WLAN-Verbindungen stören oder unterbrechen
- Nutzer gezielt aus dem Netzwerk werfen
- Grundlage für weitere Angriffe (z. B. Evil Twin)
- Demonstration, wie angreifbar ungeschützte WLAN-Strukturen sind

**Ablauf eines Deauthentication-Angriffs**

1. **Monitor Mode**<br>
Um WLAN-Pakete mitzulesen oder zu senden, muss der WLAN-Adapter in den Monitor Mode wechseln.
Nicht jeder Adapter unterstützt diesen Modus --> vorher prüfen.
**Wichtig:**
    - Grundvoraussetzung für WLAN-Analyse, Pentesting und Deauth-Angriffe
    - Adapter muss korrekt in den Monitor Mode gesetzt werden

2. **Information Gathering**<br>
Vor dem Angriff muss das Ziel identifiziert werden:
    - Welche WLAN-BSSID (MAC-Adresse des Access Points) soll angegriffen werden?
    - Sollen alle Clients betroffen sein oder ein bestimmter Client?
    - Falls gezielt: MAC-Adresse des Clients ermitteln

Typische Tools: airodump-ng, airmon-ng usw.

3. **Angriff durchführen**

Deauth gegen alle Clients<br>
    `aireplay-ng wlan0mon --deauth 1 -a {BSSID}`
    - Zwingt alle verbundenen Geräte zum Abmelden
    - Clients müssen in Reichweite des Angreifers sein
Gezielter Deauth gegen einen Client<br>
    `aireplay-ng wlan0mon --deauth 1 -a {BSSID} -c {CLIENT}`
    - Nur eine spezifische Ziel-MAC wird getrennt
Deauthentication-Flooding (dauerhaft)<br>
    `aireplay-ng wlan0mon --deauth 0 -a {BSSID}`
    - Sendet ununterbrochen Deauth-Pakete

| **Phase** | **Beschreibung** | **Wichtige Punkte** |
|----------|------------------|---------------------|
| Monitor Mode | WLAN-Karte in Überwachungsmodus versetzen | Adapter muss geeignet sein |
| Information Gathering | Ziel-AP und ggf. Ziel-Client identifizieren | BSSID & Client-MAC sammeln |
| Deauth Angriff | Senden von Deauthentication-Paketen | Gegen alle oder einen Client möglich |
| Flooding | Dauerhafte Paketflut erzwingen | Stoppen mit Strg + C |
| Probleme | Reichweite, Adapter, falsche Config | Mehrfache Wiederholungen nötig |

[Deauthentication Angriff](https://www.elektronik-kompendium.de/sites/net/2109171.htm)

### KRACK Angriff
**Was ist ein KRACK-Angriff?**<br>
Ein KRACK-Angriff (Key Reinstallation Attack) ist eine schwere Schwachstelle im WLAN-Standard WPA2, die es Angreifern ermöglicht, verschlüsselte Datenverkehr mitzulesen, zu manipulieren oder umzuleiten. Durch den Angriff können sensible Informationen wie Passwörter, Kreditkartendaten oder private Nachrichten abgefangen werden.
KRACK ermöglicht zudem On-Path-Angriffe, bei denen der Angreifer sich zwischen Gerät und Internet schaltet und z. B. gefälschte Webseiten ausliefert oder Schadcode einschleust.

**Wie funktioniert ein KRACK-Angriff?**
- WPA2 nutzt einen Vier-Wege-Handshake, um Schlüssel auszutauschen und die Verbindung zu sichern.
- Für Wiederverbindungen wird nur Nachricht 3 des Handshakes erneut gesendet.
- Dieser Schritt kann mehrfach wiederholt werden → genau diese Wiederholbarkeit ist die Schwachstelle.
- Angreifer richten ein bösartiges Klon-WLAN ein (ähnlich einem „Evil Twin“).
- Wenn das Opfer sich verbindet, zwingt der Angreifer es auf das Klon-Netzwerk und sendet Handshake-Nachricht 3 mehrfach.
- Durch diese Schlüssel-Neuinstallation werden Datenpakete wiederverwendet → Teile des verschlüsselten Verkehrs werden entschlüsselt.
- Aggre­giert über viele Wiederholungen lässt sich der WPA2-Schlüssel rekonstruieren.

**Was kann der Angreifer danach tun?**
- Datenverkehr mitschneiden
- Login-Daten stehlen
- HTTP-Verbindungen erzwingen (z. B. mit SSLStrip)
- Schadcode einschleusen
- Inhalte manipulieren

**Einschränkung: KRACK funktioniert nur in WLAN-Reichweite → physische Nähe ist nötig.**

**Schutz vor KRACK**
- Alle Betriebssysteme wurden gepatcht (Windows, macOS, Android, iOS, Linux).
- Geräte regelmäßig aktualisieren → Updates schließen die Lücke.
- Beim Surfen immer HTTPS nutzen (Schloss-Symbol im Browser).
- Websites sollten TLS einsetzen → z. B. mit kostenlosen Zertifikaten wie von Cloudflare.

| **Aspekt** | **Beschreibung** |
|------------|------------------|
| **Art des Angriffs** | Key Reinstallation Attack (Schlüsselerneuerung wird missbraucht) |
| **Ziel** | WPA2-Verschlüsselung kompromittieren |
| **Methode** | Wiederholtes Senden von Handshake-Nachricht 3 → Entschlüsselung kleiner Datenfragmente |
| **Voraussetzung** | Angreifer muss in WLAN-Reichweite sein |
| **Folgen** | Abhören, Datendiebstahl, gefälschte Webseiten, Injection-Angriffe |
| **Betroffene** | Alle WPA2-Geräte vor Patchen |
| **Schutzmaßnahmen** | Betriebssystem-Updates, nur HTTPS nutzen, TLS auf Webseiten aktivieren |

[KRACK](https://www.cloudflare.com/de-de/learning/security/what-is-a-krack-attack/)

### PMKID Angriff
Der PMKID-Angriff ist eine Schwachstelle in WPA- und WPA2-Personal-Netzwerken, mit der Angreifer den Pairwise Master Key Identifier (PMKID) direkt vom Access Point erhalten können – ohne den kompletten 4-Way-Handshake abzufangen. Dadurch wird die Passwortanalyse deutlich erleichtert und beschleunigt.

**Was ist der PMKID?**<br>
Der PMKID ist ein Hash-Wert, der aus folgenden Daten gebildet wird:
- PMK (aus Passwort + SSID abgeleitet)
- SSID
- MAC-Adresse des AP
- MAC-Adresse des Clients

**Formel:** <br>
**PMKID = HMAC-SHA1(PMK, “PMK Name” + MAC_AP + MAC_Client)**<br>
Da der PMKID im ersten Frame des RSN-/WPA2-Handshakes übertragen wird, kann ein Angreifer ihn passiv erfassen – ohne dass ein Client sich verbindet.

**Wie funktioniert der Angriff?**
	1.	Angreifer erfasst den PMKID direkt vom Access Point
        - Tools: hcxdumptool, airgeddon, hcxtools
	2.	Kein Client muss aktiv verbunden sein
	3.	Der erbeutete PMKID wird offline mit Passwortlisten geprüft
        - Tools: hashcat, aircrack-ng
	4.	Bei schwachen Passwörtern lässt sich der PSK (WLAN-Passwort) schnell knacken

**Wichtig: 802.11r ist NICHT erforderlich**
- Oft wird angenommen, dass nur 802.11r-Netzwerke verwundbar sind.
- Tatsächlich hängt die Schwachstelle davon ab, wie der AP PMKID-Anfragen beantwortet.
- Auch Netzwerke ohne 802.11r sind anfällig – besonders bei alter Firmware.
<br>
Der Angriff wurde 2018 von Jens Steube veröffentlicht und ist seitdem in zahlreichen Tools integriert.

**Risiken**
- Offline-Knacken des WLAN-Passworts erleichtert
- Keine Nutzerinteraktion nötig
- Schneller als Warten auf einen 4-Way-Handshake
- Besonders gefährlich bei schwachen Passwörtern

**Schutzmaßnahmen**
- Komplexe, lange Passwörter verwenden
- Firmware des Access Points regelmäßig aktualisieren
- Falls möglich → WPA3 nutzen
- WPA3 verhindert PMKID-basiertes Offline-Cracking
- PMK-Derivation erfolgt bei WPA3 anders (SAE), wodurch hashcat-Angriffe unpraktisch werden

[PMKID](https://www.nccgroup.com/research-blog/pmkid-attacks-debunking-the-80211r-myth/)

### MAC Randomization 
**Warum gibt es zufällige MAC-Adressen?**
- Jedes Netzwerkgerät besitzt eine eindeutige MAC-Adresse, die auf Layer 2 zur Identifikation dient.
- Wichtig: Die MAC-Adresse wird immer unverschlüsselt übertragen – auch bei WPA2/WPA3.
- Dadurch kann jede Person in der Umgebung erkennen:
- welches Gerät verbunden ist
- wie lange es anwesend ist
- wie sich ein Gerät bewegt (Tracking)
- Besonders kritisch: Auch beim Scannen nach WLANs senden Geräte Probe Requests mit ihrer MAC-Adresse → Verfolgung möglich, ohne dass das Gerät verbunden ist.

**Wie funktionieren zufällige MAC-Adressen?**
1. **Beim WLAN-Scannen**
    - Seit Android 6 und iOS 9:
- Geräte nutzen für jede Scan-Anfrage eine neue, zufällige MAC-Adresse
- erschwert Standortverfolgung erheblich

2. **Beim Verbinden mit WLANs**
    - Bis Android 10 / iOS 14:
- Verbindung immer mit echter Hardware-MAC
    - Seit Android 10 und iOS 14:
- Gerät erzeugt pro WLAN-SSID eine eigene zufällige MAC-Adresse
- Ein Gerät hat also „eine andere Identität“ in jedem WLAN
- Wechsel zwischen WLANs kann nicht mehr zur Geräteverfolgung genutzt werden

**MAC-Randomisierung umgehen bedeutet NICHT, sie zu brechen, sondern sie technisch zu neutralisieren:**
- Enterprise-Authentisierung nutzen
- Geräte über Zertifikate identifizieren
- Random-MAC-Muster erkennen und blockieren
- Einstellungen/MDM nutzen, um Randomisierung zu deaktivieren

MAC-Randomisierung ist kein Sicherheitsfeature, sondern ein Privatschutzfeature – deshalb gibt es viele legitime Wege, sie zu umgehen, ohne sie anzugreifen.

[MAC Randomisierung](https://www.ingentive.net/artikel/technik/zufaellige-mac-adressen-aka-mac-address-randomization)

## 3.4 Schutzmaßnahmen 
### Protected Management Frames (802.11w)
Mit der IEEE-802.11w-Erweiterung (heute Bestandteil von 802.11-2020) wurde erstmals die Verschlüsselung und Absicherung von Management-Frames im WLAN eingeführt. Früher waren Management-Frames – wie Deauthentication-, Disassociation- oder Action-Frames – ungeschützt und unverschlüsselt, obwohl sie entscheidend für die Funkverbindung sind. Dadurch konnten Angreifer diese Frames leicht fälschen, manipulieren oder für Angriffe wie Deauth-Attacken missbrauchen.

PMF (Protected Management Frames) – auch MFP (Management Frame Protection) genannt – schützt diese robusten Management-Frames und verhindert:
- Abhören (passives Eavesdropping)
- Fälschung von Management-Frames
- Replay-Angriffe
- Deauth- und Disassociation-Angriffe nach erfolgreicher Verbindung
- Geräte, die sich als andere Clients ausgeben

WPA3 und Enhanced Open erfordern PMF verpflichtend, ältere WPA2-Netze können PMF optional aktivieren.

**PMF-Betriebsmodi**
| **Betriebsmodus** | **Parameter** | **PMF-fähiger Client** | **Nicht-PMF-Client** |
|-------------------|----------------|--------------------------|-------------------------|
| Disabled (Aus) | MFPR=0 / MFPC=0 | Kein Schutz | Kein Schutz |
| Capable (Optional) | MFPR=0 / MFPC=1 | Schutz aktiviert | Keine Vorteile / Verbindung möglich |
| Mandatory (Erforderlich) | MFPR=1 / MFPC=1 | Schutz aktiv und verpflichtend | Verbindung nicht möglich |

PMF schützt u. a. folgende Management-Frames:
- Channel Switch Announcements
- QoS Management
- ADDBA / Block-ACK
- Radio Measurement
- Security Association Queries
- Allgemeine Wireless Network Management Frames

Access Points geben ihre PMF-Fähigkeit über die RSN Capabilities im Beacon, in Probe-Responses und Association-Responses an.
In modernen Systemen (z. B. WPA3) ist PMF nicht mehr manuell konfigurierbar, da es automatisch verpflichtend aktiviert ist.

[PMF](https://arubanetworking.hpe.com/techdocs/aos/wifi-design-deploy/security/features/pmf/)

### Zertifikatbasierte Authentisierung 
**Was ist zertifikatbasierte Authentifizierung?**<br>
Bei der zertifikatbasierten Authentifizierung werden digitale, kryptografisch gesicherte Zertifikate eingesetzt, um Benutzer, Geräte oder Maschinen eindeutig zu identifizieren, bevor ihnen Zugriff auf ein Netzwerk oder eine Anwendung gewährt wird.
Statt Passwörtern nutzt CBA asymmetrische Kryptografie, die wesentlich sicherer gegen Phishing, Credential Theft oder Weitergabe ist.
In Kombination mit Multi-Faktor-Authentisierung lässt sich eindeutig prüfen, ob Benutzer X tatsächlich mit Gerät Y zugreift.

**Wie funktioniert zertifikatbasierte Authentifizierung?**<br>
CBA ist flexibel und unterstützt verschiedene Einsatzbereiche:
**Benutzerauthentifizierung**
- Windows-/Domain-Anmeldung
- Zugriff auf Unternehmens-E-Mail & Intranet
- Login zu Cloud-Diensten (z. B. Microsoft 365, Salesforce, Google Workspace)

**Geräte- & Maschinenauthentifizierung**
- Identifikation von Firmenlaptops und mobilen Endgeräten
- Absicherung von IoT-, Kiosk-, POS- oder Industrie-Systemen
- Vor Freigabe von WLAN, VPN, Firewall oder Gateway-Zugriff

| **Vorteile der zertifikatbasierten Authentifizierung** | **Beschreibung** |
|--------------------------------------------------------|------------------|
| Vermeidung schlechter Passworthygiene | Keine Passwörter zum Merken, Weitergeben oder Abfangen – verhindert Credential Theft und Missbrauch. |
| Höhere Cybersicherheit | Passwörter entfallen → Schutz vor Phishing, Diebstahl, Brute-Force und Passwortlistenangriffen. |
| Einfache Verteilung | Zertifikate können automatisch installiert und zentral ausgerollt werden. |
| Lebenszyklus-Management | Zertifikate können einfach ausgestellt, erneuert oder widerrufen werden (z. B. bei Mitarbeiterwechsel). |
| Sehr nutzerfreundlich | Nach Installation ist keine Aktion der Nutzer nötig; Anmeldung läuft transparent im Hintergrund. |
| Für alle Endpunkte geeignet | Einsetzbar für Benutzer, Computer, mobile Geräte und IoT – ein einheitliches Authentisierungssystem. |
| Nutzung bestehender Zugriffsrichtlinien | Rollen- und Rechtekonzepte bleiben erhalten; sensible Bereiche bleiben geschützt. |
| Gegenseitige Authentisierung | Client und Server prüfen sich gegenseitig → hoher Schutz gegen MITM-Angriffe. |
| Einsatz bei externen Nutzern | Zertifikate können auch Partnern oder Dienstleistern vergeben werden – ohne zusätzliche Software, mit minimalem Schulungsaufwand. |

[Zertifikatbasierte Authentifizierung](https://www.globalsign.com/de-de/blog/was-ist-zertifikatbasierte-authentifizierung)

### WLAN-IDS/WIPS
**Was sind WIDS und WIPS?**<br>
Ein Wireless Intrusion Detection System (WIDS) und ein Wireless Intrusion Prevention System (WIPS) sind Sicherheitslösungen für WLANs.
Sie erkennen Angriffe wie Rogue Access Points, Evil Twins, Man-in-the-Middle, Fehlkonfigurationen oder unberechtigte Geräte.
- WIDS: erkennt Angriffe und warnt
- WIPS: erkennt und verhindert Angriffe automatisch

WIPS gilt als umfassendste Schutzmaßnahme, da es Bedrohungen aktiv blockiert.

**Wie arbeitet ein WIPS?**<br>
Ein WIPS überwacht kontinuierlich:
- das gesamte Funkspektrum
- WLAN-Datenverkehr
- die Identität und das Verhalten angeschlossener Geräte

**Wichtige Funktionen:**
- Erkennung falscher Access Points
- Senden von Deauthentication-Paketen an Rogue/Evil Twin APs und deren Clients
- Analyse der Funkfrequenzen und Datenframes
- Erkennung von MAC-Spoofing durch Radio Fingerprinting (Analyse einzigartiger Funkmerkmale)

**Architektur eines WIPS**<br>
Ein typisches WIPS besteht aus drei Komponenten:
	1.	Sensoren
- überwachen Funkspektrum und WLAN-Verkehr
	2.	Zentrales Management-System
- Verwaltung, Policy-Definitionen, Konfiguration
	3.	Analyse-Server
- Auswertung der Daten, Kommunikation mit Sensoren

**WIPS können:**
- in bestehende WLAN-Geräte integriert sein
- oder als dediziertes Overlay-System betrieben werden (separat vom Produktivnetz → höherer Schutz)

**Einsatzgebiete & Vorteile**<br>
WIPS trägt zu einer starken WLAN-Sicherheitsarchitektur bei:
- Erkennung und Abwehr von Rogue Access Points, Evil Twins und MITM-Angriffen
- Schutz vor falsch konfigurierten oder unsicheren Access Points
- Absicherung von BYOD-Umgebungen
- Durchsetzung von WLAN-Sicherheitsrichtlinien
- Einhaltung von Sicherheitsstandards (z. B. PCI DSS)
- Klassifizierung von Geräten und Überwachung der WLAN-Auslastung
- Automatische Reaktionen + Alarmierung von Administratoren

WIPS kann aktiv eingreifen und Gefahren sofort blockieren – ein entscheidender Vorteil gegenüber rein passiven WIDS-Lösungen.

[WLAN-IDS/WIPS](https://itleague.de/133-was-ist-eigentlich-wips/)

### Segmentierung (IoT, Gäste, Corp)
Die Segmentierung von Netzwerken ist eine zentrale Sicherheitsmaßnahme, um Angriffsflächen zu reduzieren, Bedrohungen einzudämmen und die Netzwerkleistung zu optimieren. Durch die Aufteilung eines großen Netzwerks in mehrere isolierte Bereiche (z. B. IoT, Gäste, Corp) lassen sich Risiken effektiv begrenzen: Ein kompromittiertes Gerät kann sich nicht frei im gesamten Netzwerk ausbreiten.

**Segmentierung von IoT-Geräten**<br>
IoT-Geräte verfügen häufig über schwache Sicherheitsmechanismen und stellen damit ein erhebliches Risiko dar.
Deshalb sollten sie immer in ein eigenes, isoliertes Netzwerksegment verschoben werden.<br>
**Wichtig:**
- IoT-Geräte separat halten → keine Verbindung zu internen Systemen
- Zugriff zwischen den Segmenten ausschließlich über Firewall-Regeln
- **Ausnahmen:** Geräte wie Smart-TVs, die auf Medienserver o. Ä. zugreifen müssen → gehören ins Hauptnetz

**Segmentierung von Gäste-Netzwerken**<br>
Gäste-Netzwerke müssen strikt vom Unternehmensnetz getrennt werden, um zu verhindern, dass externe Geräte Zugang zu sensiblen Daten oder Systemen erhalten.<br>
**Merkmale eines sicheren Gastnetzes:**
- Zugriff ausschließlich aufs Internet
- Keine Verbindung zu internen Servern, Druckern oder Geräten
- Schutz vor Schadsoftware durch unsichere Gastgeräte

**Segmentierung im Unternehmensnetz (Corp)**<br>
Auch im geschäftlichen Umfeld verhindert Segmentierung die laterale Bewegung von Angreifern, falls ein Bereich kompromittiert wird.<br>
**Beispiele für Corporate-Segmente:**
- Server-Segment
- NAS/Storage
- Drucker
- Mitarbeitergeräte
- Verwaltung von IoT-Geräten

**Vorteile:**
- Bessere Zugriffskontrolle per VLANs
- Weniger Ausbreitungsmöglichkeiten für Malware
- Optimierte Leistung durch geregelten Datenverkehr

**Technische Umsetzung**<br>
Segmentierung kann physisch oder virtuell erfolgen:<br>
**Virtuelle Segmentierung (VLANs)**
- kostengünstig
- flexibel & skalierbar
- Standard in Unternehmen und modernen Heimnetzwerken

**WLAN-Segmentierung**<br>
Moderne Router/Access Points unterstützen:
- mehrere SSIDs (oft bis 15)
- Client-Isolation
- getrennte Firewall-Regeln pro Netzwerk

**Firewall-Regeln**<br>
Steuern, welches Segment auf welches zugreifen darf – z. B.:
- IoT: kein Zugriff auf Server
- Gäste: nur Internet
- Mitarbeiter: definierte Freigaben

[Netzwerksegmentierung](https://www.zscaler.com/de/resources/security-terms-glossary/what-is-network-segmentation)
