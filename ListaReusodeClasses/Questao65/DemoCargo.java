package ListaReusodeClasses.Questao65;

public class DemoCargo {

    public static void main(String[] args) {
       Funcionario f= new Funcionario("Isabelly", 2500.0f);
       Assistente a= new Assistente("Maria", 2500.0f, 1478);
       Tecnico t= new Tecnico("Roberta", 5000.0f, 2587, 800.0f);
       Adm ad= new Adm("Mariana", 7550.0f, 1478, "noite", 250.0f);
        System.out.println("Funcionario:\n" + f);
        System.out.println("Ganho anual: R$ " + f.ganhoAnual() + "\n");

        System.out.println("Assistente:\n" + a);
        System.out.println("Ganho anual: R$ " + a.ganhoAnual() + "\n");

        System.out.println(t);
        System.out.println("Ganho anual: R$ " + t.ganhoAnual() + "\n");

        System.out.println(ad);
        System.out.println("Ganho anual: R$ " + ad.ganhoAnual());
    }
}
