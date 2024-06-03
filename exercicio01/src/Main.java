import java.util.Scanner;

public class Main {
    public static int somaAteN(int N) {
        if (N == 1) {
            return 1;
        } else {
            return N + somaAteN(N - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("N deve ser maior que 0.");
        } else {
            int resultado = somaAteN(N);
            System.out.println("A soma de todos os números de 1 até " + N + " é: " + resultado);
        }

        scanner.close();
    }
}
