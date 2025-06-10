// Duas cidades, A e B, têm populações de 7000 e 20000 habitantes, respectivamente. A
// cidade A tem um crescimento populacional de 3, 5% ao ano, enquanto a população da
// cidade B cresce 1% ao ano. Faça um programa que utilize laço(s) para calcular a quantidade de anos necessária para que a população da cidade A seja maior ou igual a população da cidade B.

package Lista1.Questao17;

public class Cidades {
    public static void main(String[] args) {
        int populacaoCidadeA= 7000;
        int populacaoCidadeB= 20000;
        int contagemAnos=0;
        double crescimentoA= (7000*3.5)/100;
        double crescimentoB=(20000*1)/100;
   
       
        while (populacaoCidadeA < populacaoCidadeB) {
            populacaoCidadeA += crescimentoA;
            populacaoCidadeB += crescimentoB;
            contagemAnos++;
        }
    System.out.printf("A população da cidade A é maior ou igual a da cidade B após %d anos", contagemAnos);


    }
}
