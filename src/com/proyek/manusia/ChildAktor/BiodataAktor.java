package com.proyek.manusia.ChildAktor;

public class BiodataAktor extends Aktor {
    private String listDrama;
    private String listMovie;
    private String penghargaan;
    public BiodataAktor(String nama, String kewarganegaraan, String ttlLahir,
                         String ttlDebut, int masaTrainee, String posisi,
                         String drama, String movie, String album, String penghargaan) {
        super(nama, kewarganegaraan, ttlLahir, ttlDebut, masaTrainee);
        this.listDrama = drama;
        this.listMovie = movie;
        this.penghargaan = penghargaan;}

    @Override
    public void tampilkanAktor() {
        System.out.println("=================================================");
        System.out.println("==============   BIODATA AKTOR   ===============");
        System.out.println("=================================================");
        System.out.println("Nama             : " + nama);
        System.out.println("Kewarganegaraan  : " + kewarganegaraan);
        System.out.println("Tanggal Lahir    : " + ttlLahir);
        System.out.println("Debut            : " + ttlDebut);
        System.out.println("Drama            : " + listDrama);
        System.out.println("Movie            : " + listMovie);
        System.out.println("Penghargaan      : " + penghargaan);
        System.out.println("=================================================\n");
        System.out.println();}}