package primeiraunidade.Introducao;


import java.util.Scanner;

public class distancia {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Distancia X1:");
            double x1= sc.nextDouble();
            System.out.print("Distancia Y1:");
            double y1= sc.nextDouble();
            System.out.print("Distancia X2:");
            double x2= sc.nextDouble();
            System.out.print("Distancia Y2:");
            double y2= sc.nextDouble();
            double dist= Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
            System.out.printf("A distancia entre os pontos é %.2f%n: ", dist);
        }
    }
}
