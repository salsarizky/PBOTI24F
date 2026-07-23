public class Mesin {
    private String tipeMesin;
    private int tenagaKuda; // HP (Horse Power)

    public Mesin(String tipeMesin, int tenagaKuda) {
        this.tipeMesin = tipeMesin;
        this.tenagaKuda = tenagaKuda;
    }

    public void nyalakan() {
        System.out.println("Mesin " + tipeMesin + " menyala dengan tenaga " + tenagaKuda + " HP.");
    }

    public void matikan() {
        System.out.println("Mesin " + tipeMesin + " dimatikan.");
    }

    public String getTipeMesin() {
        return tipeMesin;
    }

    public int getTenagaKuda() {
        return tenagaKuda;
    }
}