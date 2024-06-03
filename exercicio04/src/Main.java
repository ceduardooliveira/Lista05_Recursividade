import java.util.Scanner;

public class Main {
    public static boolean verificarPalindromo(String str) {
        // Remove os espaços em branco e converte para minúsculas
        str = str.replaceAll("\\s+", "").toLowerCase();
        return verificarPalindromoAux(str, 0, str.length() - 1);
    }

    private static boolean verificarPalindromoAux(String str, int esquerda, int direita) {
        if (esquerda >= direita) {
            return true;
        }

        if (str.charAt(esquerda) != str.charAt(direita)) {
            return false;
        }

        return verificarPalindromoAux(str, esquerda + 1, direita - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para verificar se é um palíndromo: ");
        String str = scanner.nextLine();

        if (verificarPalindromo(str)) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }

        scanner.close();
    }
}
