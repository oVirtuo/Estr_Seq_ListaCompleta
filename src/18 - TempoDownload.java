import java.util.Scanner;

public class TempoDownload {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o tamanho do arquivo em MB: ");
        double tamanhoArquivo = input.nextDouble();

        System.out.print("Informe a velocidade do link de Internet em Mbps: ");
        double velocidadeLink = input.nextDouble();

        double tempoDownloadSegundos = tamanhoArquivo * 8 / velocidadeLink; // em segundos

        int horas = (int) (tempoDownloadSegundos / 3600);
        int minutos = (int) ((tempoDownloadSegundos % 3600) / 60);
        int segundos = (int) (tempoDownloadSegundos % 60);

        System.out.printf("Tempo aproximado de download: %d hora(s), %02d minuto(s) e %02d segundo(s)%n", horas, minutos, segundos);

        input.close();
    }

}