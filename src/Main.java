public class Main {

    public static void main(String[] args) {

        double kilo = 105.0;
        double boy  = 1.72;

        double vucutKitleIndeksi = kilo / (boy*boy);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : " +boy);
        System.out.println("Lütfen kilonuzu giriniz : " +kilo);
        System.out.println("Vücut Kitle İndeksiniz : " +vucutKitleIndeksi );

    }
}