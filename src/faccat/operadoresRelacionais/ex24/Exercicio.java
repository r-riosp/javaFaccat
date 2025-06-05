package faccat.operadoresRelacionais.ex24;

import java.util.Scanner;

public class Exercicio {
    // Enunciado:
    /*
    Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
    ele recebe uma comissão de 3% sobre o total das vendas até R$1.500,00 mais 5% sobre o que
    ultrapassar este valor, calcular e escrever o seu salário total.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário fixo do vendedor:");
        float salarioFixo = sc.nextFloat();
        System.out.println("Digite o valor das vendas efetuadas pelo vendedor:");
        float valorVendas = sc.nextFloat();
        double comissaoTotal = valorVendas < 1501 ? valorVendas * 1.03 : 1500 * 1.03 + (valorVendas - 1500) * 1.05;
        double salarioTotal = salarioFixo + comissaoTotal;
        System.out.printf("O salário total é: %.2f%n", salarioTotal);
        sc.close();
    }
}