package jobsheet9;
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Kentang Goreng","Ayam Goreng", "Ayam Balado", "Sate Ayam", "Sate Usus","Tumis Kangkung", "Tumis Tauge", "Ikan Asin", "Capcay","Sayur Sop", "Sayur Lodeh", "Sayur Bayam"};
        System.out.println("Menu makanan dan minuman:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1)+". " +menu[i]);
        }
        for (int i = 0; i < menu.length; i++) {
            System.out.print("Masukkan nama makanan / minuman yang akan di pesan : ");
            String key = sc.nextLine();
            if (key.equalsIgnoreCase(menu[i])) {
                System.out.println("menu "+key+ " tersedia");
            }else {
                System.out.println("menu "+key+ " tidak tersedia");
            }break;
        }
    }
}
