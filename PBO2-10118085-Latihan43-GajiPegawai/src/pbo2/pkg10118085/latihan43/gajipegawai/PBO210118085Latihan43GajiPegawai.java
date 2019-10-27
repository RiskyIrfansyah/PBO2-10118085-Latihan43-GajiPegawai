/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan43.gajipegawai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Risky Irfansyah
 * KELAS    : IF-2
 * NIM      : 10118085
 * Deskripsi Program : Membuat program berbasis object untuk menghitung tegangan
 */
public class PBO210118085Latihan43GajiPegawai {

    private static int totalGaji;

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GajiPegawai gp = new GajiPegawai();
        gp.setNama("Risky Irfansyah");
        gp.setAlamat("Jalan Lurah II no 186");
        gp.setUangTransport(250000);
        gp.setUangTunjangan(300000);
        gp.setGajiPokok(4500000);
        
        totalGaji = gp.totalGaji(
                 gp.getUangTunjangan(),
                 gp.getUangTransport(),
                 gp.getGajiPokok()
         );
        
        gp.tampilData(
            gp.getNama(),
            gp.getAlamat(),
            gp.getUangTunjangan(),
            gp.getUangTransport(),
            gp.getGajiPokok(),
            totalGaji
        );
    }
    
}