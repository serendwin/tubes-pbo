package com.proyek.manusia.ChildAktris;

import com.proyek.manusia.Agensi;

public class BiodataAktris extends Agensi {

    private String drama; //properti
    private int jumlahDrama;
    private String agensi;

    public BiodataAktris(String nama, int umur, String jenisKelamin, String kewarganegaraan, int tahun,
                  String drama, int jumlahDrama, String agensi) {
        super(nama, umur, jenisKelamin, kewarganegaraan, tahun);
        this.drama = drama;
        this.jumlahDrama = jumlahDrama;
        this.agensi = agensi; //constructor
    }

    @Override 
    public void bekerja() {
        System.out.println(nama + " sedang syuting drama " + drama);
    }

    public void news() { //methods
        System.out.println("Aktris " + nama + " akan bergabung dengan " + drama + " yang sudah dikonfirmasi oleh " + agensi);
    }

    public void dispatch(boolean berita) {
        if (berita) {
            System.out.println(nama + " telah membintangi " + jumlahDrama + " drama selama kariernya.");
        } else {
            news();
        }
    }

    public void fanMeeting() {
        System.out.println(nama + " mengadakan fan meeting bersama penggemar di Seoul!");
    }

    public void wawancara() {
        System.out.println(nama + " sedang menghadiri acara wawancara bersama media.");
    }
}
