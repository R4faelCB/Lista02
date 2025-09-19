import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o seu peso? ");
        double peso = scan.nextDouble();

        System.out.print("Qual a sua altura? ");
        double altura = scan.nextDouble();

        double imc = peso / (altura * altura);

        if(imc < 18.5){
            System.out.println("Seu IMC é: " + imc);
            System.out.println("Você está Abaixo do peso!");
        }else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Seu IMC é: " + imc);
            System.out.println("Você está com o peso Normal!");
        }else if(imc >= 25 && imc <= 29.9){
            System.out.println("Seu IMC é: " + imc);
            System.out.println("Você está com Sobrepeso!");
        }else if(imc >= 30){
            System.out.println("Seu IMC é: " + imc);
            System.out.println("Você está com Obesidade!");
        }
    }
}
