class PersegiPanjang extends BangunDatar {

    double panjang;
    double lebar;

    PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override
    double luas(){
        return panjang * lebar;
    }
    @Override
    double keliling(){
        return 2 * (panjang + lebar);
    }

}