/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayMultidimensi;

/**
 *
 * @author Agnes Juliana
 */
public class Multidimensi2 {



    public void tampil(String n) {
        System.out.println("Identitas Siswa Angkatan 24");
    }

    public void namanis(int n) {
        String nama[][] = {{"Ade"}, {"Galih "}, {"Baihaqi"}};
        int nis[][] = {{210651}, {210651}, {210652}};
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
               System.out.println(nama[1][j]+":"+nis[1][j]);
            }

        }
    }
    public static void main(String[] args) {
        Multidimensi2 siswa = new Multidimensi2();
        siswa.tampil(null);
        siswa.namanis(0);
    }
}
