package com.proyek.manusia.ChildIdol;

import java.util.Scanner;
import com.proyek.manusia.Agensi;

public class Idol extends Agensi{

    public Idol(String nama, String kewarganegaraan, String ttlLahir,
                  String ttlDebut, int masaTrainee) {
        super(nama, kewarganegaraan, ttlLahir, ttlDebut, masaTrainee);}

    public void tampilkanbiodatagroupidol() {
        System.out.println("Menampilkan biodata idol");}
    
    public void tampilkanbiodatamemberNCTDream() {
        System.out.println("Menampilkan biodata idol");}

    public void tampilkanbiodatamemberDAY6() {
        System.out.println("Menampilkan biodata idol");}

    public void infoIdol() {
        System.out.println("Menampilkan info idol");
    }

    public void infoEvent() {
        System.out.println("Menampilkan info event");}

    public void inputTiket(Scanner input) {
        System.out.println("Input tiketing");}

    public void cetakTiket() {
        System.out.println("Menampilkan tiket");}

    public void PricelistAlbumnct() {
        System.out.println("Menampilkan pricelist album NCT DREAM");
    }

    public void PricelistAlbumday6() {
        System.out.println("Menampilkan pricelist album Day6");
    }

    public void beliAlbum1(Scanner input) {
        System.out.println("Input pembelian album NCT DREAM");
    }

    public void beliAlbum2(Scanner input) {
        System.out.println("Input pembelian album Day6");
    }

    public void cetakStruk() {
        System.out.println("Menampilkan struk pembelian album");
    }
}