public class ConversorMonetario {
    public static void main(String[] args) {

        double valorEmDolar = 10.99;
        double taxaConvercao = 5.68;

        double valorEmReal = valorEmDolar + taxaConvercao;

        System.out.println("O valor convertido é de: " + valorEmReal);
    }
}