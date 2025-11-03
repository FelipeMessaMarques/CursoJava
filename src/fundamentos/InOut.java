/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/

package fundamentos;
import java.util.Scanner;

public class InOut {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva um número e direi quantos deles pertencem ao intervalo  [10,20]:");
        int numeros= scan.nextInt();

        int in = 0;
        int out = 0;

        for(int i = 1; i <= numeros; i++) {
            if(i >= 10 && i <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }

        System.out.println("in " + in);
        System.out.println("out " + out);

        scan.close();
    }
}
