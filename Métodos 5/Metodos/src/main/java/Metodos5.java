import java.util.Scanner;

public class Metodos5{
    // Vai fazer minutos virarem horas e minutos
    public static void converterMinutos(int totalMinutos) {
        // Vai calcular as horas
        int horas = totalMinutos / 60;
        // Ve os minutos que vao sobrar
        int minutos = totalMinutos % 60;
        
        // Mostra o resultado
        System.out.println(totalMinutos + " minutos é igual a " + horas + " horas e " + minutos + " minutos.");
    }

    public static void main(String[] args) {
        // Le a mensagem que o usuario mandar
        Scanner scanner = new Scanner(System.in);
        
        // Pergunta ao usuario a quantidade de minutos
        System.out.print("Digite a quantidade de minutos: ");
        int minutos = scanner.nextInt();
        
        // Converte e mostra o resultado
        converterMinutos(minutos);
        scanner.close();
    }
}
