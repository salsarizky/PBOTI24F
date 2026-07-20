public class Rekening {
    protected String namaPemilik;
    protected String nomorRekening;
    protected double saldo;

    public Rekening(String namaPemilik, String nomorRekening, double saldo) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    // Soal 3: Overloading Versi 1 (Setor Tunai)
    public void setor(double jumlah) {
        this.saldo += jumlah;
        System.out.println(namaPemilik + " setor tunai: Rp " + jumlah);
    }

    // Soal 3: Overloading Versi 2 (Transfer dari orang lain)
    public void setor(double jumlah, boolean transfer) {
        if (transfer) {
            double biayaAdmin = 2500;
            this.saldo += (jumlah - biayaAdmin);
            System.out.println(namaPemilik + " terima transfer: Rp " + jumlah + " (Potong admin Rp 2.500)");
        } else {
            setor(jumlah);
        }
    }

    public void tarik(double jumlah) {
        if (jumlah <= saldo) {
            this.saldo -= jumlah;
            System.out.println(namaPemilik + " tarik saldo: Rp " + jumlah);
        } else {
            System.out.println("Saldo " + namaPemilik + " tidak cukup!");
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + namaPemilik + " | No: " + nomorRekening + " | Saldo: Rp " + saldo);
    }
}