package faccat.operadoresRelacionais.ex22;

import java.util.Scanner;

public class Exercicio {
    // Enunciado:
    // A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
    //de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
    //Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
    //o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
    //(considere que o mês possua 4 semanas exatas).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantas horas trabalhou no mês:");
        int horasTrabalhadas = sc.nextInt();
        System.out.println("Digite seu salário por hora:");
        double salarioHora = sc.nextFloat();
        double salarioExtra = salarioHora * (horasTrabalhadas - 160) * 1.5;
        double salarioTotal = salarioHora * horasTrabalhadas;
        salarioTotal = (horasTrabalhadas > 160) ? salarioTotal - salarioHora * (horasTrabalhadas - 160) + salarioExtra : salarioTotal;
        sc.close();
        System.out.printf("Salário Total: R$%.2f%n", salarioTotal);
    }
}