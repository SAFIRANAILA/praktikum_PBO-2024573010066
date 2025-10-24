package modul_2;

import java.util.Scanner;

public class GradeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai (0-100: ");
        int nilai = input.nextInt();

        char Grade;
        String Keterangan;

        //menggunakan if-else if-else
        if (nilai >= 85) {
            Grade = 'A';
            Keterangan = "Excellent";
        } else if (nilai >= 75) {
            Grade = 'B';
            Keterangan = "Good";
        } else if (nilai >= 65) {
            Grade = 'C';
            Keterangan = "Fair";
        } else if (nilai >= 55) {
            Grade = 'D';
            Keterangan = "Poor";
        } else {
            Grade = 'E';
            Keterangan = "Fail";
        }
        System.out.println("Nilai: " + nilai);
        System.out.println("Grade: " + Grade);
        System.out.println("Keterangan: " + Keterangan);

        input.close();



    }
}
