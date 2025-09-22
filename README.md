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
```Java
package Model;
```
Package berfungsi untuk mengelompokkan kelas agar lebih terstruktur, rapi, dan mudah dikelola. Gambar diatas menunjukkan bahwa class modelFestival berada dalam package bernama Model.

**b. Deklarasi Class**
```Java
public class modelFestival {
```
Deklarasi public class modelFestival {} menunjukkan bahwa kita sedang membuat sebuah class bernama modelFestival. Class ini bisa dipakai di mana saja karena access modifier bersifat public.

**c. Atribut**
```Java
   private String namaFestival;
   private String asal;
   private String tanggalPelaksanaan;
```
Kode di atas mendefinisikan tiga atribut dalam class Model dengan modifier private yaitu namaFestival, asal, dan tanggalPelaksanaan. Ketiganya bertipe String dan berfungsi untuk menyimpan data utama tentang festival bud. Modifier private membuat atribut hanya bisa diakses melalui method khusus salah satunya getter dan setter.

**d. Construktor**
```Java
public modelFestival(String namaFestival, String asal, String tanggalPelaksanaan) {
   this.namaFestival = namaFestival;
   this.asal = asal;
   this.tanggalPelaksanaan = tanggalPelaksanaan;
}
```
Pada construktor ini otomatis akan dijalankan saat kita membuat objek baru dari kelas modelFestival. Parameter yang dimasukkan adalah namaFestival, asal, tanggalPelaksanaan yang dimana langsung disimpan ke dalam variabel kelas menggunakan kata kunci "this.".

**e. Getter dan Setter**
```Java
public String getNamaFestival() {
   return namaFestival;
}

public String getAsal() {
   return asal;
}

public String getTanggalPelaksanaan() {
   return tanggalPelaksanaan;
}

public void setNamaFestival(String namaFestival) {
   this.namaFestival = namaFestival;
}

public void setAsal(String asal) {
   this.asal = asal;
}

public void setTanggalPelaksanaan(String tanggalPelaksanaan) {
   this.tanggalPelaksanaan = tanggalPelaksanaan;
}
```
- Getter dan Setter ini berfungsi untuk mengambil dan mengubah data festival. Method getter dipakai untuk melihat nilai dari atribut, seperti nama festival, asal, dan tanggal pelaksanaannya.
- Sedangkan method setter dipakai untuk mengganti atau memberikan nilai baru pada atribut tersebut. Cara ini menjaga agar data tetap aman karena atribut dibuat private, tetapi tetap bisa digunakan lewat method khusus.

**f. Method toString()**
```Java
@Override
public String toString() {
   return String.format("%-30s | %-20s | %-20s", namaFestival, asal, tanggalPelaksanaan);
}
```

- Di bagian akhir ada metode toString(). Ini adalah cara untuk mengatur bagaimana sebuah objek ditampilkan kalau dipanggil dengan System.out.println().
- Dalam kode ini digunakan String.format() untuk membuat tampilan yang rapi seperti tabel nama festival ditaruh di kolom rata kiri dengan lebar 30 karakter, asal di kolom 20 karakter, dan tanggal pelaksanaan di kolom 20 karakter juga. Hasilnya, daftar festival akan tercetak sejajar sehingga lebih mudah dibaca.

### 2. SubClass Tradisional
**a. Deklarasi Package**
```Java
package Model
```

**b. Deklarasi SubClass**
```Java
public class Tradisional extends modelFestival {
    private String ritualAdat;
```
Kode diatas mendefinisikan kelas Tradisional sebagai subclass dari modelFestival. Artinya, Tradisional mewarisi semua atribut dan method dari modelFestival (seperti namaFestival, asal, dan tanggalPelaksanaan), lalu menambahkan atribut baru ritualAdat yang khusus digunakan untuk menyimpan informasi tentang ritual adat dalam festival tradisional. Dengan begitu, kelas ini bisa merepresentasikan festival yang memiliki ciri khas adat secara lebih spesifik dibandingkan kelas induknya.

