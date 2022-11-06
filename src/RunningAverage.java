import java.util.Scanner;
public class RunningAverage {
    public static void main(String[] args) {
        // Instance Variables
        Scanner s = new Scanner(System.in);
        int count = 0;
        int input;
        int sum = 0;
        System.out.print("Enter a number (or -1 to quit): ");
        input = s.nextInt();
        if (input != -1) {
            count++;
            sum = input + sum;
        }
        while (input != -1) {
            System.out.print("Enter a number (or -1 to quit): ");
            input = s.nextInt();
            if (input != -1) {
                count++;
                sum = input + sum;
            }
        }
        if (count == 0) {
            System.out.println("You entered no numbers so nothing to show!");
        } else {
            double average = (double)sum / count;
            System.out.println("Sum: " + sum);
            System.out.println("Number of numbers added: " + count);
            System.out.println("Average: " + String.format("%.2f", average));
        }
    }
}