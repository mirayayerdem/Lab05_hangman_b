package GUIHangman.src;

import java.awt.*;

import ConsoleHangman.src.BasicSetup;
import ConsoleHangman.src.ConsoleHangmanView;
import GUIHangman.src.ConsoleControl;

import GUIHangman.src.SimpleJFrame;
import cs102.*;

/**
 * GUIHangman - GUI based MVC test for cs102 Hangman & IHangmanSetup
 *
 * @author David
 * @version 1.00 2013/4/7
 */

public class GUIHangman
{
	public GUIHangman()
	{
    	System.out.println( "Start of GUIHangman\n");


		HangmanModel		hangman;
		IHangmanSetup		basicSetup;
		ConsoleHangmanView consoleView;
		TextFieldControlPanel ctrlPanel;
		NewGameButtonControl newButton;
		LabelsHangmanView labelView;
		GallowsHangmanView gallows;

		basicSetup = new BasicSetup();
		hangman = new HangmanModel( basicSetup);

		consoleView = new ConsoleHangmanView();
		hangman.addView( consoleView);
		ctrlPanel = new TextFieldControlPanel(hangman);
		newButton = new NewGameButtonControl(hangman);
		labelView = new LabelsHangmanView();
		hangman.addView(labelView);
		gallows = new GallowsHangmanView(hangman);
		hangman.addView(gallows);

		 new SimpleJFrame( "GUIHangman", 	// title
							gallows,			// center
				 ctrlPanel, newButton,		// north, south
							null, labelView );	// east, west

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
