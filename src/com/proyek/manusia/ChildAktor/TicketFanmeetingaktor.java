package com.proyek.manusia.ChildAktor;

import java.util.Scanner;

public class TicketFanmeetingaktor extends BiodataAktor {

    private String eventName;
    private String lokasi;
    private String tanggal;
    private String kategori;
    private double harga;
    private int qty;
    private double total;

    public TicketFanmeetingaktor(
            String nama, String kewarganegaraan, String ttlLahir,
            String ttlDebut, int masaTrainee, String posisi,
            String drama, String movie, String album, String penghargaan) {

        super(nama, kewarganegaraan, ttlLahir, ttlDebut, masaTrainee,
              posisi, drama, movie, album, penghargaan);
    }

    @Override
    public void tampilkanAktor() {
        System.out.println("Menampilkan biodata aktor");
        super.tampilkanAktor();
    }

    @Override
    public void infoEvent() {
        System.out.println("=========================================");
        System.out.println("            INFORMASI EVENT");
        System.out.println("=========================================");
        System.out.println("Nama Event : " + eventName);
        System.out.println("Lokasi     : " + lokasi);
        System.out.println("Tanggal    : " + tanggal);
        System.out.println("Kategori   : " + kategori);
        System.out.println("Harga      : " + harga);
        System.out.println("=========================================");
    }

    @Override
    public void cetakTiket() {
        System.out.println("=============== TIKET BERHASIL DICETAK ===============");
        System.out.println("Aktor       : " + nama);
        System.out.println("Event       : " + eventName);
        System.out.println("Lokasi      : " + lokasi);
        System.out.println("Tanggal     : " + tanggal);
        System.out.println("Kategori    : " + kategori);
        System.out.println("Jumlah      : " + qty);
        System.out.println("Total Harga : " + total);
        System.out.println("=======================================================");
    }

    @Override
    public void inputTiket(Scanner input) {
        System.out.println("=========== INPUT DATA TIKET ===========");

        System.out.print("Masukkan nama event: ");
        eventName = input.nextLine();

        System.out.print("Masukkan lokasi event: ");
        lokasi = input.nextLine();

        System.out.print("Masukkan tanggal event: ");
        tanggal = input.nextLine();

        System.out.print("Masukkan kategori (VIP/Regular): ");
        kategori = input.nextLine();

        if (kategori.equalsIgnoreCase("VIP")) {
            harga = 1500000;
        } else {
            harga = 750000;
        }

        System.out.print("Masukkan jumlah tiket: ");
        qty = input.nextInt();
        input.nextLine(); // Clear buffer

        total = harga * qty;

        System.out.println("\nBerhasil input data tiket!\n");
    }

    public void Wuseok() {
        System.out.println("Mengeluarkan teks selamat membeli tiket Byeon Woo Seok");
    }

    public void GongYoo() {
        System.out.println("Mengeluarkan teks selamat membeli tiket Gong Yoo");
    }
}