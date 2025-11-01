package jobsheet8;
import java.util.Scanner;
public class NilaiKelompok01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, nilai;   //Mendeklarasikan variabel i untuk kelompok dan nilai untuk nilai kelompok
        float totalNilai, rataNilai;    //mendeklarasikan totalNilai untuk jumlah nilai yang sudah di inputkan dan rataNilai untuk rata-rata nilai setiap kelompok
        i = 1;  //Inisialisasi i dengan 1 
        while (i <= 6) {    //Jumlah kelompok ada 6 dan program akan berjalan sampai i = 6
            System.out.println("Kelompok " + i);    //Untuk menampilkan nomor kelompok  

            totalNilai = 0;     //Inisialisasi totalNilai dengan 0 untuk mereset total nilai setiap kelompok
            for (int j = 1; j <= 5; j++) { //Perulangan pengisian nilai yang dilakukan sebanyak 5 kali
                System.out.print("  Nilai dari Kelompok Penilai " + j + ": ");  //Menampilkan perintah untuh memasukkan nilai
                nilai = sc.nextInt();   //Untuk menginputkan nilai kelompok
                totalNilai += nilai;    //Untuk menjumlahkan nilai yang sudah di inputkan dan dimasukkan ke dalam variabel totalNilai
            }
            rataNilai = totalNilai/5;   //Untuk menghitung rata-rata nilai dengan membagi totalNilai dengan 5
            System.out.println("Kelompok " +i+ ": nilai rata-rata = " +rataNilai);  //Untuk menampilkan nilai rata-rata tiap kelompok
            System.out.println();
            i++;    //Lanjut ke kelompok berikutnya
        }
    }
}
