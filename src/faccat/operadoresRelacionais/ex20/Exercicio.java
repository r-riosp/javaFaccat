package faccat.operadoresRelacionais.ex20;

import java.util.Scanner;

public class Exercicio {
    // Enunciado:
    // Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = sc.nextInt();
        if (valor1 < valor2) {
            System.out.printf("Ordem crescente: %d, %d%n", valor1, valor2);
        } else {
            System.out.printf("Ordem crescente: %d, %d%n", valor2, valor1);
        }
        sc.close();
    }
}