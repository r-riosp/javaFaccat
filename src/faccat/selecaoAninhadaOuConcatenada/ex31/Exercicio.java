package faccat.selecaoAninhadaOuConcatenada.ex31;

import java.util.Scanner;

public class Exercicio {
    // Ler três valores inteiros e verificar se eles podem ser os lados de um triângulo.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Verificador de lados de triângulo");
        System.out.print("Digite o lado A: ");
        int ladoA = sc.nextInt();
        System.out.print("Digite o lado B: ");
        int ladoB = sc.nextInt();
        System.out.print("Digite o lado C: ");
        int ladoC = sc.nextInt();
        
        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            System.out.println("Os valores podem ser os lados de um triângulo.");
        } else {
            System.out.println("Os valores não podem ser os lados de um triângulo.");
        }
    }
}
