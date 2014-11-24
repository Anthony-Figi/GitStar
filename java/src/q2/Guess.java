package q2;

import java.util.Random;
import java.util.Scanner;

/**
 * <p>A guessing game where the player has to guess a number
 * between 1-100 (inclusive) and will keep entering
 * a number until you guess the correct one.</p>
 *
 * @author Anthony Figueroa
 * @version 1.0
 */
public class Guess {
    /**Holds the maximum number for the guessing game range.*/
    private static final int MAX_NUMBER = 100;
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber;
        int correctAnswers = 0;
        int guessedNumber = 0;
        String playAgain;
        System.out.println("========Hi-Lo Guessing Game========");
        do {
            randomNumber = rand.nextInt(MAX_NUMBER) + 1;
            //testing only
            //System.out.println(randomNumber);
            
            do {
                System.out.print("Guess a number(0 to quit): ");
                guessedNumber = input.nextInt();
                if (guessedNumber == randomNumber) {
                    correctAnswers++;
                    System.out.println("\nCongratulation you guessed it right " 
                            + correctAnswers + " times!");
                    
                    randomNumber = rand.nextInt(MAX_NUMBER) + 1;
                    //testing only
                   // System.out.println(randomNumber);
                } else if (guessedNumber != randomNumber && guessedNumber != 0){
                    System.out.println("Sorry, guess again!");
                }
            } while(guessedNumber != randomNumber && guessedNumber != 0);
            System.out.print("\nPlay again?(y/n): ");
            playAgain = input.next();
        } while (playAgain.equalsIgnoreCase("y"));
        input.close();
        System.out.println("\nQuestion two was called and ran sucessfully.");
    }

};
