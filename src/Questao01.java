import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual sua Idade? ");
        int idade = leitor.nextInt();

        if(idade >= 18){
            System.out.println("Você é maior de Idade.");
        }else{
            System.out.println("Você é menor de Idade.");
        }

    }
}
