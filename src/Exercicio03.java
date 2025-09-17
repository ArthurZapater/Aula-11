import java.util.Random;

public class Exercicio03 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[][] x = new int[10][12];
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        int[] y = new int[10];


        //Entrada de dados
        for (int i = 0; i < x.length; i++) {
            int total = 0;
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = aleatorio.nextInt(10, 33);
                total += x[i][j];
                System.out.print(x[i][j] + "ºC" + "\t");
            }
            System.out.println();
            total /= 12;
            y[i] = total;

            if (y[i] > maior) {
                maior = y[i];
            }

            if (y[i] < menor) {
                menor = y[i];
            }

        }

        System.out.println("\nMédia dos anos");
        for (int i = 0; i < y.length; i++) {
            System.out.println("Ano " + (i + 1) + " --> " + y[i] + "ºC");

        }

        System.out.println("\nMaior média --> " + maior);
        System.out.println("Menor maior --> " + menor);
    }
}
