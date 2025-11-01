package jobsheet8;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();
        for (int baris = 1; baris <= n ; baris++) {
            for (int kolom = 1; kolom <= n; kolom++) {
                if (baris == 1 || baris == n || kolom == 1 || kolom == n) {
                    System.out.print(n+ " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
