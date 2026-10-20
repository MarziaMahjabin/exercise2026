
package W03;

import java.util.Random;

public class W03L03 {
    public static void main(String[] args) {
        Random rand = new Random();

        int num1 = rand.nextInt(41) + 10;
        int num2 = rand.nextInt(41) + 10;
        int num3 = rand.nextInt(41) + 10;

        int sum = num1 + num2 + num3;
        double average = sum / 3.0;

        System.out.println("The three random numbers are: "
                + num1 + ", " + num2 + ", " + num3);

        System.out.printf("Sum = %.2f%n", (double) sum);
        System.out.printf("Average = %.2f%n", average);
    }
}
