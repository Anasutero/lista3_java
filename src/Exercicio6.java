import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        double numero;

        Scanner leitura = new Scanner(System.in);

        System.out.println("\n---Programa da tabuada---");

        try{
            System.out.printf("Insira um numero:");
            numero = leitura.nextDouble();

            System.out.printf("\nNumero: %.1f\n", numero);
            System.out.println("Tabuada:");

            for(int i = 0; i <= 10; i++) {
                double resultado = numero * i;
                System.out.printf("%.1f x %d = %.1f\n", numero, i, resultado);
            }

        } catch (InputMismatchException e) {
            System.out.println("ERRO: Ops... só aceitamos números.");
        } finally {
            leitura.close();
        }
    }
}

