package Tugas1;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Latihan4{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String namaToko = "TOKO SERBAGUNA IBIK";
        String namaProduk = "ROTI ENAK";
        double harga = 6300;
        int jumlah;
        double total;
        double diskon = 0;
        double subtotal;

        Date waktu = new Date();
        SimpleDateFormat format =
                new SimpleDateFormat("dd MMM yyyy (HH:mm)");

        System.out.println("================================================");
        System.out.println("             " + namaToko);
        System.out.println("================================================");

        System.out.print("Masukan jumlah produk yang dibeli: ");
        jumlah = input.nextInt();

        total = harga * jumlah;

        if (jumlah % 3 == 0) {
            diskon = total * 0.05;
        }

        subtotal = total - diskon;

        System.out.println();
        System.out.println(format.format(waktu));
        System.out.println("ITEM          QTY       HARGA        TOTAL");
        System.out.println("================================================");

        System.out.printf("%-14s %5d Rp %,.0f Rp %,.0f%n",
                namaProduk, jumlah, harga, total);

        System.out.println("------------------------------------------------");
        System.out.printf("Diskon : %.0f%%%n",
                (diskon / total) * 100);
        System.out.printf("Sub Total : Rp %,.0f%n", subtotal);
        System.out.println("================================================");

        input.close();
    }
}
