// Escreva uma classe para representar um número complexo. Essa classe deve conter
// três construtores. Um construtor deverá receber os dois valores (parte real e parte imaginária) como argumentos, o outro somente o valor real, considerando o imaginário como
// sendo zero, e o terceiro construtor não recebe argumentos, considerando as partes real e
// imaginária do número complexo como sendo iguais a zero. Escreva um método toString
// que apresente o número complexo em notação apropriada (ex.: 2 + 4i) e o use em um
// aplicativo de teste que demonstre as capacidades da classe criada.

package Questao39;


public class NumComplexo {
    float parteReal;
    float parteImag;


    public NumComplexo(float parteReal, float parteImag) {
        this.parteReal = parteReal;
        this.parteImag = parteImag;
    }

    public NumComplexo(float parteReal) {
        this(parteReal, 0);
    }

   
    public NumComplexo() {
        this(0, 0);
    }

    @Override
    public String toString() {
        if (parteImag == 0) {
            return String.format("%.1f", parteReal);
        } else if (parteImag > 0) {
            return String.format("%.1f + %.1fi", parteReal, parteImag);
        } else {
            return String.format("%.1f + %.1fi", parteReal, -parteImag);
        }
    }
}

