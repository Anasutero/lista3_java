import java.util.InputMismatchException;
import java.util.Scanner;

public class EExercicio4 {
    public static void main(String[] args) {
        double numero = 0;
        double incremento = 0;
        double saida = 0;

        Scanner leitura = new Scanner(System.in);
        System.out.println("---Programa de opinião de satisfação---");

        try {
            System.out.print("\nInsira um número: ");
            numero = leitura.nextDouble();

            System.out.print("Insira o incremento desejado: ");
            incremento = leitura.nextDouble();

            System.out.printf("\nNumero:" +numero);
            System.out.printf("\nIncremento:" +incremento);
            System.out.print("\nSaída do programa: ");
            while (saida <= numero) {
                System.out.print(saida + " ");
                saida += incremento;
            }

        } catch (InputMismatchException e) {
            System.out.println("ERRO: Ops... só aceitamos números.");
        }
    }
}
