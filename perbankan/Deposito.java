public class Deposito extends Rekening {
    private int jangkaWaktuBulan;
    private double sukuBunga;

    public Deposito(String nama, String nomor, double saldo, int jangka, double bunga) {
        super(nama, nomor, saldo);
        this.jangkaWaktuBulan = jangka;
        this.sukuBunga = bunga;
    }

    public void hitungBunga() {
        double bunga = sukuBunga * saldo * jangkaWaktuBulan;
        System.out.println("Bunga Deposito: Rp " + bunga);
    }

    @Override
    public void tarik(double jumlah) {
        double denda = 0.10 * saldo;
        saldo -= (jumlah + denda);
        System.out.println("Tarik Deposito SEBELUM jatuh tempo! Kena denda 10%: Rp " + denda);
    }
}