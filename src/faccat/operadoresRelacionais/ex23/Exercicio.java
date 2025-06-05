package faccat.operadoresRelacionais.ex23;

import java.util.Scanner;

public class Exercicio {
    /* Enunciado:
    Para o enunciado a seguir foi elaborado um algoritmo em Português Estruturado que contém
    erros, identifique os erros no algoritmo apresentado abaixo:
    Enunciado: Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule
    e mostre o seu peso ideal, utilizando as seguintes fórmulas:
     - para sexo masculino: peso ideal = (72,7 * altura) - 58
     - para sexo feminino: peso ideal = (62,1 * altura) - 44,7
    inicio
    ler nome
    ler sexo
    se sexo = M então
    peso_ideal = (72,7 * altura) - 58
    senão
    peso_ideal = (62,1 * altura) – 44,7
    fim_se
    escrever peso_ideal
    fim*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite a altura: ");
        float altura = sc.nextFloat();
        System.out.println("Digite o sexo (M ou F): ");
        char sexo = sc.next().toUpperCase().charAt(0);
        float pesoIdeal = (sexo == 'M') ? (72.7f * altura) - 58 : (62.1f * altura) - 44.7f;
        System.out.printf("O peso ideal de %s é: %.2f kg%n", nome, pesoIdeal);
        sc.close();
    }
}