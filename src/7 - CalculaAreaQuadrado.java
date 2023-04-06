import java.util.Scanner;

public class CalculaAreaQuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o lado do quadrado: ");
        double lado = sc.nextDouble();
        double area = Math.pow(lado, 2);
        double dobroArea = 2 * area;
        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da área do quadrado é: " + dobroArea);
    }
}