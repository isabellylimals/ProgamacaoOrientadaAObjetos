package Questao37;

public class DemoContador {
    public static void main(String[] args) {
           Contador contador = new Contador();
           contador.setCont(5);
           contador.incrementar();
           contador.zerar();
            contador.incrementar();
           System.out.println("Valor do contador: " + contador.getCont());
       }
}
