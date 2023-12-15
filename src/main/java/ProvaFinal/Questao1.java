package ProvaFinal;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo:");
        double valorEmprestimo = scanner.nextDouble();

        System.out.println("Digite a taxa de juros do empréstimo:");
        double taxaJuros = scanner.nextDouble();

        System.out.println("Digite o tempo para pagamento:");
        int tempoPagamento = scanner.nextInt();

        double[] amortizacao = new double[tempoPagamento];
        double[] saldoDevedor = new double[tempoPagamento];
        double[] jurosMensal = new double[tempoPagamento];
        double[] parcelaMensal = new double[tempoPagamento];
        double totalJuros = 0;

        for (int mes = 0; mes < tempoPagamento; mes++) {
            amortizacao[mes] = valorEmprestimo / tempoPagamento;
            saldoDevedor[mes] = mes == 0 ? valorEmprestimo : saldoDevedor[mes-1] - amortizacao[mes];
            jurosMensal[mes] = saldoDevedor[mes] * (taxaJuros / 100);
            parcelaMensal[mes] = jurosMensal[mes] + amortizacao[mes];
            totalJuros += jurosMensal[mes];
        }

        System.out.printf("Valor fixo da amortização R$ %.2f, Saldo devedor total R$ %.2f com um juros de %.2f%% ao mês%n", amortizacao[0], saldoDevedor[0], taxaJuros);

        for (int mes = 0; mes < tempoPagamento; mes++) {
            System.out.printf("Parcela %d | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo devedor: R$ %.2f%n", mes+1, jurosMensal[mes], parcelaMensal[mes], saldoDevedor[mes]);
        }

        System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f%n", valorEmprestimo + totalJuros, totalJuros, valorEmprestimo);
    }
}
