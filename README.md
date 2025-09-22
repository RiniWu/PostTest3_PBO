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

   Di package ini terdapat class modelFestival yang berperan sebagai superclass dari subclass Tradisional dan SeniPertujukan untuk menyimpan data dasar sebuah festival, seperti nama, asal daerah, dan tanggal pelaksanaannya. Package ini berfungsi sebagai tempat mendefinisikan struktur data yang akan dipakai program.

   - **SubClass Tradisional**, digunakan untuk merepresentasikan festival yang masih kental akan adat istiadat. Selain atribut umum dari kelas modelFestival, ditambahkan atribut ritualAdat untuk menampilkan detail khas, seperti ritual utama dalam festival budaya.
     
   - **SubClass SeniPertunjukan**, digunakan untuk menggambarkan festival yang berfokus pada seni, seperti tari, musik, atau teater. Kelas ini menambahkan atribut jenisSeni sehingga informasi festival seni bisa ditampilkan lebih spesifik sesuai jenis pertunjukannya dalam festival.
   
3. **package Service**

   Package ini berisi class serviceFestival yang mengatur semua logika CRUD. Di sinilah data festival dikelola, mulai dari menambah, menampilkan, mengubah, hingga menghapus, sehingga menjadi penghubung antara data dan menu utama.


## Penjelasan Source Code Program
### 1. Package & Class modelFestival

<img width="274" height="108" alt="image" src="https://github.com/user-attachments/assets/90545fde-9bbd-40ef-9111-d13db879794d" />


**a. Deklarasi package**

<img width="178" height="34" alt="image" src="https://github.com/user-attachments/assets/133a80bd-bb32-4ff0-af7a-4da25939bec2" />

- Package berfungsi untuk mengelompokkan kelas agar lebih terstruktur, rapi, dan mudah dikelola. Gambar diatas menunjukkan bahwa class modelFestival berada dalam package bernama Model.

**b. Deklarasi Class**

<img width="356" height="30" alt="image" src="https://github.com/user-attachments/assets/bfa378d8-82d7-4459-9a4f-a349bb6ad303" />

- Deklarasi public class modelFestival {} menunjukkan bahwa kita sedang membuat sebuah class bernama modelFestival. Class ini bisa dipakai di mana saja karena access modifier bersifat public.

**c. Atribut**

<img width="413" height="84" alt="image" src="https://github.com/user-attachments/assets/e6ca86e8-b125-42f1-99ee-2896c5bdce3f" />

- Kode di atas mendefinisikan tiga atribut dalam class Model dengan modifier private yaitu namaFestival, asal, dan tanggalPelaksanaan. Ketiganya bertipe String dan berfungsi untuk menyimpan data utama tentang festival bud. Modifier private membuat atribut hanya bisa diakses melalui method khusus salah satunya getter dan setter.

**d. Construktor**

<img width="1055" height="158" alt="image" src="https://github.com/user-attachments/assets/ed7c488c-c10b-4712-95b2-6e8ccc1afeea" />

- Pada construktor ini otomatis akan dijalankan saat kita membuat objek baru dari kelas modelFestival. Parameter yang dimasukkan adalah namaFestival, asal, tanggalPelaksanaan yang dimana langsung disimpan ke dalam variabel kelas menggunakan kata kunci "this.".

**e. Getter dan Setter**

<img width="485" height="291" alt="image" src="https://github.com/user-attachments/assets/72127031-6e5e-4ef6-a9b0-a670aaadaabe" />

<img width="753" height="296" alt="image" src="https://github.com/user-attachments/assets/5199a5c5-c731-4c7f-88cf-c1a3a48fb0b1" />

- Getter dan Setter ini berfungsi untuk mengambil dan mengubah data festival. Method getter dipakai untuk melihat nilai dari atribut, seperti nama festival, asal, dan tanggal pelaksanaannya. Sedangkan method setter dipakai untuk mengganti atau memberikan nilai baru pada atribut tersebut. Cara ini menjaga agar data tetap aman karena atribut dibuat private, tetapi tetap bisa digunakan lewat method khusus.

**f. Method toString()**

<img width="1131" height="106" alt="image" src="https://github.com/user-attachments/assets/e00fd39a-4d26-4a55-ae14-e2cccc715777" />

- Di bagian akhir ada metode toString(). Ini adalah cara untuk mengatur bagaimana sebuah objek ditampilkan kalau dipanggil dengan System.out.println(). Dalam kode ini digunakan String.format() untuk membuat tampilan yang rapi seperti tabel nama festival ditaruh di kolom rata kiri dengan lebar 30 karakter, asal di kolom 20 karakter, dan tanggal pelaksanaan di kolom 20 karakter juga. Hasilnya, daftar festival akan tercetak sejajar sehingga lebih mudah dibaca.

### 2. SubClass Tradisional
**a. Deklarasi Package**






- Kode diatas berfungsi untuk mengembalikan jumlah data festival yang ada di dalam list.

