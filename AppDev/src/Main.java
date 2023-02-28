import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Adresse rechnungsAdresse = new Adresse("straße", "10a", 52722, "koeln");
        Adresse adresse2 = new Adresse("starße", "10a", 52722, "Düren");

        Artikel harryPotter1 = new Artikel("Harry Potter 1", 5.50, "Buch");
        Artikel herrDerRinge1 = new Artikel("Herr der Ringe 1", 8.50, "Buch");
        Artikel test = new Artikel("test", 8.50, "Buch");


        Warenkorb warenkorb = new Warenkorb();
        Warenkorb warenkorb2 = new Warenkorb();
        Kunde kunde1 = new Kunde("Fabian", "Grudzinski", rechnungsAdresse, rechnungsAdresse, warenkorb);
        Kunde kunde2 = new Kunde("Cenk", "Cansiz", adresse2, adresse2, warenkorb2);

        kunde1.Warenkorb.artikelHinzufuegen(herrDerRinge1);
        kunde1.Warenkorb.artikelHinzufuegen(harryPotter1);
        kunde1.Warenkorb.artikelHinzufuegen(test);
        kunde1.Warenkorb.artikelHinzufuegen(herrDerRinge1);
        kunde1.Warenkorb.warenkorbAusgeben();

        kunde1.Warenkorb.mengeAnpassen(1, herrDerRinge1);
        kunde1.Warenkorb.warenkorbAusgeben();

        kunde1.Warenkorb.artikelEntfernen(test);
        kunde1.Warenkorb.warenkorbAusgeben();

        kunde1.Warenkorb.bestellungAbschliessen(kunde1.Versandadresse);

        kunde2.Warenkorb.bestellungAbschliessen(kunde2.Versandadresse);

        Adresse rechnungsAdresse2 = new Adresse("atdfvzas", "12", 52722, "koeln");
        kunde1.rechnungsadresseAendern(rechnungsAdresse2);
    }
}