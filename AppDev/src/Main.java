public class Main {
    public static void main(String[] args) {
        Adresse reAdresse1 = new Adresse("straße", "10a", 52722, "koeln");
        Adresse veAdresse1 = new Adresse("straße", "10a", 52722, "koeln");
        Adresse reAdresse2 = new Adresse("straße", "10a", 52722, "koeln");
        Adresse veAdresse2 = new Adresse("straße", "10a", 52722, "koeln");

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


        Kunde kunde1 = KundeAnlegen("Bill", "Gates", reAdresse1, veAdresse1);
        Kunde kunde2 = KundeAnlegen("Linus", "Torvalds", reAdresse2, veAdresse2);

        kunde1.kundeDetailsAusgeben();
        kunde1.Warenkorb.warenkorbAusgeben();
        kunde2.kundeDetailsAusgeben();
        kunde2.Warenkorb.warenkorbAusgeben();

        kunde1.Warenkorb.artikelHinzufuegen(starTrek);
        kunde1.Warenkorb.artikelHinzufuegen(terminator);
        kunde1.Warenkorb.artikelHinzufuegen(pong);
        kunde1.Warenkorb.artikelHinzufuegen(tetris);
        kunde1.kundenNamenAusgeben();
        kunde1.Warenkorb.warenkorbAusgeben();

        kunde2.Warenkorb.mengeAnpassen(2, harryPotter);
        kunde2.kundenNamenAusgeben();
        kunde2.Warenkorb.warenkorbAusgeben();

        kunde1.Warenkorb.mengeAnpassen(7, tetris);
        kunde1.Warenkorb.artikelEntfernen(starTrek);
        kunde1.kundenNamenAusgeben();
        kunde1.Warenkorb.warenkorbAusgeben();

        Adresse neueVeAdresse = new Adresse("straße neu", "10a", 52722, "koeln");
        kunde2.versandadresseAendern(neueVeAdresse);
        kunde2.kundeDetailsAusgeben();

        kunde1.Warenkorb.bestellungAbschliessen(kunde1.Versandadresse);
        kunde2.Warenkorb.bestellungAbschliessen(kunde2.Versandadresse);
    }
    public static Kunde KundeAnlegen(String vorname,
                             String nachname,
                             Adresse rechnungsAdresse,
                             Adresse versandAdresse){
        Warenkorb warenkorb = new Warenkorb();
        Kunde kunde = new Kunde(vorname, nachname, rechnungsAdresse, versandAdresse, warenkorb);

        return kunde;
    }
}