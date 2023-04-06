import java.util.Scanner;

public class CalcularMulta {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o peso em quilos dos peixes: ");
        double peso = input.nextDouble();
        
        double excesso = 0.0;
        double multa = 0.0;
        
        //se o peso for menor que 50 passa direto pro else
        if (peso > 50.0) {
            excesso = peso - 50.0;
            multa = excesso * 4.0;
        }
        
        System.out.printf("Peso dos peixes: %.2f kg\n", peso);
        
        //não tendo excesso, vai pro else abaixo tambem
        if (excesso > 0.0) {
            System.out.printf("Excesso de peso: %.2f kg\n", excesso);
            System.out.printf("Valor da multa: R$ %.2f", multa);
        } 
        else {
            System.out.println("Não houve excesso de peso. Nenhuma multa será aplicada.");
        }
        
        input.close();
    }
}