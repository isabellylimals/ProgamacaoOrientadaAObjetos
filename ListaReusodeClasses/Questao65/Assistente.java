package ListaReusodeClasses.Questao65;

public class Assistente extends Funcionario{
    private int numeroMat;

    public Assistente(String nome, float salario, int numeroMat) {
        super(nome, salario);
        this.numeroMat = numeroMat;
    }

    public int getNumeroMat() {
        return numeroMat;
    }

    @Override
    public String toString() {
        return "numero da matricula: " + numeroMat +  "\n" + super.toString();
    }
    
    
}
