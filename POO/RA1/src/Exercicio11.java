import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = 0;

        do {
            System.out.print("Digite a quantidade de números: ");
            N = input.nextInt();
        }
        while (N < 1);

        float[] num = new float[N];
        for (int i = 0; i < N; i++)
        {
            System.out.print("Digite um número real: ");
            float x = input.nextFloat();
            num[i] = x;
        }

        float numTemp;

        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num.length-1-i; j++) {
                if (num[j] > num[j+1]) {
                    numTemp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = numTemp;
                }
            }
        }

        System.out.println("Array ordenado:");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
