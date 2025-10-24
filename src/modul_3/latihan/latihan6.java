package modul_3.latihan;
import java.util.Scanner;
public class latihan6 {

        public static void prosesDataMahasiswa(String data) {
            System.out.println("\n=== PENGOLAHAN DATA MAHASISWA ===");
            // Memisahkan data berdasarkan koma
            String[] dataMahasiswa = data.split(",");

            System.out.println("Data yang dimasukkan:");
            for (int i = 0; i < dataMahasiswa.length; i++) {
                dataMahasiswa[i] = dataMahasiswa[i].trim(); // Menghilangkan spasi
                System.out.println((i + 1) + ". " + dataMahasiswa[i]);
            }

            // Analisis data
            System.out.println("\n=== ANALISIS DATA ===");
            System.out.println("Jumlah mahasiswa: " + dataMahasiswa.length);

            // Mencari nama terpanjang dan terpendek
            String namaTerpanjang = dataMahasiswa[0];
            String namaTerpendek = dataMahasiswa[0];

            for (String nama : dataMahasiswa) {
                if (nama.length() > namaTerpanjang.length()) {
                    namaTerpanjang = nama;
                }
                if (nama.length() < namaTerpendek.length()) {
                    namaTerpendek = nama;
                }
            }

            System.out.println("Nama terpanjang: " + namaTerpanjang + " (" + namaTerpanjang.length() + " karakter)");
            System.out.println("Nama terpendek: " + namaTerpendek + " (" + namaTerpendek.length() + " karakter)");

            System.out.println("\n=== FORMAT DATA ===");
            for (String nama : dataMahasiswa) {
                // ✅ Validasi nama
                if (!validasiNama(nama)) {
                    System.out.println("Nama \"" + nama + "\" tidak valid (mengandung angka atau karakter khusus).");
                    System.out.println("---");
                    continue;
                }

                String namaFormatted = formatTitleCase(nama);
                String inisial = buatInisial(namaFormatted);
                String username = buatUsername(namaFormatted);
                String email = buatEmail(namaFormatted);

                System.out.println("Nama lengkap: " + namaFormatted);
                System.out.println("Inisial: " + inisial);
                System.out.println("Username: " + username);
                System.out.println("Email: " + email);
                System.out.println("---");
            }
        }

        public static String formatTitleCase(String teks) {
            String[] kata = teks.toLowerCase().split(" ");
            StringBuilder result = new StringBuilder();

            for (String k : kata) {
                if (k.length() > 0){
                    result.append(Character.toUpperCase(k.charAt(0)))
                            .append(k.substring(1))
                            .append(" ");
                }
            }
            return result.toString().trim();
        }

        public static String buatInisial(String nama) {
            String[] kata = nama.split(" ");
            StringBuilder inisial = new StringBuilder();

            for (String k : kata) {
                if (k.length() > 0) {
                    inisial.append(Character.toUpperCase(k.charAt(0)));
                }
            }
            return inisial.toString();
        }

        public static String buatUsername(String nama) {
            String[] kata = nama.split(" ");
            return kata[0].toLowerCase();
        }

        // ✅ Method tambahan: Membuat email berdasarkan nama
        public static String buatEmail(String nama) {
            String[] kata = nama.split(" ");
            if (kata.length < 2) {
                // Jika hanya satu kata, gunakan kata itu + angka random
                return kata[0].toLowerCase() + "@example.com";
            } else {
                return (kata[0].toLowerCase() + "." + kata[kata.length - 1].toLowerCase() + "@example.com");
            }
        }

        // ✅ Method tambahan: Validasi nama
        public static boolean validasiNama(String nama) {
            // Hanya boleh huruf dan spasi
            return nama.matches("[a-zA-Z\\s]+");
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Contoh: Alice Johnson, Bob Smith, CHARLIE BROWN");
            System.out.print("Masukkan daftar nama (dipisahkan koma): ");
            String dataInput = input.nextLine();
            prosesDataMahasiswa(dataInput);
        }
    }


