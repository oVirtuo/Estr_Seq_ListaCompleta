import java.util.Scanner;

public class CalcularPesoIdealMF {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a altura em metros: ");
        double altura = input.nextDouble();
        System.out.print("Digite o sexo (M ou F): ");
        char sexo = input.next().charAt(0);
        
        double pesoIdeal;
        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Tente novamente!");
            input.close();
            return;
        }
        
        System.out.printf("O peso ideal para essa altura e sexo é %.2f kg.", pesoIdeal);
        
        input.close();
    }
}