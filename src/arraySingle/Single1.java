/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraySingle;

/**
 *
 * @author Agnes Juliana
 */
public class Single1 {

    public static void array1() {
        int nilai[] = new int[3];
        nilai[0] = 20;
        nilai[1] = 30;
        nilai[2] = 10;

        double ratarata = 0.0;

        for (int i = 0; i < nilai.length; i++) {
            ratarata += nilai[i];
        }
        ratarata /= nilai.length;
        System.out.println("NIlai Rata Rata = " + ratarata);

    }

    public static void main(String[] args) {
        array1();
    }
}
