import java.util.Scanner;

public class MediaBimestre {
   public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
        double nota1, nota2, nota3, nota4;
          
          System.out.print("Digite a primeira nota: ");
          nota1 = input.nextDouble();
          
          System.out.print("Digite a segunda nota: ");
          nota2 = input.nextDouble();
          
          System.out.print("Digite a terceira nota: ");
          nota3 = input.nextDouble();
          
          System.out.print("Digite a quarta nota: ");
          nota4 = input.nextDouble();
          
          double soma = nota1 + nota2 + nota3 + nota4;
          double media = soma / 4;
          
          System.out.println("A soma das notas é: " + soma);
          System.out.println("A média das notas é: " + media);
    }
   }
}