**c. Construktor**
```Java
public Tradisional (String namaFestival, String asal, String tanggalPelaksanaan, String ritualAdat) {
        super(namaFestival, asal, tanggalPelaksanaan);
        this.ritualAdat = ritualAdat;
    }
```
Pada konstruktor, digunakan super(...) untuk memanggil konstruktor dari kelas induk (modelFestival) agar atribut umum seperti namaFestival, asal, dan tanggalPelaksanaan tetap diinisialisasi. Setelah itu, this.ritualAdat = ritualAdat; digunakan untuk mengisi atribut khusus milik kelas Tradisional.

**d. Getter dan Setter**
```Java
public String getRitualAdat() {
   return ritualAdat;
    }

public void setRitualAdat(String ritualAdat) {
   this.ritualAdat = ritualAdat;
    }
```
Potongan kode di atas adalah getter dan setter untuk atribut ritualAdat di subclass Tradisional.

- getRitualAdat() berfungsi untuk mengambil nilai dari atribut ritualAdat, sehingga bisa digunakan atau ditampilkan tanpa langsung mengakses variabel privatnya.

- setRitualAdat(String ritualAdat) berfungsi untuk mengubah nilai dari atribut ritualAdat dengan data baru yang diberikan.

Dengan adanya getter dan setter ini, atribut ritualAdat tetap terlindungi (karena bersifat private), tetapi tetap bisa diakses dan dimodifikasi secara aman melalui method tersebut.

**e. Method toString()**
```Java
@Override
public String toString(){
   return super.toString() + String.format(" | Ritual Adat Utama : %-15s", ritualAdat);
    }
```
Method toString() pada subclass Tradisional ini akan menampilkan data lengkap festival dengan memanggil super.toString() untuk informasi umum, lalu menambahkan atribut khusus ritualAdat. Dengan begitu, setiap objek tradisional menampilkan identitas festival beserta ritual adat utamanya secara jelas dan rapi.

### 3. SubClass SeniPertunjukan
```Java
package Model
```

**b. Deklarasi SubClass**
```Java
public class SeniPertunjukan extends modelFestival {
    private String jenisSeni;
```
- Potongan kode di atas menunjukkan deklarasi subclass SeniPertunjukan yang mewarisi (extends) kelas induk modelFestival. Subclass ini menambahkan atribut khusus yaitu jenisSeni, yang berfungsi untuk menyimpan jenis seni yang ditampilkan dalam sebuah festival.
- Dengan pewarisan ini, SeniPertunjukan otomatis memiliki atribut umum dari modelFestival (nama festival, asal, dan tanggal pelaksanaan), sekaligus memperluasnya dengan informasi tambahan tentang jenis seni yang menjadi ciri khas festival tersebut.

**c. Construktor**
```Java
public SeniPertunjukan(String namaFestival, String asal, String tanggalPelaksanaan, String jenisSeni) {
        super(namaFestival, asal, tanggalPelaksanaan);
        this.jenisSeni = jenisSeni;
    }
```
Constructor dari suclass SeniPertunjukan yang merupakan turunan dari modelFestival. Constructor  menerima 4 parameter yaitu namaFestival, asal, tanggalPelaksanaan, dan jenisSeni. Tiga parameter pertama dikirim ke constructor modelFestival menggunakan super(...), sedangkan jenisSeni diinisialisasi untuk atribut baru di kelas SeniPertunjukan.

Dengan begitu, kelas ini dapat menyimpan data festival umum dari modelFestival, ditambah informasi khusus berupa jenis seni yang ditampilkan pada festival tersebut.


**d. Getter dan Setter**
```Java
public String getJenisSeni() {
   return jenisSeni;
    }

public void setJenisSeni(String jenisSeni) {
   this.jenisSeni = jenisSeni;
    }
```
- getJenisSeni() berfungsi untuk mengambil/mengembalikan nilai dari atribut jenisSeni.

- setJenisSeni(String jenisSeni) berfungsi untuk mengubah atau menetapkan nilai baru pada atribut jenisSeni.

