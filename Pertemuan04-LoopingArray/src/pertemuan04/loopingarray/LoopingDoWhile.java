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
public class LoopingDoWhile {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 22;
        
        System.out.println("Isi Gelas Sekarang: "+isiGelas+" ml");
        System.out.println("Isi Ketika Penuh: "+penuh+" ml");
        
        do {
            isiGelas++;
            System.out.println("Sedang mengisi gelas....");
            System.out.println("Isi Gelas Sekarang: "+isiGelas+" ml");
        } while(isiGelas != penuh);
        System.out.println("Yeay!! Akhirnya gelas sudah penuh: "+isiGelas+" ml");
    }        
}
