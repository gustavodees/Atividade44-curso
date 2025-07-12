package principal;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = input.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um numero");
            vect[i] = input.nextDouble();
        }

        double soma = 0.0;
        double media = 0.0;

        for (int i = 0; i < vect.length; i++) {
            soma += vect[i];

        }


        media = soma / vect.length;
        System.out.println("Média do vetor: " + media);
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < media) {
                System.out.println("Elementos abaixo da media: " + vect[i]);
            }
        }












    }
}