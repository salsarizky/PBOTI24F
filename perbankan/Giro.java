public class Giro extends Rekening {
    private double limitPenarikan;

    public Giro(String nama, String nomor, double saldo, double limit) {
        super(nama, nomor, saldo);
        this.limitPenarikan = limit;
    }

    @Override
    public void tarik(double jumlah) {
        if (jumlah <= (saldo + limitPenarikan)) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " (Giro) tarik: Rp " + jumlah);
        } else {
            System.out.println("Tarik gagal! Melebihi limit Giro.");
        }
    }
}