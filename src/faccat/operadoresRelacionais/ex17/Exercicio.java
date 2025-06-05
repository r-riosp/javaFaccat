package faccat.operadoresRelacionais.ex17;

import java.util.Scanner;

public class Exercicio {
    // Enunciado:
    //  Ler as notas da primeira e segunda avaliações de um aluno. Calcular a média aritmética simples e escrever
    //uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
    //aluno é aprovado). Escrever também a média calculada.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota da primeira avaliação: ");
        float nota1 = sc.nextFloat();
        System.out.println("Digite a nota da primeira avaliação: ");
        float nota2 = sc.nextFloat();
        float media = (nota1 + nota2) / 2;
        sc.close();
        if (media < 6) {
            System.out.printf("Aluno reprovado. Não desista!%nMédia: %.1f%n", media);
        } else {
            System.out.printf("Aluno aprovado. Parabéns!%nMédia: %.1f%n", media);
        }
    }
}
