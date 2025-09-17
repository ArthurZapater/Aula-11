import java.util.Random;

public class Exercicio07 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int ordem = aleatorio.nextInt(2, 5);
        int[][] x = new int[ordem][ordem];
        int aux, k;

        //Entrada de dados
        System.out.println("Valores originais");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = aleatorio.nextInt(0, 10);
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }

        //Trocar elementos
        k = ordem - 1;
        for (int i = 0; i < x.length; i++) {
            aux = x[i][i];
            x[i][i] = x[i][k];
            x[i][k] = aux;
            k--;
        }

        //Imprimir novamente
        System.out.println("\n Impressão após a troca dos elementos");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
