package com.proyek.manusia.ChildAktor;

import java.util.Scanner;

public class TicketFanmeetingaktor extends Aktor {

    private String event;
    private String lokasi;
    private String tanggal;
    private String kategori;
    private double harga;
    private int qty;
    private double total;

    public TicketFanmeetingaktor(String nama, String kewarganegaraan, String ttlLahir,
                                     String ttlDebut, int masaTrainee,
                                     String event, String lokasi, String tanggal,
                                     String kategori) {

        super(nama, kewarganegaraan, ttlLahir, ttlDebut, masaTrainee);

        this.event = event;
        this.lokasi = lokasi;
        this.tanggal = tanggal;
        this.kategori = kategori;
        this.harga = tentukanHarga(kategori);
    }

    @Override
    public void infoEvent() {
        System.out.println("=================================================================");
        System.out.println("======================  INFO EVENT & PRICELIST  =================");
        System.out.println("=================================================================");
        System.out.println("Aktor         : " + nama);
        System.out.println("Event          : " + event);
        System.out.println("Lokasi         : " + lokasi);
        System.out.println("Tanggal        : " + tanggal);
        System.out.println("----------------------  KATEGORI TIKET  -------------------------");
        System.out.println("VVIP           : Rp " + tentukanHarga("VVIP"));
        System.out.println("VIP            : Rp " + tentukanHarga("VIP"));
        System.out.println("REGULAR        : Rp " + tentukanHarga("REGULAR"));
        System.out.println("BALCONY        : Rp " + tentukanHarga("BALCONY"));
        System.out.println("=================================================================");
    }

    @Override
    public void inputTiket(Scanner input) {
        input.nextLine();
        System.out.println("=================================================================");
        System.out.println("===================  PEMBELIAN TIKET FANMEETING =================");
        System.out.println("=================================================================");
        System.out.println("Aktor        : " + nama);
        System.out.println("Event         : " + event);
        System.out.print("Kategori      : ");
        this.kategori = input.nextLine();
        this.harga = tentukanHarga(this.kategori);
        System.out.println("Harga     : Rp " + this.harga);
        System.out.print("Masukkan jumlah tiket : ");
        this.qty = input.nextInt();
        this.total = this.harga * this.qty;
        System.out.println("=================================================================");
        System.out.println();
    }

    @Override
    public void cetakTiket() {
        System.out.println("=================================================================");
        System.out.println("======================  CETAK TIKET FANMEETING  =================");
        System.out.println("=================================================================");
        System.out.println("Aktor       : " + this.nama);
        System.out.println("Event        : " + this.event);
        System.out.println("Kategori     : " + this.kategori);
        System.out.println("Harga/Tiket  : Rp " + this.harga);
        System.out.println("Jumlah Tiket : " + this.qty);
        System.out.println("Total Harga  : Rp " + this.total);
        System.out.println("=================================================================");
        System.out.println();
    }

    @Override
    public void leeminho() {
        System.out.println("Anda telah berhasil membeli tiket fanmeeting Lee Minho-!");
        System.out.println();
    }

    @Override
    public void dongwook() {
        System.out.println("Anda telah berhasil membeli tiket fanmeeting Lee Dongwook-!");
        System.out.println();
    }

    private double tentukanHarga(String kategori) {
        switch (kategori.toUpperCase()) {
            case "VVIP": return 3000000;
            case "VIP": return 2500000;
            case "REGULAR": return 900000;
            case "BALCONY": return 600000;
            default: 
                System.out.println("Kategori  " + kategori + "  tidak tersedia. Harga default digunakan.");
                return 0;
        }
    }
    
}