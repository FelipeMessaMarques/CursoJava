package vetores.application;

import vetores.entities.Produtos;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos produtos deseja adicionar? ");
        int n = scan.nextInt();

        Produtos[] vect = new Produtos[n];

        for(int i = 0; i < vect.length; i++) {
            scan.nextLine();
            String nome = scan.nextLine();
            double preco = scan.nextDouble();
            vect[i] = new Produtos(nome, preco);
        }

        double sum = 0;
        for(int i = 0; i < vect.length; i++) {
            sum += vect[i].getPreco();
        }

        double media = sum / vect.length;

        System.out.printf("Media do preço = %.2f ", media);
        scan.close();
    }

}
