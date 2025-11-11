package jobsheet10;
import java.util.Scanner;
public class BioskopWithScanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        String [][] penonton = new String[4][2];
        while (true) {
            System.out.println("Menu 1: Input data penonton");
            System.out.println("Menu 2: Tampilkan data penonton");
            System.out.println("Menu 3: Exit");
            System.out.print("Masukkan menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (penonton[baris-1][kolom-1] == null) {
                        System.out.println("Kursi yang dipilih tersedia");
                    } else if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Kursi yang dipilih sudah terisi oleh penonton lainnya");
                        continue;
                    }
                    penonton[baris-1][kolom-1] = nama;
                    
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }System.out.println();
                break;

                case 2:
                for (String []temp : penonton) {
                    for (String dataPenonton : temp) {
                        if (dataPenonton == null) {
                            System.out.println("***");
                        }else{
                            System.out.println(dataPenonton + " ");
                        }
                    }
                }System.out.println();
                break;
                
                case 3:
                return; 

                default:
                break;
            }
        }
    }
}
