package segundaunidade.Heranca.Concessionaria;

public class AutomovelBasico extends Automovel {
    private boolean airbag;
    private boolean radio;

    public AutomovelBasico(boolean airbag, boolean radio, String modelo, String cor, int ano) {
        super(modelo, cor, ano);
        this.airbag = airbag;
        this.radio = radio;
    }
    @Override
    public float quantoCusta(){
        float custo= super.quantoCusta();
        if(airbag) custo+=15000;
        if(radio) custo+=2000;
        return custo;

    }
}
