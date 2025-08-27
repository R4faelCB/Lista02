import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = leitor.nextInt();

        if(numero % numero == 0){
            System.out.println("É um número primo.");
        }else{
            System.out.println("Não é um número primo.");
        }

    }
}
