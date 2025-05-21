// 42. Escreva uma classe genérica com 3 atributos de um mesmo tipo genérico. Além do
// construtor, essa classe deve ter:
// • Um método que diz quantos dos 3 atributos são iguais;
// • Um método que imprime os 3 atributos.
// Escreva também uma classe executável para demonstrar o uso da classe criada com
// diferentes tipos de dados.


package Questao42;

public class Generica {
private int num1;
private  int num2;
private int num3;

    public Generica(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
 public void iguais(){
    if(num1==num2 && num1==num3 && num2==num3){
        System.out.println("Os tres sao iguais\n");

    }if(num1==num2 || num1==num3 ||num2==num3){
         System.out.println("So dois sao iguais\n");
    }else{
         System.out.println("Não existe nenhum igual\n");
    }
 }

    public String toString() {
        return "Generica [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + "]";
    }




    }
    

