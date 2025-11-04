package jobsheet9;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan di input : ");
        int jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];
        double rata2, total = 0;
        int nilaiTertinggi = 0, nilaiTerendah = 100;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+ " : ");
            nilaiMhs [i] = sc.nextInt();
            total += nilaiMhs[i];
        }
        System.out.println();
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }if (nilaiMhs [i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
            System.out.println("Nilai mahasiswa ke- "+(i+1)+ " adalah : "+nilaiMhs[i]);
        }
        rata2 = total / nilaiMhs.length;
        System.out.println("\nRata-rata nilai mahasiswa : "+rata2);
        System.out.println("\nnilai tertinggi adalah : "+nilaiTertinggi);
        System.out.println("\nnilai terendah adalah : "+nilaiTerendah);
    }
}
