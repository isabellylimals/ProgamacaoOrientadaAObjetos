package ListaCriacaoClasses1.Questao30;

import java.util.Scanner;

public class DemoTimes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
     
  String nome, tecnico, cor1,cor2,cidadeOrigem;
  int numTitulos;

  System.out.println("Nome do time: ");
  nome= sc.nextLine();
  System.out.println("Nome do tecnico: ");
  tecnico=sc.nextLine();
  System.out.println("Cidade de Origem: ");
  cidadeOrigem= sc.nextLine();
  System.out.println("Cor 1: ");
  cor1=sc.nextLine();
  System.out.println("Cor 2: ");
  cor2= sc.nextLine();
  System.out.println("Numero de titulos:");
  numTitulos= sc.nextInt();
Times times= new Times(nome, tecnico, cidadeOrigem, cor1, cor2, numTitulos);
times.exibirInfo();
        sc.close();
    }
}
