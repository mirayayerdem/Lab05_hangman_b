package GUIHangman.src;

import ConsoleHangman.src.IHangmanView;
import cs102.Hangman;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * NewGameButtonControl
 *
 * @author Miray Ayerdem
 * @version  2020/12/2
 */

public class NewGameButtonControl extends JButton implements IHangmanView
{
    //instances
    Hangman hangman;

    //constructor
    public NewGameButtonControl(Hangman hangman)
    {
        this.hangman = hangman;
        this.setText("New Game");
        this.setEnabled(false);
        this.addActionListener(new ButtonListener());
    }

    @Override
    /**
     * all buttons are enabled
     */
    public void updateView(Hangman hangmanModel)
    {
        if(hangman.isGameOver())
            this.setEnabled(true);
    }

    class ButtonListener implements ActionListener //new game has been started
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            hangman.initNewGame();
        }
    }
}
