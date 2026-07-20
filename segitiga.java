class Segitiga extends BangunDatar {

    double alas;
    double tinggi;
    double sisi1;
    double sisi2;
    double sisi3;

    Segitiga(double alas, double tinggi, double s1, double s2, double s3){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = s1;
        this.sisi2 = s2;
        this.sisi3 = s3;
    }
    @Override
    double luas(){
        return 0.5 * alas * tinggi;
    }
    @Override
    double keliling(){
        return sisi1 + sisi2 + sisi3;
    }

}