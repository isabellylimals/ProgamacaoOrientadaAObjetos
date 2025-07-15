package ListaReusodeClasses.Questao63;

public class DemoLivro {
    public static void main(String[] args) {
        LivroBiblioteca livroEmprestar= new LivroBiblioteca("Trono de vidro", "Fantasia", "Sarah J.maas",true);
        LivroLivaria livroComprar= new LivroLivaria("Acotar", "Fantasia", "Sarah J.maas", 50.0f);
     
        System.out.println("Livro na Livraria:" + livroComprar);
        
        System.out.println("Livro na biblioteca:" + livroEmprestar);
           livroEmprestar.emprestarLivro();

           System.out.println("Livro na biblioteca:" + livroEmprestar);
    }
}
