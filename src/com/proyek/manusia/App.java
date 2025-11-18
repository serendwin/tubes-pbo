package com.proyek.manusia;

import java.util.Scanner;
import com.proyek.manusia.ChildAktris.BiodataAktris;
import com.proyek.manusia.ChildAktris.TicketingFanmeetingAktris;

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

        BiodataAktris aktris2 = new BiodataAktris(
            "Pukimai",
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
        System.out.println("______________________________________________________________________");
        System.out.println("=====Hello My Dear, Welcome to Our House, MihuMihu Entertaintment!====");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Choose Your Fighter Baby:");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("1. Aktor");
        System.out.println("2. Aktris");
        System.out.println("3. Idol");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu : ");
        System.out.println("----------------------------------------------------------------------");





        System.out.println("====== Aktris =====");
        System.out.println("1. Biodata Aktris");
        System.out.println("2. Ticketing");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu : ");

        int pilihan = input.nextInt();
        int Menu = input.nextInt();

        switch (Menu) {
            case 1:
                System.out.println("Biodata Aktris");
                    switch (pilihan) {
                    case 1:
                    System.out.println("Info Fanmeeting");
                    aktris1.tampilkanAktris();
                    break;  

                    case 2:
                    System.out.println("Pemesanan Tiket");
                    aktris2.tampilkanAktris();
                    break;

                    default:
                    System.out.println("Pilihan tidak valid!");
                    }
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
