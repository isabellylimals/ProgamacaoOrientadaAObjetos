// Escrevaumprogramaquerecebeumvalorinteirorepresentandoumintervalo emminutos
// e imprime o equivalente a esse período expresso em valores inteiros para dias, horas e
// minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos

package Lista1.Questao6;

import java.util.Scanner;

public class Minutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutosTotal;
        
        int contadordeDias=0;
       int contadorHoras=0;
        System.out.print("Insira o valor em minutos: ");
        minutosTotal = sc.nextInt();
        int minutosVar= minutosTotal;
        if(minutosVar>1440){
            while(minutosVar>1440){
                minutosVar-= 1440;
                contadordeDias++;
                
            } }
            if(minutosVar>=60){
                while(minutosVar>=60){
                    minutosVar-=60;
                    contadorHoras++;
                }
    
            }
            
            System.out.println(minutosTotal + " minutos= " + contadordeDias + " dias " + contadorHoras + " horas " + minutosVar +  " minutos");
        }}
        //sc.close();

    

//1440 min/ 1 dia
