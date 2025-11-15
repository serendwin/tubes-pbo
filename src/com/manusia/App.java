 package com.manusia;

public class App {
    public static void main(String[] args) {

        Idol idol1 = new Idol("Youngk", 27, "Laki - laki", "Korea",
                2010, "Day6", "LA Entertainment", 2016, 20, "Rock");

        Aktris aktris1 = new Aktris("Kim Ji-won", 29, "Perempuan", "Korea Selatan", 2015,
                "Queen of Tears", 10, "LA Entertainment");

        Aktor aktor1 = new Aktor("Park Seo-joon", 33, "Laki-laki", "Korea Selatan", 2016,
                "Concrete Utopia", 12, "LA Entertainment");

               
        System.out.println("===== IDOL =====");                
        System.out.println("================================================================================");
        idol1.tampilProfil();
        idol1.news(true);
        idol1.bekerja();
        idol1.tampilPanggung();
        idol1.variety();
        System.out.println("================================================================================");


        System.out.println();
        System.out.println("===== Aktris =====");                
        System.out.println("========================================================================================================");
        aktris1.news();
        aktris1.dispatch(true);
        aktris1.bekerja();
        aktris1.wawancara();
        aktris1.fanMeeting();
        System.out.println("========================================================================================================");

        System.out.println();
        System.out.println("===== Aktor =====");                
        System.out.println("========================================================================================================");
        aktor1.news();
        aktor1.bekerja();
        aktor1.wawancara();
        aktor1.photoshoot();
        System.out.println("========================================================================================================");

        System.out.println();
        System.out.println("=== Agensi LA Entertainment ===");

        System.out.println();
        System.out.println("===== Idol =====");                
        idol1.tampilData();
        System.out.println();
        idol1.begabung();
        idol1.bekerja();
        idol1.aktif();
        

        System.out.println();
        System.out.println("===== Aktris =====");                
        aktris1.tampilData();
        System.out.println();
        aktris1.begabung();
        aktris1.bekerja();
        aktris1.hiatus();

        System.out.println();
        System.out.println("===== Aktor =====");    
        aktor1.tampilData(); 
        System.out.println();     
        aktor1.begabung();
        aktor1.bekerja();      
        aktor1.aktif();
    }
}
