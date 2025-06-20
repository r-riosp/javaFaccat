package faccat.selecaoAninhadaOuConcatenada.ex27;

import java.util.Scanner;

public class Exercicio {
    // Enunciado:
    /*
    Ler um valor e escrever se é positivo, negativo ou zero.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int valor = sc.nextInt();
        if (valor > 0) {
            System.out.println("O valor é positivo.");
        } else if (valor < 0) {
            System.out.println("O valor é negativo.");
        } else {
            System.out.println("O valor é zero.");
        }
        sc.close();
    }
}
