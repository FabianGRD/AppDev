import java.util.ArrayList;
import java.util.List;

public class Warenkorb {
    double ArtikelGesamtPreis = 0;
    int MaximalMenge = 100;
    double GesamtPreis = 0;
    double Versandkosten = 0;
    List<Artikel> AlleArtikel = new ArrayList<>();;

    public Warenkorb(){
    }

    private double berechneArtikelGesamtPreis(){
        double preis = 0;
        for (Artikel artikel : AlleArtikel){
            preis += artikel.Preis;
        }


        return preis;
    }
    public double berechneVersand(){
        ArtikelGesamtPreis = berechneArtikelGesamtPreis();
        if(ArtikelGesamtPreis <= 20){
            return 5.95;
        } else if (ArtikelGesamtPreis <= 50) {
            return 2.95;
        }else {
            return 0;
        }
    }

    public double berechneGesamtPreis(){
        Versandkosten = berechneVersand();
        GesamtPreis = Versandkosten + ArtikelGesamtPreis;

        return GesamtPreis;
    }

    public void bestellungAbschliessen(Adresse versandAdresse){
        berechneGesamtPreis();

        System.out.println("Bestellbestätigung: ");
        System.out.println("Preis: " + ArtikelGesamtPreis);
        System.out.println("Versandadresse: " + versandAdresse.PLZ +" "+ versandAdresse.Stadt +" "+ versandAdresse.Strasse +" "+ versandAdresse.Hausnummer);
        System.out.println("Versandkosten: +" + Versandkosten);
    }

    public void artikelHinzufuegen(Artikel artikel){
        if(AlleArtikel.size() < MaximalMenge){
            AlleArtikel.add(artikel);
        }
    }

    public void artikelEntfernen(Artikel artikel){
        if(AlleArtikel.contains(artikel)){
            AlleArtikel.remove(artikel);
        }
    }

    public void mengeAnpassen(int menge, Artikel artikel){
        int anzahlArtikel = 0;
        for (Artikel gesuchterArtikel : AlleArtikel) {
            if (gesuchterArtikel == artikel) {
                anzahlArtikel++;
            }
        }

        int differenz = menge - anzahlArtikel;

        if(AlleArtikel.size() + differenz <= MaximalMenge) {
            while (menge != anzahlArtikel) {
                if (menge > anzahlArtikel) {
                    artikelHinzufuegen(artikel);
                    anzahlArtikel++;
                } else if (menge < anzahlArtikel) {
                    artikelEntfernen(artikel);
                    anzahlArtikel--;
                }
            }
        }else{
            System.out.println("Es wurden zu viele Bücher hinzugefügt");
        }
    }

    public void warenkorbAusgeben(){
        berechneGesamtPreis();
        int i = 1;
        for (Artikel artikel: AlleArtikel) {
            System.out.println(i +"Art. "+artikel.Bezeichnung +" "+ artikel.Kategorie +" "+ artikel.Preis);
            i++;
        }
        System.out.println("Artikel Gesamtpreis: " + ArtikelGesamtPreis);
        System.out.println("Versandkosten: " + Versandkosten);
        System.out.println("Gesamtpreis: " + GesamtPreis);
        System.out.println("_________________________Ausgabe beendet____________________________");
        System.out.println(" ");
        System.out.println(" ");
    }
}

