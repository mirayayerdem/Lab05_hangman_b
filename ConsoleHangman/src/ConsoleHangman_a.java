package ConsoleHangman.src;

import java.util.Scanner;
import cs102.*;

/**
 * ConsoleHangman
 *
 * @author Miray Ayerdem
 * @version 1.00 2013/4/7
 */

public class ConsoleHangman_a
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in);

        System.out.println( "Start of ConsoleHangman\n");

        // VARIABLES
        Hangman		hangman;

        // PROGRAM CODE
        hangman = new Hangman( new BasicSetup() );

        do //letters are tried until game is over
        {
            System.out.println("Enter a letter: ");
            String letter = scan.nextLine();
            for(int i = 0 ; i < letter.length(); i++ ) { //strings chars are found
                int number = hangman.tryThis(letter.charAt(i));
                if (number == -1) {
                    System.out.println("The game is Over");
                    System.out.println("You had " + hangman.getNumOfIncorrectTries() + " attempts");
                    System.out.println(hangman.getKnownSoFar());
                } else if (number == -2) {
                    System.out.println("You have already try this letter");
                    System.out.println("You had " + hangman.getNumOfIncorrectTries() + " attempts");
                    System.out.println(hangman.getKnownSoFar());
                } else if (number == -4) {
                    System.out.println("It is an empty input");
                    System.out.println("You had " + hangman.getNumOfIncorrectTries() + " attempts");
                    System.out.println(hangman.getKnownSoFar());
                } else if (number == -3) {
                    System.out.println("It is not an appropriate letter");
                    System.out.println("You had " + hangman.getNumOfIncorrectTries() + " attempts");
                    System.out.println(hangman.getKnownSoFar());
                } else if (number == 0) {
                    System.out.println("The secret word does not contain the letter");
                    System.out.println("You had " + hangman.getNumOfIncorrectTries() + " attempts");
                    System.out.println(hangman.getKnownSoFar());
                } else {
                    System.out.println("The secret word contains the letter");
                    System.out.println("You had " + hangman.getNumOfIncorrectTries() + " attempts");
                    System.out.println(hangman.getKnownSoFar());
                }
            }
        }
        while(!hangman.isGameOver());
        if(hangman.hasLost()) //if gamer has lost
            System.out.println("You have lost buddy");
        else
        {
            System.out.println("You win"); //else they win
        }


        // ToDo - allow user to repeatedly enter a letter and tryThis letter
        //		  then show game status, until gameover. Finally report win/lose.


        System.out.println( "\nEnd of ConsoleHangman\n" );
    }

} // end of class ConsoleHangman