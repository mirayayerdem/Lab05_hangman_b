package GUIHangman.src;

import java.awt.*;

import ConsoleHangman.src.BasicSetup;
import ConsoleHangman.src.ConsoleHangmanView;
import ConsoleHangman.src.IHangmanView;
import GUIHangman.src.ConsoleControl;

import GUIHangman.src.SimpleJFrame;
import cs102.*;

/**
 * GUIHangman
 *
 * @author Miray Ayerdem
 * @version  2020/12/2
 */

public class GUIHangman
{
	public GUIHangman()
	{
    	System.out.println( "Start of GUIHangman\n");

		//instances
		HangmanModel		hangman;
		IHangmanSetup		basicSetup;
		ConsoleHangmanView consoleView;
		TextFieldControlPanel ctrlPanel;
		NewGameButtonControl newButton;
		LabelsHangmanView labelView;
		GallowsHangmanView gallows;
		HangmanLetterButtonsController listener;
		HangmanLetterButtonControls buttonController;

		//constructions and adding Views
		basicSetup = new BasicSetup();
		hangman = new HangmanModel( basicSetup);

		consoleView = new ConsoleHangmanView();
		hangman.addView( consoleView);

		ctrlPanel = new TextFieldControlPanel(hangman);

		newButton = new NewGameButtonControl(hangman);
		hangman.addView(newButton);

		labelView = new LabelsHangmanView();
		hangman.addView(labelView);

		gallows = new GallowsHangmanView(hangman);
		hangman.addView(gallows);

		listener = new HangmanLetterButtonsController(hangman);

		buttonController = new HangmanLetterButtonControls(hangman.getAllLetters(),13,2);
		buttonController.addActionListener(listener);
		hangman.addView(buttonController);


		 new SimpleJFrame( "GUIHangman", 	// title
							gallows,			// center
				 ctrlPanel, newButton,		// north, south
							buttonController, labelView );	// east, west

		// this is an infinite loop reading from the console... not clever!
		ConsoleControl.controlFor( hangman);
	}

	public static void main( String[] args)
	{
		new GUIHangman();

//		// This is the approved way to initialise GUIs
//		// but won't work with the ConsoleControl as is!
//		// --------------------------------------------
//		SwingUtilities.invokeLater(
//			new Runnable() {
//			    public void run() {
//	        		new GUIHangman();
//	        		new GUIHangman();
//	    		}
//			});
	}

} // end of class GUIHangman
