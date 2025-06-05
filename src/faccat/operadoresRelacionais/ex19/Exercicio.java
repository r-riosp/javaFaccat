package faccat.operadoresRelacionais.ex19;

import java.util.Scanner;

public class Exercicio {
    // Enunciado:
    // Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.printf("O maior valor é: %d%n", valor1);
        } else {
            System.out.printf("O maior valor é: %d%n", valor2);
        }
        sc.close();
    }
}
