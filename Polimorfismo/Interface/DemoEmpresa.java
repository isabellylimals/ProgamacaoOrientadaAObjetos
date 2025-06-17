package Polimorfismo.Interface;

public class DemoEmpresa {
    public static void main(String[] args) {
      Assalariado a= new Assalariado("efefef", "Jorge", 5000.0f);
      Fatura f= new Fatura(50.0f, 5);
      imprimeCustoPagamento(a);
      imprimeCustoPagamento(f);
    }
    public static void imprimeCustoPagamento(Pagavel pag){
        System.out.println("Custo do pagamento eh:R$" + pag.obterValorPagamento());
        
    }
}
