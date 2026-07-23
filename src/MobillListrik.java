public class MobillListrik extends Kendaraan implements KendaraanListrik {
    private int kapasitasBaterai;

    public MobillListrik(String merek, int kapasitasBaterai) {
        super(merek);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    @Override
    public void isiDaya() {
        System.out.println("Mobil " + merek + " sedang di-charge... Baterai: " + kapasitasBaterai + " kWh.");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Tipe: Mobil Listrik Ramah Lingkungan.");
    }
}