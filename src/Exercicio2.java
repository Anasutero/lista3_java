import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        int idade=1;
        double altura=1;
        double peso=1;
        int escolha=0;
        int contador=0;
        int idadeacima=0;
        double alturaacima=0;
        double pesoacima=0;

        Scanner leitura = new Scanner(System.in);
        System.out.printf("\n---Programa calculo de peso---");

        do{
            System.out.println("\nInsira 10 idades:");
            idade=leitura.nextInt();

            System.out.println("Insira a altura de 10 pessoas:");//arrumar os valores decimais
            altura = leitura.nextDouble();

            System.out.println("Insira o peso de 10 pessoas:");
            peso=leitura.nextDouble();


            if(idade >50){
                idadeacima ++;
            }

            if(altura >1.60){
                alturaacima ++;
            }
            if(peso > 80){
                pesoacima++;
            }
            contador = contador + 1;

        }while (contador <10);

        do{
            System.out.printf("\nInsira abaixo o que deseja ver:");
            System.out.printf("\n1.Quantas tem idade acima de 50 anos?");
            System.out.printf("\n2.Quantas tem altura acima de 1.60m?");
            System.out.printf("\n3.Quantas tem peso abaixo de 80kg?");
            System.out.printf("\n4.Sair");
            System.out.printf("\nFaça sua escolha:");
            escolha=leitura.nextInt();

            switch (escolha){
                case 1->{
                    System.out.printf("\nA quantidade de pessoas que tem idade acima de 50 : " +idadeacima);
                }

                case 2 ->{
                    System.out.printf("\nA quantidade de pessoas que tem altura acima de 1.60 :" +alturaacima);
                }
                case 3->{
                    System.out.printf("\nA quantidade de pessoas que tem peso acima de 80kg :" +pesoacima);
                }
                case 4->{
                    System.out.printf("\nSaindo do programa...");
                    System.exit(0);
                }
                default -> {
                    System.out.printf("\nERRO:Ops.. valor invalido!");
                }
            }

        }while(escolha !=0);

    }
}
