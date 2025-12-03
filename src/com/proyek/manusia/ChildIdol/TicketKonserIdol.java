package com.proyek.manusia.ChildIdol;

import java.util.Scanner;

public class TicketKonserIdol extends Idol {

    private String eventType;
    private String eventName;
    private String lokasi;
    private String tanggal;
    private String kategori;
    private String section;
    private double harga;
    private int qty;
    private double total;

    public TicketKonserIdol(String nama, String kewarganegaraan, String ttlLahir,
                            String ttlDebut, int masaTrainee,
                            String posisi, String drama, String movie,
                            String album, String penghargaan,
                            String eventType, String eventName, String lokasi,
                            String tanggal, String kategori, String section) {

        super(nama, kewarganegaraan, ttlLahir, ttlDebut, masaTrainee);

        this.eventType = eventType.toUpperCase();
        this.eventName = eventName;
        this.lokasi = lokasi;
        this.tanggal = tanggal;
        this.kategori = kategori.toUpperCase();
        this.section = section.toUpperCase();
        this.harga = tentukanHarga(eventType, kategori, section);
    }

    @Override
    public void infoEvent() {
        System.out.println("===========================================================");
        System.out.println("==================== INFO EVENT IDOL ======================");
        System.out.println("===========================================================");
        System.out.println("Idol         : " + nama);
        System.out.println("Event        : " + eventName);
        System.out.println("Jenis Event  : " + eventType);
        System.out.println("Lokasi       : " + lokasi);
        System.out.println("Tanggal      : " + tanggal);
        if (eventType.equals("KONSER")) {
            System.out.println("-------------------- KATEGORI & SECTION -------------------");
            System.out.println("VVIP (A/B)     : Rp 3.000.000 / 2.700.000");
            System.out.println("VIP  (A/B/C)   : Rp 1.800.000 / 1.500.000 / 1.300.000");
            System.out.println("REGULAR (A/B)  : Rp 900.000 / 800.000");
            System.out.println("BALCONY LEFT   : Rp 600.000");
            System.out.println("BALCONY RIGHT  : Rp 550.000");
        } else {
            System.out.println("---------------- KATEGORI TIKET FANMEETING ----------------");
            System.out.println("HI-TOUCH  : Rp 2.000.000");
            System.out.println("PHOTO OP  : Rp 1.200.000");
            System.out.println("SIGNING   : Rp 900.000");
            System.out.println("REGULAR   : Rp 500.000");
        }
        System.out.println("===========================================================");
    }

    @Override
    public void inputTiket(Scanner input) {
        input.nextLine();
        System.out.println("===========================================================");
        System.out.println("===================== PEMBELIAN TIKET =====================");
        System.out.println("===========================================================");
        System.out.println("Event : " + eventName + " (" + eventType + ")");

        System.out.print("Kategori Tiket : ");
        kategori = input.nextLine().toUpperCase();

        if (eventType.equals("KONSER")) {
            System.out.print("Section (A/B/C/LEFT/RIGHT) : ");
            section = input.nextLine().toUpperCase();
        } else {
            section = "-";
        }

        harga = tentukanHarga(eventType, kategori, section);
        System.out.println("Harga Tiket : Rp " + harga);

        System.out.print("Jumlah Tiket : ");
        if (!input.hasNextInt()) {
            System.out.println("Jumlah tiket harus angka! default = 1");
            qty = 1;
        } else {
            qty = input.nextInt();
            if (qty <= 0) qty = 1;
        }

        total = harga * qty;
        System.out.println("===========================================================");
        System.out.println();
    }

    @Override
    public void cetakTiket() {
        System.out.println("===========================================================");
        System.out.println("======================= CETAK TIKET =======================");
        System.out.println("===========================================================");
        System.out.println("Nama        : " + nama);
        System.out.println("Event       : " + eventName);
        System.out.println("Jenis       : " + eventType);
        System.out.println("Kategori    : " + kategori);

        if (eventType.equals("KONSER"))
            System.out.println("Section     : " + section);

        System.out.println("Harga/Tiket : Rp " + harga);
        System.out.println("Jumlah      : " + qty);
        System.out.println("Total Harga : Rp " + total);
        System.out.println("===========================================================");
        System.out.println();
    }

    public String toString() {
        System.out.println("===========================================================");
        return  "===================== STRUK TIKET =========================" +
                "===========================================================" +
                "Nama Idol     : " + nama + "\n" +
                "Event         : " + eventName + "\n" +
                "Jenis Event   : " + eventType + "\n" +
                "Kategori      : " + kategori + "\n" +
                "Section       : " + (eventType.equals("KONSER") ? section : "-") + "\n" +
                "Harga/Tiket   : Rp " + harga + "\n" +
                "Jumlah Tiket  : " + qty + "\n" +
                "Total Harga   : Rp " + total + "\n" +
                "===========================================================";
    }

    private double tentukanHarga(String eventType, String kategori, String section) {

        kategori = kategori.toUpperCase();
        section = section.toUpperCase();

        
        if (eventType.equals("FANMEETING")) {
            switch (kategori) {
                case "HI-TOUCH": return 2000000;
                case "PHOTO OP": return 1200000;
                case "SIGNING":  return 900000;
                case "REGULAR":  return 500000;
                default:
                    System.out.println("Kategori tidak dikenal, harga REGULAR digunakan.");
                    return 500000;
            }
        }

        
        switch (kategori) {
            case "VVIP":
                if (section.equals("A")) return 3000000;
                if (section.equals("B")) return 2700000;
                return 2500000;

            case "VIP":
                if (section.equals("A")) return 1800000;
                if (section.equals("B")) return 1500000;
                if (section.equals("C")) return 1300000;
                return 1500000;

            case "REGULAR":
                if (section.equals("A")) return 900000;
                if (section.equals("B")) return 800000;
                return 800000;

            case "BALCONY":
                if (section.equals("LEFT")) return 600000;
                if (section.equals("RIGHT")) return 550000;
                return 500000;

            default:
                System.out.println("Kategori tidak dikenal, harga REGULAR digunakan.");
                return 800000;
        }
    }
}