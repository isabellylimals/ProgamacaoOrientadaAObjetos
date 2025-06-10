// Crie umobjetodeumaclassechamadaCliente comosatributosid, nome, idade, telefone.
//  Faça umprogramaparasolicitar os dados de vários clientes e armazenar em umArrayList
//  até que se digite um número de id negativo. Em seguida, exiba os dados de todos os
//  clientes
package Lista4ArrayList.Exercicio50;

public class Cliente {
    private String nome;
    private int id;
    private int idade;
    private int telefone;

    public Cliente(int id, int idade, String nome, int telefone) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getInfo() {
        return "Nome: " + nome +
               "\nIdade: " + idade +
               "\nId: " + id +
               "\nTelefone: " + telefone;
    }
}
