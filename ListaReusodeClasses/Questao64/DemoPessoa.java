package ListaReusodeClasses.Questao64;

public class DemoPessoa {
    public static void main(String[] args) {
    Pessoa pessoa= new Pessoa("Isabelly", 21);
    System.out.println("Pessoa normal:" + pessoa);
Politico politico= new Politico("Pedro", 36, "PL");
Governador governador= new Governador("Carlos",58, "PL", "Paraiba");
Prefeito prefeito= new Prefeito("Roberto",45, "PL", "São Paulo");
System.out.println("Politico: " + politico);
System.out.println(governador);
System.out.println(prefeito);

    }
}
