package faccat.selecaoAninhadaOuConcatenada.ex37;

import java.util.Scanner;

public class Exercicio {
    /**
     * Enunciado:
     * Uma fruteira está vendendo frutas com a seguinte tabela de preços:
     * Morango: Até 5 Kg, R$2,50 por kg; acima de 5 kg, R$2,20 por kg;
     * Maçã: Até 5 kg, R$1,80 por kg; acima de 5 kg, R$1,50 por kg.
     * Se o cliente comprar mais de 8 kg em frutas ou o valor total da compra ultrapassar R$25,00, receberá
     * ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em kg) de
     * morangos e a quantidade (em kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade (em kg) de morangos comprados:");
        int quantidadeMorango = sc.nextInt();
        System.out.println("Digite a quantidade (em kg) de maçãs compradas:");
        int quantidadeMaca = sc.nextInt();

        float precoMorango = quantidadeMorango > 5 ? 2.2f * quantidadeMorango : 2.5f * quantidadeMorango;
        float precoMaca = quantidadeMaca > 5 ? 1.5f * quantidadeMaca : 1.8f * quantidadeMaca;

        float valorTotal = precoMorango + precoMaca;
        valorTotal = (quantidadeMorango + quantidadeMaca) > 8 || valorTotal > 25.0f ? valorTotal * 0.9f : valorTotal;

        System.out.printf("O valor total da compra foi: %.2f", valorTotal);
        sc.close();
    }
}
