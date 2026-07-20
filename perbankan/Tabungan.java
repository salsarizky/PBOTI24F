public class Tabungan extends Rekening {
    private double bungaTahunan;

    public Tabungan(String nama, String nomor, double saldo, double bunga) {
        super(nama, nomor, saldo);
        this.bungaTahunan = bunga;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis: Tabungan | Bunga: " + bungaTahunan + "%");
    }

    public void hitungBunga(int bulan) {
        double bunga = (bungaTahunan / 100 / 12) * saldo * bulan;
        System.out.println("Estimasi bunga " + bulan + " bulan: Rp " + bunga);
    }
}