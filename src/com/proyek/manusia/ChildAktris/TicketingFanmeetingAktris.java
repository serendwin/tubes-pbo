package com.proyek.manusia.ChildAktris;

public class TicketingFanmeetingAktris extends BiodataAktris {

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
        this.kategoriTiket = kategoriTiket;

        if (validasiKategori(kategoriTiket)) {
            this.hargaTiket = tentukanHarga(kategoriTiket);
        } else {
            System.out.println("Kategori tidak dikenal! Harga default digunakan.");
            this.hargaTiket = 1000000;
        }
    }

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

    private boolean validasiKategori(String kategori) {
        return kategori.equalsIgnoreCase("VVIP")
                || kategori.equalsIgnoreCase("VIP")
                || kategori.equalsIgnoreCase("REGULAR")
                || kategori.equalsIgnoreCase("BALCONY");
    }

    public double getHarga() {
        return hargaTiket;
    }

    public void ubahKategoriTiket(String kategoriBaru) {
        if (validasiKategori(kategoriBaru)) {
            this.kategoriTiket = kategoriBaru;
            this.hargaTiket = tentukanHarga(kategoriBaru);
            System.out.println("Kategori berhasil diubah ke: " + kategoriBaru);
        } else {
            System.out.println("Kategori tidak valid! Tidak ada perubahan.");
        }
    }

    public void infoEvent() {
        System.out.println("====== INFO EVENT ======");
        System.out.println("Aktris  : " + Nama);
        System.out.println("Event   : " + Event);
        System.out.println("Lokasi  : " + lokasi);
        System.out.println("Tanggal : " + tanggal);
        System.out.println("============================");
    }

    public void cetakTiket() {
        System.out.println("========= TICKET FANMEETING ========");
        System.out.println("Aktris   : " + Nama);
        System.out.println("Event    : " + Event);
        System.out.println("Lokasi   : " + lokasi);
        System.out.println("Tanggal  : " + tanggal);
        System.out.println("Kategori : " + kategoriTiket);
        System.out.println("Harga    : Rp " + hargaTiket);
        System.out.println("======================================");
    }
}