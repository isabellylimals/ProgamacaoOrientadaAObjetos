package primeiraunidade;
import java.util.Scanner;


public class Fatoriais {
    public static void main(String[] args) {
        Scanner fator= new Scanner(System.in);
        int n, fat=1;
        System.out.println("N:");
        n= fator.nextInt();
        System.out.println("Fatorial de 0 é: 1 ");

        for(int i=1; i<=n; i++) {
        fat *=i;
        System.out.println("Fatorial de " + i + " é: " + fat);
         
        }
        fator.close(); 
}
}