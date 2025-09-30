package jobsheet5;
import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Apakah anda membawa kartu mahasiswa? (true/false)");
        boolean ktm=sc.nextBoolean();
        System.out.println("Apakah anda sudah melakukan registrasi? (true/false)");
        boolean reg=sc.nextBoolean();
        String pesan;
        pesan = (ktm && reg) ? "Anda memenuhi semua persyaratan, Silahkan masuk" : "Anda tidak memenuhi persyaratan yang ada, Anda dilarang masuk";
        System.out.println(pesan);
    }
}