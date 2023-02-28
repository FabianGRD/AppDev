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
}
