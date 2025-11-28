package com.proyek.manusia.ChildAktor;
import java.util.Scanner;
import com.proyek.manusia.Agensi;

public class Aktor extends Agensi {

    public Aktor(String nama, String kewarganegaraan, String ttlLahir,
                  String ttlDebut, int masaTrainee) {
        super(nama, kewarganegaraan, ttlLahir, ttlDebut, masaTrainee);}
        
    public void tampilkanAktor() {
        System.out.println("Menampilkan biodata aktor");}
    public void infoEvent() {
        System.out.println("Menampilkan info event");}
    public void cetakTiket() {
        System.out.println("Menampilkan tiket");}
    public void inputTiket(Scanner input) {
        System.out.println("Input tiketing");}
    public void Wuseok() {
        System.out.println("Mengeluarkan teks selamat membeli tiket Byeon Wu Seok");}
    public void GongYoo() {
        System.out.println("Mengeluarkan teks selamat membeli tiket Gong Yoo");}}