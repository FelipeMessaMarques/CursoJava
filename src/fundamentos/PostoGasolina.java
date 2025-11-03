/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível*/

package fundamentos;
import java.util.Scanner;

public class PostoGasolina {

    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);

         int gasolina = 0;
         int alcool = 0;
         int diesel = 0;

         System.out.println("Olá o que você deseja abastecer?\n1 - Gasolina\n2 - Ácool\n3 - Diesel\n4 - Sair");
         int combustivel = scan.nextInt();

         while (combustivel != 4) {
             if (combustivel == 1) {
                 gasolina++;
             } else if (combustivel == 2){
                 alcool++;
             } else if (combustivel == 3) {
                 diesel++;
             }

             System.out.println("Olá o que você deseja abastecer?\n1 - Gasolina\n2 - Ácool\n3 - Diesel\n4 - Sair");
             combustivel = scan.nextInt();
         }

         System.out.println("MUITO OBRIGADO");
         System.out.println("Gasolina: " + gasolina);
         System.out.println("Ácool: " + alcool);
         System.out.println("Diesel: " + diesel);

         scan.close();
    }
}
