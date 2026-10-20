import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) / 1.8;

        System.out.printf("Temperature in Celsius: %.2f%n", celsius);

        input.close();
    }
}
