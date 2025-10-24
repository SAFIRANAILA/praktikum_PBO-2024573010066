package modul_3.latihan;
import java.util.Scanner;
public class latihan2 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            // Langkah 1: Deklarasi array 2D untuk nilai siswa (3 siswa, 4 mata pelajaran)
            int[][] nilaiSiswa = new int[3][4];
            String[] namaSiswa = new String[3];
            String[] mataPelajaran = {"Matematika", "Bahasa Indonesia", "IPA", "IPS"};

            // Langkah 2: Input nilai
            System.out.println("=== INPUT NILAI SISWA ===");
            for (int i = 0; i < 3; i++) {
                System.out.print("Nama siswa ke-" + (i + 1) + ": ");
                namaSiswa[i] = input.next();
                for (int j = 0; j < 4; j++) {
                    System.out.print(mataPelajaran[j] + ": ");
                    nilaiSiswa[i][j] = input.nextInt();
                }
                System.out.println();
            }

            // Langkah 3: Menampilkan data dalam bentuk tabel
            System.out.println("=== TABEL NILAI SISWA ===");
            System.out.printf("%-15s", "Nama");
            for (int i = 0; i < 4; i++) {
                System.out.printf("%-15s", mataPelajaran[i].substring(0, Math.min(7, mataPelajaran[i].length())));
            }
            System.out.printf("%-15s\n", "Rata-rata");

            for (int i = 0; i < 3; i++) {
                System.out.printf("%-15s", namaSiswa[i]);
                int total = 0;
                for (int j = 0; j < 4; j++) {
                    System.out.printf("%-15d", nilaiSiswa[i][j]);
                    total += nilaiSiswa[i][j];
                }
                double ratarata = total / 4.0;
                System.out.printf("%-15.2f\n", ratarata);
            }

            // ✅ Fitur Tambahan
            System.out.println("\n=== NILAI TERTINGGI SETIAP SISWA ===");
            for (int i = 0; i < 3; i++) {
                int max = nilaiSiswa[i][0];
                int indexMax = 0;

                for (int j = 1; j < 4; j++) {
                    if (nilaiSiswa[i][j] > max) {
                        max = nilaiSiswa[i][j];
                        indexMax = j;
                    }
                }
                System.out.println(namaSiswa[i] + " tertinggi pada: " + mataPelajaran[indexMax] + " (" + max + ")");
            }

            System.out.println("\n=== RATA-RATA SETIAP MATA PELAJARAN ===");
            for (int j = 0; j < 4; j++) {
                int totalMapel = 0;
                for (int i = 0; i < 3; i++) {
                    totalMapel += nilaiSiswa[i][j];
                }
                double rataMapel = totalMapel / 3.0;
                System.out.println(mataPelajaran[j] + ": " + String.format("%.2f", rataMapel));
            }
        }
    }


