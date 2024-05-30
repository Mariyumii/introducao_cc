import java.util.Scanner;

public class Fibonacci_piramide {

    public static void main(String[] args) {

        int n, fibn, fibn1 = 1, fibn2 = 0, cont=0, cont2;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Informe um valor de n para o cálculo do fibonacci. O valor de n deve ser inteiro e posistivo.");
            n = scanner.nextInt();
        } while(n < 0);

        do{// Referente a construção das linhas da pirâmide
            cont2 = 0; //cont2 vai ser o n do fibonacci a ser calculado
            do{// Cálculo do fibonacci referente a linha da pirâmide
                if (cont == 0){
                    System.out.print(0 + " ");
                } else if (cont2 ==1) {
                    System.out.print(1 + " ");
                } else {
                    fibn = fibn1 + fibn2;
                    fibn2 = fibn1;
                    fibn1 = fibn;
                    cont2--;
                    System.out.println(fibn + " ");
                }
                cont2++;
            }while(cont2 <= cont);
            System.out.println();
            cont2++;

        } while (cont < n);

    }
}


