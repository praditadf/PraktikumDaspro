package jobsheet8;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();
        for (int j = 1; j <= n; j++) {
            int jumlahKuadrat = 0; 
            String kuadratSebelumnya = ""; 
            for (int i = 1; i <= j; i++) {
                int kuadrat = i * i;
                jumlahKuadrat += kuadrat; 
                if (i == 1) {
                    kuadratSebelumnya += kuadrat;
                } else {
                    kuadratSebelumnya += " + " + kuadrat;
                }
            }
            System.out.println("n = " + j + " -> jumlah kuadrat = " +kuadratSebelumnya+ " = " +jumlahKuadrat);
        }
    }
}
