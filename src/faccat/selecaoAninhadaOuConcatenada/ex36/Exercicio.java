package faccat.selecaoAninhadaOuConcatenada.ex36;

import java.util.Scanner;

public class Exercicio {
    /**
     * Enunciado:
     * <p>
     * Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades
     * dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma
     * das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais
     * novo com a mulher mais velha.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade do primeiro homem:");
        int idadeHomem1 = sc.nextInt();
        System.out.println("Digite a idade do segundo homem:");
        int idadeHomem2 = sc.nextInt();
        System.out.println("Digite a idade da primeira mulher:");
        int idadeMulher1 = sc.nextInt();
        System.out.println("Digite a idade da segunda mulher:");
        int idadeMulher2 = sc.nextInt();
        int somaIdades = 0;
        int produtoIdades = 0;

        if (idadeHomem1 > idadeHomem2 && idadeMulher1 > idadeMulher2) {
            somaIdades = idadeHomem1 + idadeMulher2;
            produtoIdades = idadeHomem2 * idadeMulher1;
        } else if (idadeHomem1 < idadeHomem2 && idadeMulher1 > idadeMulher2) {
            somaIdades = idadeHomem2 + idadeMulher2;
            produtoIdades = idadeHomem1 * idadeMulher1;
        } else if (idadeHomem1 > idadeHomem2 && idadeMulher1 < idadeMulher2) {
            somaIdades = idadeHomem1 + idadeMulher1;
            produtoIdades = idadeHomem2 * idadeMulher2;
        } else if (idadeHomem1 < idadeHomem2 && idadeMulher1 < idadeMulher2) {
            somaIdades = idadeHomem2 + idadeMulher1;
            produtoIdades = idadeHomem1 * idadeMulher2;
        } else {
            // Caso não haja diferença entre as idades, o que não deve acontecer segundo o enunciado
            System.out.println("As idades dos homens ou das mulheres não devem ser iguais.");
            return;
        }
        sc.close();

        System.out.printf("A soma das idades do homem mais velho com a mulher mais nova é %d%n", somaIdades);
        System.out.printf("O produto das idades do homem mais novo com a mulher mais velha é %d%n", produtoIdades);
    }
}
