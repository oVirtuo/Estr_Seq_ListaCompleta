import java.util.Scanner;

public class CalculaExpressoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Informe o segundo número inteiro: ");
        int num2 = sc.nextInt();

        System.out.print("Informe um número real: ");
        double numReal = sc.nextDouble();

        int produto = (num1 * 2) * (num2 / 2);
        double soma = (num1 * 3) + numReal;
        double cubo = Math.pow(numReal, 3);

        System.out.println("O produto do dobro do primeiro com a metade do segundo é: " + produto);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + soma);
        System.out.printf("O terceiro elevado ao cubo é: %.1f", cubo);
    }
}