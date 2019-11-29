package com.example.tugas9backup.model;

public class Mahasiswa {
        private String nama;
        private String nim;
        private String Nohp;
        private String gender;
        private String hobi;
        private String cita;
        private String moto;

   public Mahasiswa(String nama, String nim, String Nohp, String gender, String hobi, String cita, String moto) {
        this.gender = gender;
        this.hobi = hobi;
        this.cita = cita;
        this.moto = moto;
    }

        public String getNama() {
        return nama;
    }

        public void setNama(String nama) {
        this.nama = nama;
    }

        public String getNim() {
        return nim;
    }

        public void setNim(String nim) {
        this.nim = nim;
    }

        public String getNohp() {
        return Nohp;
    }

        public void setNohp(String noHp) {
        Nohp = noHp;
    }

        public void setGender(String gender) {
        this.gender = gender;}
        public void setHobi(String hobi){
        this.hobi = hobi; }
        public void setCita(String cita){
        this.cita = cita;}
        public void setMoto(String moto){
        this.moto = moto;}

    }
