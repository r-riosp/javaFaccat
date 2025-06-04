package faccat.operadoresMatematicos.ex12;

import java.util.Scanner;

public class Exercicio {
    // Enunciado:
    // 12) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
    //correspondente em graus Celsius (baseado na fórmula abaixo):
    // C F - 32
    // ---------- = -----------
    // 5 9
    //Observação: Para testar se a sua resposta está correta saiba que 100oC = 212F

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Fahrenheit: ");
        float fahrenheit = sc.nextFloat();
        float celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("%.1fºF correspondem a %.1fºC.%n", fahrenheit, celsius);
        sc.close();
    }
}
