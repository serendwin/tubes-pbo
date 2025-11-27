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

    @Override
    public void PricelistAlbumnct() {
        System.out.println("========== PRICELIST ALBUM NCT DREAM ==========");
        System.out.println("GLITCH MODE     : Rp " + tentukanHarga("GLITCH MODE"));
        System.out.println("HOT SAUCE     : Rp " + tentukanHarga("HOT SAUCE"));
        System.out.println("===============================================");
    }

    @Override
    public void PricelistAlbumday6() {
        System.out.println("========== PRICELIST ALBUM DAY6 ==========");
        System.out.println("FOUREVER     : Rp " + tentukanHarga("FOUREVER"));
        System.out.println("THE BOOK OF US     : Rp " + tentukanHarga("THE BOOK OF US"));
        System.out.println("==========================================");
    }

    @Override
    public void beliAlbum1(Scanner input) {
        input.nextLine();
        System.out.println("=================================================");
        System.out.println("==========  PEMBELIAN ALBUM NCT DREAM  =========");
        System.out.println("=================================================");
        System.out.println("Idol    : " + nama);
        System.out.print("Nama Album    : ");
        this.album = input.nextLine();
        this.harga = tentukanHarga(this.album);
        System.out.println("Harga     : Rp " + this.harga);
        System.out.print("Masukkan jumlah Album : ");
        qty = input.nextInt();
        total = qty * harga;
        System.out.println("=================================================");
        System.out.println();
        System.out.println("Anda telat membeli album ini, Terimakasih <3");
        System.out.println();
    }

    @Override
    public void beliAlbum2(Scanner input) {
        input.nextLine();
        System.out.println("=================================================");
        System.out.println("==============  PEMBELIAN ALBUM DAY6  ===========");
        System.out.println("=================================================");
        System.out.println("Idol    : " + nama);
        System.out.print("Nama Album    : ");
        this.album = input.nextLine();
        this.harga = tentukanHarga(this.album);
        System.out.println("Harga     : Rp " + this.harga);
        System.out.print("Masukkan jumlah Album : ");
        qty = input.nextInt();
        total = qty * harga;
        System.out.println("=================================================");
        System.out.println();
        System.out.println("Anda telat membeli album ini, Terimakasih <3");
        System.out.println();
    }

    @Override
    public void cetakStruk() {
        System.out.println("=================================================");
        System.out.println("===============  STRUK PEMBELIAN  ===============");
        System.out.println("=================================================");        
        System.out.println("Idol         : " + this.nama);
        System.out.println("Album        : " + this.album);
        System.out.println("Harga Album  : Rp " + this.harga);
        System.out.println("Jumlah       : " + this.qty);
        System.out.println("Total Harga  : Rp " + this.total);
        System.out.println("================================================");
        System.out.println();
    }

    private double tentukanHarga(String album) {
        switch (album.toUpperCase()) {
            case "GLITCH MODE": return 300000;
            case "HOT SAUCE": return 250000;
            case "FOUREVER": return 280000;
            case "THE BOOK OF US": return 320000;
            default:
                System.out.println("Album tidak terdaftar, harga = 0");
                return 0;
        }
    }
}
