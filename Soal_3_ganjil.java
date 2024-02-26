import java.util.Scanner;

public class Percabangan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jam masuk: ");
        int jamMasuk = scanner.nextInt();

        System.out.print("Masukkan jam keluar: ");
        int jamKeluar = scanner.nextInt();

        int lamaBekerja = hitungLamaBekerja(jamMasuk, jamKeluar);

        if (lamaBekerja != -1) {
            System.out.println("Lama Bekerja " + lamaBekerja + " Jam");
        } else {
            System.out.println("Jam masuk harus dari jam 1-12");
        }
    }

    public static int hitungLamaBekerja(int jamMasuk, int jamKeluar) {
        if (jamMasuk < 1 || jamMasuk > 12 || jamKeluar < 1 || jamKeluar > 12) {
            return -1;
        }

        int lamaBekerja;
        if (jamMasuk <= jamKeluar) {
            lamaBekerja = jamKeluar - jamMasuk;
        } else {
            lamaBekerja = 12 - jamMasuk + jamKeluar;
        }

        return lamaBekerja;
    }
}
