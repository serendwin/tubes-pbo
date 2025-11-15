package com.proyek.manusia;

public class Idol extends Agensi {

    private String grup;
    private String agensi;
    private int tahunDebut;
    private int jumlahAlbum;
    private String genre;

    public Idol(String nama, int umur, String jenisKelamin, String kewarganegaraan, int tahun,
                String grup, String agensi, int tahunDebut, int jumlahAlbum, String genre) {
        super(nama, umur, jenisKelamin, kewarganegaraan, tahun);
        this.grup = grup;
        this.agensi = agensi;
        this.tahunDebut = tahunDebut;
        this.jumlahAlbum = jumlahAlbum;
        this.genre = genre;
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " sedang latihan untuk comeback bersama grup " + grup);
    }

    public void tampilPanggung() {
        System.out.println(nama + " tampil di panggung musik membawakan lagu bergenre " + genre);
    }

    public void tampilProfil() {
        System.out.println("Nama " + nama + " Grup " + grup + " Agensi " + agensi);
    }

    public void news(boolean comeback) {
    if (comeback) {
        System.out.println(nama + " sedang bersiap untuk comeback dengan grup " + grup + ".");
    } else {
        System.out.println(nama + " belum memiliki jadwal comeback, fokus pada aktivitas solo.");
    }
    }   

    public void variety() {
        System.out.println(nama + " akan hadir di variety show go school pada eps 21");
    }

}
