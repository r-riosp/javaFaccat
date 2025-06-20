package faccat.selecaoAninhadaOuConcatenada.ex28;

import java.util.Scanner;

public class Exercicio {
    // Enunciado:
    /*
     Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int valor2 = sc.nextInt();
        System.out.println("Digite o terceiro valor:");
        int valor3 = sc.nextInt();
        // Por enquanto, não serão utilizados operadores lógicos, apenas condicionais aninhadas.
        if (valor1 > valor2) {
            if (valor1 > valor3) {
                System.out.printf("O maior valor é %d%n", valor1);
            } else {
                System.out.printf("O maior valor é %d%n", valor3);
            }
        } else if (valor2 > valor3) {
            System.out.printf("O maior valor é %d%n", valor2);
        } else {
            System.out.printf("O maior valor é %d%n", valor3);
        }


        sc.close();
    }
}
