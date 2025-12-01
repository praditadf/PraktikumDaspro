package jobsheet11;
import java.util.Scanner;
public class RekapPenjualanCafe01 {
    static Scanner sc = new Scanner(System.in);

    static void inputData(int[][] cafe, String[] menu){
        System.out.println("Masukkan data penjual menu");
        for (int i = 0; i < cafe.length; i++) {
            System.out.println("Menu : "+menu[i]);
            for (int j = 0; j < cafe[i].length; j++) {
                System.out.print("Hari ke "+(j+1)+" : ");
                cafe[i][j]=sc.nextInt();
            }
        }
    }

    static void tampilData(int[][] cafe,int jumlahHari, String[] menu){
        System.out.println("\nRekap penjualan menu :");
        System.out.print("\t");
        for (int h = 0; h < jumlahHari; h++) {
            System.out.print("\tHari ke "+(h+1));
        }
        for (int i = 0; i < cafe.length; i++) {
            System.out.print("\n"+menu[i]+"\t");
            if (menu[i].length() < 5 ) {
                System.out.print("\t");
            }
            for (int j = 0; j < cafe[i].length; j++) {
                System.out.print(cafe[i][j]+"\t\t");
            }
            System.out.println();
        }
    }

    static int[] menuTerlaris(int[][] cafe, String[] menu){
        int terlaris = 0;
        String menuTerlaris = "";
        int[] totalPenjualanMenu = new int[menu.length];
        for (int i = 0; i < totalPenjualanMenu.length; i++) {
            for (int j = 0; j < cafe[i].length; j++) {
                totalPenjualanMenu[i] += cafe[i][j];
            }
            if (totalPenjualanMenu[i] >= terlaris) {
                terlaris = totalPenjualanMenu[i];
                menuTerlaris = menu[i];
            }
        }
        System.out.println("\nMenu "+menuTerlaris+ " memiliki total penjualan tertinggi : "+terlaris+ " menu terjual");
    return totalPenjualanMenu;
    }

    static void hitungRata(int[] totalPenjualanMenu,int jumlahHari , String[] menu){
        int[] rataPerMenu = new int[menu.length];
        System.out.println("\nRata-rata Penjualan Tiap Menu");
        System.out.println("Nama Menu\t\tRata-rata");
        for (int i = 0; i < rataPerMenu.length; i++) {
            rataPerMenu[i] = totalPenjualanMenu[i] / jumlahHari;
            System.out.print((i+1)+". "+menu[i]+"\t");
            if (menu[i].length() < 5) {
                System.out.print("\t\t");
            }else if (menu[i].length() < 11) {
                System.out.print("\t");
            }
            System.out.println(rataPerMenu[i]);
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah menu : ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan jumlah hari : ");
        int jumlahHari = sc.nextInt();
        sc.nextLine();
        String[] menu = new String[jumlahMenu];
        for (int i = 0; i < menu.length; i++) {
            System.out.print("Masukkan nama menu ke- "+(i+1)+ " : ");
            menu[i]=sc.nextLine();
        }
        int[][] cafe = new int[jumlahMenu][jumlahHari];
        inputData(cafe, menu);
        tampilData(cafe, jumlahHari, menu);
        int[] totalPenjualanMenu = menuTerlaris(cafe, menu);
        hitungRata(totalPenjualanMenu, jumlahHari, menu);
    }
}