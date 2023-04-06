import java.util.Scanner;

public class ConversorMetrosCentimetros {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o valor em metros
        System.out.print("Digite o valor em metros: ");
        double metros = scanner.nextDouble(); // Lê um valor em metros digitado pelo usuário

        // Converter metros para centímetros
        double centimetros = metros * 100; // 1 metro = 100 centímetros

        // Exibir o resultado da conversão
        System.out.println(metros + " metros equivalem a " + centimetros + " centímetros.");

        // Fechar o objeto Scanner
        scanner.close();
    }
}
