/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan04.loopingarray;

/**
 *
 * @author asus
 */
public class Pertemuan04LoopingArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 22;
        
        System.out.println("Isi Gelas Sekarang: "+isiGelas+" ml");
        System.out.println("Isi Gelas Ketika Penuh: "+penuh+" ml");
        
        while(isiGelas != penuh){
            isiGelas++;
            System.out.println("Sedang mengisi gelas....");
            System.out.println("Isi gelas sekarang: "+isiGelas+" ml");
        }
        
        System.out.println("Akhirnya! Isi gelas penuh hehe.. yaitu: "+isiGelas+" ml");
    }
    
}
