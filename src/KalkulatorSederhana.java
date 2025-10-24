import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Kalkulator Sederhana ===");

        // Input dua angka
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        // Operasi matematika
        double tambah = angka1 + angka2;
        double kurang = angka1 - angka2;
        double kali = angka1 * angka2;
        double bagi = angka1 / angka2;

        // Output hasil
        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Penjumlahan : " + tambah);
        System.out.println("Pengurangan : " + kurang);
        System.out.println("Perkalian   : " + kali);
        System.out.println("Pembagian   : " + bagi);
        System.out.println("\n=== Hasil Perhitungan ===");

        input.close();
    }
}
