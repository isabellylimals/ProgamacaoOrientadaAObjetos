package segundaunidade.arraylist.TrianguloPascal;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        int nLinhas;
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("Linhas: ");
            nLinhas = sc.nextInt();
            int [][] triangulo = new int[nLinhas][];
            for(int l=0; l<triangulo.length; l++){
                triangulo[l]= new int[l+1];
                triangulo[l][0]= 1;
                triangulo[l][l] = 1;
                for(int c=1; c<l; c++){
                    triangulo[l][c]= triangulo[l-1][c] + triangulo[l-1][c-1];
                }
            }
            for(int l=0; l<triangulo.length; l++){
                for(int c=0; c<triangulo[l].length; c++){
                    System.out.print(triangulo[l][c] + " ");
                }
                System.out.println();
            }
        }
    }
}
