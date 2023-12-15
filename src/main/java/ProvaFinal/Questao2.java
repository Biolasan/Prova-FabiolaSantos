package ProvaFinal;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura:");
        double temp = scanner.nextDouble();

        System.out.println("Qual a unidade de origem dessa temperatura? [C, K, F]");
        String unidadeOrigem = scanner.next().toUpperCase();

        if (!unidadeOrigem.equals("C") && !unidadeOrigem.equals("K") && !unidadeOrigem.equals("F")) {
            System.out.println("A entrada especificada não é válida.");
            return;
        }

        System.out.println("Qual a unidade de destino dessa temperatura? [C, K, F]");
        String unidadeDestino = scanner.next().toUpperCase();

        if (!unidadeDestino.equals("C") && !unidadeDestino.equals("K") && !unidadeDestino.equals("F")) {
            System.out.println("A entrada especificada não é válida.");
            return;
        }

        double[] tempConvertida = new double[1];
        if (unidadeOrigem.equals("C")) {
            if (unidadeDestino.equals("F")) {
                tempConvertida[0] = (temp * 9 / 5) + 32;
            } else if (unidadeDestino.equals("K")) {
                tempConvertida[0] = 273.15 + temp;
            }
        } else if (unidadeOrigem.equals("F")) {
            if (unidadeDestino.equals("C")) {
                tempConvertida[0] = (temp - 32) * 5 / 9;
            } else if (unidadeDestino.equals("K")) {
                tempConvertida[0] = ((temp - 32) * 5 / 9) + 273.15;
            }
        } else if (unidadeOrigem.equals("K")) {
            if (unidadeDestino.equals("C")) {
                tempConvertida[0] = temp - 273.15;
            } else if (unidadeDestino.equals("F")) {
                tempConvertida[0] = ((temp - 273.15) * 9 / 5) + 32;
            }
        }

        System.out.printf("%.2f %s = %.2f %s\n", temp, unidadeOrigem, tempConvertida[0], unidadeDestino);
    }
}
