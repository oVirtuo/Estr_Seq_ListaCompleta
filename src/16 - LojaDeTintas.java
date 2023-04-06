import java.util.Scanner;

public class LojaDeTintas {
    public static void main(String[] args) {
        final int COBERTURA_TINTA = 3; // 1 litro de tinta cobre 3 metros quadrados
        final int LITROS_LATA = 18; // cada lata de tinta contém 18 litros
        final double PRECO_LATA = 80.0; // preço de cada lata de tinta
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o tamanho em metros quadrados da área a ser pintada: ");
        int tamanhoArea = input.nextInt();
        
        // calcular a quantidade de litros de tinta necessária
        int litrosNecessarios = (int) Math.ceil((double) tamanhoArea / COBERTURA_TINTA);
        
        // calcular a quantidade de latas de tinta necessária
        int latasNecessarias = (int) Math.ceil((double) litrosNecessarios / LITROS_LATA);
        
        // calcular o preço total das latas de tinta necessárias
        double precoTotal = latasNecessarias * PRECO_LATA;
        
        System.out.println("Quantidade de latas de tinta a serem compradas: " + latasNecessarias);
        System.out.println("Preço total das latas de tinta: R$ " + precoTotal);
        
        input.close();
    }
}