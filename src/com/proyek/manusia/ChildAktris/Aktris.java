package com.proyek.manusia.ChildAktris;

import com.proyek.manusia.Agensi;

public class Aktris extends Agensi {

    public Aktris(String nama, String kewarganegaraan, String ttlLahir,
                  String ttlDebut, int masaTrainee) {
        super(nama, kewarganegaraan, ttlLahir, ttlDebut, masaTrainee);
    }

    public void tampilkanAktris() {
        System.out.println("Menampilkan biodata aktris");
    }

    public void infoEvent() {
        System.out.println("Menampilkan info event");
    }

    public void cetakTiket() {
        System.out.println("Menampilkan tiket");
    }
}
