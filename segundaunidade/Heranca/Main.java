package segundaunidade.Heranca;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa= new Pessoa("Linda", "25874");
        Funcionario funcionario= new Funcionario("Pedro", "123456", 1400.0f);
        ChefeDeDepartamento chefe1= new ChefeDeDepartamento("Carla","5874" , 2500.0f, "RH");
        System.out.println("=====Funcionario geral dados:=====");
        System.out.println(funcionario);

        System.out.println("=====Dados do Chefe de departamento:=====");
        
        System.out.println(chefe1);
    }
}
