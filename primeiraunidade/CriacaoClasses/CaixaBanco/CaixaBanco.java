package primeiraunidade.CriacaoClasses.CaixaBanco;

public class CaixaBanco {
    public static int clientesAtendidos=0;
    private int numeroCaixa;
    public CaixaBanco(int numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
    }
    @Override
    public String toString() {
        return "CaixaBanco [numeroCaixa=" + numeroCaixa + "]";
    }
    public void iniciaAtendimento(){
        System.out.println("Caixa: " + numeroCaixa + "atendendo o cliente " 
         + ++clientesAtendidos);
    }
    
   
}
