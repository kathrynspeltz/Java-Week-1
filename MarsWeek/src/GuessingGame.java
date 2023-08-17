import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public GuessingGame() {
        System.out.println("Hello, what is your name?");
        System.out.println("Type your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Welcome to the game " + name);
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println("Guess a number 1 - 100");
        input = new Scanner(System.in);
        int guesses = 0;

        while (true) {
            int guess;
            try {
                guess = input.nextInt();
            } catch (Exception e) {
                String bad_input = input.next();   // need to progress past bad input
                System.out.println("Guess not valid. That's not an integer, try again");
                continue;
            }
        if ( 1 > guess || guess > 100) {
        System.out.println("Guess not valid, guess between 1 - 100");
        } else if (guess < number) {
                System.out.println("Sorry, your guess was too low, guess higher");
                guesses += 1;
            } else if ( guess > number) {
                System.out.println("Sorry, your guess was too high, guess lower");
                guesses += 1;
            } else {
                guesses += 1;
                System.out.println("You guessed correctly, you guessed this many times:" + guesses);
                break;
            }
        }
    }
}