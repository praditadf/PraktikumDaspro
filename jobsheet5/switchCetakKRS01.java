package jobsheet5;
import java.util.Scanner;
public class switchCetakKRS01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Cetak KRS SIAKAD---");
        System.out.println("Masukkan Semester saat ini: ");
        int semester=sc.nextInt();

        switch (semester) {
            case 1:
            System.out.println("Krs Semester 1 ditampilkan");
            break;
            case 2:
            System.out.println("Krs Semester 2 ditampilkan");
            break;
            case 3:
            System.out.println("Krs Semester 3 ditampilkan");
            break;
            case 4:
            System.out.println("Krs Semester 4 ditampilkan");
            break;
            case 5:
            System.out.println("Krs Semester 5 ditampilkan");
            break;
            case 6:
            System.out.println("Krs Semester 6 ditampilkan");
            break;
            case 7:
            System.out.println("Krs Semester 7 ditampilkan");
            break;
            case 8:
            System.out.println("Krs Semester 8 ditampilkan");
            break;
            default:
            System.out.println("Semester tidak valid");
        }
    }
}