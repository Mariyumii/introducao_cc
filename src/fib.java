import java.util.Scanner;

public class fib {

    public static void main(String[] args) {

        int n, fibn, fibn1 = 1, fibn2 = 0, cont=2;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Informe um valor de n para o cálculo do fibonacci. O valor de n deve ser inteiro e posistivo.");
            n = scanner.nextInt();
        } while(n < 0);

        do{
            if(n == 0 || n == 1){
                fibn = n;
                break;
            } else {
                fibn = fibn1 + fibn2;
                fibn2 = fibn1;
                fibn1 = fibn;
                cont++;
            }
        } while (cont < n);
            System.out.println("O fibonacci de " + n + " é igual a: " + fibn);
    }
}
