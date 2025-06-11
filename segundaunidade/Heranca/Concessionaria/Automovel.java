package segundaunidade.Heranca.Concessionaria;

public class Automovel {
    private String modelo;
    private String cor;
    private int ano;
    public Automovel(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    public float quantoCusta(){
        return (ano<2010 ? 50000 : 70000);
    }
}
