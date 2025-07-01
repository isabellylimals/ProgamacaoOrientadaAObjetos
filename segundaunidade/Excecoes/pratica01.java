package segundaunidade.Excecoes;


public class pratica01 {
    public static void main(String[] args) {
        int respostas[] =  {0,1,3,2,5,1,2,2,3,9};
    int contador[]= new int[6];
    for(int i=0; i<contador.length; i++){
contador[i] = 0;
    }

    for (int resp:respostas){
       
        try { contador[resp]++;
            
        } catch (Exception e) {
            System.out.println("Resposta inválida: " + resp);
        }
    }


    for (int j=0; j<contador.length; j++){
        System.out.println("A resposta " + j + " foi escolhida " + contador[j] + " vezes.");
    }
}}
