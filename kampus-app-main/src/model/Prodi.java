package model;

public class Prodi {
    private int idProdi;
    private String namaProdi;

    public Prodi(int idProdi, String namaProdi) {
        this.idProdi = idProdi;
        this.namaProdi = namaProdi;
    }

    public int getIdProdi() {
        return idProdi;
    }

    public String getNamaProdi() {
        return namaProdi;
    }
}