/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

import java.util.Scanner;

/**
 *
 * @author vitor_trierveiler
 */
public class ExerciciosVetor {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //exercicioA(scanner);
        //exercicioB(scanner);
        //exercicioC(scanner);
        //exercicioD(scanner);
        exercicioE(scanner);

        scanner.close();
    }

    // a.
    public static void exercicioA(Scanner scanner) {
        int[] valoresOriginais = new int[5];
        int soma = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        int negativos = 0, impares = 0;

        System.out.println("Digite 5 valores inteiros:");
        for (int i = 0; i < valoresOriginais.length; i++) {
            valoresOriginais[i] = scanner.nextInt();
            soma += valoresOriginais[i];

            if (valoresOriginais[i] > maior) maior = valoresOriginais[i];
            if (valoresOriginais[i] < menor) menor = valoresOriginais[i];
            if (valoresOriginais[i] < 0) negativos++;
            if (valoresOriginais[i] % 2 != 0) impares++;
        }

        double media = soma / 5.0;

        System.out.println("\nMédia: " + media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Valores negativos: " + negativos);
        System.out.println("Valores ímpares: " + impares);
    }

    // b.
    public static void exercicioB(Scanner scanner) {
        int[] valoresOriginais = new int[8];
        int[] valoresInvertidos = new int[8];

        System.out.println("Digite 8 valores inteiros:");
        for (int i = 0; i < 8; i++) {
            valoresOriginais[i] = scanner.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            valoresInvertidos[i] = valoresOriginais[7 - i];
        }

        System.out.println("\nVetor Original:");
        for (int v : valoresOriginais) System.out.print(v + " ");

        System.out.println("\nVetor Invertido:");
        for (int v : valoresInvertidos) System.out.print(v + " ");
        System.out.println();
    }

    // c.
    public static void exercicioC(Scanner scanner) {
        int[] valoresOriginais = new int[8];
        System.out.println("Digite 8 valores inteiros:");
        for (int i = 0; i < 8; i++) {
            valoresOriginais[i] = scanner.nextInt();
        }

        System.out.print("Digite o valor a ser buscado: ");
        int buscado = scanner.nextInt();
        int contador = 0;

        for (int valor : valoresOriginais) {
            if (valor == buscado) contador++;
        }

        System.out.println("O valor " + buscado + " aparece " + contador + " vez(es) no vetor.");
    }

    // d.
    public static void exercicioD(Scanner scanner) {
        char[] caracteresInformados = new char[10];
        scanner.nextLine(); // limpar buffer

        System.out.println("Digite 10 caracteres:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Caractere " + (i + 1) + ": ");
            caracteresInformados[i] = scanner.nextLine().charAt(0);
        }

        System.out.print("Digite o caractere a ser buscado: ");
        char buscado = scanner.nextLine().charAt(0);
        boolean encontrado = false;

        for (char c : caracteresInformados) {
            if (c == buscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O caractere '" + buscado + "' existe no vetor.");
        } else {
            System.out.println("O caractere '" + buscado + "' NÃO foi encontrado no vetor.");
        }
    }

    // e.
    public static void exercicioE(Scanner scanner) {
        int[] valoresOriginais = new int[5];
        int[] valoresFinais = new int[15];

        System.out.println("Digite 5 valores inteiros:");
        for (int i = 0; i < 5; i++) {
            valoresOriginais[i] = scanner.nextInt();
        }

        // Posiciona os valores em 1, 4, 7, 10, 13
        for (int i = 0; i < 5; i++) {
            int pos = 1 + (i * 3); // posições 1, 4, 7, 10, 13
            valoresFinais[pos] = valoresOriginais[i];
        }

        // Preenche os demais valores com média dos vizinhos
        for (int i = 0; i < valoresFinais.length; i++) {
            if (valoresFinais[i] == 0 && i > 0 && i < valoresFinais.length - 1) {
                valoresFinais[i] = (valoresFinais[i - 1] + valoresFinais[i + 1]) / 2;
            }
        }

        System.out.println("\nVetor Original:");
        for (int v : valoresOriginais) System.out.print(v + " ");

        System.out.println("\nVetor Final:");
        for (int v : valoresFinais) System.out.print(v + " ");
        System.out.println();
    }
}
