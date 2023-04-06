import java.util.Scanner;

public class CalcularPesoIdeal {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a altura em metros: ");
        double altura = input.nextDouble();
        
        double pesoIdeal = (72.7 * altura) - 58;//na minha cabeça isso ta muito impreciso kkkk
        
        System.out.printf("O peso ideal para essa altura é %.2f kg.", pesoIdeal);
        
        input.close();
    }
}
