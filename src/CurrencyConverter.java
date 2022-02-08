import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("Currency Converter");
        System.out.println("Enter amount: ");
        Scanner scanner = new Scanner(System.in);
        int Usd = scanner.nextInt();
        final int rate = 23000;
        int Vnd = Usd*rate;
        System.out.println("Convert:");
        System.out.println(Vnd + "VND");
    }
}
