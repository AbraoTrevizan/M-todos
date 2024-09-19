public class Metodos4 {
    // Vai calcular a potencia de a elevado a b
    public static double calcularPotencia(double a, double b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        // Um exemplo do programa
        double a = 4;
        double b = 2;
        double resultado = calcularPotencia(a, b);
        System.out.println(a + " elevado a " + b + " é igual a " + resultado);
    }
}
