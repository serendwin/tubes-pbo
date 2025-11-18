package com.proyek.manusia;

import com.proyek.manusia.ChildAktor.BiodataAktor;
import com.proyek.manusia.ChildAktris.BiodataAktris;
import com.proyek.manusia.ChildIdol.BiodataIdol;
import com.proyek.manusia.Agensi;

public class App {
    public static void main(String[] args) {
      
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
                750000);               // Price
        //
        

        System.out.println("===== AKTRIS =====");
        System.out.println("====================================================");
        aktris1.tampilkanAktris();
        System.out.println("====================================================\n");


    }
}
