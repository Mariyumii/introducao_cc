import java.util.Scanner;

public class Atividade_1 {
    public static void main(String[] args) {
        float limite, valor;
        String produto;
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o limite do cartão que será utilizado nas compras:");
        limite = leia.nextFloat();

        while (limite < 1) {
            System.out.println("O valor inserido é inválido, tente outro valor");
            System.out.println("Informe o limite do cartão que será utilizado nas compras:");
            limite = leia.nextInt();
        }

        while (true) {

                System.out.println("Informe o que deseja comprar:");
                System.out.println("Caso queira encerrar a compra digite 'fim' ");
               produto = leia.next();

            if(produto.equalsIgnoreCase("fim")) {
                break;
            }

                System.out.println("Informe o valor de " + produto);
                valor = leia.nextFloat();
                if (valor > limite) {
                    System.out.println("O valor é maior que o limite disponível");
                } else {
                    limite = limite - valor;
                    System.out.println("Seu limite restante é de: " + (limite - valor));
                }


              }
            System.out.println("Seu saldo final é de:" + limite);
        }

    }









