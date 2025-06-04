package segundaunidade.arraylist.Extrato;
import java.util.ArrayList;

public class Extrato {
    private float saldoFinal;
    private ArrayList<Float> transacoes;

    public Extrato() {
        saldoFinal = 0.0f;
        transacoes = new ArrayList<>();
    }

    @Override
    public String toString() {
        String res ="================\n";
        for(Float f : transacoes) {
            res += f + "\n";
        
        }
           res+=  "Saldo final: " + saldoFinal + "\n";
           return res;
            // res ="================\n";
       
  

}
