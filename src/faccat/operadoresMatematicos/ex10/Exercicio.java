package faccat.operadoresMatematicos.ex10;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Custo de fábrica:");
        float custoFabrica = sc.nextFloat();
        System.out.println("Percentual do distribuidor: ");
        float percentualDistribuidor = 28f;
        System.out.println("Percentual de impostos: ");
        float percentualImpostos = 45f;

        float custoFinal = custoFabrica + (custoFabrica * percentualDistribuidor / 100) + (custoFabrica * percentualImpostos / 100);
        System.out.printf("Custo final do carro: R$ %.2f%n", custoFinal);
        sc.close();
    }
}
