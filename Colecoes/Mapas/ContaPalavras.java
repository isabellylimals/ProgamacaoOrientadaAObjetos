package Colecoes.Mapas;
import java.util.TreeMap;
public class ContaPalavras {
public static void main(String[] args) {
    String texto ="Três irmãos viajando por uma estrada solitária e sinuosa ao entardecer chegaram a um rio profundo e traiçoeiro onde qualquer um que tentasse nadar ou vadear se afogaria";
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
