
// Crie uma função recursiva mdc que retorna o máximo divisor comum de m e n. O mdc de
// m e n é definido recursivamente como segue:
// • se n > m, retorne mdc(n, m);
// • se n = 0, retorne m;
// • senão, retorne mdc(n, m%n), onde % é o operador de resto da divisão.
package Lista1.Questao20;

import java.util.Scanner;

public class Mdc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("M:");
        m= sc.nextInt();
        System.out.println("N:");
        n=sc.nextInt();
     System.out.printf(".O maximo divisor comum entre %d e %d eh: %d  ", m , n, calculoMdc(m,n));
        sc.close();
    }
public static int calculoMdc(int n, int m){
    if(n == 0){
        return m;
    }
    if(n > m){
        return calculoMdc(m, n);  
    } else {
        return calculoMdc(m % n, n); 
    }
}

}
