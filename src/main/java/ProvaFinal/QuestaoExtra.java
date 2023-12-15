package ProvaFinal;

import java.util.Scanner;

public class QuestaoExtra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int n = scanner.nextInt();
        char[][] rectangle = new char[2*n-1][2*n-1];

        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                rectangle[i][j] = ' ';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = n-i-1; j < n+i; j++) {
                rectangle[i][j] = '*';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < 2*n-1-i; j++) {
                rectangle[n+i-1][j] = '*';
            }
        }

        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                System.out.print(rectangle[i][j]);
            }
            System.out.println();
        }
    }
}
