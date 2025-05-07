// O mês de fevereiro de 2015 começou em um domingo. Escreva um programa que, dado
// o número de um dia do mês de fevereiro de 2015 (um valor entre 1 e 28), imprime o dia
// da semana correspondente.
// • Exemplo de entrada: 10
// • Exemplo de saída: O dia 10 será uma terça-feira

package Lista1.Questao12;

import java.util.Scanner;

public class Fevereiro {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int diaCorrespondente;
        do {
            System.out.print("Informe um dia do mês de fevereiro de 2015 (entre 1 e 28): ");
            diaCorrespondente = sc.nextInt();
            if (diaCorrespondente < 1 || diaCorrespondente > 28) {
                System.out.println("Erro: Apenas valores entre 1 e 28 são permitidos.");
            }
              } while (diaCorrespondente < 1 || diaCorrespondente > 28);
        
            if(diaCorrespondente==8 || diaCorrespondente ==15 || diaCorrespondente== 22){
                System.out.println("é domingo");

            }
            if(diaCorrespondente==2 || diaCorrespondente ==9 || diaCorrespondente ==16 || diaCorrespondente==23){
                System.out.println("é segunda");
            }
            if(diaCorrespondente==3|| diaCorrespondente==10|| diaCorrespondente==17|| diaCorrespondente==24){
                System.out.println("é terça-feira");
            }
            if(diaCorrespondente==4|| diaCorrespondente==11||diaCorrespondente==18||diaCorrespondente==25){
                System.out.println("é quarta-feira");
            }
            if(diaCorrespondente==5|| diaCorrespondente==12|| diaCorrespondente==19||diaCorrespondente==26){
                System.out.println("é quinta-feira");
            }
            if(diaCorrespondente==6|| diaCorrespondente==13||diaCorrespondente==20||diaCorrespondente==27){
                System.out.println("é sexta-feira");
            }
            if(diaCorrespondente==7||diaCorrespondente==14||diaCorrespondente==21||diaCorrespondente==28){
                System.out.println("Its Sartuday");
            }

            sc.close();
        }

       

        
     
    }
