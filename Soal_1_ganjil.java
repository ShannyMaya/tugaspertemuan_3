import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan karakter pertama: ");
        char kar1 = scanner.next().charAt(0);

        System.out.print("Masukkan karakter kedua: ");
        char kar2 = scanner.next().charAt(0);

        System.out.print("Masukkan karakter ketiga: ");
        char kar3 = scanner.next().charAt(0);

        if (urutanKata(kar1, kar2, kar3)) {
            System.out.println("Termasuk urutan konsonan-vokal-konsonan");
        } else {
            System.out.println("Bukan termasuk urutan konsonan-vokal-konsonan");
        }
    }

    public static boolean urutanKata(char char1, char char2, char char3) {
        return Konsonan(char1) && Vokal(char2) && Konsonan(char3);
    }

    public static boolean Konsonan(char c) {
        String konsonan = "bcdfghjklmnpqrstvwxyz";
        return konsonan.indexOf(c) != -1;
    }

    public static boolean Vokal(char c) {
        String vokal = "aeiou";
        return vokal.indexOf(c) != -1;
    }
}
