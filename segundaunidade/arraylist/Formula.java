package segundaunidade.arraylist;

public class Formula {
    // Declare the array as a static field
    private static final double termosDaSerie[] = new double[100000000];

    public static void main(String[] args) {
        for (int i = 0; i < termosDaSerie.length; i++) {
            termosDaSerie[i] = 1 / Math.pow(i + 1, 2);
        }
        for (int num = 10; num < 100000000; num *= 10) {
            calculoEMostraSomatoria(termosDaSerie, num);
        }
        System.out.println(Math.pow(Math.PI, 2) / 6);
        // calculoEMostraSomatoria(termosDaSerie, 100000000);
    }

    public static void calculoEMostraSomatoria(double array[], int num) {
        double soma = 0.0;
        for (int i = 0; i < num; i++) {
            soma += array[i];
        }
        System.out.println("A soma dos primeiros " + num + " termos é: " + soma);
    }
}

