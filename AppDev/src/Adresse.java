/**
 * Adresse ist verantwortlich für alle Daten,
 * die eine Adresse beschreiben
 * und hält diese bereit
 */
public class Adresse {
    String Strasse;
    String Hausnummer;
    int PLZ;
    String Stadt;

    public Adresse(
            String strasse,
            String hausnummer,
            int plz,
            String stadt
    ){
        Strasse = strasse;
        Hausnummer = hausnummer;
        PLZ = plz;
        Stadt = stadt;
    }
}
