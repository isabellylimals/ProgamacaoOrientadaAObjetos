package segundaunidade.Heranca.Concessionaria;

import java.lang.classfile.CustomAttribute;

public class AutomovelDeLuxo extends AutomovelBasico {
    private boolean arCondicionado;
    private boolean  direcaoHidraulica;

    public AutomovelDeLuxo(boolean arCondicionado, boolean direcaoHidraulica, boolean airbag, boolean radio, String modelo, String cor, int ano) {
        super(airbag, radio, modelo, cor, ano);
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
    }
public float quandoCusta(){
    float custo=super.quantoCusta();
    if(arCondicionado) custo += 10000;
    if(direcaoHidraulica) custo+=15000;
    return custo;
}
@Override
public String toString() {
    System.out.println("Carro:");
    String res= "modelo:" + getModelo() + "\ncor:" + getCor() + "\nano:" + getAno(); 
      res+= "\nDirecao Hidraulica: " + (direcaoHidraulica ? "Sim" :"Não");
    res+= "\nAr condicionado: " + (arCondicionado ? "Sim" : "Nao"); 
    res+= "\nRadio: " + isRadio();
    res+= "\nAirbag:" + isAirbag();
    res+= "\nCusto:= " + quandoCusta();
  return res;

}

}
