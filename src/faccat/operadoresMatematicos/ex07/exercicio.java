package faccat.operadoresMatematicos.ex07;

import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int anos = sc.nextInt();
        System.out.println("Quantos meses se passaram desde seu último aniversário?");
        int meses = sc.nextInt();
        System.out.println("Quantos dias se passaram desde seu último mesversário?");
        int dias = sc.nextInt();
        int diasTotais = (anos * 365) + (meses * 30) + dias;
        System.out.printf("Você já viveu %d dias.%n", diasTotais);
    }
}
