package primeiraunidade;
import java.util.Calendar;
import java.util.Scanner;


public class Vercartao {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Calendar data= Calendar.getInstance();
        boolean invalido;
       System.out.println(data.get(Calendar.MONTH) + ""+ (Calendar.YEAR));
       int anoAtual= data.get(Calendar.YEAR);
        int mesAtual= data.get(Calendar.MONTH)+1;
        int ano, mes;
        System.out.println("Numero:");
        String cartao = sc.nextLine();
        System.out.println("Nome do titular:");
        String titular = sc.nextLine();
        System.out.println("Codigo de segurança:");
        String codigo = sc.nextLine();
    do { 
        System.out.println("Mes:");
        mes = sc.nextInt();
        System.out.println("Ano:");
       ano = sc.nextInt();
       invalido= ano<anoAtual||(ano==anoAtual && mes<mesAtual);
       if(invalido){System.out.println("Cartao invalido, insira os dados novamente!");}
    } while (invalido); 
    System.err.print("Cartao valido! \n");
       
    //sc.close();
       
    }
    
}
