public class Metodos1 {
    public static void main(String[] args) {
        // Verifica o numero
        int numero = -6;

        // Vai estar vendo se e positivo ou negativo 
        verificarNumero(numero);
    }

    // Vai estar verificando o numero 
    public static void verificarNumero(int numero) {
        // Estara vendo se e maior ou igual a 0
        if (numero >= 0) {
            //Se for positivo esta aparecendo para o usuario o mesmo
            System.out.println("O número é positivo.");
        } else {
            // Se n for positivo esta nessa parte e vai aparecer ao usuario 
            System.out.println("O número é negativo.");
        }
    }
}
