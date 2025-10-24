package modul_3.latihan;

public class latihan1 {

        public static void main(String[] args) {
            // Langkah 1: Deklarasi dan inisialisasi array
            int[] nilai = {85, 90, 78, 92, 88};
            String[] nama = {"Alice", "Bob", "Charlie", "Diana", "Eva"};

            // Langkah 2: Menampilkan panjang array
            System.out.println("Jumlah siswa: " + nilai.length);

            // Langkah 3: Mengakses elemen array
            System.out.println("Nama siswa pertama: " + nama[0]);

            // Langkah 4: Menampilkan semua data menggunakan loop
            System.out.println("\nData semua siswa:");
            for (int i = 0; i < nama.length; i++) {
                System.out.println((i + 1) + ". " + nama[i] + " - Nilai: " + nilai[i]);
            }

            // Tambahan: Menghitung rata-rata, nilai tertinggi & terendah
            int total = 0;
            int max = nilai[0];
            int min = nilai[0];

            for (int i = 0; i < nilai.length; i++) {
                total += nilai[i];

                if (nilai[i] > max) {
                    max = nilai[i];
                }

                if (nilai[i] < min) {
                    min = nilai[i];
                }
            }

            double rataRata = (double) total / nilai.length;

            // Tampilkan hasil tambahan
            System.out.println("\nRata-rata nilai: " + rataRata);
            System.out.println("Nilai tertinggi: " + max);
            System.out.println("Nilai terendah: " + min);
        }
    }


