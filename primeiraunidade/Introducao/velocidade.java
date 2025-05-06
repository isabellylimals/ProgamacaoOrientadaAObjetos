package primeiraunidade;

import java.text.DecimalFormat;

public class velocidade {
    public static void main(String[] args) {
        double kmPorHora = 0.0;
        double mps, mph, pps;

        System.out.println("k/h\tm/s\tm/h\tp/s");
        System.out.println("------------------------------");

        while (kmPorHora <= 50) {
            mps = kmPorHora * 0.2778;
            //System.out.println(kmPorHora + "\t" + mps);
            System.out.print(new DecimalFormat("00.00").format(kmPorHora) + "\t");
            //if(kmPorHora<10){
                //System.out.print("0");
               // System.out.printf("%.2f\t", kmPorHora);
            //}
            System.out.print(new DecimalFormat("00.00").format(mps)+ "\t");

            mph = kmPorHora * 0.6214;
            System.out.print(new DecimalFormat("00.00").format(mph)+ "\t");
            pps = kmPorHora * 0.9113;
            System.out.println(new DecimalFormat("00.00").format(pps)+ "\t");

           // System.out.printf("%-10.1f %-10.4f %-10.4f %-10.4f%n", kmPorHora, mps, mph, pps);
            kmPorHora += 0.5;
        }
    }
}