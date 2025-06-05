package faccat.operadoresRelacionais.ex25;

import java.util.Scanner;

public class Exercicio {
    // Enunciado:
    /*
    Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
    escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
    ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Sistema de Controle de Conta ===");
        System.out.print("Número da conta do cliente: ");
        long numContaCliente = sc.nextInt();
        System.out.printf("Saldo da conta %d: ", numContaCliente);
        double saldo = sc.nextFloat();
        System.out.print("Débito: ");
        double debito = sc.nextFloat();
        System.out.print("Crédito: ");
        double credito = sc.nextFloat();
        System.out.println("=== Resultado da Operação ===");
        System.out.printf("Saldo Anterior: %.2f%n", saldo);
        // Calcula o novo saldo subtraindo débitos e adicionando créditos
        saldo += -debito + credito;  // Pode ser escrito como: saldo = saldo - debito + credito
        System.out.printf("Saldo atual da conta %d: %.2f%n", numContaCliente, saldo);
        if (saldo > -1) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
        sc.close();
    }
}