public class Mamifero {
    protected void andar() {
        System.out.print("Mamifero andando");
        ouvir();
    }
    protected void ver() {
        System.out.print("Mamifero vendo");
    }
    protected void ouvir() {
        System.out.print("Mamifero ouvindo");
        ver();
    }
}

public class Primata extends Mamifero {
    protected void andar() {
        System.out.print("Primata andando");
        ouvir();
    }
}

public class Homem extends Primata {
    protected void ver() {
        System.out.print("Homem vendo");
    }
    public static void main(String[] args) {
        Mamifero m = new Homem();
        m.andar();
    }
}