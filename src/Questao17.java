import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n1 = scan.nextDouble();

        System.out.print("Digite um número: ");
        double n2 = scan.nextDouble();

        System.out.print("Digite um número: ");
        double n3 = scan.nextDouble();

        if(n1 < n2 && n1 < n3){
            if(n2 < n3){
                System.out.println("O primeiro número é " + n1 + " seguido do " + n2 + " por ultimo o " + n3);
            }else if(n3 < n2){
                System.out.println("O primeiro número é " + n1 + " seguido do " + n3 + " por ultimo o " + n2);
            }
        }

        if(n2 < n1 && n2 < n3){
            if(n1 < n3){
                System.out.println("O primeiro número é " + n2 + " seguido do " + n1 + " por ultimo o " + n3);
            }else if(n3 < n1){
                System.out.println("O primeiro número é " + n2 + " seguido do " + n3 + " por ultimo o " + n1);
            }
        }

        if(n3 < n1 && n3 < n2){
            if(n1 < n2){
                System.out.println("O primeiro número é " + n3 + " seguido do " + n1 + " por ultimo o " + n2);
            }else if(n2 < n1){
                System.out.println("O primeiro número é " + n3 + " seguido do " + n2+ " por ultimo o " + n1);
            }
        }
    }
}
