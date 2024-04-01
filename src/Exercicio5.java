import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ArrayList<Double> saldos = new ArrayList<>();
        char continuar = 'S'; // Inicializa com 'S' para começar o programa

        System.out.println("---Programa de verificação de saldo---");

        do {
            System.out.println("Insira o saldo:");
            double saldo = leitura.nextDouble();
            saldos.add(saldo); // Adiciona o saldo à lista

            System.out.println("Deseja continuar? (S/N)");
            continuar = leitura.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        System.out.println("Saldo de todas as pessoas: " + saldos);

        double saldoPositivo = 0;
        double saldoNegativo = 0;

        // Cálculo dos saldos
        for (double s : saldos) {
            if (s > 0) {
                saldoPositivo++;
            } else if (s < 0) {
                saldoNegativo++;
            }
        }

        System.out.println("Quantidade de pessoas com saldo positivo: " + saldoPositivo);
        System.out.println("Quantidade de pessoas com saldo negativo: " + saldoNegativo);

        if ((double) saldoPositivo / saldos.size() >= 0.5) {
            System.out.println("Nenhum risco!");
        } else {
            System.out.println("Risco ao banco!");
        }

        leitura.close();
    }
}
