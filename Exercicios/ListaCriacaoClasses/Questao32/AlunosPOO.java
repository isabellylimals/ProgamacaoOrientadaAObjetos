// Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina da
// Ufersa. Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula,
// nome, 2 notas de prova (P1 e P2) e 1 nota de trabalho (T). Escreva os seguintes métodos
// para esta classe:
// • media: calcula a média parcial do aluno (MP)
// – cada prova tem peso 2, 5 e o trabalho tem peso 2 (MP =
// 2,5×P1+2,5×P2+2×T
// 7
// )
// • provaF inal: calcula quanto o aluno precisa para o exame final (EF)
// – retorna zero se o aluno não necessita realizar o exame final (MP < 3 ou MP >=
// 7)
// – média final MF = (MP × 6 + EF × 4)/10
// – é necessário que MF seja maior ou igual a 5 para que o aluno seja aprovado
// após realizar o exame final
// Escreva um aplicativo de teste que demonstre as capacidades da classe criada
// package Questao32;
package Questao32;

public class AlunosPOO {
    int mat;
    String nome;
    double p1;
    double p2;
    double trabalho;

    public AlunosPOO(int mat, String nome, double p1, double p2, double trabalho){
        this.mat = mat;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.trabalho = trabalho;
    }

    
    public double mediaParcial() {
        return ((2.5 * p1) + (2.5 * p2) + (2 * trabalho)) / 7.0;
    }

    
    public double provaFinal() {
        double mp = mediaParcial();

        if (mp >= 7 || mp < 3) {
            System.out.println("O aluno " + nome + " não precisa realizar a prova final. MP = " + mp);
            return 0;
        }

        // MF = (MP * 6 + EF * 4) / 10  --> queremos MF >= 5
        // 5 = (MP * 6 + EF * 4) / 10  --> EF = (50 - MP * 6) / 4
        double efNecessaria = (50 - mp * 6) / 4;

        if (efNecessaria > 10) {
            System.out.println("Mesmo com 10 na prova final, " + nome + " não alcança média 5. Reprovado.");
        } else {
            System.out.printf("O aluno %s precisa tirar %.2f na prova final para ser aprovado.\n", nome, efNecessaria);
        }

        return efNecessaria;
    }
}
