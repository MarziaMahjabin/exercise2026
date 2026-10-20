
package W03;

import java.util.Random;

public class W03L05 {
    public static void main(String[] args) {
        Random rand = new Random();

        int number = rand.nextInt(10001);
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("The random number is: " + number);
        System.out.println("The sum of all digits is: " + sum);
    }
}
