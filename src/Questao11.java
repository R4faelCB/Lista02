import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual o seu sálario atual? ");
        double salario = leitor.nextDouble();

        System.out.print("Há quantos anos você trabalha? ");
        int ano = leitor.nextInt();

        double cincoAnos = salario * 0.20;
        double tresAnos = salario * 0.15;
        double menosAnos = salario * 0.10;

        if(ano > 5){
            System.out.println("Você recebe o Bônus de R$" + cincoAnos);
            System.out.println("Seu novo salário é R$" + (salario + cincoAnos));
        }else if(ano >= 3 && ano <= 5){
            System.out.println("Você recebe o Bônus de R$" + tresAnos);
            System.out.println("Seu novo salário é R$" + (salario + tresAnos));
        }else if(ano < 3){
            System.out.println("Você recebe o Bônus de R$" + menosAnos);
            System.out.println("Seu novo salário é R$" + (salario + menosAnos));
        }

    }
}
