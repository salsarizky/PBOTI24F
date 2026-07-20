public class Mobil {
    String merk;
    int kecepatan;
    boolean mesinnyala;

    public Mobil (String merk) {
        this.merk = merk;
        this.kecepatan = 0;
        this.mesinnyala = false;
    }

    public void Nyalakan() {
        this.mesinnyala = true;
        this.kecepatan = 0;
        System.out.println(merk + " : Mesin Berhasil Menyala, kecepatan : " +kecepatan+ "km/jam");
    }

    public void matikan() {
        this.mesinnyala = false;
        this.kecepatan = 0;
        System.out.println(merk + " : Mesin Berhasil dimatikan, kecepatan : " +kecepatan+ "km/jam");
    }

    public void gas() {
        if (mesinnyala) {
            this.kecepatan += 45;
            System.out.println(merk + " : gas berhasil ditekan, kecepatan : " +kecepatan+ "km/jam");
        }else {
            System.out.println(merk + " : gas gagal ditekan, kecepatan : " +kecepatan+ "km/jam");
        }
    }

    public void rem() {
        if (mesinnyala) {
            if (this.kecepatan >= 40) {
                this.kecepatan -= 40;
                System.out.println(merk + " : rem berhasil ditekan, kecepatan : " +kecepatan+ "km/jam");
            }else {
                this.kecepatan = 0;
                System.out.println(merk + " : rem gagal ditekan, kecepatan : " +kecepatan+ "km/jam");
            }
        }
    }
}