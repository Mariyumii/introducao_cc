import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int i, numero, resultado;
        String nome;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        nome = scanner.next();

        System.out.println(nome + ", favor informe um número para cálculo de tabuada:");
        numero = scanner.nextInt();

        System.out.println(nome + "faremos o cálculo da tabuada do número: "+ numero);
        //         i = 0;
//        while (i <= 10){
//            resultado = i+numero;
//            System.out.println(i + " x " + numero + " = " + resultado);
//            i = i + 1;/*i++; */
//          }

 //       for (i = 0; i <= 10; i++){
 //           resultado = i+numero;
 //           System.out.println(i + " x " + numero + " = " + resultado);
 //       }

        i = 0;
        do{
            resultado = i + numero;
            System.out.println(i + " x " + numero + " = " + resultado);
            i++;
        } while (i <= 10);
    }
}
