import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //nao foi especificado serem numeros inteiros então coloquei double
        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();
        
        double soma = num1 + num2;
        System.out.printf("A soma dos dois números é: %.2f", soma);
    }
}