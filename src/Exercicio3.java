import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int escolha;
        int bom = 0;
        int otimo = 0;
        int ruim = 0;
        int quantidade = 0;
        double porcentagemOtimo = 0;
        double porcentagemBom = 0;
        double porcentagemRuim = 0;
        char continuar = 'S'; // Inicializa com 'S' para começar o programa

        Scanner leitura = new Scanner(System.in);
        System.out.println("\n---Programa de opinião de satisfação---");

        do {
            System.out.println("\nAvaliação do filme, Insira o número correspondente à sua opinião:");
            System.out.println("1. Ótimo");
            System.out.println("2. Bom");
            System.out.println("3. Ruim");

            escolha = leitura.nextInt();
            quantidade++; // Incrementa a quantidade total de respostas

            switch (escolha) {
                case 1:
                    otimo++;
                    break;
                case 2:
                    bom++;
                    break;
                case 3:
                    ruim++;
                    break;
                default:
                    System.out.println("\nERRO: Opção inválida.");
                    quantidade--; // Decrementa a quantidade total de respostas, já que uma resposta inválida não deve ser contada
                    break;
            }

            // Pergunta ao usuário se deseja continuar
            System.out.println("\nDeseja continuar? (S/N)");
            continuar = leitura.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        // Cálculo das porcentagens
        if (quantidade != 0) {
            porcentagemOtimo = (otimo / (double) quantidade) * 100;
            porcentagemBom = (bom / (double) quantidade) * 100;
            porcentagemRuim = (ruim / (double) quantidade) * 100;
        }

        // Exibição dos resultados
        System.out.println("\nResultados:");
        System.out.println("a. Quantidade de pessoas que responderam ÓTIMO: " + otimo + " (" + porcentagemOtimo + "%)");
        System.out.println("b. Quantidade de pessoas que responderam BOM: " + bom + " (" + porcentagemBom + "%)");
        System.out.println("c. Quantidade de pessoas que responderam RUIM: " + ruim + " (" + porcentagemRuim + "%)");
        System.out.println("d. Total de respostas: " + quantidade);

        leitura.close();
    }
}
