package Model;

public class Tradisional extends modelFestival {
    private String ritualAdat;
    
    public Tradisional (String namaFestival, String asal, String tanggalPelaksanaan, String ritualAdat) {
        super(namaFestival, asal, tanggalPelaksanaan);
        this.ritualAdat = ritualAdat;
    }

    public String getRitualAdat() {
        return ritualAdat;
    }

    public void setRitualAdat(String ritualAdat) {
        this.ritualAdat = ritualAdat;
    }
    
    @Override
    public String toString(){
        return super.toString() + String.format(" | Ritual Adat Utama : %-15s", ritualAdat);
    }
}
