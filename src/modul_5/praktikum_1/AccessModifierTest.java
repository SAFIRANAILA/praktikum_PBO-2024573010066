package modul_5.praktikum_1;

public class AccessModifierTest {
    public static void main(String[] args) {
        Person person = new Person("Budi Santoso", 25);

        // Test akses public
        person.email = "budi@email.com"; // ok - public
        System.out.println("Email: " + person.email);

        person.alamat = "Jakarta";
        System.out.println("Alamat: " + person.alamat);

        person.telepon = "081234567890";
        System.out.println("Telepon: " + person.telepon);

        // Test akses private - AKAN ERROR JIKA UNCOMENT
        // person.nama = "Andi";        // ERROR - private
        // person.umur = 30;            // ERROR - private
        // person.metodePribadi();      // ERROR - private

        // Mengakses data private melalui public method
        person.tampilkanInfo();

        // Mengakses private method melalui public mthod
        person.panggilMetodePribadi();

        System.out.println("\nDEMONSTRASI ACCESS MODIFIER");
        System.out.println("✔ Public     : Bisa diakses");
        System.out.println("✔ Default    : Bisa diakses (dalam package sama)");
        System.out.println("✔ Protected  : Bisa diakses (dalam package sama)");
        System.out.println("✘ Private    : TIDAK bisa diakses langsung");


    }
}
