import java.util.Scanner;

public class ConvertMetroCent {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite um valor em metros: ");
            double metros = input.nextDouble();
            
            double centimetros = metros * 100;
            
            System.out.println(metros + " metros é igual a " + centimetros + " centímetros.");
        }
    }
}  
