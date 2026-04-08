import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        // pakai konstruktor berparameter
        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : "); 
            String nim = sc.nextLine();
            System.out.print("Nama  : "); 
            String nama = sc.nextLine();
            System.out.print("Kelas : "); 
            String kelas = sc.nextLine();
            System.out.print("IPK   : "); 
            double ipk = sc.nextDouble();
            sc.nextLine();

            System.out.println("------------------------------");
            list.tambah(new Mahasiswa02(nim, nama, kelas, ipk));
        }

        list.tampil();

        // sequential searching
        System.out.println("--------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------");
        System.out.print("Masukkan IPK yang dicari: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan Sequential Searching");
        int posisi = list.sequentialSearching(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);

        // binary search
        System.out.println("--------------------------------------------");
        System.out.print("Masukkan IPK yang dicari lagi: ");
        double cari2 = sc.nextDouble();

        System.out.println("Menggunakan Binary Search");
        int posisi2 = list.findBinarySearch(cari2, 0, jumMhs - 1);
        list.tampilPosisi(cari2, posisi2);
        list.tampilDataSearch(cari2, posisi2);

        sc.close();
    }
}