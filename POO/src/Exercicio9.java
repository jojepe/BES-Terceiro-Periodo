import java.util.Scanner;
public class Exercicio9 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] temperaturas = new int[10];

        for (int i = 0; i < 10; i++)
        {
            System.out.printf("Digite a %dº temperatura: ", i+1);
            temperaturas[i] = input.nextInt();
        }

        boolean end = true;

        while(end){

            System.out.print("Digite um número para procurar: ");
            int chave = input.nextInt();

            for (int j = 0; j < temperaturas.length; j++){
                if(chave == temperaturas[j]){
                    System.out.printf("A temperatura %d digitada foi encontrada no índice %d \n", temperaturas[j], j);
                    end = false;
                }
            }

            if(end) System.out.println("A temperatura digitada não foi encontrada!");

        }

        /*

        int j = 0;
        boolean end = false;

        while(chave != temperaturas[j] || end){
            if(j < temperaturas.length - 1){
                j++;
            } else {
                System.out.println("A temperatura inserida não pertence ao valor de temperaturas");
                chave = temperaturas[j];
                end = true;
            }
        }

        if(!end){
        System.out.printf("O valor foi encontrado e está no índice %d", j);
        }

         */
    }

}
