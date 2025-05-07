package primeiraunidade.CriacaoClasses.RegistroAca;

public class RegistroAcademico {
    String nome;
    String mat;
    int codigoCurso;
    int percentualDeCobrança;
    void inicializaRegistroAcademico(String n, String m, int c, int p){
        nome=n;
        mat=m;
        codigoCurso=c;
        percentualDeCobrança=p;
    }
   double calculaValorMensalidade(){
        return codigoCurso*100.0 *(percentualDeCobrança/100.0);
    }
  

}
