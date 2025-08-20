/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

import java.util.Scanner;

/**
 *
 * @author vitor_trierveiler
 */
public class MetodosRecursivos02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.
        System.out.print("Informe um número para somar até ele: ");
        int numero = scanner.nextInt();
        int soma = somarAte(numero);
        System.out.println("Soma de 1 até " + numero + " é: " + soma);

        // 2.
        System.out.print("\nInforme um número para calcular o fatorial: ");
        int f = scanner.nextInt();
        int resultadoFatorial = fatorial(f);
        System.out.println("Fatorial de " + f + " é: " + resultadoFatorial);

        // 3.
        System.out.print("\nInforme o tamanho do vetor de inteiros: ");
        int tamanhoVetor = scanner.nextInt();
        int[] vetor = new int[tamanhoVetor];
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }
        int somaVetor = somarValoresVetor(vetor, 0);
        System.out.println("Soma dos valores do vetor: " + somaVetor);

        // 4.
        System.out.print("\nInforme o tamanho do vetor de caracteres: ");
        int tamanhoChar = scanner.nextInt();
        char[] letras = new char[tamanhoChar];
        scanner.nextLine();

        for (int i = 0; i < tamanhoChar; i++) {
            System.out.print("Digite a letra da posição " + i + ": ");
            letras[i] = scanner.nextLine().charAt(0);
        }

        System.out.print("Digite a letra a ser buscada: ");
        char letraBuscada = scanner.nextLine().charAt(0);

        int quantidade = contarCaracteres(letras, letraBuscada, 0);
        System.out.println("A letra '" + letraBuscada + "' aparece " + quantidade + " vezes no vetor.");

        scanner.close();
    }

    // 1. Somar até N (recursivo)
    public static int somarAte(int numero) {
        if (numero <= 1) {
            return numero;
        }
        return numero + somarAte(numero - 1);
    }

    // 2. Fatorial (recursivo)
    public static int fatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        return numero * fatorial(numero - 1);
    }

    // 3. Soma dos valores do vetor (recursivo)
    public static int somarValoresVetor(int[] valores, int indice) {
        if (indice >= valores.length) {
            return 0;
        }
        return valores[indice] + somarValoresVetor(valores, indice + 1);
    }

    // 4. Contar caracteres (recursivo)
    public static int contarCaracteres(char[] letras, char letraBuscada, int indice) {
        if (indice >= letras.length) {
            return 0;
        }
        int contador = (letras[indice] == letraBuscada) ? 1 : 0;
        return contador + contarCaracteres(letras, letraBuscada, indice + 1);
    }
}
