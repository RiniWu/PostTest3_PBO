package Model;

public class modelFestival {
    private String namaFestival;
    private String asal;
    private String tanggalPelaksanaan;
    
    //CONSTRUKTOR
    public modelFestival(String namaFestival, String asal, String tanggalPelaksanaan) {
        this.namaFestival = namaFestival;
        this.asal = asal;
        this.tanggalPelaksanaan = tanggalPelaksanaan;
    }

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
    
        @Override
    public String toString() {
        return String.format("%-30s | %-20s | %-20s", namaFestival, asal, tanggalPelaksanaan);
    }
}


