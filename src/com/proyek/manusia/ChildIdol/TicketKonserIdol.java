package com.proyek.manusia.ChildIdol;

import java.util.Scanner;

public class TicketKonserIdol extends BiodataIdol {

    private String konser;
    private String lokasi;
    private String tanggal;
    private String kategori;
    private double harga;
    private int qty;
    private double total;

    public TicketKonserIdol(String nama, String kewarganegaraan, String ttlLahir,
                            String ttlDebut, int masaTrainee,
                            String posisi, String drama, String movie,
                            String album, String penghargaan,
                            String konser, String lokasi, String tanggal,
                            String kategori) {

        super(nama, kewarganegaraan, ttlLahir, ttlDebut, masaTrainee,
                posisi, drama, movie, album, penghargaan);

        this.konser = konser;
        this.lokasi = lokasi;
        this.tanggal = tanggal;
        this.harga = tentukanHarga(kategori);
        this.kategori = kategori;
    }

    @Override
    public void infoEvent() {
        System.out.println("======= INFO KONSER & PRICELIST =======");
        System.out.println("Group   : " + nama);
        System.out.println("Konser  : " + konser);
        System.out.println("Lokasi  : " + lokasi);
        System.out.println("Tanggal : " + tanggal);
        System.out.println("-------- KATEGORI TIKET --------");
        System.out.println("VVIP     : Rp 2500000");
        System.out.println("VIP      : Rp 1500000");
        System.out.println("REGULAR  : Rp 800000");
        System.out.println("BALCONY  : Rp 500000");
        System.out.println("=======================================");
    }

    public void inputTiket(Scanner input) {

        input.nextLine(); 

        System.out.println("======== PEMBELIAN TIKET KONSER ========");
        System.out.println("Group   : " + nama);
        System.out.println("Konser  : " + konser);

        try {
            System.out.print("Kategori Tiket : ");
            String kategoriInput = input.nextLine();

            
            this.harga = tentukanHarga(kategoriInput);
            this.kategori = kategoriInput;

            System.out.println("Harga Tiket    : Rp " + this.harga);
            System.out.print("Jumlah Tiket   : ");

            if (!input.hasNextInt()) {
                System.out.println("Error: jumlah tiket harus angka!");
                qty = 1;
                total = harga;
                return;
            }
            qty = input.nextInt();

            if (qty <= 0) {
                System.out.println("Error: jumlah tiket tidak boleh nol / negatif!");
                qty = 1;
            }
            total = harga * qty;

        } 
            catch (Exception e) {
            System.out.println("Error: Terjadi kesalahan input!");
            kategori = "REGULAR";
            harga = 800000;
            qty = 1;
            total = harga;
        }

        System.out.println("=========================================");
        System.out.println();
    }

    public void cetakTiket() {
        System.out.println("============ CETAK TIKET KONSER ============");
        System.out.println("Group        : " + nama);
        System.out.println("Konser       : " + konser);
        System.out.println("Kategori     : " + kategori);
        System.out.println("Harga/Tiket  : Rp " + harga);
        System.out.println("Jumlah Tiket : " + qty);
        System.out.println("Total Harga  : Rp " + total);
        System.out.println("============================================");
    }

    private double tentukanHarga(String kategori) {
        switch (kategori.toUpperCase()) {
            case "VVIP": return 2500000;
            case "VIP": return 1500000;
            case "REGULAR": return 800000;
            case "BALCONY": return 500000;
            default:
                System.out.println("Kategori \"" + kategori + "\" tidak tersedia! Harga default digunakan.");
                return 800000;
        }
    }
}