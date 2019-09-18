/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktikum1;

/**
 *
 * @author Agnes Juliana
 */
public class Nomer2 {
    /*public static void error() {
        int bilangan [5] = {1,2,3,4,5,6,7,8};
        
        deklarasi array salah dan objek didalam array lebih dari kapasitas array}
        
    }*/
    public static void benar(){
        int [] bilangan = new int [8];
        
        bilangan [0] = 1;
        bilangan [1] = 2;
        bilangan [2] = 3;
        bilangan [3] = 4;
        bilangan [4] = 5;
        bilangan [5] = 6;
        bilangan [6] = 7;
        bilangan [7] = 8;
        
        for (int i = 0; i < bilangan.length; i++) {
            System.out.println(bilangan [i]);
            
        }
    }
    public static void main(String[] args) {
        benar();
    }
    
}
