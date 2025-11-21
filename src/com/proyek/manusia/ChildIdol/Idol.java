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
    
    public void infoEvent() {
        System.out.println("Menampilkan info event");}

    public void cetakTiket() {
        System.out.println("Menampilkan tiket");}

    public void inputTiket(Scanner input) {
        System.out.println("Input tiketing");}
    
    public void tiketNCTDREAM() {
        System.out.println("Mengeluarkan teks selamat membeli tiket NCT DREAM");}

    public void tiketDay6() {
        System.out.println("Mengeluarkan teks selamat membeli tiket Day6");}
}

