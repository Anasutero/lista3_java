import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        double pesoMaisPesado = 0;
        double alturaMaisAlta = 0;
        String nomePesoMaisPesado = "";
        String nomeAlturaMaisAlta = "";
        Scanner leitura = new Scanner(System.in);

        System.out.println("\n---Programa do IMC---");

        for (int contador = 0; contador < 6; contador++) {
            System.out.printf("\nInsira o nome da pessoa %d: ", contador + 1);
            String nome = leitura.nextLine();

            System.out.printf("Insira o peso de %s: ", nome);
            double peso = leitura.nextDouble();

            System.out.printf("Insira a altura de %s: ", nome);
            double altura = leitura.nextDouble();

            // Calculando o IMC
            double imc = peso / (altura * altura);

            // Verificando se é a pessoa mais alta
            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                nomeAlturaMaisAlta = nome;
            }

            // Verificando se é a pessoa mais pesada
            if (peso > pesoMaisPesado) {
                pesoMaisPesado = peso;
                nomePesoMaisPesado = nome;
            }

            // Limpar o buffer do scanner
            leitura.nextLine();
        }

        System.out.printf("\nA pessoa mais alta é %s com %.2fm de altura.\n", nomeAlturaMaisAlta, alturaMaisAlta);
        System.out.printf("A pessoa mais pesada é %s com %.2fkg de peso.\n", nomePesoMaisPesado, pesoMaisPesado);
    }
}
