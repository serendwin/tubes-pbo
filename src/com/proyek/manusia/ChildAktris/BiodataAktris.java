package com.proyek.manusia.ChildAktris;

import com.proyek.manusia.Agensi;

public class BiodataAktris extends Agensi {

    public BiodataAktris(
            String Nama,
            String Kewarganegaraan,
            String TtlLahir,
            String TtlDebut,
            int MasaTrainee,
            String Posisi,
            String ListDrama,
            String ListMovie,
            String ListAlbum,
            String Penghargaan,
            int tahun,
            String Event,
            double Price
    ) {
        super(
                Nama,
                Kewarganegaraan,
                TtlLahir,
                TtlDebut,
                MasaTrainee,
                Posisi,
                ListDrama,
                ListMovie,
                ListAlbum,
                Penghargaan,
                tahun,
                Event,
                Price
        );
    }
    
    public void tampilkanBiodata() {
        System.out.println("===== Biodata Aktris =====");
        System.out.println("Nama: " + Nama);
        System.out.println("Kewarganegaraan: " + Kewarganegaraan);
        System.out.println("Tanggal Lahir: " + TtlLahir);
        System.out.println("Tahun Debut: " + TtlDebut);
        System.out.println("Posisi: " + Posisi);
        System.out.println("List Drama: " + ListDrama);
        System.out.println("List Movie: " + ListMovie);
        System.out.println("List Album: " + ListAlbum);
        System.out.println("Penghargaan: " + Penghargaan);
        System.out.println("Tahun: " + tahun);
    }
}

public void news() {
    System.out.println(Nama + " muncul di berita terbaru.");
}

public void dispatch(boolean hadir) {
    if (hadir) {
        System.out.println(Nama + " hadir di acara premier.");
    } else {
        System.out.println(Nama + " tidak hadir di acara premier.");
    }
}

public void fanMeeting() {
    System.out.println(Nama + " akan mengadakan fan meeting bulan depan.");
}

@Override
public void bekerja() {
    System.out.println(Nama + " sedang syuting drama.");
}

public void wawancara() {
    System.out.println(Nama + " sedang mengikuti wawancara majalah.");
}

public void hiatus() {
    System.out.println(Nama + " sedang hiatus sementara.");
}
