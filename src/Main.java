import java.util.Scanner;

/**
 * Kelas ini untuk menghitung deret Fibonacci menggunakan rekursi dengan teknik memoisasi.
 * Memungkinkan pengguna untuk memasukkan jumlah deret Fibonacci yang ingin ditampilkan.
 *
 *
 * <p>author : rakhmat
 * <p>@version 1.0
 * pucek
 */

public class Main {
    static long[] memo;
    /**
     * Konstruktor default untuk kelas ini.
     */
    public Main() {}

    /**
     * Metode utama untuk menghitung dan menampilkan deret Fibonacci.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret Fibonacci yang ingin ditampilkan: ");
        int n = scanner.nextInt();

        long startTime = System.currentTimeMillis();

        System.out.println("Deret Fibonacci rekursif:");
        memo = new long[n + 1]; // Menyiapkan memoisasi
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacciRekursif(i) + " ");
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Waktu eksekusi: " + executionTime + " milidetik");
    }

    /**
     * Menghitung bilangan Fibonacci ke-n menggunakan rekursi dengan memoisasi.
     *
     * @param n Indeks bilangan Fibonacci yang ingin dihitung.
     * @return Bilangan Fibonacci ke-n.
     */
    public static long fibonacciRekursif(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo[n] != 0) {
            return memo[n]; // Menggunakan hasil memoisasi jika sudah ada
        } else {
            memo[n] = fibonacciRekursif(n - 1) + fibonacciRekursif(n - 2);
            return memo[n];
        }
    }
}
