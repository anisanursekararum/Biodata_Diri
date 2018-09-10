/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodata_keluarga;

/**
 *
 * @author Sekar Arum
 */
public class Biodata_Keluarga 
    {
        //deklarasi
        public String saya, ayah, ibu, saudara, temp_lahir, alamat, hobi, tgl_lahir;
        public int noTelp;

        //setter
        public void setSaya(String saya) {
            this.saya = saya;
        }
        
        public void setAyah(String ayah) {
            this.ayah = ayah;
        }

        public void setIbu(String ibu) {
            this.ibu = ibu;
        }

        public void setSaudara(String saudara) {
            this.saudara = saudara;
        }

        public void setTemp_lahir(String temp_lahir) {
            this.temp_lahir = temp_lahir;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        public void setHobi(String hobi) {
            this.hobi = hobi;
        }

        public void setTgl_lahir(String tgl_lahir) {
            this.tgl_lahir = tgl_lahir;
        }

        public void setnoTelp(int noTelp)
        {
        this.noTelp=noTelp;   
        }
        
        //getter
        public String getAyah() {
            return ayah;
        }

        public String getIbu() {
            return ibu;
        }

        public String getSaya() {
            return saya;
        }

        public String getSaudara() {
            return saudara;
        }

        public String getTemp_lahir() {
            return temp_lahir;
        }

        public String getAlamat() {
            return alamat;
        }

        public String getHobi() {
            return hobi;
        }

        public String getTgl_lahir() {
            return tgl_lahir;
        }

        public int getnoTelp ()
    {
        return noTelp;
    }  

    
    }

