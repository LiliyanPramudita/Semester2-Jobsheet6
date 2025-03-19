public class Dosen15 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen15(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    void tampil() {
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", JK: " + (jenisKelamin ? "Laki-laki" : "Perempuan") + ", Usia: " + usia);
    }
    
}
