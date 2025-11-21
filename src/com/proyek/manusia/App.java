package com.proyek.manusia;

import java.util.Scanner;
import com.proyek.manusia.ChildAktris.BiodataAktris;
import com.proyek.manusia.ChildAktris.TicketingFanmeetingAktris;
import com.proyek.manusia.ChildIdol.BiodataIdol;
import com.proyek.manusia.ChildIdol.PembelianAlbum;
import com.proyek.manusia.ChildIdol.TicketKonserIdol;

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
                "Seoul Music Awards – Bonsang"
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

        BiodataIdol dream1 = new BiodataIdol(
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

        BiodataIdol dream2 = new BiodataIdol(
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

        BiodataIdol dream3 = new BiodataIdol(
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

        BiodataIdol dream4 = new BiodataIdol(
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

        BiodataIdol dream5 = new BiodataIdol(
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

        BiodataIdol dream6 = new BiodataIdol(
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

        BiodataIdol dream7 = new BiodataIdol(
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

        BiodataIdol day1 = new BiodataIdol(
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

        BiodataIdol day2 = new BiodataIdol(
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

        BiodataIdol day3 = new BiodataIdol(
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

        BiodataIdol day4 = new BiodataIdol(
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
                            System.out.println("=====================  PILIH BIODATA AKTRIS =====================");
                            System.out.println("=================================================================");
                            System.out.println("1. Kim Ji-won");
                            System.out.println("2. Park Shin-Hye");
                            System.out.println("3. Kembali");
                            System.out.println("-----------------------------------------------------------------");                                
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
                            System.out.println("=================================================================");
                            System.out.println("==================== PRICELIST & INFO EVENT  ====================");
                            System.out.println("=================================================================");
                            System.out.println("1. Kim Ji-won");
                            System.out.println("2. Park Shin-Hye");
                            System.out.println("3. Kembali");
                            System.out.println("-----------------------------------------------------------------");
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
                boolean kembaliIdol = false;
                while (!kembaliIdol) {
                    System.out.println("=================================================================");
                    System.out.println("==========================  MENU IDOL  ==========================");
                    System.out.println("=================================================================");
                    System.out.println("1. Lihat Biodata");
                    System.out.println("2. Pembelian Album");
                    System.out.println("3. Ticketing");
                    System.out.println("4. Kembali ke Menu Utama");
                    System.out.println("-----------------------------------------------------------------");
                    System.out.print("Pilih Menu: ");
                    int menuIdol = input.nextInt();
                    System.out.println();
                    switch (menuIdol) 
                    {
                        case 1:  
                            System.out.println("=================================================================");
                            System.out.println("======================== PILIH BIODATA IDOL =====================");
                            System.out.println("=================================================================");
                            System.out.println("1. NCT Dream");
                            System.out.println("2. Day6");
                            System.out.println("3. Kembali");
                            System.out.println("-----------------------------------------------------------------");                            
                            System.out.print("Pilih Idol : ");
                            int menubiodataidol = input.nextInt();
                            System.out.println();
                            switch (menubiodataidol) 
                            {
                                case 1:
                                    System.out.println("=================================================================");
                                    System.out.println("======================  BIODATA NCT DREAM =======================");
                                    System.out.println("=================================================================");
                                    System.out.println("1. Biodata Group");
                                    System.out.println("2. Biodata Per-member");
                                    System.out.println("3. Keluar");
                                    System.out.println("-----------------------------------------------------------------");
                                    System.out.print("Pilih yang ingin kamu akses biodatanya : ");
                                    int nctdream = input.nextInt();
                                    System.out.println();
                                    switch (nctdream) 
                                    {
                                        case 1 : 
                                            idol1.tampilkanbiodatagroupidol();
                                            break;
                                        
                                        case 2 :
                                            System.out.println("=================================================================");
                                            System.out.println("==================== BIODATA MEMBER NCT DREAM ===================");
                                            System.out.println("=================================================================");
                                            System.out.println("1. Mark");
                                            System.out.println("2. Renjun");
                                            System.out.println("3. Jeno");
                                            System.out.println("4. Haechan");
                                            System.out.println("5. Jaemin");
                                            System.out.println("6. Chenle");
                                            System.out.println("7. Jisung");
                                            System.out.println("8. Keluar");
                                            System.out.println("-----------------------------------------------------------------");
                                            System.out.print("Pilih member yang ingin biodatanya kamu liat : ");
                                            int membernct = input.nextInt();
                                            System.out.println();
                                            switch (membernct) {
                                                case 1 : 
                                                    dream1.tampilkanbiodatamemberNCTDream();
                                                    break;

                                                case 2 : 
                                                    dream2.tampilkanbiodatamemberNCTDream();
                                                    break;

                                                case 3 : 
                                                    dream3.tampilkanbiodatamemberNCTDream();
                                                    break;

                                                case 4 : 
                                                    dream4.tampilkanbiodatamemberNCTDream();
                                                    break;

                                                case 5 : 
                                                    dream5.tampilkanbiodatamemberNCTDream();
                                                    break;

                                                case 6 : 
                                                    dream6.tampilkanbiodatamemberNCTDream();
                                                    break;

                                                case 7 : 
                                                    dream7.tampilkanbiodatamemberNCTDream();
                                                    break;

                                                default : 
                                                    System.out.println("Anda telah keluar dari fitur ini");
                                            }

                                    }
                                    break;

                                case 2:
                                    System.out.println("=================================================================");
                                    System.out.println("========================  BIODATA DAY6  =========================");
                                    System.out.println("=================================================================");
                                    System.out.println("1. Biodata Group");
                                    System.out.println("2. Biodata Per-member");
                                    System.out.println("3. Keluar");
                                    System.out.println("-----------------------------------------------------------------");
                                    System.out.print("Pilih yang ingin kamu akses biodatanya : ");
                                    int day6 = input.nextInt();
                                    System.out.println();
                                    switch (day6) 
                                    {
                                        case 1 : 
                                           idol2.tampilkanbiodatagroupidol();
                                           break;
                                        
                                        case 2 :
                                            System.out.println("=================================================================");
                                            System.out.println("====================  BIODATA MEMBER DAY6  ======================");
                                            System.out.println("=================================================================");
                                            System.out.println("1. Sungjin");
                                            System.out.println("2. YoungK");
                                            System.out.println("3. Wonpil");
                                            System.out.println("4. Dowoon");
                                            System.out.println("5. Keluar");
                                            System.out.println("-----------------------------------------------------------------");
                                            System.out.print("Pilih member yang ingin biodatanya kamu liat : ");
                                            int memberday6 = input.nextInt();
                                            System.out.println();
                                            switch (memberday6) {
                                                case 1 : 
                                                    day1.tampilkanbiodatamemberDAY6();
                                                    break;

                                                case 2 : 
                                                    day2.tampilkanbiodatamemberDAY6();
                                                    break;

                                                case 3 : 
                                                    day3.tampilkanbiodatamemberDAY6();
                                                    break;

                                                case 4 : 
                                                    day4.tampilkanbiodatamemberDAY6();
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
                            System.out.println("=================================================================");
                            System.out.println("=======================  PEMBELIAN ALBUM  =======================");
                            System.out.println("=================================================================");
                            System.out.println("1. NCT Dream");
                            System.out.println("2. Day6");
                            System.out.println("3. Kembali");
                            System.out.println("-----------------------------------------------------------------");
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
                                    if (albumnct == 1) {
                                        album1.beliAlbum1(input);
                                        album1.cetakStruk();
                                    } else {
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
                                    if (albumday6 == 1) {
                                        album2.beliAlbum2(input);
                                        album2.cetakStruk();
                                    } else {
                                        System.out.println("Anda membatalkan pembelian.");
                                    }
                                    break;

                                default:
                                    System.out.println("Anda telah keluar");
                            }
                            break;

                        case 3:
                            System.out.println("=================================================================");
                            System.out.println("==========================  TICKETING  ==========================");
                            System.out.println("=================================================================");
                            System.out.println("1. NCT Dream");
                            System.out.println("2. Day6");
                            System.out.println("3. Kembali");
                            System.out.println("-----------------------------------------------------------------");
                            System.out.print("Pilih : ");
                            int menutiket = input.nextInt();
                            System.out.println();
                            switch (menutiket) 
                            {
                                case 1:
                                    System.out.println("=================================================================");
                                    System.out.println("=====================  TICKETING NCT DREAM  =====================");
                                    System.out.println("=================================================================");
                                    System.out.println("1. Konser");
                                    System.out.println("2. Fanmeeting");
                                    System.out.println("3. Kembali");
                                    System.out.println("-----------------------------------------------------------------");
                                    System.out.print("Pilih : ");
                                    int tiketnct = input.nextInt();
                                    System.out.println();
                                    switch (tiketnct) {
                                        case 1 : 
                                        konser1.infoEvent();
                                        System.out.println("1. Beli Tiket");
                                        System.out.println("2. Kembali");
                                        System.out.print("Pilih : ");
                                        int konsernct = input.nextInt();
                                        System.out.println();
                                        if (konsernct == 1) {
                                            konser1.inputTiket(input);
                                            konser1.cetakTiket();
                                        } else {
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
                                        if (fanmeetnct == 1) {
                                            fanmeet1.inputTiket(input);
                                            fanmeet1.cetakTiket();
                                        } else {
                                            System.out.println("Anda membatalkan pembelian.");
                                        }
                                        break;

                                        default:
                                            System.out.println("Anda telah keluar");
                                    } 
                                    break;

                                case 2:
                                    System.out.println("=================================================================");
                                    System.out.println("=======================  TICKETING DAY6  ========================");
                                    System.out.println("=================================================================");
                                    System.out.println("1. Konser");
                                    System.out.println("2. Fanmeeting");
                                    System.out.println("3. Kembali");
                                    System.out.println("-----------------------------------------------------------------");
                                    System.out.print("Pilih : ");
                                    int tiketday = input.nextInt();
                                    System.out.println();
                                    switch (tiketday) {
                                        case 1 : 
                                        konser2.infoEvent();
                                        System.out.println("1. Beli Tiket");
                                        System.out.println("2. Kembali");
                                        System.out.print("Pilih : ");
                                        int konserday6 = input.nextInt();
                                        System.out.println();
                                        if (konserday6 == 1) {
                                            konser2.inputTiket(input);
                                            konser2.cetakTiket();
                                        } else {
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
                                        if (fanmeetday6 == 1) {
                                            fanmeet2.inputTiket(input);
                                            fanmeet2.cetakTiket();
                                        } else {
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

        input.close();
    }
}