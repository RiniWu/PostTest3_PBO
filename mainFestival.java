package Main;

import Model.modelFestival;
import Model.Tradisional;
import Model.SeniPertunjukan;
import Service.serviceFestival;

import java.util.Scanner;
import java.util.InputMismatchException;

public class mainFestival {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        serviceFestival service = new serviceFestival();

        int pilihan = 0;

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

                    case 2:
                        service.tampilkanFestival();
                        break;

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

                    case 4:
                        service.tampilkanFestival();
                        if (service.getJumlahFestival() > 0) {
                            System.out.print("Nomor festival yang ingin dihapus: ");
                            int indexHapus = input.nextInt() - 1;
                            input.nextLine();
                            service.hapusFestival(indexHapus);
                        }
                        break;

                    case 5:
                        System.out.println("Terima kasih! Program telah selesai ^-^");
                        break;

                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                input.nextLine(); 
            }
        } while (pilihan != 5);

        input.close();
    }
}
