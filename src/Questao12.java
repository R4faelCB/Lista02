import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número para saber se é um número primo: ");
        int numero = leitor.nextInt();

        int contador = 0;

        for (int i=1; i <= numero; i++){
            if (numero % i == 0){
                contador++;
            }
        }
        if (numero <= 1){
            System.out.println("Digite um valor valido");
        }else if (contador == 2){
            System.out.println("É primo");
        }else {
            System.out.println("Não é primo");
        }
    }
}
