package jobsheet5;
import java.util.Scanner;
public class tugas3wifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jenis pengguna: (Dosen/Mahasiswa)");
        String pengguna=sc.nextLine();
        if (pengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        }else if (pengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.println("Masukkan jumlah SKS yang diambil");
            int sks=sc.nextInt();
            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            }else{
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        }else {
            System.out.println("Akses ditolak");
        }
    }
}
