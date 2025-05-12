package ListaCriacaoClasses1.Questao31;

import java.util.Scanner;

public class DemoFatura {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Fatura f= new Fatura();
        int qtd, num;
        double preco;
        String descricao;
        System.out.println("Numero de identificacao: ");
        num= sc.nextInt();
        System.out.println("Quantidade comprada: ");
        qtd=sc.nextInt();
        if(qtd<0){
            qtd=0;
        }
        System.out.println("Preco unitario: ");
        preco=sc.nextDouble();
        if(preco<0){
            preco=0.0;
        }
        System.out.println("Descricao do produto: ");
        descricao=sc.nextLine();
     
        f.inicializaFatura(num, descricao, qtd, preco);
        
        f.exibirInfo(qtd, num, preco, descricao);
        System.out.println("Total da compra: " + f.calculaTotal(qtd, preco));
        sc.close();
    }
}
