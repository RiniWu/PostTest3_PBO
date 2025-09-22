package Model;

public class SeniPertunjukan extends modelFestival {
    private String jenisSeni;
    
    public SeniPertunjukan(String namaFestival, String asal, String tanggalPelaksanaan, String jenisSeni) {
        super(namaFestival, asal, tanggalPelaksanaan);
        this.jenisSeni = jenisSeni;
    }

    public String getJenisSeni() {
        return jenisSeni;
    }

    public void setJenisSeni(String jenisSeni) {
        this.jenisSeni = jenisSeni;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(" | Jenis Seni: %-15s", jenisSeni);
    }
}
