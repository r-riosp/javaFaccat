package faccat.operadoresLogicos.ex42;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Código do exercício 42
        System.out.println("Digite o código do empregado: ");
        int codigo = sc.nextInt();
        System.out.println("Digite o ano de nascimento do empregado: ");
        int anoNascimento = sc.nextInt();
        System.out.println("Digite o ano de contratação do empregado: ");
        int anoContratacao = sc.nextInt();
        System.out.println("Digite o ano atual: ");
        int anoAtual = sc.nextInt();
        sc.close();

        int idade = anoAtual - anoNascimento;
        int tempoServico = anoAtual - anoContratacao;
        boolean podeAposentar = (idade >= 65) || (tempoServico >= 30) || (idade >= 60 && tempoServico >= 25);

        System.out.printf("Código do Empregado: %d%nIdade = %d%nTempo de serviço = %d%nPode se aposentar? %s%n",
                codigo, idade, tempoServico, podeAposentar ? "Sim" : "Não");
    }
}
