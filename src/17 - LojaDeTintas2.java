import java.util.Scanner;

public class LojaDeTintas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double area, litrosNecessarios, latas, galoes, precoTotal, litrosRestantes;
        int latasInt, galoesInt;

        System.out.print("Digite o tamanho da área a ser pintada em metros quadrados: ");
        area = input.nextDouble();

        litrosNecessarios = (area / 6.0);
        latas = Math.floor(litrosNecessarios / 18.0); // Quantidade de latas necessárias, arredondando para baixo
        galoes = Math.ceil((litrosNecessarios % 18.0) / 3.6); // Quantidade de galões necessários, arredondando para cima

        litrosRestantes = litrosNecessarios - (latas * 18.0); // Calcula a quantidade de litros restantes após a adição das latas

        if (litrosRestantes > 0 && litrosRestantes <= 3.6) { // Se a quantidade de litros restantes for menor ou igual a um galão
            galoes = 1; // Adiciona um galão
            litrosRestantes = 0; // Zera os litros restantes
        } else if (litrosRestantes > 3.6) { // Se a quantidade de litros restantes for maior que um galão
            galoes = Math.ceil(litrosRestantes / 3.6); // Adiciona galões adicionais
            litrosRestantes -= ((galoes - 1) * 3.6); // Subtrai os litros adicionais, considerando a primeira lata que já foi adicionada
        }

        precoTotal = (latas * 80.0) + (galoes * 25.0); // Calcula o preço total

        latasInt = (int)latas; // Converte latas e galões para inteiros
        galoesInt = (int)galoes;

        if(latasInt > 1 && galoesInt > 1){
            area = 0; litrosNecessarios = 0; latas = 0; galoes = 0; precoTotal = 0; litrosRestantes = 0;

            litrosNecessarios = (area / 6.0 * 1.1); // Adiciona 10% de folga e arredonda para cima
            latas = Math.floor(litrosNecessarios / 18.0); // Quantidade de latas necessárias, arredondando para baixo
            galoes = Math.ceil((litrosNecessarios % 18.0) / 3.6); // Quantidade de galões necessários, arredondando para cima

            litrosRestantes = litrosNecessarios - (latas * 18.0); // Calcula a quantidade de litros restantes após a adição das latas

            if (litrosRestantes > 0 && litrosRestantes <= 3.6) { // Se a quantidade de litros restantes for menor ou igual a um galão
                galoes = 1; // Adiciona um galão
                litrosRestantes = 0; // Zera os litros restantes
            } else if (litrosRestantes > 3.6) { // Se a quantidade de litros restantes for maior que um galão
                galoes = Math.ceil(litrosRestantes / 3.6); // Adiciona galões adicionais
                litrosRestantes -= ((galoes - 1) * 3.6); // Subtrai os litros adicionais, considerando a primeira lata que já foi adicionada
            }
        }

        System.out.printf("Você precisará de %.1f L de tinta.%n", litrosNecessarios);
        System.out.println("Você precisará de:");
        System.out.println(latasInt + " lata(s) de tinta de 18 litros cada");
        System.out.println(galoesInt + " galão(ões) de tinta de 3,6 litros cada");
        System.out.printf("O preço total é de R$ %.2f", precoTotal);

        input.close();
    }
}
