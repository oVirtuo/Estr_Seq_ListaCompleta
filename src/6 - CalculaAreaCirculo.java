import java.util.Scanner;

public class CalculaAreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o raio do círculo: ");
        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área do círculo é: %.2f", area);
    }
}