package exercises;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    private final static int MAX_NUMBER = 100;

    public static void main(String[] args) {
        int guess;
        int answer = getRandomNumber();

        Scanner in = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number: ");

        guess = in.nextInt();
        in.nextLine();

        System.out.printf("Your guess is: %d\n", guess);
        System.out.printf("The number I was thinking of is: %d\n", answer);
        System.out.printf("You were off by: %d\n", Math.abs(guess - answer));
    }

    private static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_NUMBER) + 1;
    }
}
