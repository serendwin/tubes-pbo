package com.proyek.manusia;

   public class Agensi {
    // property biodata
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

    // property ticketing
    protected String Event;
    protected double Price;
    protected String lokasi;
    protected String tanggal;
    protected String kategoriTiket;

    public Agensi(String Nama, String Kewarganegaraan, String TtlLahir, String TtlDebut,
                  int MasaTrainee, String Posisi, String ListDrama, String ListMovie,
                  String ListAlbum, String Penghargaan, int tahun,
                  String Event, double Price, String tanggal, String kategoriTiket) {

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
        this.tahun = tahun;
        this.Event = Event;
        this.Price = Price;
        this.tanggal = tanggal;
        this.kategoriTiket = kategoriTiket;
    }

        public void Header() {
            System.out.println("______________________________________________________________________");
            System.out.println("=====Hello My Dear, Welcome to Our House, MihuMihu Entertaintment!====");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Choose Your Fighter Baby:");
            System.out.println("----------------------------------------------------------------------");}
        public void GarisAe() {
            System.out.println("______________________________________________________________________");}
    }