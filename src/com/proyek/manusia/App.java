package com.proyek.manusia;

import java.util.Scanner;
import com.proyek.manusia.ChildAktris.BiodataAktris;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BiodataAktris aktris1 = new BiodataAktris(
            "Kim Ji-won",
            "Korea Selatan",
            "19 Oktober 1995",
            "2010",
            5,
            "Aktris",
            "Queen of Tears",
            "-",
            "-",
            "Best Actress Award",
            2024,
            "Fanmeeting Tokyo",
            750000,
            "21 November 2025",
            "VIP"
        );

        // =====================
        // MENU
        // =====================
        System.out.println("====================================");
        System.out.println("   MIHUMIHU ENTERTAINMENT SYSTEM");
        System.out.println("====================================");
        System.out.println("1. Tampilkan Biodata Aktris");
        System.out.println("2. Keluar");
        System.out.print("Pilih menu : ");

        int pilihan = input.nextInt();
        int Menu = input.nextInt();

        switch (Menu) {

            case 1:
                System.out.println("\nBiodata ");
                aktris1.tampilkanAktris();
                System.out.println("==========================");
                break;

            case 2:
            System.out.println("Fanmeeting");
                switch (pilihan) {
                    case 1:
                    System.out.println("Info Fanmeeting");
                    aktris1.infoEvent();
                    break;
                    
                    case 2:
                    System.out.println("Pemesanan Tiket");
                    aktris1.cetakTiket();
                    break;
                
                } 
            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}
