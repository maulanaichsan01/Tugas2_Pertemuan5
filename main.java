package Tugas_Pertemuan5;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        ArrayList<Pesan> pesan = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int pilih = 0;

        do {
            System.out.println("=========================================");
            System.out.println("           ICHSAN COFFE SHOP");
            System.out.println("=========================================");
            System.out.println("  1. Pesan ");
            System.out.println("  2. Tutup");
            System.out.println("=========================================");
            System.out.print(" Type [ 1, 2, or 3 ]: ");
            pilih = sc.nextInt();

            if (pilih == 1) {
                pesan = addPesan(pesan);
            } else {
                sc.close();
            }
        } while (pilih != 2);
    }

    private static ArrayList<Pesan> addPesan(ArrayList<Pesan> m) {
        Scanner sc = new Scanner(System.in);
        String customer, nama;
        int qty = 0, add_price = 0, price = 0, bayar = 0, kembalian = 0;

        // cek panjang string
        boolean ok = false;

        do {
            System.out.print("Masukkan Nama: ");
            customer = sc.nextLine();
            if (customer != null) {
                ok = true;
            } else {
                System.out.print("Nama pemesan tidak boleh kosong !");
                ok = false;
            }
        } while (ok == false);

        do {
            System.out.println("Daftar Menu");
            System.out.println("--------------------------------------------------------------------");
            System.out.printf("%-10s | %-10s | %-10s",
                    "No",
                    "Nama",
                    "Harga");
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
            System.out.printf("%-10s | %-10s | %-10s",
                    "1",
                    "Americano",
                    "10000");
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
            System.out.printf("%-10s | %-10s | %-10s",
                    "2",
                    "Latte",
                    "15000");
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
            System.out.printf("%-10s | %-10s | %-10s",
                    "3",
                    "Arabika",
                    "20000");
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
            System.out.print("Masukkan Nama Pesanan: ");
            nama = sc.nextLine();

            if (nama.equals("Americano")) {
                add_price = 10000;
                ok = true;
            } else if (nama.equals("Latte")) {
                add_price = 15000;
                ok = true;
            } else if (nama.equals("Arabika")) {
                add_price = 20000;
                ok = true;
            } else {
                System.out.println(" Maaf, pilihan pesanan anda tidak ada di menu kami ! ");
                System.out.println("");
                ok = false;
            }
        } while (ok == false);

        // cek qty
        ok = false;
        do {
            System.out.print("Mau beli berapa banyak?: ");
            qty = sc.nextInt();

            if (qty >= 1) {
                ok = true;
            } else {
                System.out.println("Jumlah tidak boleh kurang dari 0");
                ok = false;
            }
        } while (ok == false);

        // Harga yang harus dibayar
        price = (qty * add_price);
        System.out.println("Yang harus dibayar: " + price);

        boolean correct = false;
        do {
            System.out.print("Masukkan jumlah uang: ");
            bayar = sc.nextInt();
            if (bayar < price) {
                System.out.println("[ Uang yang Anda berikan kurang nih ! Rugi nanti kita kak hehe ]");
                correct = false;
            } else {
                correct = true;
            }
        } while (correct == false);

        kembalian = abs(bayar - price);
        System.out.println("Kembalian: " + kembalian);
        System.out.println(
                "[ Pesanan berhasil masuk ! Mohon ditunggu pesanannya jadi yah kak ! ]. Press enter to continue..");
        sc.nextLine();
        m.clear();
        sc.nextLine();
        return m;
    }
}
