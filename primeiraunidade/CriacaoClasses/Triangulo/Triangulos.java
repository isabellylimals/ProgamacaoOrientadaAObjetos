package primeiraunidade.CriacaoClasses.Triangulo;

public class Triangulos {
    double lado1;
    double lado2;
    double lado3;
    String descricao;
    void inicializaTriangulo(double l1, double l2, double l3){
        lado1=l1;
        lado2=l2;
        lado3=l3;
    }
    double calculaPerimetro(){
        return lado1+lado2+lado3;
    }

}
