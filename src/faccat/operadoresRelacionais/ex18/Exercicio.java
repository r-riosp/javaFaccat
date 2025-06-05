package faccat.operadoresRelacionais.ex18;

import java.util.Scanner;

public class Exercicio {
    // Enunciado:
    // Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
    //poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano atual: ");
        int anoAtual = sc.nextInt();
        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        sc.close();
        int idade = anoAtual - anoNascimento;
        if (idade >= 16) {
            System.out.printf("Como você já tem %d anos de idade, já pode votar!%n", idade);
        } else {
            System.out.println("Você é novo demais para votar. Volte quando fizer 16 anos!");
        }
    }
}
