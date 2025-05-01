package Lista1.Questao4;

import java.util.Scanner;

public class Graus {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        double celsius;
        System.out.println("Insira a temperatura em graus celsius: ");
        celsius= sc.nextDouble();
        double f= (celsius * 1.8)+32;
        System.out.print("Graus em celsius: "+ celsius + " Em f: " + f);
                sc.close();
    }
}
