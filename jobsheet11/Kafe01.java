package jobsheet11;
import java.util.Scanner;

public class Kafe01 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo){
        System.out.println("Selamat datang, "+namaPelanggan+"!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50%!");
        }else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30%!");
        }else {
            System.out.println("Kode promo invalid");
        }
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga01 (int pilihanMenu, int banyakItem, String kodePromo){
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu-1] * banyakItem;
        double diskon = 0;
        if (kodePromo.equals("DISKON50")) {
            diskon = 0.5 * hargaTotal;
            System.out.println("Anda mendapatkan diskon 50% : Rp"+diskon);
        }else if (kodePromo.equals("DISKON30")) {
            diskon = 0.3 * hargaTotal;
            System.out.println("Anda mendapatkan diskon 30% : Rp"+diskon);
        }else {
            System.out.println("Kode invalid dan tidak ada pengurangan total harga");
        }
        return hargaTotal -= diskon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode promo : ");
        String kodePromo=sc.nextLine();
        Menu("Budi", true, kodePromo);
        String pesanlagi;
        int totalKeseluruhan = 0;
        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu=sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem=sc.nextInt();
            sc.nextLine();
            int totalHarga = hitungTotalHarga01(pilihanMenu, banyakItem, kodePromo);
            System.out.println("Total harga untuk pesanan anda: Rp"+totalHarga);
            System.out.print("Apakah anda ingin memesan lagi? (Ya/Tidak) : ");
            pesanlagi=sc.nextLine();
            totalKeseluruhan += totalHarga;
        } while (pesanlagi.equalsIgnoreCase("Ya"));
        System.out.println("\nTotal keseluruhan untuk pesanan anda : Rp"+totalKeseluruhan);
    }
}
