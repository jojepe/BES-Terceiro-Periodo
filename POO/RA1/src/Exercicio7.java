import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite x: ");
        float x = teclado.nextFloat();
        System.out.print("Digite y: ");
        float y = teclado.nextFloat();
        System.out.print("Digite z: ");
        float z = teclado.nextFloat();

        float a = 0, b = 0, c = 0;

        /*
        ArrayList<Float> num = new ArrayList<Float>();
        num.add(x);
        num.add(y);
        num.add(z);

        int times = num.size();

        for(int j = 0; j < times; j++){
            float selectedNumber = Float.MIN_VALUE;

            for(int i = 0; i < num.size(); i++){
                System.out.println("num get - " + num.get(i));
                if(selectedNumber < num.get(i)){
                    selectedNumber = num.get(i);
                    num.remove(i);
                }
            }
            switch(j){
                case 0: c = selectedNumber; break;
                case 1: b = selectedNumber; break;
                case 2: a = selectedNumber; break;
            }
        }
        */

        if(x > y && x > z){
            a = y;
            b = z;
            c = x;
            if(y > z){
                b = y;
                a = z;
            }
        } else if (z > y && z > x) {
            a = x;
            b = y;
            c = z;
            if(x > y){
                a = y;
                b = x;
            }
        } else if (y > z && y > x) {
            a = x;
            b = z;
            c = y;
            if(x > z){
                a = z;
                b = x;
            }
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}