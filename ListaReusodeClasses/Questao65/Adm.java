package ListaReusodeClasses.Questao65;

public class Adm extends Assistente{
    private String turno;
    private float adicionalNoturno;
    public Adm(String nome, float salario, int numeroMat, String turno, float adicionalTurno) {
        super(nome, salario, numeroMat);
        this.turno = turno;
        this.adicionalNoturno = adicionalTurno;
    }
    public String getTurno() {
        return turno;
    }
    public float getAdicionalTurno() {
        return adicionalNoturno;
    }
  @Override
    public float ganhoAnual() {
        float salarioMensal = salario;
        if (turno.equals("noite")) {
            salarioMensal += adicionalNoturno;
        }
       
        return (salarioMensal * 12) + salario;
    }

    @Override
    public String toString() {
        return "Administrador\nturno:" + turno + "\nadicional Turno:" + adicionalNoturno + "\n" + super.toString();
    }

    
}
