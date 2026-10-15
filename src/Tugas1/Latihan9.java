package Tugas1;

import java.util.Scanner;

class Students {
    // Atribut sesuai class diagram
    Integer NPM;
    String Fullname;
    String ClassName;
    Integer Semester;
    Float GPA;

    // 5 method sesuai class diagram
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

public class Latihan9 {
    // Atribut myBio bertipe Students (sesuai class diagram)
    static Students myBio = new Students();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM          : ");
        Integer npm = myBio.getNPM(input.nextInt());
        input.nextLine(); // membersihkan sisa enter

        System.out.print("Masukkan Nama Lengkap : ");
        String nama = myBio.getFullname(input.nextLine());

        System.out.print("Masukkan Nama Kelas   : ");
        String kelas = myBio.getClassName(input.nextLine());

        System.out.print("Masukkan Semester     : ");
        Integer semester = myBio.getSemester(input.nextInt());

        System.out.print("Masukkan IPK          : ");
        Float ipk = myBio.getGPA(input.nextFloat());

        System.out.println();
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("NPM          : " + npm);
        System.out.println("Nama Lengkap : " + nama);
        System.out.println("Nama Kelas   : " + kelas);
        System.out.println("Semester     : " + semester);
        System.out.println("IPK          : " + ipk);

        input.close();
    }
}