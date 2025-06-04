package segundaunidade.arraylist.Extrato;

public class DemoContaBancaria {
    public static void main(String[] args) {
        Extrato extrato = new Extrato();
        extrato.adicionarTransacao(100.0f);
        extrato.adicionarTransacao(-50.0f);
        extrato.adicionarTransacao(200.0f);
        extrato.adicionarTransacao(-30.0f);
        
        System.out.println(extrato.toString());
    }
}
