import java.util.Scanner;

public class ConversorClimatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.printf("A temperatura de %.1f°C é equivalente a %.1f°F.%n", temperaturaCelsius, temperaturaFahrenheit);

        scanner.close();
    }
}
