package Lista6.Questao73;

public class DemoFigura {
    public static void main(String[] args) {
        FiguraGeometrica circulo= new Circulo();
        FiguraGeometrica triangulo= new Triangulo();
        FiguraGeometrica quadrado= new Quadrado();
        System.out.println("Circulo: " + circulo.descricao());
        System.out.println("Triangulo: " + triangulo.descricao());
        System.out.println("Quadrado: " + quadrado.descricao());
    }
}
