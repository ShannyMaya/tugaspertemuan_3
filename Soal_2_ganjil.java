import java.util.Scanner;

public class Percabangan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Panjang sisi pertama: ");
        double sisi1 = scanner.nextDouble();

        System.out.print("Panjang sisi kedua: ");
        double sisi2 = scanner.nextDouble();

        System.out.print("Panjang sisi ketiga: ");
        double sisi3 = scanner.nextDouble();

        if (cekKubus(sisi1, sisi2, sisi3)) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }

    public static boolean cekKubus(double sisi1, double sisi2, double sisi3) {
        return sisi1 == sisi2 && sisi2 == sisi3;
    }
}
