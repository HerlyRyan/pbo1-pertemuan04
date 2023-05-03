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
public class LoopingFor {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 20;
        
        System.out.println("Isi gelas sekarang: "+isiGelas+" ml");
        System.out.println("Gelas ketika penuh: "+penuh+" ml");
        
        for(isiGelas = 0; isiGelas <= penuh; isiGelas++){
            System.out.println("Sedang mengisi gelas...");
            System.out.println("Isi gelas sekarang: "+isiGelas+" ml");
        }
        System.out.println("Yuhuuu! Penuh deh: "+isiGelas+" ml");
    }
}
