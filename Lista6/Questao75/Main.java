package Lista6.Questao75;

public class Main {
    public static void main(String[] args) {
    
        LivroDeBiblioteca livro = new LivroDeBiblioteca(2020, "Sarah J.Maas", 300, "Livro de Fantasia");
         System.out.println("Maximo de dias para emprestimo: " + livro.maximoDeDiasParaEmprestimo);

       
        System.out.println(livro);
        System.out.println("Está emprestado? " + livro.estaEmprestado());

     
        livro.empresta();
        System.out.println("\nApós emprestar:");
        System.out.println(livro);
        System.out.println("Está emprestado? " + livro.estaEmprestado());

    
        livro.devolve();
        System.out.println("\nApós devolver:");
        System.out.println(livro);
        System.out.println("Está emprestado? " + livro.estaEmprestado());
    }
}
