import java.util.Scanner;

public class ExibirNumero {
   public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
         System.out.print("Digite um número: ");
         int numero = input.nextInt();
         
         System.out.println("O número informado foi " + numero);
      }
   }
}

