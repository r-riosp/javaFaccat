package faccat.operadoresLogicos.ex40;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nome = sc.next();
        System.out.print("Digite a quantidade comprada: ");
        int quantidade = sc.nextInt();
        System.out.print("Digite o preço unitário do produto: ");
        double precoUnitario = sc.nextFloat();
        sc.close();
        double total = quantidade * precoUnitario;

        double desconto = quantidade < 6 ? 0.98 : quantidade > 5 && quantidade < 11 ? 0.97 : 0.95;

        double totalPagar = total * desconto;

        System.out.printf("O total a pagar pelo produto %s é: R$%.2f%n", nome, totalPagar);
    }
}