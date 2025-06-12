package Lista6.Questao74;

public class Principal {
    public static void main(String[] args) {
        Desenho desenho1 = new Desenho(
            new Circulo(), 0, 0,
            new Quadrado(), 5, 5
        );

        Desenho desenho2 = new Desenho(
            new Quadrado(), 2, 2,
            new Triangulo(), 7, 3
        );

        desenho1.apresenta();
        desenho2.apresenta();
    }
}
