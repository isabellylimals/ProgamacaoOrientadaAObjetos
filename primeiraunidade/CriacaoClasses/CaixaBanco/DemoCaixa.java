package primeiraunidade.CriacaoClasses.CaixaBanco;

public class DemoCaixa {
    public static void main(String[] args) {
        System.out.println("Total de clientes atendidos: " + CaixaBanco.clientesAtendidos);
        CaixaBanco caixa= new CaixaBanco(1);
     CaixaBanco caixa2= new CaixaBanco(2);
     CaixaBanco caixa3= new CaixaBanco(3);
      CaixaBanco caixa4= new CaixaBanco(4);
       CaixaBanco caixa5= new CaixaBanco(5);
       caixa.iniciaAtendimento();
       caixa2.iniciaAtendimento();
       caixa3.iniciaAtendimento();
       caixa4.iniciaAtendimento();
       caixa5.iniciaAtendimento();

}
}