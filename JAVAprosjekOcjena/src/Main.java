public class Main {
    public static void main(String[] args) {
        int zbir;
        int prosjekInt;
        double prosjek;
        int zaokruzeno;
        boolean stipendija = true;
        int a = 9;
        int b = 8;
        int c = 10;
        int d = 7;
        int e = 9;

        zbir = a + b + c + d + e;
        prosjekInt = zbir / 5;
        prosjek = zbir / 5.0;
        zaokruzeno = Math.toIntExact(Math.round(prosjek));

        System.out.println("Zbir: " + zbir);
        System.out.println("Prosjek (int): " + prosjekInt);
        System.out.println("Prosjek (double): " + prosjek);
        System.out.println("Zaokruženo: " + zaokruzeno);
        System.out.println("Prosjek: " + prosjek);
        System.out.println("Stipendija: " + stipendija);
    }
}
