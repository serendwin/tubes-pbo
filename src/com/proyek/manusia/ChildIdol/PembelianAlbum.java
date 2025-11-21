package com.proyek.manusia.ChildIdol;

import java.util.Scanner;

public class PembelianAlbum extends Idol {

    private String album;
    private double harga;
    private int qty;
    private double total;

    public PembelianAlbum(String nama, String kewarganegaraan, String ttlLahir,
                          String ttlDebut, int masaTrainee, String album) {
        super(nama, kewarganegaraan, ttlLahir, ttlDebut, masaTrainee);

        this.album = album;
        this.harga = tentukanHarga(album);
    }

    public void PricelistAlbum() {
        System.out.println("========== PRICELIST ALBUM ==========");
        System.out.println("1. " + album + "(" + harga + ")");
        System.out.println("2. " + album + "(" + harga + ")");
        System.out.println("3. " + album + "(" + harga + ")");
        System.out.println("=====================================");
    }

    public void beliAlbum(Scanner input) {
        System.out.print("Masukkan judul album yang ingin anda beli :");
        System.out.print("Masukkan jumlah album yang ingin dibeli   : ");
        qty = input.nextInt();
        total = qty * harga;

        System.out.println("=======================================");
        System.out.println("Total Pembayaran : Rp " + total);
        System.out.println("=======================================");
    }

    public void cetakStruk() {
        System.out.println("=========== STRUK PEMBELIAN ===========");
        System.out.println("Idol         : " + nama);
        System.out.println("Album        : " + album);
        System.out.println("Harga/Album  : Rp " + harga);
        System.out.println("Jumlah       : " + qty);
        System.out.println("Total Harga  : Rp " + total);
        System.out.println("========================================");
    }

    private double tentukanHarga(String album) {
        switch (album.toUpperCase()) {
            case "GLITCH MODE": return 300000;
            case "HOT SAUCE": return 250000;
            case "4EVER": return 280000;
            case "THE BOOK OF US": return 320000;
            default:
                System.out.println("Album tidak terdaftar, harga = 0");
                return 0;
        }
    }
}
