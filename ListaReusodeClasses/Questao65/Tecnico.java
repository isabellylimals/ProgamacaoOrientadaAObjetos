package ListaReusodeClasses.Questao65;

public class Tecnico extends Assistente {
    private float bonusSalarial;

    public Tecnico(String nome, float salario, int numeroMat, float bonusSalarial) {
        super(nome, salario, numeroMat);
        this.bonusSalarial = bonusSalarial;
    }

    public float getBonusSalarial() {
        return bonusSalarial;
    }


    @Override
     public float ganhoAnual() {
    return (salario + bonusSalarial) * 12 + salario;
    }
    @Override
    public String toString() {
        return "Tecnico: \nbonusSalarial=" + bonusSalarial  +"\n" +  super.toString();
    }

    
    
}
