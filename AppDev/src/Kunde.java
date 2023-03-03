public class Kunde {
    String Vorname;
    String Nachname;
    Adresse Rechnungsadresse;
    Adresse Versandadresse;
    Warenkorb Warenkorb;

    public Kunde(
            String vorname,
            String nachname,
            Adresse rechnungsadresse,
            Adresse versandadresse,
            Warenkorb warenkorb)
    {
        Vorname = vorname;
        Nachname = nachname;
        Rechnungsadresse = rechnungsadresse;
        Versandadresse = versandadresse;
        Warenkorb = warenkorb;
    }

    public void versandadresseAendern(Adresse adresse){
        Versandadresse = adresse;
    }
    public void rechnungsadresseAendern(Adresse adresse){

        Rechnungsadresse = adresse;
    }

    public void kundeDetailsAusgeben(){
        System.out.println(Vorname +" "+ Nachname);
        System.out.println("Versandadresse: "+ Versandadresse.PLZ +" "+ Versandadresse.Stadt +" "+ Versandadresse.Strasse +" "+ Versandadresse.Hausnummer);
        System.out.println("Rechnungsadresse: "+ Rechnungsadresse.PLZ +" "+ Rechnungsadresse.Stadt +" "+ Rechnungsadresse.Strasse +" "+ Rechnungsadresse.Hausnummer);
        System.out.println(" ");
        System.out.println(" ");
    }

    public void kundenNamenAusgeben(){
        System.out.println(Vorname +" "+ Nachname);
        System.out.println(" ");
        System.out.println(" ");
    }
}
