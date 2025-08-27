import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual o valor do produto? ");
        double valor = leitor.nextDouble();

        System.out.print("Qual a forma de pagamento? (1 para a Vista| 2 para a Prazo) ");
        byte pagamento = leitor.nextByte();

        double vista = valor * 0.10;
        double prazo = valor * 0.05;

        if(pagamento == 1){
            System.out.println("Seu valor final é R$" + (valor - vista));
        }else if(pagamento == 2){
            System.out.println("Seu valor final é R$" + (valor - prazo));
        }else{
            System.out.println("Código Inválido");
        }
    }
}