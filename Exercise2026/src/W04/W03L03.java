package W04;
import java.util.Scanner;

public class W03L03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the sales volume: ");
        double sales = input.nextDouble();

        double rate;
        if (sales <= 100) {
            rate = 0.05;
        } else if (sales <= 500) {
            rate = 0.075;
        } else if (sales <= 1000) {
            rate = 0.10;
        } else {
            rate = 0.125;
        }

        double commission = sales * rate;
        System.out.printf("Commission: %.2f%n", commission);
    }
}
