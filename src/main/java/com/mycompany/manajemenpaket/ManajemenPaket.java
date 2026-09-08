package com.mycompany.manajemenpaket;

import java.util.Scanner;

public class ManajemenPaket {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        PengelolaPaket pengelola =
                new PengelolaPaket(
                        1,
                        "Admin Ekspedisi",
                        "08123456789"
                );

        int pilihan;

        do {
            tampilkanMenu();
            pilihan = inputInt("Pilih menu: ");

            switch (pilihan) {

                case 1:
                    tambahPaket(pengelola);
                    break;

                case 2:
                    tampilkanSemuaPaket(pengelola);
                    break;

                case 3:
                    cariPaket(pengelola);
                    break;

                case 4:
                    updatePaket(pengelola);
                    break;

                case 5:
                    hapusPaket(pengelola);
                    break;

                case 6:
                    System.out.println("\nProgram selesai.");
                    break;

                default:
                    System.out.println(
                            "\nPilihan menu tidak tersedia!"
                    );
            }

        } while (pilihan != 6);

        input.close();
    }

    public static void tampilkanMenu() {

        System.out.println("\n========================================");
        System.out.println("     SISTEM MANAJEMEN PAKET EKSPEDISI");
        System.out.println("========================================");
        System.out.println("1. Tambah Paket");
        System.out.println("2. Tampilkan Semua Paket");
        System.out.println("3. Cari Paket");
        System.out.println("4. Update Paket");
        System.out.println("5. Hapus Paket");
        System.out.println("6. Keluar");
        System.out.println("========================================");
    }

    // CREATE
    public static void tambahPaket(PengelolaPaket pengelola) {

        System.out.println("\n--- TAMBAH PAKET ---");

        int idPaket;

        do {
            idPaket = inputInt("ID Paket: ");

            if (pengelola.cariBerdasarkanId(idPaket) != null) {
                System.out.println("ID Paket sudah digunakan!");
            }

        } while (pengelola.cariBerdasarkanId(idPaket) != null);

        String noResi;

        do {
            noResi = inputString("Nomor Resi: ");

            if (pengelola.cariBerdasarkanResi(noResi) != null) {
                System.out.println("Nomor resi sudah digunakan!");
            }

        } while (pengelola.cariBerdasarkanResi(noResi) != null);

        String namaPengirim =
                inputString("Nama Pengirim: ");

        String tanggalMasuk =
                inputString("Tanggal Masuk: ");

        // DATA PENERIMA
        System.out.println("\n--- DATA PENERIMA ---");

        int idPenerima =
                inputInt("ID Penerima: ");

        String namaPenerima =
                inputString("Nama Penerima: ");

        String alamat =
                inputString("Alamat: ");

        String nomorHp =
                inputString("Nomor HP: ");

        Penerima penerima =
                new Penerima(
                        idPenerima,
                        namaPenerima,
                        alamat,
                        nomorHp
                );

        // DATA EKSPEDISI
        System.out.println("\n--- DATA EKSPEDISI ---");

        int idEkspedisi =
                inputInt("ID Ekspedisi: ");

        String namaEkspedisi =
                inputString("Nama Ekspedisi: ");

        String jenisLayanan =
                inputString("Jenis Layanan: ");

        Ekspedisi ekspedisi =
                new Ekspedisi(
                        idEkspedisi,
                        namaEkspedisi,
                        jenisLayanan
                );

        // DATA KURIR
        System.out.println("\n--- DATA KURIR ---");

        int idKurir =
                inputInt("ID Kurir: ");

        String namaKurir =
                inputString("Nama Kurir: ");

        String nomorKurir =
                inputString("Nomor HP Kurir: ");

        Kurir kurir =
                new Kurir(
                        idKurir,
                        namaKurir,
                        nomorKurir
                );

        String status = pilihStatus();

        Paket paket =
                new Paket(
                        idPaket,
                        noResi,
                        namaPengirim,
                        tanggalMasuk,
                        status,
                        ekspedisi,
                        penerima,
                        kurir
                );

        pengelola.tambahPaket(paket);

        System.out.println("\nPaket berhasil ditambahkan!");
    }

    // READ
    public static void tampilkanSemuaPaket(
            PengelolaPaket pengelola) {

        System.out.println("\n--- DAFTAR PAKET ---");

        if (pengelola.getDaftarPaket().isEmpty()) {
            System.out.println("Belum ada data paket.");
            return;
        }

        for (Paket paket : pengelola.getDaftarPaket()) {

            System.out.println("----------------------------------------");
            System.out.println("ID Paket      : " + paket.getIdPaket());
            System.out.println("No. Resi      : " + paket.getNoResi());
            System.out.println("Pengirim      : " + paket.getNamaPengirim());
            System.out.println("Tanggal Masuk : " + paket.getTanggalMasuk());
            System.out.println("Penerima      : "
                    + paket.getPenerima().getNama());
            System.out.println("Ekspedisi     : "
                    + paket.getEkspedisi().getNamaEkspedisi());
            System.out.println("Layanan       : "
                    + paket.getEkspedisi().getJenisLayanan());
            System.out.println("Kurir         : "
                    + paket.getKurir().getNama());
            System.out.println("Status        : " + paket.getStatus());
        }

        System.out.println("----------------------------------------");
    }

    // SEARCH
    public static void cariPaket(
            PengelolaPaket pengelola) {

        System.out.println("\n--- CARI PAKET ---");
        System.out.println("1. Berdasarkan ID");
        System.out.println("2. Berdasarkan Nomor Resi");

        int pilihan =
                inputInt("Pilih metode pencarian: ");

        Paket paket = null;

        if (pilihan == 1) {

            int id =
                    inputInt("Masukkan ID Paket: ");

            paket =
                    pengelola.cariBerdasarkanId(id);

        } else if (pilihan == 2) {

            String resi =
                    inputString("Masukkan Nomor Resi: ");

            paket =
                    pengelola.cariBerdasarkanResi(resi);

        } else {

            System.out.println("Pilihan tidak tersedia!");
            return;
        }

        if (paket == null) {
            System.out.println("Paket tidak ditemukan!");
            return;
        }

        tampilkanDetailPaket(paket);
    }

    // DETAIL
    public static void tampilkanDetailPaket(Paket paket) {

        System.out.println("\n--- DETAIL PAKET ---");

        System.out.println("ID Paket      : "
                + paket.getIdPaket());

        System.out.println("Nomor Resi    : "
                + paket.getNoResi());

        System.out.println("Nama Pengirim : "
                + paket.getNamaPengirim());

        System.out.println("Tanggal Masuk : "
                + paket.getTanggalMasuk());

        System.out.println("Status        : "
                + paket.getStatus());

        System.out.println("\n--- PENERIMA ---");

        System.out.println("ID            : "
                + paket.getPenerima().getIdPenerima());

        System.out.println("Nama          : "
                + paket.getPenerima().getNama());

        System.out.println("Alamat        : "
                + paket.getPenerima().getAlamat());

        System.out.println("Nomor HP      : "
                + paket.getPenerima().getNomorHp());

        System.out.println("\n--- EKSPEDISI ---");

        System.out.println("ID            : "
                + paket.getEkspedisi().getIdEkspedisi());

        System.out.println("Nama          : "
                + paket.getEkspedisi().getNamaEkspedisi());

        System.out.println("Layanan       : "
                + paket.getEkspedisi().getJenisLayanan());

        System.out.println("\n--- KURIR ---");

        System.out.println("ID            : "
                + paket.getKurir().getIdKurir());

        System.out.println("Nama          : "
                + paket.getKurir().getNama());

        System.out.println("Nomor HP      : "
                + paket.getKurir().getNomorHp());
    }

    // UPDATE
    public static void updatePaket(
            PengelolaPaket pengelola) {

        System.out.println("\n--- UPDATE PAKET ---");

        String resi =
                inputString("Masukkan Nomor Resi: ");

        Paket paket =
                pengelola.cariBerdasarkanResi(resi);

        if (paket == null) {
            System.out.println("Paket tidak ditemukan!");
            return;
        }

        System.out.println("\n1. Ubah Status");
        System.out.println("2. Ubah Data Penerima");
        System.out.println("3. Ubah Kurir");

        int pilihan =
                inputInt("Pilih data yang ingin diubah: ");

        switch (pilihan) {

            case 1:

                paket.setStatus(pilihStatus());

                System.out.println(
                        "Status berhasil diperbarui!"
                );

                break;

            case 2:

                String nama =
                        inputString("Nama Baru: ");

                String alamat =
                        inputString("Alamat Baru: ");

                String nomorHp =
                        inputString("Nomor HP Baru: ");

                Penerima penerimaBaru =
                        new Penerima(
                                paket.getPenerima().getIdPenerima(),
                                nama,
                                alamat,
                                nomorHp
                        );

                paket.setPenerima(penerimaBaru);

                System.out.println(
                        "Data penerima berhasil diperbarui!"
                );

                break;

            case 3:

                int idKurir =
                        inputInt("ID Kurir Baru: ");

                String namaKurir =
                        inputString("Nama Kurir Baru: ");

                String nomorKurir =
                        inputString("Nomor HP Kurir Baru: ");

                Kurir kurirBaru =
                        new Kurir(
                                idKurir,
                                namaKurir,
                                nomorKurir
                        );

                paket.setKurir(kurirBaru);

                System.out.println(
                        "Data kurir berhasil diperbarui!"
                );

                break;

            default:

                System.out.println(
                        "Pilihan tidak tersedia!"
                );
        }
    }

    // DELETE
    public static void hapusPaket(
            PengelolaPaket pengelola) {

        System.out.println("\n--- HAPUS PAKET ---");

        int id =
                inputInt("Masukkan ID Paket: ");

        Paket paket =
                pengelola.cariBerdasarkanId(id);

        if (paket == null) {
            System.out.println("Paket tidak ditemukan!");
            return;
        }

        System.out.println(
                "Paket ditemukan: "
                + paket.getNoResi()
        );

        String konfirmasi =
                inputString(
                        "Yakin ingin menghapus? (Y/N): "
                );

        if (konfirmasi.equalsIgnoreCase("Y")) {

            pengelola.hapusPaket(id);

            System.out.println(
                    "Paket berhasil dihapus!"
            );

        } else {

            System.out.println(
                    "Penghapusan dibatalkan."
            );
        }
    }

    // STATUS
    public static String pilihStatus() {

        while (true) {

            System.out.println("\nPilih Status:");
            System.out.println("1. Diterima");
            System.out.println("2. Diproses");
            System.out.println("3. Dikirim");
            System.out.println("4. Dalam Perjalanan");
            System.out.println("5. Sampai Tujuan");

            int pilihan =
                    inputInt("Status: ");

            switch (pilihan) {

                case 1:
                    return "Diterima";

                case 2:
                    return "Diproses";

                case 3:
                    return "Dikirim";

                case 4:
                    return "Dalam Perjalanan";

                case 5:
                    return "Sampai Tujuan";

                default:
                    System.out.println(
                            "Status tidak tersedia!"
                    );
            }
        }
    }

    // VALIDASI STRING
    public static String inputString(String pesan) {

        while (true) {

            System.out.print(pesan);

            String data =
                    input.nextLine().trim();

            if (!data.isEmpty()) {
                return data;
            }

            System.out.println(
                    "Input tidak boleh kosong!"
            );
        }
    }

    // VALIDASI INTEGER
    public static int inputInt(String pesan) {

        while (true) {

            try {

                System.out.print(pesan);

                int angka =
                        Integer.parseInt(
                                input.nextLine()
                        );

                if (angka > 0) {
                    return angka;
                }

                System.out.println(
                        "Angka harus lebih dari 0!"
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Input harus berupa angka!"
                );
            }
        }
    }
}