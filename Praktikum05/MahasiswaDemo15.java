import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // Membersihkan buffer

        MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // Membersihkan buffer

            list.tambah(new Mahasiswa15(nim, nama, kelas, ipk));
        }

        System.out.println("\nData mahasiswa sebelum sorting:");
        list.tampil();

        list.bubbleSort();

        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}

    
