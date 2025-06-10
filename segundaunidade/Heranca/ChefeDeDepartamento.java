package segundaunidade.Heranca;

public class ChefeDeDepartamento extends Funcionario {
    private String departamento;

    public ChefeDeDepartamento(String nome, String identidade, float salario, String departamento) {
        super(nome, identidade, salario);
        this.departamento = departamento;
    }
    public String toString(){
        return super.toString() + "\ndepartamento: " + departamento;
    }
}
