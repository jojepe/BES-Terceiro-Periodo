import java.util.Scanner;
public class pjbl2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de b: ");
        double b = scanner.nextDouble();

        if (a <= b) {
            System.out.println("Digite o número de subintervalos: ");
            int n = scanner.nextInt();

            if (n > 0) {
                double area_total = 0;
                double x = a;
                double h = (b - a) / n;
                double y1 = f(x);
                int i = 0;

                while (i < n) {
                    x = x + h;
                    double y2 = f(x);
                    double area_trapezio = ((y1 + y2) / 2) * h;
                    area_total = area_total + area_trapezio;
                    y1 = y2;
                    i = i + 1;
                }

                System.out.println("A área total é: " + area_total);
            } else {
                System.out.println("Erro: o valor de n deve ser maior que zero");
            }
        } else {
            System.out.println("Erro: valor de a deve ser menor ou igual ao valor de b");
        }

        scanner.close();
    }

    private static double f(double x) {
        // aqui você pode colocar a função que deseja calcular a área sob a curva
        return x * x;
    }
}
