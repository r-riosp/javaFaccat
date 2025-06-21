package faccat.operadoresLogicos.ex43;

import java.util.Scanner;

/**
 * Exemplos de saída do exercício:
 * <ul>
 *   <li>A = 1, B = 2, C = 3 &rarr; Não foi possível formar um triângulo.</li>
 *   <li>A = 3, B = 4, C = 5 &rarr; Triângulo escaleno.</li>
 *   <li>A = 2, B = 2, C = 4 &rarr; Não foi possível formar um triângulo.</li>
 *   <li>A = 4, B = 4, C = 4 &rarr; Triângulo equilátero.</li>
 *   <li>A = 5, B = 3, C = 3 &rarr; Triângulo isósceles.</li>
 * </ul>
 */

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três valores separados por um espaço: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            if (a == b && b == c) {
                System.out.println("Triângulo equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triângulo isósceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }
        } else {
            System.out.println("Não foi possível formar um triângulo.");
        }
    }
}
