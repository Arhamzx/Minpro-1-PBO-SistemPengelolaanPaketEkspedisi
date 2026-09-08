package com.mycompany.manajemenpaket;

public class Ekspedisi {
    private int idEkspedisi;
    private String namaEkspedisi;
    private String jenisLayanan;

    public Ekspedisi(int idEkspedisi, String namaEkspedisi,
            String jenisLayanan) {

        this.idEkspedisi = idEkspedisi;
        this.namaEkspedisi = namaEkspedisi;
        this.jenisLayanan = jenisLayanan;
    }

    public int getIdEkspedisi() {
        return idEkspedisi;
    }

    public String getNamaEkspedisi() {
        return namaEkspedisi;
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }
}