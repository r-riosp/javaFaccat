package faccat.operadoresRelacionais.ex26;

import java.util.Scanner;

public class Exercicio {
    // Enunciado:
    /*
    Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
    quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
    média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
    à quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
    compra'.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade atual em estoque: ");
        int quantidade = sc.nextInt();
        System.out.print("Capacidade máxima do estoque: ");
        int capacidadeMaxima = sc.nextInt();
        System.out.print("Capacidade mínima do estoque: ");
        int capacidadeMinima = sc.nextInt();

        float media = (capacidadeMaxima + capacidadeMinima) / 2f; // Usando 2f para garantir que a divisão seja feita em ponto flutuante
        System.out.printf("Quantidade média: %.2f%n", media);
        System.out.printf("Quantidade atual: %d%n", quantidade);

        if (quantidade < media) {
            System.out.println("Está quase acabando. Necessário efetuar compra!");
        } else {
            System.out.println("Está numa quantidade boa. Não precisa efetuar compra.");
        }
        sc.close();
    }
}
