
// . Crie uma classe chamada F atura para que uma loja de suprimentos de informática a
// utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as seguintes informações sobre o item vendido: o número de identificação, a descrição, a
// quantidade comprada e o preço unitário. Se a quantidade não for positiva, ela deve ser
// configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como
// 0.0. Forneça também um método chamado calculaT otal que calcula e retorna o valor de
// fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste
// que demonstre as capacidades da classe criada.
package ListaCriacaoClasses1.Questao31;

public class Fatura {
    int numId;
    String descricao;
    int quantidadeComprada;
    double precoUnitario;

    void inicializaFatura(int num, String des, int qtd, double p){
        numId=num;
        quantidadeComprada=qtd;
        descricao=des;
        precoUnitario=p;


    }
    double calculaTotal(int quantidadeComprada, double precoUnitario){
        return quantidadeComprada*precoUnitario;

    }
   
    void exibirInfo(int quantidadeComprada, int numId, double precoUnitario, String descricao){
        System.out.println("Numero de Identificacao: " + numId + "\nDescricao: " + descricao + "\nQuantidade comprada: " + quantidadeComprada + "\nPreco por unidade: " + precoUnitario);
    }

}
