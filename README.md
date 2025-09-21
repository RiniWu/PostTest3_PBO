# PostTest3_PBO (Manajemen_Daftar_Festival_Budaya)

Nama : Rini Wulandari

NIM : 2409116048

Kelas : Sistem Informasi B 2024

## Penjelasan Singkat terkait Program
Program ini berguna dalam menampung informasi data dari Festival Budaya mulai dari nama festival, asal festival dan tanggal pelaksanaan festival. Dalam program ini menyediakan opsi untuk menambahkan festival baru, menampilkan daftar festival dalam format tabel, mengubah data festival berdasarkan nomor urut, serta menghapus festival sekaligus memperbarui daftar agar tetap berurutan. Proses menu dijalankan menggunakan perulangan do-while dan struktur switch-case, dilengkapi validasi agar input nomor yang dipilih sesuai dengan data yang ada.

## Struktur Program
Program ini dibagi menjadi 3 package utama dengan 2 subclass pada package Model:

<img width="278" height="219" alt="image" src="https://github.com/user-attachments/assets/1006e472-30d7-478f-af11-5d3935bfda8c" />

1. **package Main**

   Package ini berisi class mainFestival yang menampilkan menu interaktif kepada pengguna. Melalui menu ini, pengguna bisa mengakses berbagai fitur CRUD dengan lebih mudah, lengkap dengan validasi agar input tetap aman.

2. **package Model**

   Di package ini terdapat class modelFestival yang menyimpan data dasar sebuah festival, seperti nama, asal daerah, dan tanggal pelaksanaannya. Package ini berfungsi sebagai tempat mendefinisikan struktur data yang akan dipakai program.

   - **SubClass Tradisional**

     fyqgfi
     
   - **SubClass SeniPertunjukan**

     ouiefhuh
   
4. **package Service**

   Package ini berisi class serviceFestival yang mengatur semua logika CRUD. Di sinilah data festival dikelola, mulai dari menambah, menampilkan, mengubah, hingga menghapus, sehingga menjadi penghubung antara data dan menu utama.
