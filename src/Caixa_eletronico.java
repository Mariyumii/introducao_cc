import java.util.Scanner;

public class Caixa_eletronico {
    public static void main(String[] args) {
        int valor;

        int nota100, nota50, nota20, nota10, nota5, nota2;

        Scanner leia = new Scanner(System.in);
        System.out.println ("Digite o valor que voce deseja sacar");
        valor = leia.nextInt();

      nota100 =  valor/100;
      nota50 = (valor%100)/50;
      nota20 = ((valor%100)%50)/20;
      nota10 = (((valor%100)%50)%20)/10;
      nota5 = ((((valor%100)%50)%20)%10)/5;
      nota2 = (((((valor%100)%50)%20)%10)%5)/2;

        System.out.println ((nota100) + " notas de 100.");
        System.out.println ((nota50) + " notas de 50.");
        System.out.println ((nota20) + " notas de 20.");
        System.out.println ((nota10) + " notas de 10.");
        System.out.println ((nota5) + " notas de 5.");
        System.out.println ((nota2) + " notas de 2.");
    }


}
