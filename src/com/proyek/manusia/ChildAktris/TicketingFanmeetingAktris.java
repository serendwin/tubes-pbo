package com.proyek.manusia.ChildAktris;

import com.proyek.manusia.Agensi;

public class TicketingFanmeetingAktris extends Agensi {

    private String kategoriTiket;
    private double hargaTiket;
    private String lokasi;
    private String tanggal;

    public TicketingFanmeetingAktris(
            String Nama,
            String Kewarganegaraan,
            String TtlLahir,
            String TtlDebut,
            int MasaTrainee,
            String Posisi,
            String ListDrama,
            String ListMovie,
            String ListAlbum,
            String Penghargaan,
            int tahun,
            String Event,
            String lokasi,
            String tanggal,
            String kategoriTiket
    ) {

        super(Nama, Kewarganegaraan, TtlLahir, TtlDebut, MasaTrainee, Posisi,
                ListDrama, ListMovie, ListAlbum, Penghargaan, tahun, Event, 0);

        this.lokasi = lokasi;
        this.tanggal = tanggal;
        setKategori(kategoriTiket); 
    }

    // Validasi kategori tiket
    private boolean validasiKategori(String kategori) {
        if (kategori.equalsIgnoreCase("VVIP")) {
            return true;
        } else if (kategori.equalsIgnoreCase("VIP")) {
            return true;
        } else if (kategori.equalsIgnoreCase("REGULAR")) {
            return true;
        } else if (kategori.equalsIgnoreCase("BALCONY")) {
            return true;
        } else {
            return false;
        }
    }

    // Menentukan harga berdasarkan kategori
    private double tentukanHarga(String kategori) {
        if (kategori.equalsIgnoreCase("VVIP")) {
            return 2500000;
        } else if (kategori.equalsIgnoreCase("VIP")) {
            return 1500000;
        } else if (kategori.equalsIgnoreCase("REGULAR")) {
            return 800000;
        } else if (kategori.equalsIgnoreCase("BALCONY")) {
            return 500000;
        } else {
            return 1000000; 
    }
    }
    // Kategori + Harga
    private void setKategori(String kategori) {
        if (validasiKategori(kategori)) {
            this.kategoriTiket = kategori.toUpperCase();
            this.hargaTiket = tentukanHarga(kategori);
        } else {
            System.out.println("Kategori tidak valid! Menggunakan harga default.");
            this.kategoriTiket = "UNKNOWN";
            this.hargaTiket = 1000000;
        }
    }

    // ubah kategori tiket
    public void ubahKategoriTiket(String kategoriBaru) {
        setKategori(kategoriBaru);
        System.out.println("Kategori tiket berhasil diubah menjadi: " + kategoriTiket);
    }

    //  harga
    public double getHarga() {
        return hargaTiket;
    }

    public void infoEvent() {
        System.out.println("====== INFO EVENT ======");
        System.out.println("Aktris  : " + Nama);
        System.out.println("Event   : " + Event);
        System.out.println("Lokasi  : " + lokasi);
        System.out.println("Tanggal : " + tanggal);
        System.out.println("=========================");
    }

    public void cetakTiket() {
        System.out.println("====== TICKET FANMEETING ======");
        System.out.println("Aktris    : " + Nama);
        System.out.println("Event     : " + Event);
        System.out.println("Lokasi    : " + lokasi);
        System.out.println("Tanggal   : " + tanggal);
        System.out.println("Kategori  : " + kategoriTiket);
        System.out.println("Harga     : Rp " + hargaTiket);
        System.out.println("================================");
    }
}