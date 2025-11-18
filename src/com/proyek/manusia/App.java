package com.proyek.manusia;

import com.proyek.manusia.ChildAktor.BiodataAktor;
import com.proyek.manusia.ChildAktris.BiodataAktris;
import com.proyek.manusia.ChildIdol.BiodataIdol;

public class App {
    public static void main(String[] args) {

        // ==== OBJECT IDOL ====
        BiodataIdol idol1 = new BiodataIdol(
                "Youngk",          // nama
                27,               // umur
                "Laki-laki",      // jenis kelamin
                "Korea",          // kewarganegaraan
                2010,             // tahun
                "Day6",           // grup
                "LA Entertainment", 
                2016,             // tahun debut
                20,               // jumlah album
                "Rock"            // genre
        );

        // ==== OBJECT AKTRIS ====
        BiodataAktris aktris1 = new BiodataAktris(
                "Kim Ji-won",        // Nama
                "Korea Selatan",     // Kewarganegaraan
                "19 Oktober 1995",   // TTL Lahir
                "2010",              // Tahun Debut
                5,                   // Masa trainee
                "Aktris",            // Posisi
                "Queen of Tears",    // List Drama
                "-",                 // List Movie
                "-",                 // List Album
                "Best Actress Award", // Penghargaan
                2024,                // tahun
                "Fanmeeting Tokyo",  // Event
                750000               // Price
        );

        // ==== OBJECT AKTOR ====
        BiodataAktor aktor1 = new BiodataAktor(
                "Park Seo-joon",
                33,
                "Laki-laki",
                "Korea Selatan",
                2016,
                "Concrete Utopia",
                "LA Entertainment"
        );

        // ===========================================
        //               OUTPUT PROGRAM
        // ===========================================

        System.out.println("\n===== IDOL =====");
        System.out.println("====================================================");
        idol1.tampilProfil();
        idol1.news(true);
        idol1.bekerja();
        idol1.tampilPanggung();
        idol1.variety();
        System.out.println("====================================================\n");

        System.out.println("===== AKTRIS =====");
        System.out.println("====================================================");
        aktris1.tampilkanBiodata();
        aktris1.news();             // method yang sudah aku tambahkan
        aktris1.dispatch(true);     // method tambahan
        aktris1.bekerja();          // override
        aktris1.wawancara();        // method di Aktris
        aktris1.fanMeeting();       // method tambahan
        aktris1.hiatus();           // method tambahan
        System.out.println("====================================================\n");

        System.out.println("===== AKTOR =====");
        System.out.println("====================================================");
        aktor1.news();
        aktor1.bekerja();
        aktor1.wawancara();
        aktor1.photoshoot();
        System.out.println("====================================================\n");

    }
}