Dengan adanya getter dan setter ini, atribut jenisSeni tetap bersifat private (terenkapsulasi), tetapi masih bisa diakses dan dimodifikasi secara aman melalui metode publik.


**e. Method toString()**
```Java
@Override
public String toString() {
   return super.toString() + String.format(" | Jenis Seni: %-15s", jenisSeni);
    }
```
- @Override menandakan bahwa method toString() ini mengganti method bawaan dari kelas induk (Object) atau superclass (modelFestival).

- super.toString() memanggil method toString() dari kelas induk (modelFestival), sehingga informasi dasar festival tetap ditampilkan.

- String.format(" | Jenis Seni: %-15s", jenisSeni) menambahkan informasi baru berupa jenis seni dengan format yang rapi (lebar 15 karakter).


### 4. Package dan Class serviceFestival

<img width="247" height="56" alt="image" src="https://github.com/user-attachments/assets/bdc86834-a403-4d8a-b73c-b2bd8e184a94" />

**a. Deklarasi Package dan Import**
```Java
package Service;

import Model.modelFestival;
import java.util.ArrayList;
import Model.Tradisional;
import Model.SeniPertunjukan;
```
Kode diatas merupakan package dan import yang dilakukan dalam serviceFestival. Package Service untuk menyatakan bahwa kelas ini berada dalam paket Service. Import berguna untuk mengimpor kelas/objek dari paket lain agar bisa digunakan di kelas ini:

- Model.modelFestival → kelas modelFestival dari paket Model.

- java.util.ArrayList → kelas bawaan Java untuk struktur data daftar dinamis.

- Model.Tradisional → kelas Tradisional dari paket Model.

- Model.SeniPertunjukan → kelas SeniPertunjukan dari paket Model.

**b. Deklarasi SubClass**
```Java
public class serviceFestival {
    private ArrayList<modelFestival> festivalList = new ArrayList<>();
```
- Class serviceFestival berfungsi untuk mengelola data festival, ditunjukkan dengan adanya atribut festivalList berupa ArrayList<modelFestival> yang bersifat private, sehingga hanya dapat diakses di dalam kelas tersebut.
- Penggunaan ArrayList memungkinkan penyimpanan sekumpulan objek modelFestival secara dinamis, sehingga class ini nantinya dapat digunakan untuk menambah, menampilkan, atau mengelola daftar festival dengan lebih fleksibel.

**c. Construktor**
```Java
public serviceFestival() {
        festivalList.add(new Tradisional("Festival Tabuik Pariaman", "Sumatera Barat", "15 Agustus 2025", "Pembuangan Tabuik"));
        festivalList.add(new Tradisional("Karapan Sapi", "Madura", "10 Oktober 2025", "Lomba Pacuan Sapi"));
        festivalList.add(new SeniPertunjukan("Bali Arts Festival", "Bali", "20 Juni 2025", "Pertunjukan Tari"));
        festivalList.add(new SeniPertunjukan("Festival Danau Toba", "Sumatera Utara", "25 November 2025", "Konser Musik Tradisional"));
    }
```
Construktor serviceFestival() pada kode di atas akan langsung mengisi daftar festivalList dengan beberapa data festival saat objek serviceFestival dibuat. Data tersebut berupa objek dari kelas Tradisional dan SeniPertunjukan yang masing-masing berisi informasi seperti nama festival, lokasi, tanggal pelaksanaan, serta jenis atau bentuk kegiatan. Dengan cara ini, setiap kali kita membuat objek serviceFestival, daftar festival otomatis sudah terisi dengan contoh data tanpa perlu menambahkannya secara manual satu per satu.

**d. CREATE**
```Java
public void tambahFestival(modelFestival festival) {
        festivalList.add(festival);
        System.out.println("Festival berhasil ditambahkan!");
    }
```
Pada method tambahFestival() digunakan untuk menambahkan festival baru ke dalam daftar festivalList. Saat method ini dipanggil dengan membawa sebuah objek modelFestival, objek tersebut akan langsung dimasukkan ke dalam ArrayList, lalu program menampilkan pesan "Festival berhasil ditambahkan!" sebagai konfirmasi. Dengan begitu, pengguna bisa menambahkan data festival secara dinamis tanpa harus mengubah kode di konstruktor.

