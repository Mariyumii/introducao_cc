import java.util.Scanner;

public class primeiro_algoritmo {
    public static void main(String[] args) {
        float  nota1, nota2, nota3, nota4,media;
        String aluno;

        nota1 = 0;

        Scanner loud = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        aluno = loud.next();
        System.out.println(aluno);


        System.out.println("Informe a nota 1(deve estar no intervalo de 0 a 10):");
        while(nota1 < 0 || nota1 > 10){
            System.out.println("Informe a nota 1(deve estar no intervalo de 0 e 10):");
            nota1 = loud.nextFloat();

        }

        System.out.println("Informe a nota 2:");
        nota2 =loud.nextFloat();
        System.out.println("A nota 2 é igual a: " + nota2);

        System.out.println("Informe a nota 3:");
        nota3 =loud.nextFloat();
        System.out.println("A nota 3 é igual a: " + nota3);

        System.out.println("Informe a nota 4:");
        nota4 =loud.nextFloat();
        System.out.println("A nota 4 é igual a: " + nota4);

        media = (nota1+nota2+nota3+nota4)/4;
        if(media >= 7){
            System.out.println(aluno + " foi aprovado.Sua média foi: "+ media + "." );
        } else {
            System.out.println(aluno + " foi reprovado.Sua média foi: "+ media + ".");
        }
    }
}
