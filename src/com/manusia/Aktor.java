package com.manusia;

public class Aktor extends Agensi {

    private String film;
    private int jumlahFilm;
    private String agensi;

    public Aktor(String nama, int umur, String jenisKelamin, String kewarganegaraan, int tahun,
                 String film, int jumlahFilm, String agensi) {
        super(nama, umur, jenisKelamin, kewarganegaraan, tahun);
        this.film = film;
        this.jumlahFilm = jumlahFilm;
        this.agensi = agensi;
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " sedang syuting film berjudul " + film);
    }

    public void wawancara() {
        System.out.println(nama + " memenangkan award ajaang bergengsi tahun 2024");
    }

    public void photoshoot() {
        System.out.println(nama + " melakukan pemotretan untuk majalah ternama Korea.");
    }

    public void news() {
        System.out.println("Aktor " + nama + " akan bergabung dengan " + film + " yang sudah dikonfirmasi oleh " + agensi);
    }
}
