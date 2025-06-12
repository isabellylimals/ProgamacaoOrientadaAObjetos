package Lista6.Questao72;

public class DemoFuncionario {
    public static void main(String[] args) {
        Funcionario f= new Funcionario("Isabelly");
         Funcionario f2= new Funcionario(10, "Maria", 35.0f);
        System.out.print("Primeiro construtor: " + f  + "\nSalario: R$" + f.calculoSalario());
       
        System.out.println("\nSegundo Construtor: " + f2 + "\nSalario: R$" + f2.calculoSalario());
        
    }
}
