import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int numero;
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe qual número você deseja saber de fibonnaci:");
        numero = leia.nextInt();

        System.out.print("O número de fibonnaci é: " + fibonnaci(numero));
    }

    public static int fibonnaci(int numero) {
        if (numero <= 1) {
            return numero;
        } return fibonnaci(numero-1) + (numero-2);

    }

}
