public class Main {

    public static void main(String[] args) {

        BujurSangkar bs = new BujurSangkar(4);
        PersegiPanjang pp = new PersegiPanjang(6,3);
        Segitiga sg = new Segitiga(5,4,3,4,5);

        System.out.println("BUJUR SANGKAR");
        System.out.println("Luas: " + bs.luas());
        System.out.println("Keliling: " + bs.keliling());

        System.out.println();

        System.out.println("PERSEGI PANJANG");
        System.out.println("Luas: " + pp.luas());
        System.out.println("Keliling: " + pp.keliling());

        System.out.println();

        System.out.println("SEGITIGA");
        System.out.println("Luas: " + sg.luas());
        System.out.println("Keliling: " + sg.keliling());
    }

}