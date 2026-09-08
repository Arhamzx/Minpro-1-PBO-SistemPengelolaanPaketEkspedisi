package com.mycompany.manajemenpaket;

public class Penerima {
    private int idPenerima;
    private String nama;
    private String alamat;
    private String nomorHp;

    public Penerima(int idPenerima, String nama,
            String alamat, String nomorHp) {

        this.idPenerima = idPenerima;
        this.nama = nama;
        this.alamat = alamat;
        this.nomorHp = nomorHp;
    }

    public int getIdPenerima() {
        return idPenerima;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorHp() {
        return nomorHp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }
}