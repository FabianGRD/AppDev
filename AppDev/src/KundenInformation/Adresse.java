package KundenInformation;

/**
 * Adresse ist verantwortlich für alle Daten,
 * die eine Adresse beschreiben
 * und hält diese bereit
 */
public class Adresse {
    public String Strasse;
    public String Hausnummer;
    public int PLZ;
    public String Stadt;

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
