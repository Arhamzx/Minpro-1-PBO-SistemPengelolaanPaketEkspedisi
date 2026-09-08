package com.mycompany.manajemenpaket;

import java.util.ArrayList;

public class PengelolaPaket {

    private int idPengelola;
    private String nama;
    private String kontak;

    private ArrayList<Paket> daftarPaket;

    public PengelolaPaket(int idPengelola, String nama, String kontak) {
        this.idPengelola = idPengelola;
        this.nama = nama;
        this.kontak = kontak;
        this.daftarPaket = new ArrayList<>();
    }

    public void tambahPaket(Paket paket) {
        daftarPaket.add(paket);
    }

    public ArrayList<Paket> getDaftarPaket() {
        return daftarPaket;
    }

    public Paket cariBerdasarkanId(int id) {
        for (Paket paket : daftarPaket) {
            if (paket.getIdPaket() == id) {
                return paket;
            }
        }

        return null;
    }

    public Paket cariBerdasarkanResi(String resi) {
        for (Paket paket : daftarPaket) {
            if (paket.getNoResi().equalsIgnoreCase(resi)) {
                return paket;
            }
        }

        return null;
    }

    public boolean hapusPaket(int id) {
        Paket paket = cariBerdasarkanId(id);

        if (paket != null) {
            daftarPaket.remove(paket);
            return true;
        }

        return false;
    }
}