**e. READ**
```Java
public void tampilkanFestival() {
        System.out.println("\n--------------------------------------------------- Daftar Festival Budaya ---------------------------------------------------");
        if (festivalList.isEmpty()) {
            System.out.println("Belum ada festival yang terdaftar.");
        } else {
            // Header tabel
            System.out.printf("%-5s | %-30s | %-20s | %-20s | %-30s%n",
                    "No", "Nama Festival", "Asal", "Tanggal", "Keterangan");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");

            // Isi tabel
            for (int i = 0; i < festivalList.size(); i++) {
                modelFestival fest = festivalList.get(i);
                System.out.printf("%-5d | %s%n", (i + 1), fest.toString());
            }
        }
    }
```
- Pada method tampilkanFestival() berfungsi untuk menampilkan seluruh daftar festival yang tersimpan di dalam festivalList dengan format tabel yang rapi. Pertama, program mencetak judul daftar, lalu mengecek apakah festivalList kosong atau tidak.
- jika kosong, akan muncul pesan "Belum ada festival yang terdaftar." jika ada datanya, method mencetak header tabel (kolom No, Nama Festival, Asal, Tanggal, dan Keterangan), kemudian melakukan perulangan untuk menampilkan setiap festival satu per satu dengan memanggil toString() dari objek modelFestival. Dengan cara ini, pengguna bisa langsung melihat daftar festival yang sudah ada dalam bentuk tabel terstruktur.

**f. UPDATE**
```Java
public void ubahFestival(int index, modelFestival festivalBaru) {
   if (index >= 0 && index < festivalList.size()) {
      festivalList.set(index, festivalBaru);
      System.out.println("Festival berhasil diubah!");
   } else {
      System.out.println("Nomor tidak valid!");
   }
```
- Pada method ubahFestival() berfungsi untuk memperbarui data festival pada posisi tertentu di dalam festivalList. Method ini menerima dua parameter yaitu index (nomor posisi data yang akan diubah) dan festivalBaru (objek festival baru yang menggantikan data lama).
- Jika index yang diberikan valid (tidak kurang dari 0 dan tidak melebihi jumlah data yang ada), maka data lama akan diganti dengan festivalBaru dan program menampilkan pesan "Festival berhasil diubah!". Namun, jika index tidak valid, akan muncul pesan "Nomor tidak valid!".

**g. DELETE**
```Java
public void hapusFestival(int index) {
   if (index >= 0 && index < festivalList.size()) {
      modelFestival festHapus = festivalList.remove(index);
      System.out.println("Festival \"" + festHapus.getNamaFestival() + "\" berhasil dihapus!");
   } else {
      System.out.println("Nomor tidak valid!");
      }
   }
```

**h. Pengembalian Jumlah Data**
```Java
public int getJumlahFestival() {
   return festivalList.size();
    }
```
Kode diatas berfungsi untuk mengembalikan jumlah data festival yang ada di dalam list.


### 4. Package & Class mainFestival

<img width="249" height="49" alt="image" src="https://github.com/user-attachments/assets/cbc0b028-f625-4c7b-8506-588e8ee62026" />

**a. Deklarasi Package & Import**
```Java
package Main;

import Model.modelFestival;
import Model.Tradisional;
import Model.SeniPertunjukan;
import Service.serviceFestival;

import java.util.Scanner;
import java.util.InputMismatchException;
```
- package Main; → Menyatakan bahwa kelas ini berada di dalam paket Main.
- import Model.modelFestival;, import Model.Tradisional;, import Model.SeniPertunjukan; → Mengimpor kelas-kelas dari paket Model yang merepresentasikan berbagai jenis festival.
- import Service.serviceFestival; → Mengimpor kelas serviceFestival dari paket Service, yang digunakan untuk mengelola daftar festival.
- import java.util.Scanner; → Mengimpor kelas Scanner untuk menerima input dari pengguna melalui konsol.
- import java.util.InputMismatchException; → Mengimpor exception bawaan Java yang digunakan untuk menangani kesalahan input ketika tipe data yang dimasukkan pengguna tidak sesuai.

