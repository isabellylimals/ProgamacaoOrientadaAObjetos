package segundaunidade.Heranca.Delegacao;
public class RegistroPosGrad{
private RegistroAcademico registro;

private String tituloTeste;
private String orientador;
public RegistroPosGrad(String nome, String mat, String curso, String tituloTeste, String orientador) {
    this.registro =new RegistroAcademico(orientador, tituloTeste, orientador) ;
    this.tituloTeste = tituloTeste;
    this.orientador = orientador;
}
@Override
public String toString() {
    return "RegistroPosGrad [registro=" + registro + ", tituloTeste=" + tituloTeste + ", orientador=" + orientador
            + "]";
}

    


}