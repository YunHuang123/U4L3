import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        int guess = 0;
        int numGuess = 0;
        int secretNum = 0;
        int maxRange = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a maximum range: ");
        maxRange = s.nextInt();
        secretNum = (int)(Math.random() * maxRange) + 1;


        while (guess != secretNum) {
            System.out.print("Guess: ");
            guess = s.nextInt();
            numGuess ++;
            if (guess > secretNum) {
                System.out.println("Too high");
            }
            if (guess < secretNum) {
                System.out.println("Too low");
            }
        }
        System.out.print("You got it, the secret number was " + secretNum + ". You guess it in " + numGuess +  " tries.");


    }
}
