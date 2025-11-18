package com.proyek.manusia.ChildAktris;

import com.proyek.manusia.Agensi;

public class Aktris extends Agensi {

    public Aktris(String Nama, String Kewarganegaraan, String TtlLahir, String TtlDebut,
                  int MasaTrainee, String Posisi, String ListDrama, String ListMovie,
                  String ListAlbum, String Penghargaan, int tahun, String Event, double Price) {

        super(Nama, Kewarganegaraan, TtlLahir, TtlDebut, MasaTrainee, Posisi,
              ListDrama, ListMovie, ListAlbum, Penghargaan, tahun, Event, Price);
    }

    public void tampilkanAktris() {
        System.out.println("menampilkan biodata aktris");
    }
   public void infoEvent() {
        System.out.println("Menampilkan Info Event");
    }
    public void cetakTiket() {
        System.out.println("Menampilkan Ticket Fanmeeting");
    }
}