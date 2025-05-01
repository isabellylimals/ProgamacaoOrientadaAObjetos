// 8. Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção relâmpago em
// dois setores:
// • No setor de Eletros, que possui código 222, todas as peças que custam mais de R$
// 500 vão ter 10% de desconto.
// • No setor de Cama, mesa e banho, que possui código 111, peças com valor acima
// de R$ 100 vão ter 40% de desconto, peças que custam entre R$ 50 e R$ 100 vão ter
// 20% de desconto e peças abaixo de R$ 50 vão ter 10% de desconto.
// Escreva umprogramaquerecebedousuárioocódigodosetor da loja e o valor original de
// um produto e imprime na tela o nome do setor e o valor do produto com desconto. Caso
// o usuário forneça um código diferente de 111 ou 222, exiba a mensagem Setor Invalido.

package Lista1.Questao8;

import java.util.Scanner;

public class Vendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int codigoSetor;
        do {
            System.out.println("Digite o código do setor (111 para Cama, mesa e banho ou 222 para Eletros): ");
            codigoSetor = sc.nextInt();
        } while (codigoSetor != 111 && codigoSetor != 222);

        System.out.println("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();
        double valorComDesconto = 0.0;
        String produto = "Setor Inválido";

        switch (codigoSetor) {
            case 222:
                produto = "Eletros";
                valorComDesconto = (valorProduto > 500) ? valorProduto * 0.9 : valorProduto;
                break;
            case 111:
                produto = "Cama, mesa e banho";
                if (valorProduto > 100) {
                    valorComDesconto = valorProduto * 0.6;
                } else if (valorProduto >= 50) {
                    valorComDesconto = valorProduto * 0.8;
                } else {
                    valorComDesconto = valorProduto * 0.9;
                }
                break;
        }

        System.out.println("Setor: " + produto);
        System.out.printf("Valor com desconto: R$ %.2f%n", valorComDesconto);
        
        sc.close();
    }
}