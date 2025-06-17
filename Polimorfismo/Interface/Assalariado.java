package Polimorfismo.Interface;

public class Assalariado extends Empregado {
    private float salario;

    public Assalariado(String ctps, String nome, float salario) {
        super(ctps, nome);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return  super.toString() + "[salario=" + salario + "]";
    }
public float obterValorPagamento(){
    return salario;
}
    
}
