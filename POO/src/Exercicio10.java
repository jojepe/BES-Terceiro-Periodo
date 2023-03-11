import java.util.Scanner;
public class Exercicio10 {
// max e min do vetor
    public static void main(String args[])
    {

        Scanner input = new Scanner(System.in);
        int N = 0;

        do {
            System.out.print("Digite a quantidade de números: ");
            N = input.nextInt();
        }
        while (N < 1);

        float[] numeros = new float[N];
        for (int i = 0; i < N; i++)
        {
            System.out.print("Digite um número real: ");
            float x = input.nextFloat();
            numeros[i] = x;
        }

        float nMax = Float.MIN_VALUE;
        float nMin = Float.MAX_VALUE;

        for(int j = 0; j < numeros.length; j++){
            if(numeros[j] > nMax) nMax = numeros[j];
            if(numeros[j] < nMin) nMin = numeros[j];
        }
        System.out.printf("O maior número é %.2f e o menor %.2f", nMax, nMin);
    }
}
