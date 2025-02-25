/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitungbalok;

/**
 *
 * @author ITBI 38
 */
public class Balok {
    int panjang,lebar,tinggi,luasBalok,kelilingBalok,volumeBalok;
    void HitungLuasBalok(){
        
        luasBalok=2*(panjang*lebar)+2*(panjang*tinggi)+2*(lebar*tinggi);
        System.out.println("Luas Balok :"+luasBalok);
    }
    
}
