# AJ-Project
package arrayMultidimensi;

/**
 *
 * @author Agnes Juliana
 */
public class Multidimensi1 {

    public static void main(String[] args) {
        int nilai[][] = new int[2][3];
        nilai[0][0] = 81;
        nilai[0][1] = 82;
        nilai[0][2] = 83;
        nilai[1][0] = 84;
        nilai[1][1] = 85;
        nilai[1][2] = 86;

        String MP[] = {"RPL", "PBO"};
        double ratarataMP[] = new double[nilai.length];
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                ratarataMP[i] += nilai[i][j];

            }
            ratarataMP[i] /= nilai[0].length;

        }
        System.out.println("===== Nilai Mata Pelajaran=====");
        System.out.println("MK\tMinggu1\tMinggu2\tMinggu3\tRata-rata");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(MP[i] + "\t");
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print(nilai[i][j]+"\t");

            }
            System.out.print(ratarataMP[i]+"\n");
        }
        
    }


}
