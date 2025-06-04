package faccat.operadoresMatematicos.ex13;

import java.util.Scanner;

public class Exercicio {
    // Enunciado:
    //Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
    //Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
    //final é:
    //                  n1 * 2 + n2 * 3 + n3 * 5
    // mediafinal = -----------------------------------
    //                              10

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float nota1 = sc.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = sc.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float nota3 = sc.nextFloat();
        float mediaFinal = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
        System.out.printf("A média final do aluno é: %.1f%n", mediaFinal);
        sc.close();
    }
}