import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio03 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Random aleatorio = new Random();
        double[][] x = new double[10][12];
        double maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        double[] y = new double[10];


        //Entrada de dados
        for (int i = 0; i < x.length; i++) {
            double total = 0;
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = aleatorio.nextDouble(10, 33);
                total += x[i][j];
                System.out.print(df.format(x[i][j]) + "ºC" + "  ");
            }
            System.out.println();
            total /= x[i].length;
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
            System.out.println("Ano " + (i + 1) + " --> " + df.format(y[i]) + "ºC");

        }

        System.out.println("\nMaior média --> " + df.format(maior));
        System.out.println("Menor maior --> " + df.format(menor));
    }
}
