package faccat.ex05;

import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int antecessor = valor - 1;
        int sucessor = valor + 1;
        System.out.printf("Antecessor: %d%n", antecessor);
        System.out.printf("Sucessor: %d%n", sucessor);
    }
}
