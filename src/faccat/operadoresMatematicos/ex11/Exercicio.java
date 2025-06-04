package faccat.operadoresMatematicos.ex11;

import java.util.Scanner;

public class Exercicio {
    // Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
    //mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
    //efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
    //vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
    //vendedor.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de carros vendidos: ");
        int numeroCarros = sc.nextInt();
        System.out.println("Digite o valor total das vendas: ");
        double valorVendas = sc.nextDouble();
        System.out.println("Digite o salário fixo do vendedor: ");
        double salarioFixo = sc.nextDouble();
        System.out.println("Digite o valor da comissão por carro vendido: ");
        double comissaoPorCarro = sc.nextDouble();
        sc.close();

        double salarioFinal = salarioFixo + numeroCarros * comissaoPorCarro + valorVendas * 0.05;
        System.out.printf("Salário final do vendedor: R$ %.2f%n", salarioFinal);
    }
}
