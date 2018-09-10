/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodata_keluarga;

import java.io.*;
import static java.lang.Integer.parseInt;

/**
 *
 * @author Sekar Arum
 */
public class Utama  
{
    public static void main (String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        //instance of class
        Biodata_Keluarga bk = new Biodata_Keluarga();
        //input
        System.out.print("Masukkan Nama          : ");
        String saya_bk = br.readLine();
        System.out.print("Masukkan Nama Ayah     : ");
        String ayah_bk = br.readLine();
        System.out.print("Masukkan Nama Ibu      : ");
        String ibu_bk = br.readLine();
        System.out.print("Masukkan Nama Saudara  : ");
        String saudara_bk = br.readLine();
        System.out.print("Masukkan Tempat Lahir  : ");
        String temp_lahir_bk = br.readLine();
        System.out.print("Masukkan Tanggal Lahir : ");
        String tgl_lahir = br.readLine();
        System.out.print("Masukkan Alamat        : ");
        String alamat_bk = br.readLine();
        System.out.print("Masukkan Nomor Telepon : ");
        int no_tlp = parseInt (br.readLine());
        System.out.print("Masukkan Hobi          : ");
        String hobi_bk = br.readLine();
        bk.setSaya(saya_bk);
        bk.setAyah(ayah_bk);
        bk.setIbu(ibu_bk);
        bk.setSaudara(saudara_bk);
        bk.setTemp_lahir(temp_lahir_bk);
        bk.setTgl_lahir(tgl_lahir);
        bk.setAlamat(alamat_bk);
        bk.setnoTelp(no_tlp);
        bk.setHobi(hobi_bk);
        //output
        System.out.println("==========BIODATA DIRI========");
        System.out.println("Nama            : " + bk.getSaya());
        System.out.println("Nama Ayah       : " + bk.getAyah());
        System.out.println("Nama Ibu        : " + bk.getIbu());
        System.out.println("Nama Saudara    : " + bk.getSaudara());
        System.out.println("Tempat Lahir    : " + bk.getTemp_lahir());
        System.out.println("Tanggal Lahir   : " + bk.getTgl_lahir());
        System.out.println("Alamat          : " + bk.getAlamat());
        System.out.println("No Telepon      : " + bk.getnoTelp());
        System.out.println("Hobi            : " + bk.getHobi());
        
    }
}
