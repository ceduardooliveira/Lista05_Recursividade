import java.util.Scanner;

public class Main {
    public static int buscaBinaria(int[] array, int elemento) {
        return buscaBinariaRecursiva(array, elemento, 0, array.length - 1);
    }

    private static int buscaBinariaRecursiva(int[] array, int elemento, int esquerda, int direita) {
        if (esquerda > direita) {
            return -1; // Elemento não encontrado
        }

        int meio = esquerda + (direita - esquerda) / 2;

        if (array[meio] == elemento) {
            return meio; // Elemento encontrado
        } else if (array[meio] < elemento) {
            return buscaBinariaRecursiva(array, elemento, meio + 1, direita); // Busca na metade direita
        } else {
            return buscaBinariaRecursiva(array, elemento, esquerda, meio - 1); // Busca na metade esquerda
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array ordenado de exemplo
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        System.out.print("Digite o elemento que deseja buscar: ");
        int elemento = scanner.nextInt();

        int posicao = buscaBinaria(array, elemento);

        if (posicao != -1) {
            System.out.println("Elemento encontrado na posição: " + posicao);
        } else {
            System.out.println("Elemento não encontrado.");
        }

        scanner.close();
    }
}
