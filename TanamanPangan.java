class TanamanPangan extends Tanaman {

    private int kebutuhanAir;

    public TanamanPangan(String namaTanaman, String jenisTanaman,
                         int umurTanaman, int kebutuhanAir) {

        super(namaTanaman, jenisTanaman, umurTanaman);

        this.kebutuhanAir = kebutuhanAir;
    }

    public void setKebutuhanAir(int kebutuhanAir) {
        this.kebutuhanAir = kebutuhanAir;
    }

    public int getKebutuhanAir() {
        return kebutuhanAir;
    }

    public void tampilData() {

        System.out.println("===== DATA TANAMAN =====");
        System.out.println("Nama Tanaman  : " + getNamaTanaman());
        System.out.println("Jenis Tanaman : " + getJenisTanaman());
        System.out.println("Umur Tanaman  : " + getUmurTanaman() + " hari");
        System.out.println("Kebutuhan Air : " + getKebutuhanAir() + " ml");
    }
}