package ListaReusodeClasses.Questao61;

public class Computador extends Equipamento {
    private String processador;
    private int memoriaRAM; 

   
    public Computador(String nome, double preco, String processador, int memoriaRAM) {
        super(nome, preco);
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
    }


    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public String toString() {
        return "Computador [nome=" + getNome() + ", preco=" + getPreco() + 
               ", processador=" + processador + ", memoriaRAM=" + memoriaRAM + "GB]";
    }
}