// 42. Escreva uma classe genérica com 3 atributos de um mesmo tipo genérico. Além do
// construtor, essa classe deve ter:
// • Um método que diz quantos dos 3 atributos são iguais;
// • Um método que imprime os 3 atributos.
// Escreva também uma classe executável para demonstrar o uso da classe criada com
// diferentes tipos de dados.

package Questao42;

public class Generica<T> {
    private T valor1;
    private T valor2;
    private T valor3;

    public Generica(T valor1, T valor2, T valor3) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }

    public int contarIguais() {
        int iguais = 0;
        if (valor1.equals(valor2) && valor1.equals(valor3)) {
            iguais = 3;
        } else if (valor1.equals(valor2) || valor1.equals(valor3) || valor2.equals(valor3)) {
            iguais = 2;
        } else {
            iguais = 0;
        }
        return iguais;
    }

    public void imprimir() {
        System.out.println("Valores: " + valor1 + ", " + valor2 + ", " + valor3);
    }
}
