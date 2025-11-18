package com.proyek.manusia.ChildAktris;

import com.proyek.manusia.Agensi;


public class TicketingFanmeetingAktris extends Aktris {

    public TicketingFanmeetingAktris(String Nama, String Kewarganegaraan, String TtlLahir, String TtlDebut,
                  int MasaTrainee, String Posisi, String ListDrama, String ListMovie,
                  String ListAlbum, String Penghargaan, int tahun,
                  String Event, double Price, String tanggal, String kategoriTiket) {

        super(Nama, Kewarganegaraan, TtlLahir, TtlDebut, MasaTrainee, Posisi,
              ListDrama, ListMovie, ListAlbum, Penghargaan, tahun, Event, Price, tanggal, kategoriTiket);
    }

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

    @Override
    public void infoEvent() {
        System.out.println("====== INFO EVENT ======");
        System.out.println("Aktris  : " + Nama);
        System.out.println("Event   : " + Event);
        System.out.println("Lokasi  : " + lokasi);
        System.out.println("Tanggal : " + tanggal);
        System.out.println("=========================");
    }

    @Override
    public void cetakTiket() {
        System.out.println("====== TICKET FANMEETING ======");
        System.out.println("Aktris    : " + Nama);
        System.out.println("Event     : " + Event);
        System.out.println("Lokasi    : " + lokasi);
        System.out.println("Tanggal   : " + tanggal);
        System.out.println("Kategori  : " + kategoriTiket);
        System.out.println("Harga     : Rp " + Price);
        System.out.println("================================");
    }
}