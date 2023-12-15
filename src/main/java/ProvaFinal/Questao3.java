package ProvaFinal;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int n = scanner.nextInt();
        char[][] triangulo = new char[n][2*n-1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                triangulo[i][j] = ' ';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = n-i-1; j < n+i; j++) {
                triangulo[i][j] = '*';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                System.out.print(triangulo[i][j]);
            }
            System.out.println();
        }
    }
}
