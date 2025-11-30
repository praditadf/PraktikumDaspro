package jobsheet11;

public class Kubus01 {
    public static void main(String[] args) {
        hitungVolume(3);
        hitungLuas(3);
    }

    public static int hitungVolume(int sisi){
        int volume = sisi * sisi * sisi;
        System.out.println("Volume kubus : "+volume);
        return volume;
    }

    public static int hitungLuas(int sisi){
        int luas = 6 * (sisi*sisi);
        System.out.println("Luas kubus : "+luas);
        return luas;
    }
}
