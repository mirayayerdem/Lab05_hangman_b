package GUIHangman.src;

import ConsoleHangman.src.IHangmanView;
import cs102.Hangman;
import cs102.HangmanModel;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
/**
 * LetterButtonControls
 *
 * @author Miray Ayerdem
 * @version  2020/12/2
 */

public class LetterButtonControls extends JPanel
{
	//instances

	public LetterButtonControls( String letters)
	{
		this( letters, 2, 13);
		setPreferredSize(new Dimension(200,400));
	}

	//constructors
	public LetterButtonControls( String letters, int rows, int cols)
	{
		setPreferredSize(new Dimension(200,400));
		setBorder( new TitledBorder("Choose a letter...") );
		setLayout( new GridLayout( rows, cols) );

		for( int i = 0; i < letters.length(); i++) { //adding buttons to the panel
			JButton b = new JButton( "" + letters.charAt(i) );
			b.setMargin( new Insets( 1, 2, 1, 2) );
			add( b);
		}
	}

	/**
	 * adding listeners to the buttons
	 * @param l actionlistener obj
	 */
	public void addActionListener( ActionListener l)
	{
		Component[] buttons = getComponents();
		for ( Component b : buttons )
		{
			( (JButton) b).addActionListener( l);
		}
	}

	/**
	 * set all buttons disabled or enabled
	 * @param state is e boolean
	 */
	public void setEnabledAll( boolean state)
	{
		for ( Component c : getComponents() ) {
			((JButton) c).setEnabled( state);
		}
	}

	/**
	 * set disabled the button if it is used letter
	 * @param letters used letters
	 */
	public void setDisabled( String letters)
	{
		for ( Component c : getComponents() ) {
			char ch = ((JButton) c).getLabel().charAt(0);
			if ( letters.indexOf(ch) >= 0)
				((JButton) c).setEnabled( false);
		}
	}

}