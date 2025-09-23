import java.util.Random;

public class Exercicio05 {
    public static void main(String[] args) {
        Random random = new Random();
        int linhas = random.nextInt(2, 6);
        int colunas = random.nextInt(2, 6);

        //Matriz original
        int[][] c = new int[linhas][colunas];

        //Matriz invertida
        int[][] ct = new int[colunas][linhas];

        //Gerar matriz c
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = random.nextInt(10);
                System.out.print(c[i][j] + "\t");
                ct[j][i] = c[i][j];
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < ct.length; i++) {
            for (int j = 0; j < ct[i].length; j++) {
                System.out.print(ct[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
