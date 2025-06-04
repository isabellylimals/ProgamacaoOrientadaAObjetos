package segundaunidade.arraylist.Media;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double media2= media( 3.5,10.0);
        System.out.println(".(Media de 2 elementos:)" + media2);
        double media3= media(8.0,5.0,8.0);
          System.out.println(".(Media de 3 elementos:)" + media3);

        sc.close();
    }
    public static double media(double... numeros){
        double soma= 0;
        for (double d : numeros) {
            soma+=d;

        }
        return soma/numeros.length;

            }
        }
