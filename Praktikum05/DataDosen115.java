import java.util.Scanner;

public class DataDosen115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen15 list = new DataDosen15();
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah data");
            System.out.println("2. Tampil data");
            System.out.println("3. Sorting ASC (Usia)");
            System.out.println("4. Sorting DSC (Usia)");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (Laki-laki: true, Perempuan: false): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    list.tambah(new Dosen15(kode, nama, jk, usia));
                    break;
                case 2:
                    list.tampil();
                    break;
                case 3:
                    list.sortingASC();
                    System.out.println("Data setelah sorting ASC berdasarkan usia:");
                    list.tampil();
                    break;
                case 4:
                    list.sortingDSC();
                    System.out.println("Data setelah sorting DSC berdasarkan usia:");
                    list.tampil();
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
        sc.close();
    }
    
}
