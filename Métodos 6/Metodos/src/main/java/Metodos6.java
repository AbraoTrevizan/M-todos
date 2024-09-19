import java.util.Scanner;

public class Metodos6 {
    // Vai calcular o fatorial
    public static int calcularFatorial(int numero) {
        // Começa com 1 pois o fatorial de 0 e 1
        int resultado = 1;
        
        // Loop que multiplica ate o numero informado
        for (int i = 1; i <= numero; i++) {
            resultado *= i; // multiplica o resultado por i
        }
        
        // volta o resultado
        return resultado;
    }

    public static void main(String[] args) {
        // Cria o Scanner para ler as respostas do usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pergunta o usuaio o numero que ele deseja 
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();
        
        // calcula o fatorial e aguarda o resultado
        int fatorial = calcularFatorial(numero);
        
        // Mostra o resultado para o usuario
        System.out.println("O fatorial de " + numero + " é " + fatorial);

        scanner.close();
    }
}
