import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o consumo de kWh? ");
        int kw = scan.nextInt();

        System.out.print("Qual o tipo de Instalção?");
        String instal = scan.next().toUpperCase();

        double total = 0;

        switch (instal){
            case "R" -> {
                double kwr = 0.70;
                if(kw >= 500){
                    kwr = 0.85;
                    total = kw * kwr;
                }else{
                    total = kw * kwr;
                }
                System.out.println("O valor total é R$ " + total);
            }

            case "C" -> {
                double kwc = 1.00;
                if(kw >= 1000){
                    kwc = 1.20;
                    total = kw * kwc;
                }else{
                    total = kw * kwc;
                }
                System.out.println("O valor total é R$ " + total);
            }

            case "I" -> {
                double kwi = 1.50;
                if(kw >= 5000){
                    kwi = 2.00;
                    total = kw * kwi;
                }else{
                    total = kw * kwi;
                }
                System.out.println("O valor total é R$ " + total);
            }
        }
    }
}
