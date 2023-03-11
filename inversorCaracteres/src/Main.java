import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String entrada = sc.nextLine();
        String entradaInvertida="";

        for(int i = entrada.length(); i >= 0 ;i--){
            entradaInvertida += entrada.charAt(i);
        }

        System.out.println("String Original: " + entrada);
        System.out.println("String invertida: " + entradaInvertida);
    }
}