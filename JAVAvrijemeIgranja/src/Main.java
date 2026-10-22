public class Main {
    public static void main(String[] args) {
        int vrijeme = 200000;

        int dani = vrijeme / 86400;
        int sati = (vrijeme % 86400) / 3600;
        int minute = (vrijeme % 3600) / 60;
        int sekunde = vrijeme % 60;

        System.out.println("Vrijeme igranja: " + dani + "d, " + sati + "h, " + minute + "m, " + sekunde + "s." );

    }
}
