import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o 1º Lado do triangulo: ");
        int lado1 = scan.nextInt();

        System.out.print("Insira o 2º Lado do triangulo: ");
        int lado2 = scan.nextInt();

        System.out.print("Insira o 3º Lado do triangulo: ");
        int lado3 = scan.nextInt();

        if(lado1 + lado2 < lado3 || lado1 + lado2 == lado3){
            System.out.println("Não é um triangulo!");
        }else if(lado1 == lado2 && lado2 == lado3 && lado3 == lado1){
            System.out.println("É um triangulo Equilátero!");
        }else if(lado1 == lado2 || lado2 == lado3 || lado3 == lado1){
            System.out.println("É um triangulo Isósceles!");
        }else if(lado1 != lado2 && lado2 != lado3){
            System.out.println("É um triangulo Escaleno!");
        }

    }
}
