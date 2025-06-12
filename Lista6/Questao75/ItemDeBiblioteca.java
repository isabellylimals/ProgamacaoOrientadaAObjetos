package Lista6.Questao75;
// Crie uma interface ItemDeBiblioteca que declara quais campos e métodos uma classe
// que representa um item para empréstimo em uma biblioteca deve implementar. Essa
// interface é composta por um campo maximoDeDiasParaEmprestimo com valor 14 e os
// seguintes métodos:
// • estaEmprestado : retorna verdadeiro se o item estiver emprestado e falso caso contrário;
// • empresta : modifica para verdadeiro o estado de um campo que indica se o item
// está emprestado ou não;
// • devolve : modifica para falso o estado de um campo que indica se o item está emprestado ou não;
// • localizacao : retorna um texto que informa o local do item na biblioteca (e.g: "corredor 2, prateleira D");
// • descricao : retorna texto contendo uma descrição resumida do item (e.g.: "artigo da
// ECOP").
public interface ItemDeBiblioteca {
    public static final int maximoDeDiasParaEmprestimo=14; //nao pode ser private
    public boolean estaEmprestado();
    public boolean empresta();
    public boolean devolve();
    public String localizacao();
    public String descricao();

    
}
