package jobsheet9;
import java.util.Scanner;
public class ArrayRataNilai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs=sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];
        int lulus = 0, tidakLulus = 0;
        double total = 0;
        double rata2, totalLulus = 0, totalTidakLulus = 0, rataLulus = 0, rataTidakLulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
            total = nilaiMhs[i];
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                lulus += 1;
                totalLulus += nilaiMhs[i];
            }else {
                tidakLulus += 1;
                totalTidakLulus += nilaiMhs [i];
            }
        }
        rata2 = total / nilaiMhs.length;
        rataLulus = totalLulus / lulus;
        rataTidakLulus = totalTidakLulus / tidakLulus;
        System.out.println("Rata-rata nilai lulus = "+rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rataTidakLulus);
    }
}
