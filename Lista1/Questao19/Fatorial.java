// Escreva uma função que calcule o fatorial de forma recursiva. Para cada chamada recursiva, exiba as saídas em uma linha separada e adicione um nível de recuo (tabulação).
// Faça o melhor que você puder para tornar a saída limpa, interessante e significativa. Seu
// objetivo aqui é projetar e implementar um formato de saída que facilite o entendimento
// da recursão.
// 3
// Por exemplo, para uma entrada n = 5, o programa deve exibir:
// 0! = 1
// 1! = 1
// 2! = 2
// 3! = 6
// 4! = 24
// 5! = 120
package Lista1.Questao19;
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("Número inválido. Digite um número inteiro positivo.");
        } else {
            System.out.println("Fatorial de " + numero + " é: " + fatorial(numero));
        }
        sc.close();
    }
    public static int fatorial(int numero){
        int multiplicador= numero;
        if(multiplicador==1){
            return numero;
        }
        else{
              return numero* fatorial(numero-1);
        }

    }
}
