package primeiraunidade.CriacaoClasses.Contab;

public class DemoBanco {
   public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Vinicius", 1000.0f, true);
        System.out.println(conta);
        //System.out.println(conta.toString());
        ContaBancaria conta2 = new ContaBancaria("Livia");
        System.out.println(conta2);
       
    } 
}
