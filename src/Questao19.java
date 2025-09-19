import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um numero de 3 digitos: ");
        String number = scan.next();

        if(number.length() == 3){
            int numero = Integer.parseInt(number);

            int n1 = numero / 100;
            int n2 = (numero / 10) % 10;
            int n3 = numero % 10;

            int reverso = (n3 * 100) + (n2 * 10) + n1;

            if (numero == reverso){
                System.out.println("É um palimdromo!");
            }else{
                System.out.println("Não é um palimdromo!");
            }
        }else{
            System.out.println("Digite um número com 3 digitos.");
        }
    }
}
