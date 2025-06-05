package faccat.operadoresRelacionais.ex16;

import java.util.Scanner;

public class Exercicio {
    // Enunciado:
    //As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
    //compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
    //escreva o custo total da compra.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de maçãs compradas: ");
        int numeroMacas = sc.nextInt();
        sc.close();
        double custoTotal = (numeroMacas < 12) ? numeroMacas * 1.30 : numeroMacas * 1.00;
        System.out.printf("Custo total da compra: R$ %.2f%n", custoTotal);
    }
}