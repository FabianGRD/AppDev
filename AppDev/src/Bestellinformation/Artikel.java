package Bestellinformation;

/**
 * Artikel ist verantwortlich für alle Daten,
 * die einem Produkt zugehörig sind
 * und hält diese bereit
 */
public class Artikel {
    String Bezeichnung;
    double Preis;
    String Kategorie;

    public Artikel(
            String bezeichnung,
            double preis,
            String kategorie){
        Bezeichnung = bezeichnung;
        Preis = preis;
        Kategorie = kategorie;
    }
}
