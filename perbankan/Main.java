import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // List untuk menampung semua jenis rekening (Polimorfisme)
        ArrayList<Rekening> daftarNasabah = new ArrayList<>();

        // Tambah Data
        daftarNasabah.add(new Tabungan("Andi", "T-001", 1000000, 5));
        daftarNasabah.add(new Giro("Budi", "G-002", 2000000, 500000));
        daftarNasabah.add(new Deposito("Citra", "D-003", 5000000, 12, 0.02));

        System.out.println("=== SEMUA DATA NASABAH ===");
        for (Rekening r : daftarNasabah) {
            r.tampilkanInfo();
        }

        System.out.println("\n=== SIMULASI TRANSAKSI ===");
        // Simulasi Overloading di akun Andi
        daftarNasabah.get(0).setor(50000, true); 
        
        // Simulasi Denda di akun Deposito Citra
        daftarNasabah.get(2).tarik(1000000);

        // Mencari Saldo Tertinggi
        Rekening tertinggi = daftarNasabah.get(0);
        for (Rekening r : daftarNasabah) {
            if (r.saldo > tertinggi.saldo) tertinggi = r;
        }
        System.out.println("\nNasabah saldo tertinggi: " + tertinggi.namaPemilik + " (Rp " + tertinggi.saldo + ")");
    }
}