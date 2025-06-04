package faccat.operadoresMatematicos.ex08;

import java.util.Scanner;

public class Exercicio {
    // Exemplo de código para o exercício 08
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== ELEITORES ===");
        System.out.print("Digite o número total de eleitores: ");
        int eleitores = sc.nextInt();
        System.out.println("Digite o número de votos brancos: ");
        int brancos = sc.nextInt();
        System.out.println("Digite o número de votos nulos: ");
        int nulos = sc.nextInt();
        sc.close();
        int validos = eleitores - brancos - nulos;
        float porcentagemBrancos = (float) (brancos * 100) / eleitores;
        float porcentagemNulos = (float) (nulos * 100) / eleitores;
        float porcentagemValidos = (float) (validos * 100) / eleitores;
        System.out.printf("Votos brancos: %d (%.2f%%)%n", brancos, porcentagemBrancos);
        System.out.printf("Votos nulos: %d (%.2f%%)%n", nulos, porcentagemNulos);
        System.out.printf("Votos válidos: %d (%.2f%%)%n", validos, porcentagemValidos);

    }
}
