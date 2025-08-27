import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o 1º Número: ");
        double n1 = leitor.nextDouble();

        System.out.print("Digite o 2º Número: ");
        double n2 = leitor.nextDouble();

        double soma = n1 + n2;
        double subtra = n1 - n2;
        double multi = n1 * n2;
        double divi = n1 / n2;

        System.out.print("Qual operação deseja fazer? ");
        String operacao = leitor.next();

        switch (operacao) {
            case "+":
                System.out.println("O Resultado da sua Soma é: " + soma);
                break;
            case "-":
                System.out.println("O Resultado da sua Subtração é: " + subtra);
                break;
            case "*":
                System.out.println("O Resultado da sua Multiplicação é: " + multi);
                break;
            case "/":
                if(n1 == 0 || n2 == 0){
                    System.out.println("Erro: divisão por Zero");
                }else{
                    System.out.println("O Resultado da sua Divisão é: " + divi);
                }
                break;
        }
    }
}
