package primeiraunidade.CriacaoClasses.Pessoa;

public class DemoPessoaa {
    public static void main(String[] args) {
        Pessoa people= new Pessoa("Livia", 1.70);
        System.out.println(people.toString());
        System.out.println("Nome: " + people.getNome());
    }
}
