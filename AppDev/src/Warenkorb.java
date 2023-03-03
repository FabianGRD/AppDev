import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Warenkorb {
    double ArtikelGesamtPreis = 0;
    int MaximalMenge = 100;
    double GesamtPreis = 0;
    double Versandkosten = 0;
    List<Artikel> AlleArtikel = new ArrayList<>();

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

        if( ArtikelGesamtPreis == 0){
            return 0;
        }else if(ArtikelGesamtPreis <= 20){
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
        DecimalFormat f = new DecimalFormat("#0.00");

        System.out.println("Bestellbestätigung: ");
        System.out.println("Preis: " +  f.format(ArtikelGesamtPreis) +"€");
        System.out.println("Versandadresse: " + versandAdresse.PLZ +" "+ versandAdresse.Stadt +" "+ versandAdresse.Strasse +" "+ versandAdresse.Hausnummer);
        System.out.println("Versandkosten: +" +  f.format(Versandkosten) +"€");

        System.out.println("_________________________Ausgabe beendet____________________________");
        System.out.println(" ");
        System.out.println(" ");
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
                    anzahlArtikel--;}
            }
        }else{
            System.out.println("Es wurden zu viele Artikel hinzugefügt");
        }
    }

    public void warenkorbAusgeben(){
        DecimalFormat f = new DecimalFormat("#0.00");
        berechneGesamtPreis();

        List<Artikel> artikelAusgabe = new ArrayList<>();
        int i = 1;
        for (Artikel artikel: AlleArtikel) {
            if(!artikelAusgabe.contains(artikel)){
                int anzahlArtikel = countArtikel(artikel);
                System.out.println(i +"Art. "+artikel.Bezeichnung +" | "+ artikel.Kategorie +" | "+ f.format(artikel.Preis) +"€ | Gesamt Anzahl des Artikels: "+ anzahlArtikel);
                artikelAusgabe.add(artikel);
                i++;
            }
        }
        if(AlleArtikel.size() == 0){
            System.out.println("Warenkorb leer");
        }

        System.out.println("Artikel Gesamtpreis: " + f.format(ArtikelGesamtPreis) +"€");
        System.out.println("Versandkosten: " + f.format(Versandkosten) +"€");
        System.out.println("Gesamtpreis: " + f.format(GesamtPreis) +"€");
        System.out.println("_________________________Ausgabe beendet____________________________");
        System.out.println(" ");
        System.out.println(" ");
    }
    private int countArtikel(Artikel gesuchterArtikel){
        int anzahlArtikel = 0;
        for (Artikel artikel: AlleArtikel) {
            if(artikel == gesuchterArtikel){
                anzahlArtikel++;
            }
        }
        return anzahlArtikel;
    }
}

