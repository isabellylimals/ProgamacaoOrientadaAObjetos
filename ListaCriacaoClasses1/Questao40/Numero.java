
// Escreva uma classe que contenha métodos estáticos para retornar o maior de dois, três,
// quatro e cinco valores, considerando que os argumentos e o retorno dos métodos podem
// ser dos tipos int e double. Em outra classe, escreva um aplicativo de teste que, sem criar
// objetos, demonstre as capacidades da classe criada.

package Questao40;



public class Numero {

    // Para dois valores
    public static int maior(int a, int b) {
        return (a > b) ? a : b;
    }

    public static double maior(double a, double b) {
        return (a > b) ? a : b;
    }

    // Para três valores
    public static int maior(int a, int b, int c) {
        return maior(maior(a, b), c);
    }

    public static double maior(double a, double b, double c) {
        return maior(maior(a, b), c);
    }

    // Para quatro valores
    public static int maior(int a, int b, int c, int d) {
        return maior(maior(a, b, c), d);
    }

    public static double maior(double a, double b, double c, double d) {
        return maior(maior(a, b, c), d);
    }

    // Para cinco valores
    public static int maior(int a, int b, int c, int d, int e) {
        return maior(maior(a, b, c, d), e);
    }

    public static double maior(double a, double b, double c, double d, double e) {
        return maior(maior(a, b, c, d), e);
    }
}