**b. Deklarasi Class**
```Java
public class mainFestival {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        serviceFestival service = new serviceFestival();

        int pilihan = 0;
```
Class mainFestival berisi method main sebagai titik awal program. Di dalamnya dibuat objek Scanner untuk membaca input dari user dan objek serviceFestival untuk mengelola data festival. Variabel pilihan disiapkan untuk menampung pilihan menu yang dimasukkan oleh pengguna.

**c. Menu Utama dengan Perulangan do-while**
```Java
do {
   try {
      System.out.println("\n=== Manajemen Daftar Festival Budaya ===");
      System.out.println("1. Tambah Festival");
      System.out.println("2. Lihat Daftar Festival");
      System.out.println("3. Ubah Festival");
      System.out.println("4. Hapus Festival");
      System.out.println("5. Keluar");
      System.out.print("Pilih menu: ");
      pilihan = input.nextInt();
      input.nextLine();
```
- Program ini akan menampilkan menu utama dengan pilihan 1 sampai 5. Perulangan do-while dipakai agar menu terus ditampilkan sampai pengguna memilih keluar pada opsi nomor 5.
- Input pilihan dibaca dengan Scanner, lalu input.nextLine() dipanggil untuk menghapus karakter enter setelah input angka. Bagian ini dibungkus try-catch sebagai validasi input supaya jika pengguna salah memasukkan data, program tidak langsung error.

**d. Case 1 (Tambah Festival)**
```Java
switch (pilihan) {
   case 1:
      System.out.println("Pilih jenis festival:");
      System.out.println("1. Tradisional");
      System.out.println("2. Seni Pertunjukan");
      System.out.print("Masukkan pilihan: ");
      int jenis = input.nextInt();
      input.nextLine();

      System.out.print("Masukkan nama festival: ");
      String nama = input.nextLine();
      System.out.print("Masukkan asal festival: ");
      String asal = input.nextLine();
      System.out.print("Masukkan tanggal festival: ");
      String tanggal = input.nextLine();

      if (jenis == 1) {
         System.out.print("Masukkan ritual adat utama: ");
         String ritual = input.nextLine();
         service.tambahFestival(new Tradisional(nama, asal, tanggal, ritual));
      } else if (jenis == 2) {
         System.out.print("Masukkan jenis seni: ");
         String seni = input.nextLine();
         service.tambahFestival(new SeniPertunjukan(nama, asal, tanggal, seni));
      } else {
         System.out.println("Jenis festival tidak valid!");
      }
      break;
```
- Pada bagian switch-case ini, program menangani menu untuk menambahkan festival baru.
- Pertama, pengguna diminta memilih jenis festival, apakah termasuk Tradisional atau Seni Pertunjukan. Setelah itu, program meminta detail informasi berupa nama festival, asal daerah, dan tanggal pelaksanaan.
- Jika pengguna memilih festival Tradisional, program akan meminta tambahan data berupa ritual adat utama, sedangkan jika memilih festival Seni Pertunjukan, yang diminta adalah jenis seni yang ditampilkan. Berdasarkan input tersebut, program kemudian membuat objek Tradisional atau SeniPertunjukan baru dan menambahkannya ke dalam daftar festival melalui method tambahFestival().
- Apabila pilihan jenis festival tidak sesuai, program akan menampilkan pesan kesalahan bahwa jenis festival tidak valid.

**e. Case 2 (Lihat Festival)**
```Java
   case 2:
      service.tampilkanFestival();
      break;
```
Jika memilih menu 2, program langsung memanggil metode tampilkanFestival() dari serviceFestival untuk menampilkan daftar festival dalam bentuk tabel.

