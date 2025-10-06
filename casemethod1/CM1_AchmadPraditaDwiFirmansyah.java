import java.util.Scanner;
public class CM1_AchmadPraditaDwiFirmansyah {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.print("Nama\t: ");
        String nama=sc.nextLine();
        System.out.print("NIM\t: ");
        long nim=sc.nextLong();

        System.out.println("\n--- Mata kuliah 1: Algoritma dan Pemograman ---");
        System.out.print("Nilai UTS\t: ");
        double utsA=sc.nextDouble();
        System.out.print("Nilai UAS\t: ");
        double uasA=sc.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        double tugasA=sc.nextDouble();


        System.out.println("\n--- Mata kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS\t: ");
        double utsB=sc.nextDouble();
        System.out.print("Nilai UAS\t: ");
        double uasB=sc.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        double tugasB=sc.nextDouble();

        String hurufA, hurufB, statusA, statusB, statusSemester;

        double akhirA = (0.3*utsA)+(0.4*uasA)+(0.3*tugasA);
        if (akhirA>80){
            hurufA="A";
        }else if(akhirA>73 && akhirA<=80){
            hurufA="B+";
        }else if(akhirA>65 && akhirA<=73){
            hurufA="B";
        }else if(akhirA>60 && akhirA<=65){
            hurufA="C+";
        }else if(akhirA>50 && akhirA<=60){
            hurufA="C";
        }else if(akhirA>39 && akhirA<=50){
            hurufA="D";
        }
        else{
            hurufA="E";
        }

        double akhirB = (0.3*utsB)+(0.4*uasB)+(0.3*tugasB);
        if (akhirB>80){
            hurufB="A";
        }else if(akhirB>73 && akhirB<=80){
            hurufB="B+";
        }else if(akhirB>65 && akhirB<=73){
            hurufB="B";
        }else if(akhirB>60 && akhirB<=65){
            hurufB="C+";
        }else if(akhirB>50 && akhirB<=60){
            hurufB="C";
        }else if(akhirB>39 && akhirB<=50){
            hurufB="D";
        }
        else{
            hurufB="E";
        }
        
        if (akhirA>=60) {
            statusA="LULUS";
        }else
        {
            statusA="TIDAK LULUS";
        }
        
        if (akhirB>=60) {
            statusB="LULUS";
        }else
        {
            statusB="TIDAK LULUS";
        }

        if (statusA.equalsIgnoreCase("LULUS") && statusB.equalsIgnoreCase("LULUS")){
            statusSemester="LULUS (Rata-rata >= 70)";
        }    
        else
        {
            statusSemester="TIDAK LULUS (Rata-rata < 70)";
        }

        System.out.println("\n================== HASIL PENILAIAN AKADEMIK ==================");
        System.out.println("Nama\t: "+nama);
        System.out.println("NIM\t: "+nim);
        System.out.println("\nMata Kuliah\t\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println(String.format("\nAlgoritma Pemograman\t\t %.2f \t %.2f \t %.2f \t %.2f \t\t %s \t\t %s ", utsA ,uasA ,tugasA  ,akhirA ,hurufA ,statusA));
        System.out.println(String.format("Struktur Data\t\t\t %.2f \t %.2f \t %.2f \t %.2f \t\t %s \t\t %s ", utsB ,uasB ,tugasB  ,akhirB ,hurufB ,statusB));

        double rataAkhir=(akhirA+akhirB) / 2;
        System.out.println("\nRata-rata Nilai Akhir\t: "+rataAkhir);
        System.out.println("Status Semester\t\t: "+statusSemester);
    }
}