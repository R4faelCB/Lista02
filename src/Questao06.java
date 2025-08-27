import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua Idade: ");
        int idade = leitor.nextInt();

        if(idade <= 12) {
            System.out.println("Você é uma Criança.");
        }else if(idade >= 13 && idade <= 17){
            System.out.println("Você é um Adolescente.");
        }else if(idade >=18 && idade <= 59){
            System.out.println("Você é um Adulto.");
        }else if(idade >= 60){
            System.out.println("Você é um Idoso");
        }
    }
}