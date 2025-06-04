package Lista4ArrayList.Exercicio51;

import java.util.ArrayList;

public class ListaInteiros {
    ArrayList<Inteiros> valor= new ArrayList<>();

    public ListaInteiros() {
        valor= new ArrayList<>();
    }
public void addNum(Inteiros i){
    valor.add(i);
}
    public void imprimir(){
        if(valor.isEmpty()){
            System.out.println("LISTA VAZIA");

        }
        else{
            System.out.println("Valores: ");
            for(Inteiros i: valor){
                System.out.println(i.getValor());
            }
        }
    }
   public void produto() {
    int produto = 1; 
    for (Inteiros i : valor) {
        produto *= i.getValor(); 
    }
    System.out.println("Produto dos números: " + produto);
}


}
