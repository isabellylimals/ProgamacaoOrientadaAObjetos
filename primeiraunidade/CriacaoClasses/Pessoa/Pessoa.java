public class Pessoa {
    private String nome;
    private double altura;

    public Pessoa(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }
    public String getNome(){
        return "O nome eh:" + this.nome.toUpperCase();

    }
    public double getAltura(){
        return this.altura;
    }
    public void setNome(String n){
        if(nome.isEmpty()){
            System.out.println("Nome vazio");
        }
        else
            System.out.println("Nome preenchido");
             this.nome=n;
    }
    public String toString(){
        return "Nome: " + this.nome + "\nAltura: " + this.altura;
    }
    public void setAltura(double a){
        if(a>0){
            this.altura=a;
        }
        else{
            System.out.println("Altura negativa");
        }
    }
}