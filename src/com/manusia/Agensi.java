package com.manusia;

public class Agensi {

    protected String nama;
    protected int umur;
    protected String jenisKelamin;
    protected String kewarganegaraan;
    protected int tahun;


    public Agensi(String nama, int umur, String jenisKelamin, String kewarganegaraan, int tahun) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.kewarganegaraan = kewarganegaraan;
        this.tahun = tahun;
    }

    public Agensi(String nama, String kewarganegaraan, int tahun) {
        this(nama, 0, "Tidak Diketahui", kewarganegaraan, 0);
    }

    public void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Kewarganegaraan: " + kewarganegaraan);
        System.out.println("Tahun bergabung: " + tahun);
    }

    public void begabung() {
        System.out.println(nama + " bergabung dengan LA Entertainment pada tahun " + tahun + " aktif sampai sekarang");
    }

    public void bekerja() {
        System.out.println(nama + " berada di naungan Agensi LA Entertainment");
    }

    public void aktif() {
        System.out.println(nama + " masih aktif di agensi LA Entertainment");
    }

    public void hiatus() {
        System.out.println(nama + " sedang hiatus di agensi LA Entertainment");
    }
}
