package com.proyek.manusia.ChildIdol;

public class BiodataIdol extends Idol {

    private String posisi;
    private String album;
    private String penghargaan;

    public BiodataIdol(String nama, String kewarganegaraan, String ttlLahir,
                         String ttlDebut, int masaTrainee, String posisi,
                         String drama, String movie, String album, String penghargaan) {
        super(nama, kewarganegaraan, ttlLahir, ttlDebut, masaTrainee);
        this.posisi = posisi;
        this.album = album;
        this.penghargaan = penghargaan;}

    @Override
    public void tampilkanbiodatagroupidol() {
        System.out.println("========== BIODATA GROUP ==========");
        System.out.println("Group Boyband: " + nama);
        System.out.println("Debut: " + ttlDebut);
        System.out.println("Album Terakhir: " + album);
        System.out.println("Penghargaan: " + penghargaan);
        System.out.println("=====================================");
        System.out.println();}
    @Override
    public void tampilkanbiodatamemberNCTDream(){
        System.out.println("====== BIODATA GROUP NCT DREAM =====");
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + ttlLahir);
        System.out.println("Kewarganegaraan: " + kewarganegaraan);
        System.out.println("Masa Trainee: " + masaTrainee);
        System.out.println("Posisi: " + posisi);
        System.out.println("------------------------------------");}
    @Override
    public void tampilkanbiodatamemberDAY6(){
        System.out.println("====== BIODATA GROUP NCT DREAM =====");
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + ttlLahir);
        System.out.println("Kewarganegaraan: " + kewarganegaraan);
        System.out.println("Masa Trainee: " + masaTrainee);
        System.out.println("Posisi: " + posisi);
        System.out.println("------------------------------------");}
}
