package segundaunidade.arraylist.Tabuleiro;
public class Tabuleiro {
    private char tabuleiro[][];
    private static final int LINHAS = 8;
    private static final int COLUNAS = 8;

    public Tabuleiro() {
        tabuleiro = new char[LINHAS][COLUNAS];
     
    
        for (int l = 0; l < tabuleiro.length; l++) {
            for (int c = 0; c < tabuleiro[l].length; c++) {
                tabuleiro[l][c] = '.';
            }
        }
       for (int l=0; l<=2;l++) {
            for(int c=l%2;c<tabuleiro[l].length; c+=2){
                tabuleiro[l][c] = 'O'; 
            }
            
        }


        for (int l=5; l<tabuleiro.length;l++) {
            for(int c=l%2;c<tabuleiro[l].length; c+=2){
                tabuleiro[l][c] = 'X'; 
            }
            
        }
    }


    public String toString(){
        String rep = "";
        for (int l = 0; l < tabuleiro.length; l++) {
            for (int c = 0; c < tabuleiro[l].length; c++) {
                rep += tabuleiro[l][c] + "  ";
            }
            rep += "\n";
        }
        return rep;
    }

}