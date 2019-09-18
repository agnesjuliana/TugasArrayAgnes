/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktikum1;

/**
 *
 * @author hp
 */
public class Nomer1 {
    /*public static void error() {
        int bilangan [5] = {1,2,3,4,5};
        System.out.println(bilangan [6]);
        
        kode error karena deklarasi array yang salah.
        (itu merupakan metode untuk meampilkan nilai array)
        seharusnya 
            int []biangan= {1,2,3,4,5}
        atau
            int bilangan []=new int [5]
            bilangan [0]= 1
            bilangan [1]= 2
        dst..
        
    }*/
    public static void benar() {
        int [] bilangan= {1,2,3,4,5};
        
        for (int i = 0; i < bilangan.length; i++) {
            System.out.println(bilangan [i]);
            
        }
    }
    public static void main(String[] args) {
        benar();
    }
}
