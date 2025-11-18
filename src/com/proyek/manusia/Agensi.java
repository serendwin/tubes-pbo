package com.proyek.manusia;

public class Agensi {
    //property biodata
    protected String Nama;
    protected String Kewarganegaraan;
    protected String TtlLahir;
    protected String TtlDebut;
    protected int MasaTrainee;
    protected String Posisi;
    protected String ListDrama;
    protected String ListMovie;
    protected String ListAlbum;
    protected String Penghargaan;
    protected int tahun;
    //property ticketing
    protected String Event;
    protected double Price;
    
    public Agensi(String Nama, String Kewarganegaraan, String TtlLahir, String TtlDebut,
                int MasaTrainee, String Posisi, String ListDrama, String ListMovie, 
                String ListAlbum, String Penghargaan, int tahun, String Event, double Price) {
        this.Nama = Nama;
        this.Kewarganegaraan = Kewarganegaraan;
        this.TtlLahir = TtlLahir;
        this.TtlDebut = TtlDebut; 
        this.MasaTrainee = MasaTrainee; 
        this.Posisi = Posisi; 
        this.ListDrama = ListDrama; 
        this.ListMovie = ListMovie; 
        this.ListAlbum = ListAlbum; 
        this.Penghargaan = Penghargaan; 
        this.tahun = 2025; 
        this.Event = Event; 
        this.Price = Price; }

    public void Header() {
        System.out.println("______________________________________________________________________");
        System.out.println("=====Hello My Dear, Welcome to Our House, MihuMihu Entertaintment!====");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Choose Your Fighter Baby:");
        System.out.println("----------------------------------------------------------------------");}
    public void GarisAe() {
        System.out.println("______________________________________________________________________");}


public void tampilData() {
    System.out.println("Data: " + Nama + " (" + Kewarganegaraan + ")");
}

public void begabung() {
    System.out.println(Nama + " bergabung dengan agensi.");
}

public void aktif() {
    System.out.println(Nama + " sedang aktif dalam kegiatannya.");
}
