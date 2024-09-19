import java.util.Scanner;

public class Metodos3 {
    public static void main(String[] args) {
        // Faz um Scanner para receber as respostas do usuario
        Scanner scanner = new Scanner(System.in);

        // Pergunta o primeiro número 
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        // Pergunta o segundo número
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        // Pergunta o terceiro número
        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        // Faz um metodo pra achar o maior numero
        int maior = encontrarMaior(numero1, numero2, numero3);

        // Mostra o maior numero
        System.out.println("O maior número é: " + maior);

        scanner.close();
    }

    // Encontra o numero maior entre os outros
    public static int encontrarMaior(int num1, int num2, int num3) {
        // Faz a variavel num1 ser o maior
        int maior = num1;

        // Compara o num1 com num2 e ve qual e maior qual for maior vai prevalecer 
        if (num2 > maior) {
            maior = num2;
        }

        // compara o numero maior com o num3 e qual for maior prevalece 
        if (num3 > maior) {
            maior = num3;
        }

        // Retorna o maior numero
        return maior;
    }
}
