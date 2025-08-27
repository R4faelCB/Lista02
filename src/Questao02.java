import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("1ª Nota: ");
        float nota1 = leitor.nextFloat();

        System.out.print("2ª Nota: ");
        float nota2 = leitor.nextFloat();

        System.out.print("3ª Nota: ");
        float nota3 = leitor.nextFloat();

        System.out.print("4ª Nota: ");
        float nota4 = leitor.nextFloat();

        float soma = nota1 + nota2 + nota3 + nota4;
        float media = soma / 4;

        if(media >= 7){
            System.out.println("Sua media é: " + media);
            System.out.println("Você foi Aprovado!");
        }else if (media >= 5 && media < 7 ) {
            System.out.println("Sua media é: " + media);
            System.out.println("Você está em Recuperação!");
        }else{
            System.out.println("Sua é media é: " + media);
            System.out.println("Você está Reprovado!");
        }
    }
}
