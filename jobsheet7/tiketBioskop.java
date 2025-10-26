package jobsheet7;
import java.util.Scanner;
public class tiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPenjualan = 0, totalTiket = 0, hargaTiket = 50000, totalHarga = 0, jmlTiket = 0; 
        double diskon = 0;
        while (true) {
            System.out.print("Masukkan jumlah tiket yang anda beli (0 untuk berhenti): "); 
            jmlTiket=sc.nextInt();

            if (jmlTiket == 0) {
                break;
            }
            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket yang anda masukkan tidak valid, silahkan masukkan ulang jumlah tiket yang anda beli");
                continue;
            }

            if (jmlTiket > 10) {
                diskon = 0.15;
            }else if (jmlTiket > 4) {
                diskon = 0.10;
            }else {
                diskon = 0; 
            }

            totalHarga = 50000*jmlTiket;
            totalHarga -= totalHarga*diskon;

            totalTiket += jmlTiket;
            totalPenjualan += totalHarga;
            System.out.println("Total tiket yang anda beli adalah " +jmlTiket+ " tiket");
            System.out.println("Total harga untuk pembelian tiket anda adalah Rp "+totalHarga);
        }
        System.out.println("\nTotal tiket terjual hari ini adalah " + totalTiket+ " tiket");
        System.out.println("Total penjualan tiket hari ini adalah Rp "+totalPenjualan);
    }
}
