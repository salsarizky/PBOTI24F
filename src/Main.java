public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI SISTEM KENDARAAN ===\n");

        MobillListrik mobil = new MobillListrik("Tesla", 75);
        mobil.info();
        mobil.isiDaya();
    }
}