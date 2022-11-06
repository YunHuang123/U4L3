import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        // Instance Variables
        Scanner s = new Scanner(System.in);
        int input;
        int min = 0;
        int max = 0;
        int count = 0;

        System.out.print("Enter a number (or -1 to quit): ");
        input = s.nextInt();

        if (input != -1)
        {
            min = input;
            max = input;
        }
        while (input != -1)
        {
            System.out.print("Enter a number (or -1 to quit): ");
            input = s.nextInt();
            if (input < min && input != -1)
            {
                min = input;
            }
            if (input > max)
            {
                max = input;
            }
            count++;
        }
        if (count == 0)
        {
            System.out.println("You did not enter any numbers!");
        }
        if (count > 0)
        {
            System.out.println("Max is: " + max);
            System.out.println("Min is: " + min);
        }
    }
}

