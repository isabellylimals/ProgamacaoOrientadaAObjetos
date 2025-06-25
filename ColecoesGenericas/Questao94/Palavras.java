package ColecoesGenericas.Questao94;

import java.util.Map;
import java.util.TreeMap;

public class Palavras {
    public static void main(String[] args) {
        String frase = "HELLO THERE";
        TreeMap<Character, Integer> contagem = new TreeMap<>();

        for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)) { 
                c = Character.toUpperCase(c);
                contagem.put(c, contagem.getOrDefault(c, 0) + 1);
            }
        }

    
        for (Map.Entry<Character, Integer> entry : contagem.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
