class BujurSangkar extends BangunDatar {
    double sisi;

    BujurSangkar(double sisi) {
        this.sisi = sisi;
    }
    @Override
    double luas() {
        return sisi * sisi;
    }
    @Override
    double keliling() {
        return 4 * sisi;
    }
}