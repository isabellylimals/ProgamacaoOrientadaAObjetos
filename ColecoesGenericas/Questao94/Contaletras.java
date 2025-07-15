package ColecoesGenericas.Questao94;
import java.util.TreeMap;
public class Contaletras {
public static void main(String[] args) {
    String texto ="isaaas";
     TreeMap<String,Integer> mapa= new TreeMap<>();
     String letras[]= texto.split("");
   
    for(String letra: letras){
       String letraMinuscula= letra.toLowerCase();
        if(mapa.containsKey(letraMinuscula)){
       
            int qtd= mapa.get(letraMinuscula);
            mapa.put(letraMinuscula, qtd+1);
        }else{
            mapa.put(letraMinuscula,1);
        }


    }
    for(String letra: mapa.keySet()){
        System.out.println(letra+ " " + mapa.get(letra));
    }
}
}