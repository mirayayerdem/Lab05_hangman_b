package ConsoleHangman.src;

import java.util.Scanner;
import cs102.*;

/**
 * ConsoleHangman
 *
 * @author Miray Ayerdem
 * @version  2020/12/1
 */

public class ConsoleHangman_b
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner( System.in);


		System.out.println( "Start of ConsoleHangman\n");

		// VARIABLES

		IHangmanView view;
		HangmanModel hangmanModel;
		IHangmanSetup setup;

		// PROGRAM CODE
		view = new ConsoleHangmanView();
		setup = new BasicSetup();
		hangmanModel = new HangmanModel(setup);
		hangmanModel.addView(view); //adding a view

		do
		{
			System.out.println("Enter a letter: ");
			char letter = scan.nextLine().charAt(0);
			hangmanModel.tryThis(letter);
			if(hangmanModel.isGameOver())
				hangmanModel.initNewGame();
		}
		while(!hangmanModel.isGameOver());
		// ToDo - allow user to repeatedly enter a letter and tryThis letter
		//		  then show game status, until gameover. Finally report win/lose.


		System.out.println( "\nEnd of ConsoleHangman\n" );
	}

} // end of class ConsoleHangman
