package primeiraunidade.CriacaoClasses.Triangulo;

public class DemoTriangulo {
    public static void main(String[] args) {
        Triangulos t1 = new Triangulos();
        t1.inicializaTriangulo(3, 4, 5);
        System.out.println("Perímetro do triângulo: " + t1.calculaPerimetro());
        Triangulos t2 = new Triangulos();
        t2.inicializaTriangulo(5, 5, 5);
        System.out.println("Perímetro do triângulo: " + t2.calculaPerimetro());

        if(t1== t2){
            System.out.println("Os triângulos são iguais.");
        }else{
            System.out.println("Os triângulos são diferentes.");
        }
    }
}
