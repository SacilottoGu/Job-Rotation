import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Informe um número inteiro positivo: ");
        num = sc.nextInt();

        boolean pertence = fibonacci(num);

        System.out.println(pertence ? num + " pertence á seguencia de fibonacci."
                                    : num + " não pertence á sequencia de Fibonacci.");
    }

    public static boolean fibonacci(int num){

        int a = 0, b = 1, c;

        if (num == 0 || num == 1) {
            return true;
        }else {
            while(b < num){
                c = a + b;
                a = b;
                b = c;
            }
            if (b == num) return true;
            else return false;
        }

    }
}

