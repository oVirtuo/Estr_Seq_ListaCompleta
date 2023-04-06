import java.util.Scanner;

public class CalculaSalario {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
          System.out.print("Digite o valor que você ganha por hora: ");
            double valorHora = input.nextDouble();
            
            System.out.print("Digite o número de horas trabalhadas no mês: ");
            double horasTrabalhadas = input.nextDouble();
            
            double salario = valorHora * horasTrabalhadas;
            
            System.out.println("O seu salário neste mês é: R$ " + salario);
      }
     }
  }