
package Tugas1;

import java.util.Scanner;

public class Latihan7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();

        String hasil = nama.replaceAll("[AEIOUaeiou]", "X");

        System.out.println("Hasil perubahan: " + hasil);

        input.close();
    }
}
