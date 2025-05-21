package primeiraunidade.CriacaoClasses;

public class Data {
  private int dia;
   private int mes;
  private int ano;


//   Data(){
//       this.dia=dia;
//       this.mes=mes;
//       this.ano=ano;

//    }

 private  boolean dataEhValida(){
    return(dia>0 && dia<=30 && mes>0 && mes<=12 &&ano >=0);
   }

  public void inicializaData(int d, int a, int m){
         dia=d;
         mes=m;
         ano=a;
         if(!this.dataEhValida()){
dia=1;
mes=1;
ano=2000;

    }}
   public void getData(){
    System.out.println("Dia: " + dia + "Mes: " + mes + "Ano: " + ano);
   }
}
