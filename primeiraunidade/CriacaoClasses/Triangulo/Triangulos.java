package primeiraunidade.CriacaoClasses.Triangulo;

public class Triangulos {
  private   double lado1;
  private double lado2;
  private  double lado3;
  private String descricao;
 public   void inicializaTriangulo(double l1, double l2, double l3){
        lado1=l1;
        lado2=l2;
        lado3=l3;
    }
    double calculaPerimetro(){
        return lado1+lado2+lado3;
    }

}
