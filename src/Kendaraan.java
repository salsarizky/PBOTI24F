public class Kendaraan {
    protected String merek;

    public Kendaraan(String merek) {
        this.merek = merek;
    }

    public void info() {
        System.out.println("Ini adalah kendaraan merek: " + merek);
    }
}