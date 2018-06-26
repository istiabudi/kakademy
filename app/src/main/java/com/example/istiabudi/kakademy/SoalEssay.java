package com.example.istiabudi.kakademy;

public class SoalEssay {
    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "Saluran warna apa yang tampak digambar ?",
            "Angka berapa yang tampak diatas ?...",
            "Gambar diatas ada angka, Angka berapa yang dimaksud ?...",
            "Tampilan gambar diatas ada angka yang tersembunyi, angka berapa yang dimaksud?...",
            "Jalur atau saluran diatas warna apa ?",
            "Angka terselubung yang di gambar, angka berapa ya?...",
            "Mata Anda sehat, perlu dicek lagi nih, Angka berapa yang ada diatas ?",
            "Buktikan, mata Anda sehat, Gambar diatas angka berapa yang muncul ? ...",
            "Ayo sedikit lagi, membuktikan mata Anda, saluran atau jalur warna apa yang tampak ? ...",
    };

    //membuat array untuk set gambar (dari String diubah jadi ImageView)
    //pastikan yang tertulis disini sama dengan nama di drawable
    //lihat gambar penjelasan1
    private String image[] = {
            "saluranhijau",
            "angka97",
            "angka74",
            "angka42",
            "saluranmerah",
            "angka16",
            "angka35",
            "angka8",
            "saluranorange",
    };

    //membuat array jawaban benar
    private String jawabanBenar[] = {
            "hijau",
            "97",
            "74",
            "42",
            "merah",
            "16",
            "35",
            "8",
            "orange",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}

