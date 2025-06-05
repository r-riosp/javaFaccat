package faccat.operadoresRelacionais.ex21;

import java.util.Scanner;

public class Exercicio {
    // Enunciado:
    //  Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
    //minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
    //de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o horário de início da partida:");
        int inicio = sc.nextInt();
        System.out.println("Digite o horário em que a partida terminou:");
        int fim = sc.nextInt();
        sc.close();
        int duracao = (inicio < fim) ? fim - inicio : fim - inicio + 24;
        System.out.printf("A duracao total da partida foi de %d horas.", duracao);
    }
}
