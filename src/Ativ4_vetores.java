import java.util.Scanner;

public class Ativ4_vetores {


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.print("Digite o valor do vetor:");
        int tamanho = leia.nextInt();
        while(tamanho <= 0){
            System.out.println("Valor inválido, insira um valor maior que 0!");
            System.out.print("Digite o valor do vetor:");
            tamanho = leia.nextInt();
        }

        int[] vetor = new int[tamanho];

        int posic1;
        for(posic1 = 0; posic1 < tamanho; ++posic1) {
            System.out.print("Vetor[" + posic1 + "]: ");
            vetor[posic1] = leia.nextInt();
            soma += vetor[posic1];
            if (vetor[posic1] > maior) {
                maior = vetor[posic1];
            }

            if (vetor[posic1] < menor) {
                menor = vetor[posic1];
            }
        }

        System.out.println("Soma:" + soma);
        float media = (float)soma / (float)tamanho;
        System.out.println("Media:" + media);
        System.out.println("Maior:" + maior);
        System.out.println("Menor:" + menor);
        System.out.print("Escolha a primeira posição que deseja substituir do vetor: ");

        for(posic1 = leia.nextInt(); posic1 < 0 || posic1 >= tamanho; posic1 = leia.nextInt()) {
            System.out.println("Posição inválida!!!!!!!!!!");
            System.out.print("Escolha a primeira posição que deseja substituir do vetor: ");
        }

        System.out.print("Escolha a segunda posição que deseja substituir do vetor: ");

        int posic2;
        for(posic2 = leia.nextInt(); posic2 < 0 || posic2 >= tamanho; posic2 = leia.nextInt()) {
            System.out.println("Posição inválida!!!!!!!!!!");
            System.out.print("Escolha a segunda posição que deseja substituir do vetor: ");
        }

        System.out.print("Por qual valor deseja substituir o vetor[" + posic1 + "]? ");
        vetor[posic1] = leia.nextInt();
        System.out.print("Por qual valor deseja substituir o vetor[" + posic2 + "]? ");
        vetor[posic2] = leia.nextInt();
        int soma2 = 0;

        for(int i = 0; i < tamanho; ++i) {
            soma2 += vetor[i];
        }

        System.out.println("Soma 2: " + soma2);
        float media2 = (float)soma2 / (float)tamanho;
        System.out.println("Média 2: " + media2);
    }
}


