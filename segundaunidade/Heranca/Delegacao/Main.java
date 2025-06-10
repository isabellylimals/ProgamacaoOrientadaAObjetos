package segundaunidade.Heranca.Delegacao;

public class Main {
    public static void main(String[] args) {
        
        RegistroAcademico alunoGrad= new RegistroAcademico("BTI", "22222", "Maria");
        RegistroPosGrad posAluno= new RegistroPosGrad("mariana","14458", "Engenharia", "Harry Potter", "Reudsman");
        System.out.println( posAluno);
        System.out.println(alunoGrad);

    }
}
