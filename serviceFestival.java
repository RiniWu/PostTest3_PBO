package Service;

import Model.modelFestival;
import java.util.ArrayList;
import Model.Tradisional;
import Model.SeniPertunjukan;

public class serviceFestival {
    private ArrayList<modelFestival> festivalList = new ArrayList<>();

    public serviceFestival() {
        festivalList.add(new Tradisional("Festival Tabuik Pariaman", "Sumatera Barat", "15 Agustus 2025", "Pembuangan Tabuik"));
        festivalList.add(new Tradisional("Karapan Sapi", "Madura", "10 Oktober 2025", "Lomba Pacuan Sapi"));
        festivalList.add(new SeniPertunjukan("Bali Arts Festival", "Bali", "20 Juni 2025", "Pertunjukan Tari"));
        festivalList.add(new SeniPertunjukan("Festival Danau Toba", "Sumatera Utara", "25 November 2025", "Konser Musik Tradisional"));
    }


    // CREATE
    public void tambahFestival(modelFestival festival) {
        festivalList.add(festival);
        System.out.println("Festival berhasil ditambahkan!");
    }

    // READ
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

    // UPDATE
    public void ubahFestival(int index, modelFestival festivalBaru) {
        if (index >= 0 && index < festivalList.size()) {
            festivalList.set(index, festivalBaru);
            System.out.println("Festival berhasil diubah!");
        } else {
            System.out.println("Nomor tidak valid!");
        }
    }

    // DELETE
    public void hapusFestival(int index) {
        if (index >= 0 && index < festivalList.size()) {
            modelFestival festHapus = festivalList.remove(index);
            System.out.println("Festival \"" + festHapus.getNamaFestival() + "\" berhasil dihapus!");
        } else {
            System.out.println("Nomor tidak valid!");
        }
    }

    public int getJumlahFestival() {
        return festivalList.size();
    }
}
