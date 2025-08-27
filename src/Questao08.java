import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        byte numero = leitor.nextByte();

        System.out.print("Inicio: ");
        double inicio = leitor.nextDouble();

        System.out.print("Fim: ");
        double fim = leitor.nextDouble();

        if(numero >= inicio && numero <= fim){
            System.out.println("O número " + numero + " está Dentro do intervalo");
        }else{
            System.out.println("O número " + numero + " está Fora do intervalo");
        }
    }
}
