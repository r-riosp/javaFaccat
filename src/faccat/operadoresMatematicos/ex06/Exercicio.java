package faccat.operadoresMatematicos.ex06;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cálculo da área de um retângulo!");
        System.out.print("Digite o primeiro número: ");
        int base = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int altura = sc.nextInt();
        int area = (base * altura);
        System.out.printf("A área do retângulo é: %d%n", area);
    }
}
