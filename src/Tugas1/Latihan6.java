
package Tugas1;

import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan usia: ");
        String usia = input.nextLine();

        System.out.print("Masukkan firstname: ");
        String firstname = input.nextLine();

        System.out.print("Masukkan lastname: ");
        String lastname = input.nextLine();

        System.out.print("Masukkan NPM: ");
        String npm = input.nextLine();

        String hasil = usia.concat(firstname)
                           .concat(lastname)
                           .concat(npm);

        System.out.println("Hasil CONCAT: " + hasil);

        input.close();
    }
}
