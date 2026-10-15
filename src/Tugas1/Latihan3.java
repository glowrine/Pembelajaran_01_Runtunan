package Tugas1;

public class Latihan3{

    static double phi = 3.14;

    static double luasKerucut(double r, double s) {
        return phi * r * (r + s);
    }

    static double volumeKerucut(double r, double t) {
        return (phi * r * r * t) / 3;
    }

    static double luasTabung(double r, double t) {
        return 2 * phi * r * (r + t);
    }

    static double volumeTabung(double r, double t) {
        return phi * r * r * t;
    }

    public static void main(String[] args) {

        double jariKerucut = 7;
        double tinggiKerucut = 24;
        double garisPelukis = 25;

        double jariTabung = 7;
        double tinggiTabung = 10;

        double luasK = luasKerucut(jariKerucut, garisPelukis);
        double volumeK = volumeKerucut(jariKerucut, tinggiKerucut);

        double luasT = luasTabung(jariTabung, tinggiTabung);
        double volumeT = volumeTabung(jariTabung, tinggiTabung);

        System.out.println("=== BANGUN KERUCUT ===");
        System.out.println("Jari-jari       : " + jariKerucut);
        System.out.println("Tinggi          : " + tinggiKerucut);
        System.out.println("Garis pelukis   : " + garisPelukis);
        System.out.println("Luas permukaan  : " + luasK);
        System.out.println("Volume          : " + volumeK);

        System.out.println();
        System.out.println("=== BANGUN TABUNG ===");
        System.out.println("Jari-jari       : " + jariTabung);
        System.out.println("Tinggi          : " + tinggiTabung);
        System.out.println("Luas permukaan  : " + luasT);
        System.out.println("Volume          : " + volumeT);
    }
}
