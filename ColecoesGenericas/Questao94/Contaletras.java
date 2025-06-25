package ColecoesGenericas.Questao94;
import java.util.TreeMap;
public class Contaletras {
public static void main(String[] args) {
    String texto ="isaaas";
     TreeMap<String,Integer> frase= new TreeMap<>();
     String letras[]= texto.split("");
   
    for(String letra: letras){
       String letraMinuscula= letra.toLowerCase();
        if(frase.containsKey(letra)){
       
            int qtd= frase.get(letraMinuscula);
            frase.put(letraMinuscula, qtd+1);
        }else{
            frase.put(letraMinuscula,1);
        }
        //System.out.println(letraMinuscula);


    }
    for(String letra: frase.keySet()){
        System.out.println(letra+ " " + frase.get(letra));
    }
}
}