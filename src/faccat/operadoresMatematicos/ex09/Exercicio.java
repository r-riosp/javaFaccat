package faccat.operadoresMatematicos.ex09;

import java.util.Scanner;

public class Exercicio {
    // Exemplo de código para o exercício 09
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIO 09 ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do salário: ");
        double salario = sc.nextDouble();
        System.out.print("Digite o valor do aumento (em porcentagem): ");
        double aumento = sc.nextDouble();
        sc.close();
        double novoSalario = salario + (salario * aumento / 100);
        System.out.printf("O novo salário é: R$ %.2f%n", novoSalario);
        System.out.printf("O aumento foi de: R$ %.2f%n", (novoSalario - salario));
    }
}
