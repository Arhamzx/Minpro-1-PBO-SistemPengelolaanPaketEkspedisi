package com.mycompany.manajemenpaket;

public class Kurir {
    private int idKurir;
    private String nama;
    private String nomorHp;

    public Kurir(int idKurir, String nama, String nomorHp) {
        this.idKurir = idKurir;
        this.nama = nama;
        this.nomorHp = nomorHp;
    }

    public int getIdKurir() {
        return idKurir;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorHp() {
        return nomorHp;
    }
}