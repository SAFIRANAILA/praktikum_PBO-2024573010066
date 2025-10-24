package modul_3.latihan;
import java.util.Scanner;
public class latihan4 {
        // Method untuk input array
        public static int[] inputArray(int ukuran) {
            Scanner input = new Scanner(System.in);
            int[] array = new int[ukuran];
            System.out.println("Masukkan " + ukuran + " angka:");
            for (int i = 0; i < ukuran; i++) {
                System.out.print("Angka ke-" + (i + 1) + ": ");
                array[i] = input.nextInt();
            }
            return array;
        }

        // Method untuk menampilkan array
        public static void tampilkanArray(int[] array) {
            System.out.print("Array: [");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1)
                    System.out.print(", ");
            }
            System.out.println("]");
        }

        // Method untuk mencari nilai maksimum
        public static int cariMaksimum(int[] array) {
            int maks = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maks) {
                    maks = array[i];
                }
            }
            return maks;
        }

        // Method untuk mencari nilai minimum
        public static int cariMinimum(int[] array) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }

        // Method untuk menghitung rata-rata
        public static double hitungRataRata(int[] array) {
            int total = 0;
            for (int nilai : array) {
                total += nilai;
            }
            return (double) total / array.length;
        }

        // Method untuk mengurutkan array (Bubble Sort)
        public static int[] urutkanArray(int[] array) {
            int[] arrayBaru = array.clone();
            for (int i = 0; i < arrayBaru.length - 1; i++) {
                for (int j = 0; j < arrayBaru.length - 1 - i; j++) {
                    if (arrayBaru[j] > arrayBaru[j + 1]) {
                        int temp = arrayBaru[j];
                        arrayBaru[j] = arrayBaru[j + 1];
                        arrayBaru[j + 1] = temp;
                    }
                }
            }
            return arrayBaru;
        }

        // ✅ Method tambahan: Cari nilai tertentu dalam array
        public static int cariNilai(int[] array, int target) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    return i; // index ditemukan
                }
            }
            return -1; // tidak ditemukan
        }

        // ✅ Method tambahan: Hitung median dari array terurut
        public static double hitungMedian(int[] arrayTerurut) {
            int n = arrayTerurut.length;
            if (n % 2 == 1) {
                return arrayTerurut[n / 2]; // tengah langsung
            } else {
                return (arrayTerurut[n / 2 - 1] + arrayTerurut[n / 2]) / 2.0;
            }
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("==== PROGRAM ANALISIS ARRAY ====");
            int[] data = inputArray(5);

            System.out.println("\n==== HASIL ANALISIS ====");
            tampilkanArray(data);
            System.out.println("Nilai Maksimum: " + cariMaksimum(data));
            System.out.println("Nilai Minimum: " + cariMinimum(data));
            System.out.println("Rata-rata: " + hitungRataRata(data));

            int[] dataTerurut = urutkanArray(data);
            System.out.print("Array setelah diurutkan: ");
            tampilkanArray(dataTerurut);

            // ✅ Mencari nilai tertentu
            System.out.print("\nMasukkan angka yang ingin dicari: ");
            int target = input.nextInt();
            int hasilCari = cariNilai(data, target);
            if (hasilCari != -1) {
                System.out.println(target + " ditemukan pada index ke-" + hasilCari);
            } else {
                System.out.println(target + " tidak ditemukan dalam array.");
            }

            // ✅ Menampilkan median
            System.out.println("Median dari array: " + hitungMedian(dataTerurut));
        }
    }


