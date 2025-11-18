package com.proyek.manusia.ChildAktris;

public class BiodataAktris extends Aktris {

    public BiodataAktris(String Nama, String Kewarganegaraan, String TtlLahir, String TtlDebut,
                  int MasaTrainee, String Posisi, String ListDrama, String ListMovie,
                  String ListAlbum, String Penghargaan, int tahun,
                  String Event, double Price, String tanggal, String kategoriTiket) {

        super(Nama, Kewarganegaraan, TtlLahir, TtlDebut, MasaTrainee, Posisi,
              ListDrama, ListMovie, ListAlbum, Penghargaan, tahun, Event, Price, tanggal, kategoriTiket);
    }

    @Override
    public void tampilkanAktris() {
        System.out.println("===== BIODATA LENGKAP AKTRIS =====");
        System.out.println("Nama: " + Nama);
        System.out.println("Kewarganegaraan: " + Kewarganegaraan);
        System.out.println("Tanggal Lahir: " + TtlLahir);
        System.out.println("Debut: " + TtlDebut);
        System.out.println("Masa Trainee: " + MasaTrainee + " tahun");
        System.out.println("Posisi: " + Posisi);
        System.out.println("Drama: " + ListDrama);
        System.out.println("Movie: " + ListMovie);
        System.out.println("Album: " + ListAlbum);
        System.out.println("Penghargaan: " + Penghargaan + " (" + tahun + ")");
        System.out.println("Event: " + Event);
        System.out.println("Harga Ticket: $" + Price);
    }
}