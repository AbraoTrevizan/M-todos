import java.util.Scanner;
public class Metodos2 {
    public static void main(String[] args) {
    	
        // Faz um Scanner pra ler as mensagem que o usuario ira mandar
        Scanner scanner = new Scanner(System.in);

        // Pedi que seja digitado o primeiro numero
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        // Pedi que seja digitado o segundo numero
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Pedi que seja digitado o terceiro numero
        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        // Faz o calculo para saber a media dos 3 numeros dados
        double media = calcularMedia(numero1, numero2, numero3);

        // Mostra a media ao usuario
        System.out.println("A média aritmética é: " + media);

        scanner.close();
    }

    // Aqui e onde vai estar calulando a mendia aritmetica
    public static double calcularMedia(double num1, double num2, double num3) {
        // Soma os 3 numeros dados
        double soma = num1 + num2 + num3;

        // divide a soma por 3
        double media = soma / 3;

        // retorna a media que foi calculada
        return media;
    }
}
