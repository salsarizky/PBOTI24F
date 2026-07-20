class Tanaman {
    
    private String namaTanaman;
    private String jenisTanaman;
    private int umurTanaman;

    public Tanaman(String namaTanaman, String jenisTanaman, int umurTanaman){
        this.namaTanaman = namaTanaman;
        this.jenisTanaman = jenisTanaman;
        this.umurTanaman = umurTanaman; // constructor
    }
    public void setNamaTanaman(String namaTanaman) {
        this.namaTanaman = namaTanaman;
    }
    public void setJenisTanaman(String jenisTanaman){
        this.jenisTanaman = jenisTanaman;
    }
    public void setUmurTanaman(int umurTanaman){
        this.umurTanaman = umurTanaman; //setter
    }
    public String getNamaTanaman(){
        return namaTanaman;
    }
    public String getJenisTanaman(){
        return jenisTanaman;
    }
    public int getUmurTanaman(){
        return umurTanaman;
    }
}