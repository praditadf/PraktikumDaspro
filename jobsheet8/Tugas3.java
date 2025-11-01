package jobsheet8;
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ttlCabang, jmlPelanggan, jmlItem, ttlPelanggan = 0, ttlItem = 0, allItem = 0;
        System.out.print("Jumlah cabang kafe: ");
        ttlCabang = sc.nextInt();
        System.out.println("=== Input Penjualan Per Cabang ===");
        for (int cabang = 1; cabang <= ttlCabang; cabang++) {
            System.out.println("\n--- Cabang " + cabang + " ---");
            System.out.print("Jumlah pelanggan: ");
            jmlPelanggan = sc.nextInt();
            ttlItem = 0;
            for (int pelanggan = 1; pelanggan <= jmlPelanggan; pelanggan++) {
                System.out.print("- Pelanggan " + pelanggan + " memesan berapa item? ");
                jmlItem = sc.nextInt();
                ttlItem += jmlItem; 
            }
            System.out.println("Cabang " +cabang+ ":");
            System.out.println("- Pelanggan: " +jmlPelanggan+ " Orang");
            System.out.println("- Item terjual: " +ttlItem);
            ttlPelanggan += jmlPelanggan;
            allItem += ttlItem;
        }
        System.out.println("\nTotal seluruh Cabang: "+ttlCabang);
        System.out.println("Pelanggan: "+ttlPelanggan);
        System.out.println("Item terjual: "+allItem);

    }
}