**f. Case 3 (Ubah Festival)**
```Java
case 3:
   service.tampilkanFestival();
   if (service.getJumlahFestival() > 0) {
      System.out.print("Nomor festival yang ingin diubah: ");
      int indexUbah = input.nextInt() - 1;
      input.nextLine();

      System.out.println("Pilih jenis festival baru:");
      System.out.println("1. Tradisional");
      System.out.println("2. Seni Pertunjukan");
      System.out.print("Masukkan pilihan: ");
      int jenisBaru = input.nextInt();
      input.nextLine();

      System.out.print("Masukkan nama festival baru: ");
      String namaBaru = input.nextLine();
      System.out.print("Masukkan asal festival baru: ");
      String asalBaru = input.nextLine();
      System.out.print("Masukkan tanggal festival baru: ");
      String tanggalBaru = input.nextLine();

      if (jenisBaru == 1) {
         System.out.print("Masukkan ritual adat baru: ");
         String ritualBaru = input.nextLine();
         service.ubahFestival(indexUbah, new Tradisional(namaBaru, asalBaru, tanggalBaru, ritualBaru));
      } else if (jenisBaru == 2) {
         System.out.print("Masukkan jenis seni baru: ");
         String seniBaru = input.nextLine();
         service.ubahFestival(indexUbah, new SeniPertunjukan(namaBaru, asalBaru, tanggalBaru, seniBaru));
      } else {
         System.out.println("Jenis festival tidak valid!");
      }
   }
   break;
```
- Jika memilih menu 3, program digunakan untuk mengubah data festival yang sudah ada. Pertama, program menampilkan seluruh daftar festival menggunakan tampilkanFestival(). 
- Jika terdapat data di dalam daftar, pengguna diminta memilih nomor festival yang ingin diubah. Selanjutnya, program menanyakan jenis festival baru yang akan dimasukkan (Tradisional atau Seni Pertunjukan), lalu meminta detail baru berupa nama, asal, dan tanggal festival.
- Jika festival yang dipilih adalah Tradisional, pengguna juga harus mengisi ritual adat baru sedangkan untuk Seni Pertunjukan, pengguna perlu memasukkan jenis seni baru. Data yang sudah diisi kemudian akan menggantikan data lama melalui method ubahFestival().
- Apabila input jenis festival tidak sesuai, program akan menampilkan pesan bahwa jenis festival tidak valid. Dengan demikian, menu ini berfungsi untuk memperbarui informasi festival sesuai kebutuhan pengguna.

**g. Case 4 (Hapus Festival)**
```Java
case 4:
   service.tampilkanFestival();
   if (service.getJumlahFestival() > 0) {
      System.out.print("Nomor festival yang ingin dihapus: ");
      int indexHapus = input.nextInt() - 1;
      input.nextLine();
      service.hapusFestival(indexHapus);
   }
   break;
```
Jika memilih menu 4, program akan menampilkan daftar festival dan meminta nomor festival yang ingin dihapus. Sama seperti update, nomor dikurangi 1 agar sesuai dengan indeks list. Data dihapus dengan memanggil hapusFestival().

**h. Case 5 (Keluar Program)**
```Java
case 5:
   System.out.println("Terima kasih! Program telah selesai ^-^");
   break;

default:
   System.out.println("Pilihan tidak valid!");
```
- Jika memilih menu 5, program akan menampilkan ucapan terima kasih lalu perulangan berhenti.
- Jika memilih menu selain dari angka 1-5, maka program akan menampilkan pesan bahwa "Pilihan tidak valid!" dan akan langsung melakukan perulangan ke menu.

**i. Exception Handling**
```Java
} catch (InputMismatchException e) {
   System.out.println("Input harus berupa angka!");
   input.nextLine(); 
}
```
Bagian ini menangani kesalahan input. Jika pengguna salah memasukkan tipe data (misalnya huruf saat diminta angka), maka program akan menampilkan pesan “Input harus berupa angka!” dan membersihkan input agar program bisa lanjut tanpa error.

**j.Perulangan do-while**
```Java
   } while (pilihan != 5);
   
   input.close();
}
```
Perulangan akan terus berjalan selama pilihan bukan 5. Begitu pengguna memilih keluar, program berhenti dan Scanner akan ditutup.












