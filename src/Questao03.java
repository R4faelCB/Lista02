import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = leitor.nextDouble();

        if(numero == 0){
            System.out.println("Seu número é Zero");
        }

        if(numero > 0){
            System.out.println("Seu número é Positivo");
        }else if(numero < 0 ){
            System.out.println("Seu número é Negativo");
        }

        if(numero != 0 && numero % 2 == 0){
            System.out.println("Seu número é Par");
        }else if(numero != 0 && numero % 2 != 0){
            System.out.println("Seu número é Impar");
        }
    }
}