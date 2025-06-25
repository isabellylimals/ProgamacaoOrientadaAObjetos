package Colecoes.Mapas;
import java.util.TreeMap;
public class ContaPalavras {
public static void main(String[] args) {
    String texto = "A casa é azul e a casa é grande A casa é bonita";
     TreeMap<String,Integer> mapa= new TreeMap<>();
     String palavras[]= texto.split(" ");
   
    for(String palavra: palavras){
       String palavraMinuscula= palavra.toLowerCase();
        if(mapa.containsKey(palavra)){
       
            int qtd= mapa.get(palavraMinuscula);
            mapa.put(palavraMinuscula, qtd+1);
        }else{
            mapa.put(palavraMinuscula,1);
        }
        //System.out.println(palavraMinuscula);


    }
    for(String palavra: mapa.keySet()){
        System.out.println(palavra+ " " + mapa.get(palavra));
    }
}
}
