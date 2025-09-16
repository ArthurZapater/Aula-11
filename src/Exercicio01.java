import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[][] m = new int[4][4];
        int somaPrincipal = 0, somaSecundaria = 0;

        //Entrada de dados
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = rd.nextInt(1, 5);
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        //Soma diagonal principal
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    somaPrincipal += m[i][j];
                }
            }
        }

        //Soma diagonal secundaria
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i + j == m.length - 1) {
                    somaSecundaria += m[i][j];
                }
            }
        }

        System.out.println();
        System.out.println("Soma da diagonal principal --> " + somaPrincipal);

        System.out.println();
        System.out.println("Soma da diagonal secundaria --> " + somaSecundaria);
    }
}
