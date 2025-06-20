package faccat.operadoresLogicos.ex41;

import java.util.Scanner;

public class Exercicio {
    /**
     * Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos
     * exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo
     * e escrever o conceito do aluno conforme a tabela de conceitos mais abaixo:
     * Média de Aproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + média dos exercícios) / 7
     * * Conceito:
     * * A = média >= 9
     * * B = média >= 7.5 e < 9
     * * C = média >= 6 e < 7.5
     * * D = média < 6
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Cálculo de Média de Aproveitamento ===");
        System.out.println("Digite a primeira nota: ");
        float nota1 = sc.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = sc.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float nota3 = sc.nextFloat();
        System.out.println("Digite a média de exercícios: ");
        float mediaExercicios = sc.nextFloat();

        float mediaFinal = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;

        System.out.printf("Sua média final foi: %.2f%n", mediaFinal);
        sc.close();

        char conceito = mediaFinal >= 9 ? 'A' : mediaFinal > 7.5 && mediaFinal < 9 ? 'B' : mediaFinal >= 6 && mediaFinal < 7.5 ? 'C' : mediaFinal < 6 ? 'D' : ' ';

    }
}
