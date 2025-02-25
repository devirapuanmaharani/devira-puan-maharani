/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihankedua;

/**
 *
 * @author ITBI 38
 */
public class LatihanKedua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A=100, B=30;             // nilai variabel A dan B
        
        
        int jumlah  = A+B;          // operasi penjumlahan
        int kurang  = A-B;          // operasi pengurangan
        int kali    = A*B;          // operasi penkalian
        float bagi  = (float)A/B;   // operasi pembagian
        int modulo  = A%B;          // modulo
        
        //tampilakan hasil
        System.out.println("Penjumlahan: "+A+" + "+B+" = "+ jumlah);
        System.out.println("Pengurangan: "+A+" - "+B+" = "+ kurang);
        System.out.println("Penkalian: "+A+" * "+B+" = "+ kali);
        System.out.println("Pembagian: "+A+" / "+B+" = "+ bagi);
        System.out.println("Modulo: "+A+" mod "+B+" = "+ modulo);
    }
    
}
