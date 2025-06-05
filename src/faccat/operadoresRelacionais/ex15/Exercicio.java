package faccat.operadoresRelacionais.ex15;

import java.util.Scanner;

public class Exercicio {
    //Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int valor = sc.nextInt();
        if (valor < 0) {
            System.out.println("O valor é negativo.");
        } else {
            System.out.println("O valor é positivo.");
        }
        sc.close();
    }
}
