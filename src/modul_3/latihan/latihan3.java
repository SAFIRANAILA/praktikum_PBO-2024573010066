package modul_3.latihan;

public class latihan3 {
        public static void tampilkanHeader() {
            System.out.println("=========================");
            System.out.println("   PROGRAM KALKULATOR SEDERHANA");
            System.out.println("=========================");
            System.out.println();
        }

        public static void tampilkanHasil(String operasi, double a, double b, double hasil) {
            System.out.printf("%.2f %s %.2f = %.2f%n", a, operasi, b, hasil);
        }

        // Method dasar
        public static double tambah(double a, double b) {
            return a + b;
        }

        public static double kurang(double a, double b) {
            return a - b;
        }

        public static double kali(double a, double b) {
            return a * b;
        }

        public static double bagi(double a, double b) {
            if (b == 0) {
                System.out.println("Error: Pembagian dengan nol!");
                return Double.NaN;
            } else {
                return a / b;
            }
        }

        // ✅ Method tambahan: Pangkat
        public static double pangkat(double a, double b) {
            return Math.pow(a, b);
        }

        // ✅ Method tambahan: Akar kuadrat (untuk satu angka)
        public static double akarKuadrat(double a) {
            if (a < 0) {
                System.out.println("Error: Tidak bisa akar bilangan negatif!");
                return Double.NaN;
            }
            return Math.sqrt(a);
        }

        // Validasi angka
        public static boolean validasiAngka(double angka) {
            return !(Double.isNaN(angka) || Double.isInfinite(angka));
        }

        public static void main(String[] args) {
            tampilkanHeader();

            double x = 15.5;
            double y = 4.2;

            if (validasiAngka(x) && validasiAngka(y)) {
                double hasilTambah = tambah(x, y);
                double hasilKurang = kurang(x, y);
                double hasilKali = kali(x, y);
                double hasilBagi = bagi(x, y);
                double hasilPangkat = pangkat(x, y);
                double hasilAkarX = akarKuadrat(x);
                double hasilAkarY = akarKuadrat(y);

                tampilkanHasil("+", x, y, hasilTambah);
                tampilkanHasil("-", x, y, hasilKurang);
                tampilkanHasil("*", x, y, hasilKali);
                tampilkanHasil("/", x, y, hasilBagi);

                System.out.printf("%.2f ^ %.2f = %.2f%n", x, y, hasilPangkat);
                System.out.printf("√%.2f = %.2f%n", x, hasilAkarX);
                System.out.printf("√%.2f = %.2f%n", y, hasilAkarY);
            }
        }
    }


