package GUIHangman.src;

import cs102.Hangman;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * HangmanLetterButtonsController
 *
 * @author Miray Ayerdem
 * @version  2020/12/2
 */

public class HangmanLetterButtonsController implements ActionListener
{
    Hangman hangman;
    public HangmanLetterButtonsController(Hangman hangman)
    {
        this.hangman = hangman;
    }
    @Override
    public void actionPerformed(ActionEvent e) //letter of tapped button is sent to tryThis method
    {
        char c;
        JButton button = (JButton) e.getSource();
        c = button.getText().charAt(0);
        hangman.tryThis(c);
        button.setEnabled(false); //then set disabled

    }
}
