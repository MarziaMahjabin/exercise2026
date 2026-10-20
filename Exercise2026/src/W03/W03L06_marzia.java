
package W03;

import java.util.Scanner;

public class W03L06_marzia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in gram: ");
        double gram = input.nextDouble();

        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialF = input.nextDouble();

        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalF = input.nextDouble();

        double M = gram / 1000;

        double initialC = (initialF - 32) / 1.8;
        double finalC = (finalF - 32) / 1.8;

        double Q = M * (finalC - initialC) * 4184;

        System.out.printf("The energy needed is %.6e%n", Q);

        input.close();
    }
}
