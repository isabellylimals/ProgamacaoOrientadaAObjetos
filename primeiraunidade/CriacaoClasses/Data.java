package primeiraunidade.CriacaoClasses;

public class Data {
   int dia;
   int mes;
   int ano;


//   Data(){
//       this.dia=dia;
//       this.mes=mes;
//       this.ano=ano;

//    }

   boolean dataEhValida(){
    return(dia>0 && dia<=30 && mes>0 && mes<=12 &&ano >=0);
   }

   void inicializaData(int d, int a, int m){
         dia=d;
         mes=m;
         ano=a;
    }
   void mostraData(){
    System.out.println("Dia: " + dia + "Mes: " + mes + "Ano: " + ano);
   }
}
