
package Tugas1;

import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata atau kalimat: ");
        String teks = input.nextLine();

        String hasil = teks.toUpperCase();

        System.out.println("Hasil huruf besar: " + hasil);

        input.close();
    }
}
