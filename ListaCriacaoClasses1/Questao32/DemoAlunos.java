package  Questao32;
import java.util.Scanner;

public class DemoAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do aluno:");
        String nome = sc.nextLine();

        System.out.println("Insira a matrícula do aluno:");
        int mat = sc.nextInt();
        sc.nextLine(); // Limpa o buffer

        System.out.println("Agora a nota da P1:");
        double p1 = sc.nextDouble();

        System.out.println("Agora a nota da P2:");
        double p2 = sc.nextDouble();

        System.out.println("Agora a nota do trabalho:");
        double trabalho = sc.nextDouble();

        AlunosPOO aluno = new AlunosPOO(mat, nome, p1, p2, trabalho);

        double media = aluno.mediaParcial();
        System.out.printf("Média Parcial: %.2f\n", media);

        aluno.provaFinal();

        sc.close();
    }
}
