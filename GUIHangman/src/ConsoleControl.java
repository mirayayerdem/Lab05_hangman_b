package GUIHangman.src;

import cs102.Hangman;
import java.util.Scanner;

/**
 * ConsoleControl
 *
 * @author Miray Ayerdem
 * @version  2020/12/1
 */

public class ConsoleControl
{
	public static void controlFor( Hangman hangman)
	{
		Scanner scan = new Scanner( System.in);

		char	letter;

		do
		{
			System.out.print( "Enter letter: ");
			letter = scan.next().charAt(0);

			System.out.println( "found " + hangman.tryThis( letter) + " occurences.");
			System.out.println();

		} while (!hangman.isGameOver());	// !hangman.isGameOver() );
	}
}
