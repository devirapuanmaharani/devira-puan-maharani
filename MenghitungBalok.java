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
public class MenghitungBalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Balok LuasBalok= new Balok();
        LuasBalok.panjang=5;
        LuasBalok.lebar=3;
        LuasBalok.tinggi=4;
        
        LuasBalok.HitungLuasBalok();
        
        Balok HitungVolumeBalok= new Balok();
        
        HitungVolumeBalok.panjang=5;
        HitungVolumeBalok.lebar=3;
        HitungVolumeBalok.tinggi=4;
        
        Balok HitungKelilingBalok= new Balok();
        
        HitungKelilingBalok.panjang=5;
        HitungKelilingBalok.lebar=3;
        HitungKelilingBalok.tinggi=4;
    }
    
}
