import java.util.Scanner;

//Comentario insignificante: sendo CLT, so de lembrar que tem tudo isso de desconto da uma tristeza

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora trabalhada: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double ir = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - ir - inss - sindicato;

        System.out.printf("\n+Salário Bruto : R$ %.2f\n", salarioBruto);
        System.out.printf("- IR (11%%) : R$ %.2f\n", ir);
        System.out.printf("- INSS (8%%) : R$ %.2f\n", inss);
        System.out.printf("- Sindicato (5%%) : R$ %.2f\n", sindicato);
        System.out.printf("= Salário Líquido : R$ %.2f\n", salarioLiquido);
    }
}
