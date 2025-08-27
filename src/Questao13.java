import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual o peso do produto? (em kg) ");
        double peso = leitor.nextDouble();

        System.out.print("Qual a distância? (em km) ");
        int distancia = leitor.nextInt();

        double opcao1 = 10 + (0.50 * distancia);
        double opcao2 = 15 + (0.80 * distancia);
        double opcao3 = 20 + (1.00 * distancia);

        if(peso <= 1){
            System.out.println("O valor total do Frete é R$" + opcao1);
        }else if(peso > 1 && peso <= 5){
            System.out.println("O valor total do Frete é R$" + opcao2);
        }else if(peso > 5){
            System.out.println("O valor total do Frete é R$" + opcao3);
        }
    }
}
