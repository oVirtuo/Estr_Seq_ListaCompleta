import java.util.Scanner;

public class ConvertCparaF {
    public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
        System.out.print("Digite a temperatura em Celsius: ");
          double celsius = input.nextDouble();
           
          double fahrenheit = (celsius * 1.8) + 32;
           
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    
      }
    }
 
 }