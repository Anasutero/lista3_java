import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        double numero = 1;
        int escolha = 0;
        double numeropar = 0;
        double numeroimpar = 0;
        double numeropositivo = 0;
        double numeronegativo = 0;
        int contador = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.printf("\n----Programa de saber o que são os numeros ---");

        do {
            System.out.printf("\nInsira os numeros desejados:");
            numero = leitura.nextDouble();

            if (numero % 2 == 0) {
                numeropar++;
            } else {
                numeroimpar++;
            }

            if (numero < 0) {
                numeronegativo++;
            } else {
                numeropositivo++;
            }
            contador = contador + 1;

        } while (contador < 10);


        do {
            System.out.printf("\n-----Insira o numero correspondente ao que deseja  ver-----" +
                    "\n1.Ver quantos numeros  pares? " +
                    "\n2.Ver quantos numeros impares?" +
                    "\n3.Ver quantos negativos:?" +
                    "\n4.Ver quantos positivos?" +
                    "\n5.Sair" +
                    "\nFaça sua escolha:");
            escolha = leitura.nextInt();

            switch (escolha) {
                case 1 -> {
                    System.out.println("\nOs numeros pares são:" + numeropar);
                }
                case 2 -> {
                    System.out.println("\nOs numeros impares são:" + numeroimpar);
                }
                case 3 -> {
                    System.out.println("\nOs numeros negativos são:" + numeronegativo);
                }
                case 4 -> {
                    System.out.println("\nOs numeros positivos são:" + numeropositivo);
                }
                case 5 -> {
                    System.out.println("\nSaindo do programa....");
                    System.exit(0);
                }
                default -> {
                    System.out.printf("ERRO:ops.. valor invalido.");
                }
            }
        }while(escolha !=0);
    }
}
