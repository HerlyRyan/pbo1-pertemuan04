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
public class Array {
    public static void main(String[] args) {
        int nilaiArr[] = {1, 2, 3, 4, 5, 6, 10, 12, 100, 50};
        
        System.out.println(nilaiArr[0]);
        System.out.println(nilaiArr[5]);
        System.out.println(nilaiArr[7]);
        
        String mataKuliah[];
        mataKuliah = new String[10];
        mataKuliah[0] = "Pemrograman Berbasis Objek";
        mataKuliah[1] = "Pemrograman Visual 2";
        mataKuliah[2] = "Pemrograman Web 2";
        mataKuliah[3] = "Perancangan Database";
        mataKuliah[4] = "Organisasi Komputer";
        System.out.println(mataKuliah[2]);
        System.out.println(mataKuliah[1]);
        System.out.println(mataKuliah[5]); // null karena array index ke 5 tidak ada atau belum di set
    }
}
