import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("M - Matutino");
        System.out.println("V - Vespertino");
        System.out.println("N - Noturno");
        System.out.print("Em qual turno você estuda? ");
        String turno = leitor.next().toUpperCase();

        switch (turno) {
            case "M":
                System.out.println("Bom Dia!");
                break;
            case "V":
                System.out.println("Boa Tarde!");
                break;
            case "N":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor Inválido!");
        }
    }
}