package com.proyek.manusia;

import java.util.Scanner;

import com.proyek.manusia.ChildAktor.BiodataAktor;
import com.proyek.manusia.ChildAktor.TicketFanmeetingaktor;
import com.proyek.manusia.ChildAktris.BiodataAktris;
import com.proyek.manusia.ChildAktris.TicketingFanmeetingAktris;
import com.proyek.manusia.ChildIdol.BiodataIdol;
import com.proyek.manusia.ChildIdol.PembelianAlbum;
import com.proyek.manusia.ChildIdol.TicketKonserIdol;

public class App 
{
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);

        BiodataAktor aktor1 = new BiodataAktor(
                "Lee Min-ho",
                "Korea Selatan",
                "22 Juni 1987",
                "2003",
                0,
                "Actor",
                "The Heirs",
                "Gangnam Blues",
                "—",
                "Best Actor Award"
        );

        BiodataAktor aktor2 = new BiodataAktor(
                "Lee Dong-wook",
                "Korea Selatan",
                "6 November 1981",
                "1999",
                0,
                "Actor",
                "A shop for killers",
                "The Beauty Inside",
                "—",
                "Best Actor Award"
        );

        TicketFanmeetingaktor leeminho = new TicketFanmeetingaktor(
                "Lee Min-ho",
                "Korea Selatan",
                "22 Juni 1987",
                "2003",
                0,
                "Lee Min-ho Global Fanmeeting Tour 2026",
                "Jakarta Convention Center (JCC)",
                "10 Mei 2026",
                "VIP"
        );

        TicketFanmeetingaktor leedongwook = new TicketFanmeetingaktor(
                "Lee Dong-wook",
                "Korea Selatan",
                "6 November 1981",
                "1999",
                0,
                "Lee Dong-wook Asian Fanmeeting 2026 My Dear",
                "ICE BSD Tangerang",
                "25 Mei 2026",
                "VVIP"
        );


        BiodataAktris aktris1 = new BiodataAktris(
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

        TicketingFanmeetingAktris jiwon = new TicketingFanmeetingAktris(
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

        BiodataAktris aktris2 = new BiodataAktris(
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

        TicketingFanmeetingAktris shinhye = new TicketingFanmeetingAktris(
                "Park Shin-hye",
                "Korea Selatan",
                "18 Februari 1990",
                "2003",
                0,
                "Abracadabra",
                "Seoul Arena",
                "12 Desember 2025",
                "Regular"
        );

        BiodataIdol idol1 = new BiodataIdol(
                "NCT DREAM",
                "Korea Selatan",
                "25 Agustus 2016",  
                "2016",
                7,                   
                "Vocalist, Rapper, Dancer",
                "-",
                "-",
                "Hot Sauce (2021)",
                "Seoul Music Awards - Bonsang"
        );

        BiodataIdol idol2 = new BiodataIdol(
                "DAY6",
                "Korea Selatan",
                "7 September 2015",      
                "2015",
                2,                    
                "Band (Vocalist, Guitarist, Bassist, Keyboardist, Drummer)",
                "-", "-", 
                "The Book of Us (2020)",
                "Golden Disc Award - Best Band"
        );

        BiodataIdol mark = new BiodataIdol(
                "Mark",
                "Korea Selatan / Kanada",
                "2 Agustus 1999",
                "2016",
                5,
                "Leader, Main Rapper, Main Dancer, Sub-Vokalis, Face of the Group",
                "-", "-",
                "Reload (2020)",
                "Seoul Music Awards Bonsang"
        );

        BiodataIdol renjun = new BiodataIdol(
                "Renjun",
                "Tiongkok",
                "23 Maret 2000",
                "2016",
                4,
                "Main Vocalist, Main Dancer",
                "-", "-",
                "Reload (2020)",
                "Seoul Music Awards Bonsang"
        );

        BiodataIdol jeno = new BiodataIdol(
                "Jeno",
                "Korea Selatan",
                "23 April 2000",
                "2016",
                5,
                "Main Rapper, Main Dancer, Sub-Vokalis, Visual",
                "-", "-",
                "Reload (2020)",
                "Seoul Music Awards Bonsang"
        );

        BiodataIdol haechan = new BiodataIdol(
                "Haechan",
                "Korea Selatan",
                "6 Juni 2000",
                "2016",
                3,
                "Main Vocalist",
                "-", "-",
                "Reload (2020)",
                "Seoul Music Awards Bonsang"
        );

        BiodataIdol jaemin = new BiodataIdol(
                "Jaemin",
                "Korea Selatan",
                "13 Agustus 2000",
                "2016",
                5,
                "Main Dancer, Sub Rapper, Sub Vocalist, Visual, Center",
                "-", "-",
                "Reload (2020)",
                "Seoul Music Awards Bonsang"
        );

        BiodataIdol chenle = new BiodataIdol(
                "Chenle",
                "Tiongkok",
                "22 November 2001",
                "2016",
                1,
                "Main Vocalist",
                "-", "-",
                "Reload (2020)",
                "Seoul Music Awards Bonsang"
        );

        BiodataIdol jisung = new BiodataIdol(
                "Jisung",
                "Korea Selatan",
                "5 Februari 2002",
                "2016",
                5,
                "Main Dancer, Sub Rapper, Sub Vocalist, Maknae",
                "-", "-",
                "Reload (2020)",
                "Seoul Music Awards Bonsang"
        );

        BiodataIdol sungjin = new BiodataIdol(
                "Sungjin",
                "Korea Selatan",
                "16 Januari 1993",
                "2015",
                2,
                "Leader, Main Vocalist, Rhythm Guitarist",
                "-", "-",
                "The Book of Us: Negentropy (2021)",
                "Golden Disc Award - Best Band"
        );

        BiodataIdol youngk = new BiodataIdol(
                "Young K",
                "Korea Selatan",
                "19 Desember 1993",
                "2015",
                2,
                "Bassist, Main Rapper, Main Vocalist",
                "-", "-",
                "The Book of Us: Negentropy (2021)",
                "Golden Disc Award - Best Band"
        );

        BiodataIdol wonpiil = new BiodataIdol(
                "Wonpil",
                "Korea Selatan",
                "28 April 1994",
                "2015",
                2,
                "Keyboardist, Synthesizer, Main Vocalist, Visual",
                "-", "-",
                "The Book of Us: Negentropy (2021)",
                "Golden Disc Award - Best Band"
        );

        BiodataIdol dowoon = new BiodataIdol(
                "Dowoon",
                "Korea Selatan",
                "25 Agustus 1995",
                "2015",
                2,
                "Drummer, Maknae, Vocalist",
                "-", "-",
                "The Book of Us: Negentropy (2021)",
                "Golden Disc Award - Best Band"
        );

        PembelianAlbum album1 = new PembelianAlbum(
                "NCT DREAM",
                "Korea Selatan",
                "25 Agustus 2016",
                "2016",
                5,
                "Glitch Mode"
        );

        PembelianAlbum album2= new PembelianAlbum(
                "DAY6",
                "Korea Selatan",
                "07 September 2015",
                "2016",
                5,
                "Fourever"
        );

        TicketKonserIdol konser1 = new TicketKonserIdol(
            "NCT DREAM",
            "Korea Selatan",
            "25 Agustus 2016",
            "2016",
            4,
            "Vocalist, Rapper, Dancer",
            "-", "-", 
            "Hot Sauce",
            "Seoul Music Award",
            "KONSER",
            "THE DREAM SHOW 3",
            "Jakarta",
            "22 Februari 2025",
            "VVIP",
            "A"
         );

        TicketKonserIdol konser2 = new TicketKonserIdol(
                "DAY6",
                "Korea Selatan",
                "7 September 2015",
                "2015",
                2,
                "Band, Vocalist, Guitarist, Drummer",
                "-", "-", 
                "The Book of Us",
                "Golden Disc Award - Best Band",
                "KONSER",
                "DAY6 1st World Tour",
                "Jakarta",
                "22 Februari 2025",
                "VVIP",
                "A"
        );

        TicketKonserIdol fanmeet1 = new TicketKonserIdol(
                "Jisung",
                "Korea Selatan",
                "05 Februari 2002",
                "2016",
                5,
                "Dancer, Maknae",
                "-", "-",
                "Hello Future",
                "MMA Rookie Award",
                "FANMEETING",
                "JISUNG 1st FANMEETING OUR MEMORY",
                "Jakarta",
                "10 Maret 2025",
                "HI-TOUCH",
                "-"
        );

        TicketKonserIdol fanmeet2 = new TicketKonserIdol(
                "DAY6",
                "Korea Selatan",
                "7 September 2015",
                "2015",
                2,
                "Band, Vocalist, Guitarist, Drummer",
                "-", "-",
                "The Book of Us",
                "Golden Disc Award - Best Band",
                "FANMEETING",
                "DAY6 1st FANMEETING OUR STORY",
                "Jakarta",
                "10 Maret 2025",
                "HI-TOUCH",
                "-"
        );

        boolean kembaliutama = false;
        while (!kembaliutama) 
        {
        System.out.println("______________________________________________________________________");
        System.out.println("=====Hello My Dear, Welcome to Our House, MihuMihu Entertaintment!====");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Choose Your Fighter Baby:");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("1. Aktor");
        System.out.println("2. Aktris");
        System.out.println("3. Idol");
        System.out.println("4. Keluar");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Pilih menu : ");
        int menuUtama = input.nextInt();
        System.out.println();
        switch (menuUtama) 
        {
            case 1: 
                boolean kembaliAktor = false;
                while (!kembaliAktor) 
                {
                    System.out.println("=================================================================");
                    System.out.println("=========================  MENU AKTOR   =========================");
                    System.out.println("=================================================================");
                    System.out.println("1. Lihat Biodata");
                    System.out.println("2. Info Event dan Pembelian Tiket");
                    System.out.println("3. Kembali ke Menu Utama");
                    System.out.println("-----------------------------------------------------------------");   
                    System.out.print("Pilih Menu : ");
                    int menuAktor = input.nextInt();
                    System.out.println();
                    switch (menuAktor) 
                    {
                        case 1:  
                            System.out.println("=================================================================");
                            System.out.println("=====================  PILIH BIODATA AKTOR  =====================");
                            System.out.println("=================================================================");
                            System.out.println("1. Lee Min-ho");
                            System.out.println("2. Lee Dong-wook");
                            System.out.println("3. Kembali");
                            System.out.println("-----------------------------------------------------------------");                                
                            System.out.print("Pilih Aktor : ");
                            int menuBiodataaktor = input.nextInt();
                            System.out.println();
                            switch (menuBiodataaktor) 
                            {
                                case 1:
                                    aktor1.tampilkanAktor();
                                    break;

                                case 2:
                                    aktor2.tampilkanAktor();
                                    break;

                                case 3:
                                    break;

                                default:
                                    System.out.println("Pilihan tidak valid!");
                            }
                            break;

                        case 2:  
                            System.out.println("=================================================================");
                            System.out.println("====================  PRICELIST & INFO EVENT  ===================");
                            System.out.println("=================================================================");
                            System.out.println("1. Lee Min-ho");
                            System.out.println("2. Lee Dong-wook");
                            System.out.println("3. Kembali");
                            System.out.println("-----------------------------------------------------------------");
                            System.out.print("Pilih Aktor : ");
                            int menueventaktor = input.nextInt();
                            System.out.println();
                            switch (menueventaktor) 
                            {
                                case 1:
                                    leeminho.infoEvent();
                                    System.out.println("1. Beli Tiket");
                                    System.out.println("2. Kembali");
                                    System.out.print("Pilih : ");
                                    int tiketaktor1 = input.nextInt();
                                    System.out.println();
                                    if (tiketaktor1 == 1) 
                                    {
                                        leeminho.inputTiket(input);
                                        leeminho.cetakTiket();
                                        leeminho.leeminho();
                                    } 
                                    else 
                                    {
                                        System.out.println("Anda membatalkan pembelian.");
                                    }
                                    break;

                                case 2:
                                    leedongwook.infoEvent();
                                    System.out.println("1. Beli Tiket");
                                    System.out.println("2. Kembali");
                                    System.out.print("Pilih : ");
                                    int tiketaktor2 = input.nextInt();
                                    System.out.println();
                                    if (tiketaktor2 == 1) 
                                    {
                                        leedongwook.inputTiket(input);
                                        leedongwook.cetakTiket();
                                        leedongwook.dongwook();
                                    } 
                                    else 
                                    {
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
                            kembaliAktor = true;
                            break;

                        default:
                            System.out.println("Pilihan tidak valid!");
                    }
                }
                break;

            case 2: 
                boolean kembaliAktris = false;
                while (!kembaliAktris) 
                {
                    System.out.println("=================================================================");
                    System.out.println("=========================  MENU AKTRIS ==========================");
                    System.out.println("=================================================================");
                    System.out.println("1. Lihat Biodata");
                    System.out.println("2. Info Event dan Pembelian Tiket");
                    System.out.println("3. Kembali ke Menu Utama");
                    System.out.println("-----------------------------------------------------------------");   
                    System.out.print("Pilih Menu : ");
                    int menuAktris = input.nextInt();
                    System.out.println();
                    switch (menuAktris) 
                    {
                        case 1:  
                            System.out.println("=================================================================");
                            System.out.println("=====================  PILIH BIODATA AKTRIS  ====================");
                            System.out.println("=================================================================");
                            System.out.println("1. Kim Ji-won");
                            System.out.println("2. Park Shin-Hye");
                            System.out.println("3. Kembali");
                            System.out.println("-----------------------------------------------------------------");                                
                            System.out.print("Pilih Aktris : ");
                            int menubiodataaktris = input.nextInt();
                            System.out.println();
                            switch (menubiodataaktris) 
                            {
                                case 1:
                                    aktris1.tampilkanAktris();
                                    break;

                                case 2:
                                    aktris2.tampilkanAktris();
                                    break;

                                case 3:
                                    break;

                                default:
                                    System.out.println("Pilihan tidak valid!");
                            }
                            break;

                        case 2:  
                            System.out.println("=================================================================");
                            System.out.println("====================  PRICELIST & INFO EVENT  ===================");
                            System.out.println("=================================================================");
                            System.out.println("1. Kim Ji-won");
                            System.out.println("2. Park Shin-Hye");
                            System.out.println("3. Kembali");
                            System.out.println("-----------------------------------------------------------------");
                            System.out.print("Pilih Aktris : ");
                            int menueventaktris = input.nextInt();
                            System.out.println();
                            switch (menueventaktris) 
                            {
                                case 1:
                                    jiwon.infoEvent();
                                    System.out.println("1. Beli Tiket");
                                    System.out.println("2. Kembali");
                                    System.out.print("Pilih : ");
                                    int tiketaktris1 = input.nextInt();
                                    System.out.println();
                                    if (tiketaktris1 == 1) {
                                        jiwon.inputTiket(input);
                                        jiwon.cetakTiket();
                                        jiwon.jiwon();
                                    } 
                                    else 
                                    {
                                        System.out.println("Anda membatalkan pembelian.");
                                    }
                                    break;

                                case 2:
                                    shinhye.infoEvent();
                                    System.out.println("1. Beli Tiket");
                                    System.out.println("2. Kembali");
                                    System.out.print("Pilih : ");
                                    int tiketaktris2 = input.nextInt();
                                    System.out.println();
                                    if (tiketaktris2 == 1) 
                                    {
                                        shinhye.inputTiket(input);
                                        shinhye.cetakTiket();
                                        shinhye.shinhye();
                                    } 
                                    else 
                                    {
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

            case 3:
                boolean kembaliIdol = false;
                while (!kembaliIdol) 
                {
                    System.out.println("===========================================================");
                    System.out.println("=======================  MENU IDOL  =======================");
                    System.out.println("===========================================================");
                    System.out.println("1. Lihat Biodata");
                    System.out.println("2. Pembelian Album");
                    System.out.println("3. Ticketing");
                    System.out.println("4. Kembali ke Menu Utama");
                    System.out.println("-----------------------------------------------------------");
                    System.out.print("Pilih Menu: ");
                    int menuIdol = input.nextInt();
                    System.out.println();
                    switch (menuIdol) 
                    {
                        case 1:  
                            System.out.println("===========================================================");
                            System.out.println("==================== PILIH BIODATA IDOL ===================");
                            System.out.println("===========================================================");
                            System.out.println("1. NCT Dream");
                            System.out.println("2. Day6");
                            System.out.println("3. Kembali");
                            System.out.println("-----------------------------------------------------------");                            
                            System.out.print("Pilih Idol : ");
                            int menubiodataidol = input.nextInt();
                            System.out.println();
                            switch (menubiodataidol) 
                            {
                                case 1:
                                    System.out.println("===========================================================");
                                    System.out.println("==================== BIODATA NCT DREAM ====================");
                                    System.out.println("===========================================================");
                                    System.out.println("1. Biodata Group");
                                    System.out.println("2. Biodata Per-member");
                                    System.out.println("3. Keluar");
                                    System.out.println("-----------------------------------------------------------");
                                    System.out.print("Pilih yang ingin kamu akses biodatanya : ");
                                    int nctdream = input.nextInt();
                                    System.out.println();
                                    switch (nctdream) 
                                    {
                                        case 1 : 
                                            idol1.tampilkanbiodatagroupidol();
                                            break;
                                        
                                        case 2 :
                                            System.out.println("===========================================================");
                                            System.out.println("================= BIODATA MEMBER NCT DREAM ================");
                                            System.out.println("===========================================================");
                                            System.out.println("1. Mark");
                                            System.out.println("2. Renjun");
                                            System.out.println("3. Jeno");
                                            System.out.println("4. Haechan");
                                            System.out.println("5. Jaemin");
                                            System.out.println("6. Chenle");
                                            System.out.println("7. Jisung");
                                            System.out.println("8. Keluar");
                                            System.out.println("-----------------------------------------------------------");
                                            System.out.print("Pilih member yang ingin biodatanya kamu liat : ");
                                            int membernct = input.nextInt();
                                            System.out.println();
                                            switch (membernct) {
                                                case 1 : 
                                                    mark.tampilkanbiodatamemberNCTDream();
                                                    break;

                                                case 2 : 
                                                    renjun.tampilkanbiodatamemberNCTDream();
                                                    break;

                                                case 3 : 
                                                    jeno.tampilkanbiodatamemberNCTDream();
                                                    break;

                                                case 4 : 
                                                    haechan.tampilkanbiodatamemberNCTDream();
                                                    break;

                                                case 5 : 
                                                    jaemin.tampilkanbiodatamemberNCTDream();
                                                    break;

                                                case 6 : 
                                                    chenle.tampilkanbiodatamemberNCTDream();
                                                    break;

                                                case 7 : 
                                                    jisung.tampilkanbiodatamemberNCTDream();
                                                    break;

                                                default : 
                                                    System.out.println("Anda telah keluar dari fitur ini");
                                            }

                                    }
                                    break;

                                case 2:
                                    System.out.println("===========================================================");
                                    System.out.println("=====================  BIODATA DAY6  ======================");
                                    System.out.println("===========================================================");
                                    System.out.println("1. Biodata Group");
                                    System.out.println("2. Biodata Per-member");
                                    System.out.println("3. Keluar");
                                    System.out.println("-----------------------------------------------------------");
                                    System.out.print("Pilih yang ingin kamu akses biodatanya : ");
                                    int day6 = input.nextInt();
                                    System.out.println();
                                    switch (day6) 
                                    {
                                        case 1 : 
                                           idol2.tampilkanbiodatagroupidol();
                                           break;
                                        
                                        case 2 :
                                            System.out.println("===========================================================");
                                            System.out.println("=================  BIODATA MEMBER DAY6  ===================");
                                            System.out.println("===========================================================");
                                            System.out.println("1. Sungjin");
                                            System.out.println("2. YoungK");
                                            System.out.println("3. Wonpil");
                                            System.out.println("4. Dowoon");
                                            System.out.println("5. Keluar");
                                            System.out.println("-----------------------------------------------------------");
                                            System.out.print("Pilih member yang ingin biodatanya kamu liat : ");
                                            int memberday6 = input.nextInt();
                                            System.out.println();
                                            switch (memberday6) 
                                            {
                                                case 1 : 
                                                    sungjin.tampilkanbiodatamemberDAY6();
                                                    break;

                                                case 2 : 
                                                    youngk.tampilkanbiodatamemberDAY6();
                                                    break;

                                                case 3 : 
                                                    wonpiil.tampilkanbiodatamemberDAY6();
                                                    break;

                                                case 4 : 
                                                    dowoon.tampilkanbiodatamemberDAY6();
                                                    break;

                                                default : 
                                                    System.out.println("Anda telah keluar dari fitur ini");
                                            }

                                    }
                                    break;

                                default:
                                    System.out.println("Anda telah keluar dari fitur ini");
                            }
                            break;

                        case 2:  
                            System.out.println("===========================================================");
                            System.out.println("====================  PEMBELIAN ALBUM  ====================");
                            System.out.println("===========================================================");
                            System.out.println("1. NCT Dream");
                            System.out.println("2. Day6");
                            System.out.println("3. Kembali");
                            System.out.println("-----------------------------------------------------------");
                            System.out.print("Pilih Idol yang anda ingin beli Album nya : ");
                            int menualbum = input.nextInt();
                            System.out.println();
                            switch (menualbum) 
                            {
                                case 1:
                                    album1.PricelistAlbumnct();
                                    System.out.println("1. Beli Album");
                                    System.out.println("2. Kembali");
                                    System.out.print("Pilih : ");
                                    int albumnct = input.nextInt();
                                    System.out.println();
                                    if (albumnct == 1) 
                                    {
                                        album1.beliAlbum1(input);
                                        album1.cetakStruk();
                                    } 
                                    else 
                                    {
                                        System.out.println("Anda membatalkan pembelian.");
                                    }
                                    break;

                                case 2:
                                    album2.PricelistAlbumday6();
                                    System.out.println("1. Beli Album");
                                    System.out.println("2. Kembali");
                                    System.out.print("Pilih : ");
                                    int albumday6 = input.nextInt();
                                    System.out.println();
                                    if (albumday6 == 1) 
                                    {
                                        album2.beliAlbum2(input);
                                        album2.cetakStruk();
                                    } 
                                    else 
                                    {
                                        System.out.println("Anda membatalkan pembelian.");
                                    }
                                    break;

                                default:
                                    System.out.println("Anda telah keluar");
                            }
                            break;

                        case 3:
                            System.out.println("===========================================================");
                            System.out.println("=======================  TICKETING  =======================");
                            System.out.println("===========================================================");
                            System.out.println("1. NCT Dream");
                            System.out.println("2. Day6");
                            System.out.println("3. Kembali");
                            System.out.println("-----------------------------------------------------------");
                            System.out.print("Pilih : ");
                            int menutiket = input.nextInt();
                            System.out.println();
                            switch (menutiket) 
                            {
                                case 1:
                                    System.out.println("===========================================================");
                                    System.out.println("==================  TICKETING NCT DREAM  ==================");
                                    System.out.println("===========================================================");
                                    System.out.println("1. Konser");
                                    System.out.println("2. Fanmeeting");
                                    System.out.println("3. Kembali");
                                    System.out.println("-----------------------------------------------------------");
                                    System.out.print("Pilih : ");
                                    int tiketnct = input.nextInt();
                                    System.out.println();
                                    switch (tiketnct) 
                                    {
                                        case 1 : 
                                        konser1.infoEvent();
                                        System.out.println("1. Beli Tiket");
                                        System.out.println("2. Kembali");
                                        System.out.print("Pilih : ");
                                        int konsernct = input.nextInt();
                                        System.out.println();
                                        if (konsernct == 1) 
                                        {
                                            konser1.inputTiket(input);
                                            konser1.cetakTiket();
                                        } 
                                        else 
                                        {
                                            System.out.println("Anda membatalkan pembelian.");
                                        }
                                        break;

                                        case 2 : 
                                        fanmeet1.infoEvent();
                                        System.out.println("1. Beli Tiket");
                                        System.out.println("2. Kembali");
                                        System.out.print("Pilih : ");
                                        int fanmeetnct = input.nextInt();
                                        System.out.println();
                                        if (fanmeetnct == 1) 
                                        {
                                            fanmeet1.inputTiket(input);
                                            fanmeet1.cetakTiket();
                                        } 
                                        else 
                                        {
                                            System.out.println("Anda membatalkan pembelian.");
                                        }
                                        break;

                                        default:
                                            System.out.println("Anda telah keluar");
                                    } 
                                    break;

                                case 2:
                                    System.out.println("===========================================================");
                                    System.out.println("====================  TICKETING DAY6  =====================");
                                    System.out.println("===========================================================");
                                    System.out.println("1. Konser");
                                    System.out.println("2. Fanmeeting");
                                    System.out.println("3. Kembali");
                                    System.out.println("-----------------------------------------------------------");
                                    System.out.print("Pilih : ");
                                    int tiketday = input.nextInt();
                                    System.out.println();
                                    switch (tiketday) 
                                    {
                                        case 1 : 
                                        konser2.infoEvent();
                                        System.out.println("1. Beli Tiket");
                                        System.out.println("2. Kembali");
                                        System.out.print("Pilih : ");
                                        int konserday6 = input.nextInt();
                                        System.out.println();
                                        if (konserday6 == 1) 
                                        {
                                            konser2.inputTiket(input);
                                            konser2.cetakTiket();
                                        } 
                                        else 
                                        {
                                            System.out.println("Anda membatalkan pembelian.");
                                        }
                                        break;

                                        case 2 : 
                                        fanmeet2.infoEvent();
                                        System.out.println("1. Beli Tiket");
                                        System.out.println("2. Kembali");
                                        System.out.print("Pilih : ");
                                        int fanmeetday6 = input.nextInt();
                                        System.out.println();
                                        if (fanmeetday6 == 1) 
                                        {
                                            fanmeet2.inputTiket(input);
                                            fanmeet2.cetakTiket();
                                        } 
                                        else 
                                        {
                                            System.out.println("Anda membatalkan pembelian.");
                                        }
                                        break;

                                        default:
                                            System.out.println("Anda telah keluar");
                                    } 
                                    break;

                                default:
                                    System.out.println("Anda telah keluar");
                            }
                            break;

                        default:
                            System.out.println("Pilihan tidak valid!");
                    }
                }

            case 4:
                System.out.println("Keluar...");
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

    }
    }

}