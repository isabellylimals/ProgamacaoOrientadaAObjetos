package primeiraunidade.CriacaoClasses.Circulo;

public class Circulo {
    private double raio;
    private static double pi=3.1415;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + "]";
    }
    public double perimetro(){
        return 2*pi*raio;
    }


}
