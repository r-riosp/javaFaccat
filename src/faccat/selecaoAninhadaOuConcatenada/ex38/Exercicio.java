package faccat.selecaoAninhadaOuConcatenada.ex38;

import java.util.Scanner;

public class Exercicio {
    /**
     * Enunciado: Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
     * diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
     * mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se
     * esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a
     * senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu código de usuário:");
        int codigo = sc.nextInt();
        if (codigo != 1234) {
            System.out.println("Usuário inválido!");
        } else {
            System.out.println("Digite sua senha:");
            int senha = sc.nextInt();
            if (senha != 9999) {
                System.out.println("Senha incorreta.");
            } else {
                System.out.println("Acesso permitido.");
            }
        }
        sc.close();
    }
}
// O código poderia ter sido escrito de forma mais concisa, mas para fins didáticos, vamos manter a estrutura aninhada.
// Além disso, uma lógica de validação mais robusta poderia ser implementada, como permitir várias tentativas de login.
// No entanto, para o exercício, mantive a lógica simples e direta.
