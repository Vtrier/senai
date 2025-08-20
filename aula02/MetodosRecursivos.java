package Aula02;

import java.util.Scanner;

public class MetodosRecursivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // EXERCÍCIO 1
        System.out.print("Informe o valor de n para imprimir de 0 até n: ");
        int n = scanner.nextInt();

        System.out.print("Iterativo: ");
        imprimirIterativo(n);
        System.out.println();

        System.out.print("Recursivo: ");
        imprimirRecursivo(0, n); // Começa do 0
        System.out.println();

        // EXERCÍCIO 2
        System.out.print("\nInforme o valor de x para calcular o somatório de 1 até x: ");
        int x = scanner.nextInt();
        int resultadoSomatorio = somatorio(x);
        System.out.println("Somatório de 1 até " + x + " é: " + resultadoSomatorio);

        // EXERCÍCIO 3
        System.out.print("\nInforme o valor de n para encontrar o n-ésimo termo da sequência de Fibonacci: ");
        int termoFibo = scanner.nextInt();
        int resultadoFibo = fibonacci(termoFibo);
        System.out.println(termoFibo + "º termo da sequência de Fibonacci é: " + resultadoFibo);

        scanner.close();
    }

    // ------------------------------
    // EXERCÍCIO 1 - IMPRESSÃO
    // ------------------------------

    // Método Iterativo
    public static void imprimirIterativo(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    // Método Recursivo
    public static void imprimirRecursivo(int atual, int n) {
        if (atual > n) {
            return;
        }
        System.out.print(atual + " ");
        imprimirRecursivo(atual + 1, n);
    }

    // ------------------------------
    // EXERCÍCIO 2 - SOMATÓRIO
    // ------------------------------

    public static int somatorio(int x) {
        if (x <= 1) {
            return x;
        }
        return x + somatorio(x - 1);
    }

    // ------------------------------
    // EXERCÍCIO 3 - FIBONACCI
    // ------------------------------

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
