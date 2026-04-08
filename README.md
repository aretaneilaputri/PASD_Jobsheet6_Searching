# PASD_Jobsheet6_Searching

6.2.3 Pertanyaan dan Jawaban
1. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!
Jawaban : Perbedaan antara method tampilPosisi dan tampilDataSearch adalah pada fungsi yang ditampilkan:
tampilPosisi digunakan untuk menampilkan letak atau indeks dari data yang ditemukan di dalam array. Jadi fokusnya hanya memberi tahu di posisi ke berapa data itu ada.Sedangkan tampilDataSearch digunakan untuk menampilkan isi data mahasiswa secara lengkap, seperti NIM, nama, kelas, dan IPK dari data yang ditemukan.
2. Jelaskan fungsi break pada kode program di bawah ini! 
    if (listMhs[j].ipk==cari){
        posisi=j;
        break;
    }
Jawaban: Fungsi break pada kode tersebut adalah untuk menghentikan perulangan (loop) saat data yang dicari sudah ditemukan.Agar program tidak melanjutkan pencarian ke data berikutnya yang sebenarnya sudah tidak perlu dicek lagi, sehingga lebih cepat dan efisien.
3.	Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?
Jawaban: Variabel pos berfungsi untuk menyimpan indeks atau posisi data yang ditemukan dalam array, sehingga bisa digunakan untuk mengetahui letak dan menampilkan data tersebut.
4.	Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan menampilkan data ke berapa? Jelaskan.
Jawaban: Yang ditampilkan adalah data pertama yang ditemukan.Karena saat data sudah cocok, program langsung berhenti dengan break, jadi tidak melanjutkan pencarian ke data berikutnya.
5.	Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari kode di atas?
Jawaban: Jika break dihapus, maka perulangan akan tetap berjalan sampai akhir.yang berakibat, yang tersimpan di pos adalah data terakhir yang memiliki nilai yang sama, bukan yang pertama.

6.3 — Percobaan Binary Search
1.	Tunjukkan pada kode program yang mana proses divide dijalankan!
Jawaban: Proses divide terdapat pada kode 
mid = (left + right) / 2 program menentukan titik tengah dari data. Titik tengah ini digunakan untuk membandingkan nilai yang dicari dengan data yang ada
2.	Tunjukkan pada kode program yang mana proses conquer dijalankan!
Jawaban: Proses conquer terlihat pada saat program melanjutkan pencarian ke salah satu bagian hasil pembagian, yaitu melalui pemanggilan method secara rekursif:return findBinarySearch(cari, left, mid - 1); atau return findBinarySearch(cari, mid + 1, right); pada bagian tersebut program sudah menentukan akan fokus ke bagian kiri atau kanan, lalu “menyelesaikan” pencarian di bagian tersebut dengan menjalankan fungsi yang sama lagi. Jadi, tahap conquer ini adalah saat program menindaklanjuti hasil pembagian dan berusaha mendapatkan hasil dari bagian yang dipilih.
3.	Apa fungsi left, right, dan mid?
Jawaban: left digunakan sebagai penanda batas awal (indeks paling kiri) dari data yang sedang dicari. Sementara right adalah penanda batas akhir (indeks paling kanan). Jadi, dua variabel ini menentukan bagian mana dari array yang sedang diperiksa.Sedangkan mid adalah nilai tengah yang didapat dari left dan right. Nilai ini dipakai untuk mengecek apakah data yang dicari ada di posisi tengah. Kalau belum ketemu, dari sinilah program memutuskan apakah akan lanjut ke kiri atau ke kanan.
4.	Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian?
Jawaban: Programnya tetap bisa dijalankan, tapi hasilnya tergantung metode pencariannya.Kalau pakai sequential search, program tetap bisa menemukan data walaupun IPK tidak urut. Soalnya metode ini mengecek data satu per satu dari awal sampai akhir, jadi tidak butuh data dalam keadaan terurut.Tapi kalau pakai binary search, hasilnya bisa jadi salah atau data tidak ditemukan. Ini karena binary search bekerja dengan cara membagi data berdasarkan nilai tengah, sehingga syarat utamanya data harus sudah terurut. Kalau datanya acak, pembagian ke kiri atau kanan jadi tidak sesuai, dan pencariannya bisa gagal.
5.	Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai
Jawaban: Kalau data IPK diurutkan dari terbesar ke terkecil (descending) seperti 3.8, 3.7, 3.5, 3.4, 3.2, lalu kita cari 3.2, maka binary search yang sekarang kemungkinan tidak akan bekerja dengan benar.Karena logika binary search di kodenya dibuat untuk data urut naik (ascending). Jadi saat membandingkan nilai tengah, arah pencariannya jadi terbalik. Akibatnya, data bisa tidak ditemukan padahal sebenarnya ada.Supaya hasilnya sesuai dengan data yang descending, kondisi perbandingannya harus dibalik. seperti berikut:
int findBinarySearch(double cari, int left, int right) {
    int mid;
    if (right >= left) {
        mid = (left + right) / 2;

        if (cari == listMhs[mid].ipk) {
            return mid;
        } else if (listMhs[mid].ipk < cari) {
            return findBinarySearch(cari, left, mid - 1); // dibalik
        } else {
            return findBinarySearch(cari, mid + 1, right); // dibalik
        }
    }
    return -1;
}
6.	Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam array.
Jawaban: Binary search menentukan data tidak ditemukan saat batas pencarian sudah habis. Artinya, nilai left sudah melewati right (left > right), sehingga tidak ada lagi bagian array yang bisa dicek.
7.	Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard.
Jawaban: Supaya jumlah mahasiswa bisa menyesuaikan input dari user, perlu mengubah bagian yang tadinya tetap menjadi dinamis, baik di MahasiswaDemo02 maupun MahasiswaBerprestasi02.

Di MahasiswaDemo02.java, jumlah mahasiswa yang awalnya langsung diisi angka tetap diganti dengan input dari keyboard:
// sebelumnya
int jumMhs = 5;
// sesudah diubah
System.out.print("Masukkan jumlah mahasiswa: ");
int jumMhs = sc.nextInt();
sc.nextLine();
Lalu di MahasiswaBerprestasi02.java, array yang awalnya langsung berukuran 5 diubah supaya mengikuti jumlah yang dimasukkan:
// sebelumnya
Mahasiswa02[] listMhs = new Mahasiswa02[5];

// sesudah diubah
Mahasiswa02[] listMhs;

MahasiswaBerprestasi02(int jumlah) {
    listMhs = new Mahasiswa02[jumlah];
}
Terakhir, saat membuat objek di MahasiswaDemo02, juga harus disesuaikan dengan jumlah yang sudah diinput:
// sebelumnya
MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02();

// sesudah
MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02(jumMhs);