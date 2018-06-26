package com.example.istiabudi.kakademy;

public class SoalPilihanGanda {

    //membuat array untuk pertanyaan
    public String image[] = {
            "angka12",
            "angka26",
            "angka74",
            "angka96",
            "angka42",
            "angka3",
            "angka15",
            "angka6",
            "angka16",
    };

    //membuat array untuk pilihan jawaban
    private String pilihanJawaban[][] = {
            {"12","46","96"},
            {"16","26","73"},
            {"15","3","74"},
            {"35","29","96"},
            {"42","45","15"},
            {"3","8","2"},
            {"19","15","17"},
            {"9","8","6"},
            {"35","16","29"},
    };

    //membuat array untuk jawaban benar
    private String jawabanBenar[] = {
            "12",
            "26",
            "74",
            "96",
            "42",
            "3",
            "15",
            "6",
            "16",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }

    // membuat getter untuk jumlah soal
    public int getJumlahSoal() {
        return this.jawabanBenar.length;
    }
}
