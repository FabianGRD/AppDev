import Bestellinformation.Warenkorb;
import Bestellinformation.Artikel;
import KundenInformation.Kunde;
import KundenInformation.Adresse;

/**
 * Main startet das Programm
 * und beinhält einen festen Ablauf
 * der ausgeführt wird
 * und dabei auf die unterschiedlichen Klassen zugreift
 *
 * @author Cenk Cansiz
 * @author Fabian Grudzinski
 * @author Jens Müller
 * @author Lukas Großnick
 * @author Sebastian Leszinski
 *
 * @version 2.2.3
 */

public class Main {
    public static void main(String[] args) {
        /**
         * Anlegen von 4 verschiedenen Adressen, darunter 2 Versandadressen und 2 Rechnungsadressen
         */
        Adresse reAdresse1 = new Adresse("Ligusterweg", "4", 75968, "London");
        Adresse veAdresse1 = new Adresse("Bat Cave", "10a", 10001, "Gotham City");
        Adresse reAdresse2 = new Adresse("Schicksalsberg", "1", 52722, "Mordor");
        Adresse veAdresse2 = new Adresse("Beutelsend", "1", 3400, "Auenland");

        /**
         * Anlegen von 10 Artikeln die
         */
        Artikel harryPotter = new Artikel("Harry Potter", 0.01, "Buch");
        Artikel herrDerRinge = new Artikel("Herr der Ringe", 10101.01, "Buch");
        Artikel starTrek = new Artikel("Star Trek", 47.74, "Buch");
        Artikel derPate = new Artikel("Der Pate", 13.37, "Film");
        Artikel interstellar = new Artikel("Interstellar", 42.42, "Film");
        Artikel terminator = new Artikel("Terminator", 19.84, "Film");
        Artikel javaIstAuchEineInsel = new Artikel("Java ist auch eine Insel", 25.79, "Buch");
        Artikel jurassicPark = new Artikel("Jurassic Park", 11.50, "Film");
        Artikel pong = new Artikel("Pong", 15.80, "Spiel");
        Artikel tetris = new Artikel("Tetris", 30.50, "Spiel");


        /**
         * Kunden werden über die Methode KundeAnlegen erstellt
         */
        Kunde kunde1 = KundeAnlegen("Bill", "Gates", reAdresse1, veAdresse1);
        Kunde kunde2 = KundeAnlegen("Linus", "Torvalds", reAdresse2, veAdresse2);

        /**
         * zu Beginn werden die Kundendetails und
         * die Warenkörbe ausgegeben für die
         * Übersicht des Ablaufes
         */
        kunde1.kundeDetailsAusgeben();
        kunde1.Warenkorb.warenkorbAusgeben();
        kunde2.kundeDetailsAusgeben();
        kunde2.Warenkorb.warenkorbAusgeben();

        /**
         * Kunde 1 (Bill Gates) fügt 4 unterschiedliche Artikel
         * dem Warenkorb hinzu
         * zur übersicht wird der Warenkorb ausgegeben
         */
        kunde1.Warenkorb.artikelHinzufuegen(starTrek);
        kunde1.Warenkorb.artikelHinzufuegen(terminator);
        kunde1.Warenkorb.artikelHinzufuegen(pong);
        kunde1.Warenkorb.artikelHinzufuegen(tetris);
        kunde1.kundenNamenAusgeben();
        kunde1.Warenkorb.warenkorbAusgeben();

        /**
         * Kunde 2 passt die Menge des Artikels "Harry Potter"
         * auf die Menge 3 an
         * Auch hier wird danach eine Übersicht des neuen Warenkorbs ausgegeben
         */
        kunde2.Warenkorb.mengeAnpassen(3, harryPotter);
        kunde2.kundenNamenAusgeben();
        kunde2.Warenkorb.warenkorbAusgeben();

        /**
         * Kunde 1 passt die Menge des Artikels "tetris"
         * auf die Menge 7 an
         * und gibt den Warenkorb aus
         */
        kunde1.Warenkorb.mengeAnpassen(7, tetris);
        kunde1.Warenkorb.artikelEntfernen(starTrek);
        kunde1.kundenNamenAusgeben();
        kunde1.Warenkorb.warenkorbAusgeben();

        /**
         * Kunde 2 ändert seine Versandadresse
         * und danaach werden die Kundendetails ausgegeben
         */
        Adresse neueVeAdresse = new Adresse("Hacker Way", "1", 94025, "San Francisco");
        kunde2.versandadresseAendern(neueVeAdresse);
        kunde2.kundeDetailsAusgeben();

        /**
         * Kunde 1 und 2 schließen ihre Bestellungen ab
         */
        kunde1.Warenkorb.bestellungAbschliessen(kunde1.Versandadresse);
        kunde2.Warenkorb.bestellungAbschliessen(kunde2.Versandadresse);
    }

    /**
     * Legt einen Kunden mit den dazugehörigen Adressen an
     * und erstellt bei der erstellung des Kunden einen Warenkorb
     * der dem Kunden zugewisen wird
     *
     * @param vorname enthält den Vornamen des Kunden
     * @param nachname enthält den Nachnamen des Kunden
     * @param rechnungsAdresse die umzurechnende Geschwindigkeit in km/h
     * @param versandAdresse die umzurechnende Geschwindigkeit in km/h
     *
     * @return Kunde mit seinen zugehörigen Adressen und dem zughörigen Warenkorb
     */
    public static Kunde KundeAnlegen(String vorname,
                             String nachname,
                             Adresse rechnungsAdresse,
                             Adresse versandAdresse){
        Warenkorb warenkorb = new Warenkorb();
        Kunde kunde = new Kunde(vorname, nachname, rechnungsAdresse, versandAdresse, warenkorb);

        return kunde;
    }
}