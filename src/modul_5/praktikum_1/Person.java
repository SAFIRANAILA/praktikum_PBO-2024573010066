package modul_5.praktikum_1;

public class Person {
    // Private - hanya bisa diakses di dalam class ini
    private String nama;
    private int umur;

    // Default - diakses dalam package yang sama
    String alamat;

    // Protected - diakses dalam package dan sublcass
    protected String telepon;

    // public - diakses dri mana saja
    public String email;

    //  Constructor
    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    // public method untuk menampilkan info
    public void tampilkanInfo() {
        System.out.println("INFORMASI PERSON");  // ok- dalam class yg sama
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Alamat : " + alamat);
        System.out.println("Telepon : " + telepon);
        System.out.println("Email : " + email); //
    }

    // Private method - hanya bisa dipanggil dalam class ini
    private void metodePribadi() {
        System.out.println("Ini adalah method private");
    }

    // Protected method
    protected void metodeProtected() {
        System.out.println("Ini adalah method protected");
    }

    // Method untuk mengakses private method
    public void panggilMetodePribadi() {
        metodePribadi(); // Ok dalam class yg sama
    }
}
