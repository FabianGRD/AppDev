package KundenInformation;

import Bestellinformation.Warenkorb;

/**
 * Kunde ist verantwortlich für alle Daten,
 * die einen Kunden beschreiben
 * und greift für die Versand- und Rechnungsadresse
 * auf die Klasse Adresse zu
 */
public class Kunde {
    public String Vorname;
    public String Nachname;
    public Adresse Rechnungsadresse;
    public Adresse Versandadresse;
    public Warenkorb Warenkorb;

    public Kunde(
            String vorname,
            String nachname,
            Adresse rechnungsadresse,
            Adresse versandadresse,
            Warenkorb warenkorb ) {
        Vorname = vorname;
        Nachname = nachname;
        Rechnungsadresse = rechnungsadresse;
        Versandadresse = versandadresse;
        Warenkorb = warenkorb;
    }


    /**
     * Ändert die Versandadresse
     *
     * @param adresse enthält die Adresse des Kunden
     */
    public void versandadresseAendern( Adresse adresse ) {
        Versandadresse = adresse;
    }

    /**
     * Ändert die Rechnungsadresse
     *
     * @param adresse enthält die Adresse des Kunden
     */
    public void rechnungsadresseAendern( Adresse adresse ) {
        Rechnungsadresse = adresse;
    }

    /**
     * Gibt alle Details eines Kunden aus
     */
    public void kundeDetailsAusgeben() {
        System.out.println(Vorname + " " + Nachname);
        System.out.println("Versandadresse: " + Versandadresse.PLZ + " " + Versandadresse.Stadt + " " + Versandadresse.Strasse + " " + Versandadresse.Hausnummer);
        System.out.println("Rechnungsadresse: " + Rechnungsadresse.PLZ + " " + Rechnungsadresse.Stadt + " " + Rechnungsadresse.Strasse + " " + Rechnungsadresse.Hausnummer);
        System.out.println(" ");
        System.out.println(" ");
    }

    /**
     * Gibt den Vornamen und Nachnamen des Kunden aus
     */
    public void kundenNamenAusgeben() {
        System.out.println(Vorname + " " + Nachname);
        System.out.println(" ");
        System.out.println(" ");
    }
}
