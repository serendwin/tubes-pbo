package com.proyek.manusia;

import java.util.Scanner;
import com.proyek.manusia.ChildAktris.BiodataAktris;
import com.proyek.manusia.ChildAktris.TicketingFanmeetingAktris;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BiodataAktris biodata1 = new BiodataAktris(
                "Kim Ji-won",
                "Korea Selatan",
                "19 Oktober 1992",
                "2008",
                0,
                "Aktris",
                "Queen of Tears",
                "Horor stories",
                "-",
                "Best Actress Award pada tahun 2016"
        );

        TicketingFanmeetingAktris tiket1 = new TicketingFanmeetingAktris(
                "Kim Ji-won",
                "Korea Selatan",
                "19 Oktober 1995",
                "2010",
                0,
                "Wonderful With Me",
                "Tokyo Dome",
                "21 November 2025",
                "VIP"
        );

        BiodataAktris biodata2 = new BiodataAktris(
                "Park Shin-hye",
                "Korea Selatan",
                "18 Februari 1990",
                "2003",
                0,
                "Aktris",
                "Memories of the Alhambra",
                "Cyrano Agency",
                "-",
                "Most Popular Film Actress pada tahun 2015"
        );

        TicketingFanmeetingAktris tiket2 = new TicketingFanmeetingAktris(
                "Park Shin-hye",
                "Korea Selatan",
                "18 Februari 1990",
                "2003",
                0,
                "Abracadabra",
                "Seoul Arena",
                "12 Desember 2025",
                "Reguler"
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
        int menuUtama = input.nextInt();
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
        switch (menuUtama) {
            case 2: 
                boolean kembaliAktris = false;
                while (!kembaliAktris) {
                    System.out.println("=========== Menu Aktris ===========");
                    System.out.println("1. Biodata");
                    System.out.println("2. Info Event dan Pembelian Tiket");
                    System.out.println("3. Kembali");
                    System.out.print("Pilih menu : ");
                    int menuAktris = input.nextInt();
                    System.out.println();
                    switch (menuAktris) 
                    {
                        case 1:  
                            System.out.println("=== Pilih Biodata Aktris ===");
                            System.out.println("1. Kim Ji-won");
                            System.out.println("2. Park Shin-Hye");
                            System.out.println("3. Kembali");
                            System.out.print("Pilih Aktris : ");
                            int menuBiodata = input.nextInt();
                            System.out.println();
                            switch (menuBiodata) {
                                case 1:
                                    biodata1.tampilkanAktris();
                                    break;

                                case 2:
                                    biodata2.tampilkanAktris();
                                    break;

                                case 3:
                                    break;

                                default:
                                    System.out.println("Pilihan tidak valid!");
                            }
                            break;

                        case 2:  
                            System.out.println("=== Pricelist dan Info Event ===");
                            System.out.println("1. Kim Ji-won");
                            System.out.println("2. Park Shin-Hye");
                            System.out.println("3. Kembali");
                            System.out.print("Pilih Aktris : ");
                            int menuEvent = input.nextInt();
                            System.out.println();
                            switch (menuEvent) 
                            {
                                case 1:
                                    tiket1.infoEvent();
                                    System.out.println("1. Beli Tiket");
                                    System.out.println("2. Kembali");
                                    System.out.print("Pilih : ");
                                    int beli1 = input.nextInt();
                                    System.out.println();
                                    if (beli1 == 1) {
                                        tiket1.inputTiket(input);
                                        tiket1.cetakTiket();
                                        tiket1.jiwon();
                                    } else {
                                        System.out.println("Anda membatalkan pembelian.");
                                    }
                                    break;

                                case 2:
                                    tiket2.infoEvent();
                                    System.out.println("1. Beli Tiket");
                                    System.out.println("2. Kembali");
                                    System.out.print("Pilih : ");
                                    int beli2 = input.nextInt();
                                    System.out.println();
                                    if (beli2 == 1) {
                                        tiket2.inputTiket(input);
                                        tiket2.cetakTiket();
                                        tiket2.shinhye();
                                    } else {
                                        System.out.println("Anda membatalkan pembelian.");
                                    }
                                    break;

                                case 3:
                                    break;

                                default:
                                    System.out.println("Anda telah keluar");
                            }
                            break;

                        case 3:
                            kembaliAktris = true;
                            break;

                        default:
                            System.out.println("Pilihan tidak valid!");
                    }
                }
                break;

            case 1:
                System.out.println("Fitur Aktor belum dibuat.");
                break;

            case 3:
                System.out.println("Fitur Idol belum dibuat.");
                break;

            case 4:
                System.out.println("Keluar...");
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}
