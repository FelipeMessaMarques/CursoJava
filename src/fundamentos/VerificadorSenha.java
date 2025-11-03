/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/

package fundamentos;
import java.util.Scanner;


public class VerificadorSenha {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tentativas = 3;
        int senha = 2002;

        System.out.println("Digite a senha do cofre. Você tem " + tentativas + " tentativas.");
        int senhaDigitada = scan.nextInt();

        while(senhaDigitada != senha) {

            tentativas--;

            if (tentativas > 0) {
                System.out.println("Digite a senha novamente. Você tem mais " + tentativas + " tentativas.");
                senhaDigitada = scan.nextInt();
            } else {
                System.out.println("Suas tentativas acabaram, você perdeu!!");
                break;
            }
        }

        if(senhaDigitada == senha) {
            System.out.println("Senha correta!!");
        }
        scan.close();

    }
}
