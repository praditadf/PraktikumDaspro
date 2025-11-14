package jobsheet10;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int responden = 10, pertanyaan = 6;
        double totalPerResp, totalPerPert, rataResp, rataPert, totalNilai = 0, rata = 0;
        int [][] survey = new int[responden][pertanyaan];
        for (int i = 0; i < responden; i++) {
            System.out.println("\nResponden ke-" +(i+1));
            for (int j = 0; j < pertanyaan; j++) {
                System.out.print("Masukkan nilai(1-5) untuk pertanyaan ke-"+(j+1)+ " : ");
                survey[i][j] = sc.nextInt();
                while (survey[i][j] > 5 || survey [i][j] < 1) {
                    System.out.print("Nilai yang anda masukkan salah silahkan masukkan kembali :");
                    survey[i][j] = sc.nextInt();
                }totalNilai += survey[i][j];
            }
        }
        System.out.println("\nHasil Survey:");
        System.out.println("\nRata-rata nilai setiap responden");
        for (int i = 0; i < responden; i++) {
            totalPerResp = 0;
            rataResp = 0;
            for (int j = 0; j < pertanyaan; j++) {
                totalPerResp += survey[i][j];
                rataResp = totalPerResp / pertanyaan;
            }System.out.println("Rata-rata nilai untuk responden ke-"+(i+1)+ " : "+rataResp); 
        }System.out.println("\nRata-rata nilai setiap pertanyaan");
        for (int j = 0; j < pertanyaan; j++) {
            totalPerPert = 0;
            rataPert = 0;
            for (int i = 0; i < responden; i++) {
                totalPerPert += survey[i][j];
                rataPert = totalPerPert / responden;
            }System.out.println("Rata-rata nilai untuk pertanyaan ke-"+(j+1)+ " : "+rataPert);
        }rata = totalNilai / (responden * pertanyaan);
        System.out.println("\nRata-rata nilai secara keseluruhan adalah : "+rata);
    }
    
}