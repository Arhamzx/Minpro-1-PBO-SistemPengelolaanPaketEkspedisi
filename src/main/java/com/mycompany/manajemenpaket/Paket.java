package com.mycompany.manajemenpaket;

public class Paket {
    private int idPaket;
    private String noResi;
    private String namaPengirim;
    private String tanggalMasuk;
    private String status;
    private Ekspedisi ekspedisi;
    private Penerima penerima;
    private Kurir kurir;

    public Paket(int idPaket, String noResi, String namaPengirim,
            String tanggalMasuk, String status,
            Ekspedisi ekspedisi, Penerima penerima, Kurir kurir) {

        this.idPaket = idPaket;
        this.noResi = noResi;
        this.namaPengirim = namaPengirim;
        this.tanggalMasuk = tanggalMasuk;
        this.status = status;
        this.ekspedisi = ekspedisi;
        this.penerima = penerima;
        this.kurir = kurir;
    }

    public int getIdPaket() {
        return idPaket;
    }

    public String getNoResi() {
        return noResi;
    }

    public String getNamaPengirim() {
        return namaPengirim;
    }

    public String getTanggalMasuk() {
        return tanggalMasuk;
    }

    public String getStatus() {
        return status;
    }

    public Ekspedisi getEkspedisi() {
        return ekspedisi;
    }

    public Penerima getPenerima() {
        return penerima;
    }

    public Kurir getKurir() {
        return kurir;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPenerima(Penerima penerima) {
        this.penerima = penerima;
    }

    public void setKurir(Kurir kurir) {
        this.kurir = kurir;
    }
}