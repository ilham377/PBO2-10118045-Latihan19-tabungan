/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan19saldotabungan;

import java.text.DecimalFormat;

/**
 *
 * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : Program Saldo Tabungan
 * 
 */
public class PBO10118045Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    
    public static void main(String[] args) {
        // TODO code application logic here
       
        double saldo = 2500000;
        for (int i = 1;i < 7; i++){
            saldo=saldo+(saldo*0.15);
            
            System.out.println("Saldo di bulan ke-"+i+" Rp."+df2.format(saldo));
        }
    }
    
}
