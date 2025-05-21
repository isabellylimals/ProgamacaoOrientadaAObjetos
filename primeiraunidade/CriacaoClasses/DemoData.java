package primeiraunidade.CriacaoClasses;

import java.util.Scanner;

public class DemoData {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
          Data data = new Data();
          data.inicializaData(-5, 2000, 5);
        //   System.out.println("Dia:");
        //   data.dia = sc.nextInt(); 
        //   System.out.println("Mes:");
        //   data.mes = sc.nextInt(); 
        //   System.out.println("Ano:");
        //   data.ano = sc.nextInt();      
        //  data.dataEhValida();
          data.getData();
          sc.close();
    //         if(data.dataEhValida()){
    //             System.out.println("Data válida.");
    //   }
      }}
    

