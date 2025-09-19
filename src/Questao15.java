import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = leitor.nextInt();

        if(ano % 4 == 0 && ano % 100 != 0 ){
            System.out.println("É um ano bissexto!");
        }else if(ano % 400 != 0){
            System.out.println("Não é um ano bissexto!");
        }
    }
}
