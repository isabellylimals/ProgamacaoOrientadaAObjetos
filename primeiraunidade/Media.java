package primeiraunidade;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner calcula= new Scanner(System.in);
        double n1,n2,n3;
        System.out.print("Primeira nota: ");
        n1= calcula.nextDouble();
        System.out.print("Segunda nota: ");
        n2= calcula.nextDouble();
        System.out.print("Terceira nota: ");
        n3= calcula.nextDouble();
        double m= media(n1,n2,n3);
        System.out.printf("A media é: %.2f%n", m);
        if(m>=7){
            System.out.println("Aprovado!");
        }else if(m>=5){
            System.out.println("Recuperação!");
        }
  calcula.close();
    }
    public static double media(double n1, double n2, double n3){
        return (n1+n2+n3)/3;    
    }
}
