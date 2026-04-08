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