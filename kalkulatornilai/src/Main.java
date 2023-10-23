package kalkulatornilai.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan nilai Tubes: ");
        double nilaiTubes = input.nextDouble();

        System.out.print("Masukkan nilai Quiz: ");
        double nilaiQuiz = input.nextDouble();

        System.out.print("Masukkan nilai Tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double nilaiUts = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double nilaiUas = input.nextDouble();

        double totalNilai = (0.30 * nilaiTubes) + (0.10 * nilaiQuiz) + (0.10 * nilaiTugas) + (0.25 * nilaiUts)
                + (0.25 * nilaiUas);

        System.out.println("\nNama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.printf("Nilai Matakuliah Pemrograman Berorientasi Objek: %.2f", totalNilai);
    }
}
