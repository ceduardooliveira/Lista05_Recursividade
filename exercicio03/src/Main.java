import java.util.Scanner;

public class Main {
    public static int calcularPotencia(int X, int Y) {
        if (Y == 0) {
            return 1;
        } else {
            return X * calcularPotencia(X, Y - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X (base): ");
        int X = scanner.nextInt();

        System.out.print("Digite o valor de Y (expoente): ");
        int Y = scanner.nextInt();

        if (Y < 0) {
            System.out.println("O expoente deve ser maior ou igual a zero.");
        } else {
            int resultado = calcularPotencia(X, Y);
            System.out.println(X + " elevado a " + Y + " é: " + resultado);
        }

        scanner.close();
    }
}
