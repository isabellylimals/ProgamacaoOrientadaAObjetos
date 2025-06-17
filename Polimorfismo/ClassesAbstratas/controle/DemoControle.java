package Polimorfismo.ClassesAbstratas.controle;

public class DemoControle {
    public static void main(String[] args) {
        Carro c= new Carro("iloveU", 4, 5);
        Barco b= new Barco("747959", 58.0f, 8);
        Aviao a= new Aviao("isagatinha123", "258741", 250);
        Carro c1= new Carro("wdwdwd8");
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);

        Controle control= new Controle();
        control.controlar(c);
        control.controlar(b);
        control.controlar(a);
    }
}
