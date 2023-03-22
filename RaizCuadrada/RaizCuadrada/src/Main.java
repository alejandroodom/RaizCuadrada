import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir un valor: \n");
        double valor = scanner.nextDouble();

        try {
            if (valor < 0) {
                throw new Exception("La raíz cuadrada no está definida para un número negativo.");
            }
            double resultado = Math.sqrt(valor);
            System.out.println("√" + valor + " = " + resultado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}