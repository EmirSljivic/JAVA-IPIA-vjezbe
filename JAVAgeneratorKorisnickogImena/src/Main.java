import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String ime = "Amila";
        String prezime = "Tabak";
        int godiste = 2006;

        // Inicijali
        String inicijalIme = ime.substring(0, 1);
        String inicijalPrezime = prezime.substring(0, 1);

        // Godine u string
        String godine = "" + godiste;

        // Godine na 06 umjesto 2006
        String skracenoGodiste = godine.substring(2);

        // Puno ime i prezime
        String punoIme = ime + " " + prezime;

        // Ime i prezime malim slovima
        String malimIme = ime.toLowerCase();
        String malimPrezime = prezime.toLowerCase();

        // Samo prvo slovo imena malim slovom
        String maloSlovoIme = inicijalIme.toLowerCase();

        System.out.println("Inicijali: " + inicijalIme + "." + inicijalPrezime);
        System.out.println("Puno ime i prezime: " + punoIme);
        System.out.println("Username: " + maloSlovoIme + malimPrezime + skracenoGodiste );


    }
}
