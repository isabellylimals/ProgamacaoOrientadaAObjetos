// 30. Escreva uma classe para representar um time de um esporte qualquer em um campeonato desse esporte. Que atributos devem ser representados nessa classe? Quais métodos ela deve conter? Escreva um aplicativo de teste que demonstre as capacidades da
// classe criada.
package ListaCriacaoClasses1.Questao30;

public class Times {
    String nome;
    String tecnico;
    String cidadeOrigem;
    String cor1;
    String cor2;
    int numeroTitulos;

    public Times(String nome, String tecnico, String cidadeOrigem, String cor1, String cor2, int numeroTitulos){
        this.cidadeOrigem=cidadeOrigem;
        this.cor1=cor1;
        this.cor2=cor2;
        this.tecnico=tecnico;
        this.nome=nome;
        this.numeroTitulos=numeroTitulos;
    }
    public void exibirInfo(){
        System.out.println("Nome do time: " + nome + "\nTecnico: "+ tecnico + "\nCores: " + cor1 + " e "+ cor2 + "\nNumero de titulos: " + numeroTitulos);
    }
}
