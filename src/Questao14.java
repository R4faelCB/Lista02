import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual a sua idade? ");
        int idade = leitor.nextInt();

        if(idade < 5){
            System.out.println("Não possui idade para participar!");
        }else if(idade >= 5 && idade <= 12 ){
            System.out.println("Sua categoria é: Infantil.");
        }else if(idade >= 13 && idade <= 17){
            System.out.println("Sua categoria é: Juvenil.");
        }else if(idade >= 18 && idade <= 40){
            System.out.println("Sua categoria é: Adulto.");
        }else if(idade > 40){
            System.out.println("Sua categoria é: Master.");
        }

    }
}
