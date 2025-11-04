package jobsheet9;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan: ");
        int jml = sc.nextInt();
        sc.nextLine();
        String[] namaPesanan = new String[jml];
        double[] hargaPesanan = new double[jml];
        double total = 0;

        for (int i = 0; i < jml; i++) {
            System.out.print("Masukkan nama makanan / minuman ke-" +(i+1)+ " : ");
            namaPesanan [i] = sc.nextLine();
            System.out.print("Masukkan harga makanan / minuman ke-" +(i+1)+ " : ");
            hargaPesanan [i] = sc.nextDouble();
            total += hargaPesanan[i];
            sc.nextLine();
        }
        for (int i = 0; i < jml; i++) {
            System.out.println("\n"+(i+1)+". " +namaPesanan[i] + " = Rp "+hargaPesanan[i] );            
        }
        System.out.println("Total biaya dari " +jml+ " pesanan adalah Rp "+total);
    }
}
