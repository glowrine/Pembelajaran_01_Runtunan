package Tugas1;

import java.util.Locale;
import java.util.Scanner;

class Students {
    Integer NPM;
    String Fullname;
    String ClassName;
    Integer Semester;
    Float GPA;

    Integer getNPM(Integer value) {
        this.NPM = value;
        return this.NPM;
    }

    String getFullname(String value) {
        this.Fullname = value;
        return this.Fullname;
    }

    String getClassName(String value) {
        this.ClassName = value;
        return this.ClassName;
    }

    Integer getSemester(Integer value) {
        this.Semester = value;
        return this.Semester;
    }

    Float getGPA(Float value) {
        this.GPA = value;
        return this.GPA;
    }
}

public class Latihan10 {
    static Students myBio = new Students();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Nama Barang  : ");
        String barang = input.nextLine();

        System.out.print("Harga        : ");
        double harga = input.nextDouble();

        System.out.print("Jumlah       : ");
        int jumlah = input.nextInt();
        input.nextLine(); 

        double subTotal = harga * jumlah;

        System.out.print("Nama Member  : ");
        String member = myBio.getFullname(input.nextLine());

        System.out.println();
        System.out.println("===== STRUK =====");
        System.out.println("Barang       : " + barang);
        System.out.println("Harga        : " + harga);
        System.out.println("Jumlah       : " + jumlah);
        System.out.println("SubTotal     : " + subTotal);
        System.out.println("Member Name  : " + member);

        input.close();
    }
}