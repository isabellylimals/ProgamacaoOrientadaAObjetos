package primeiraunidade.CriacaoClasses.RegistroAca;

public class RegistroAcademico {
   private  String nome;
   private String mat;
    private int codigoCurso;
    private int percentualDeCobrança;



    public void  inicializaRegistroAcademico(String n, String m, int c, int p){
        nome=n;
        mat=m;
        codigoCurso=c;
        percentualDeCobrança=p;

    }
   double calculaValorMensalidade(){
        return codigoCurso*100.0 *(percentualDeCobrança/100.0);
    }
  

}
