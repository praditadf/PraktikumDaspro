package jobsheet11;
import java.util.Scanner;
public class NilaiMahasiswa01 {
    static Scanner sc = new Scanner(System.in);

    static void isianArray(int[] nilaiMahasiswa){
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+ " : ");
            nilaiMahasiswa[i] = sc.nextInt();
        }
    }

    static void tampilArray(int[] nilaiMahasiswa){
        System.out.println("Data nilai mahasiswa : ");
        for (int dataNilai : nilaiMahasiswa) {
            System.out.println(dataNilai);
        }
    }

    static int hitTot(int[] nilaiMahasiswa){
        int total = 0;
        for (int totalNilai : nilaiMahasiswa) {
            total += totalNilai;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mahasiswa : ");
        int N = sc.nextInt();
        int [] nilaiMahasiswa = new int[N];
        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);
        int hitTot = hitTot(nilaiMahasiswa);
        System.out.println("Total nilai seluruh mahasiswa : "+hitTot);
    }
}
