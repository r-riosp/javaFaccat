package faccat.selecaoAninhadaOuConcatenada.ex29;

import java.util.Scanner;

public class Exercicio {
    // Enunciado:
    /*
    Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2
maiores.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int valor2 = sc.nextInt();
        System.out.println("Digite o terceiro valor:");
        int valor3 = sc.nextInt();
        int resultado = getResultado(valor1, valor2, valor3);
        sc.close();
        System.out.printf("A soma dos dois maiores valores é %d%n", resultado);
    }

    private static int getResultado(int valor1, int valor2, int valor3) {
        int resultado = 0;
        // Determinando o maior e o segundo maior valor
        if (valor1 > valor2) {
            if (valor2 > valor3) {
                resultado = valor1 + valor2;
            } else {
                resultado = valor1 + valor3;
            }
        } else if (valor2 > valor1) {
            if (valor1 > valor3) {
                resultado = valor2 + valor1;
            } else {
                resultado = valor2 + valor3;
            }
        } else if (valor3 > valor1) {
            resultado = valor3 + valor2;
        } else {
            resultado = valor3 + valor1;
        }
        return resultado;
    }
}
