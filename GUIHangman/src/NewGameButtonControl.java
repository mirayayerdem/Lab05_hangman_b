package GUIHangman.src;

import cs102.Hangman;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGameButtonControl extends JButton
{
    Hangman hangman;
    public NewGameButtonControl(Hangman hangman)
    {
        this.hangman = hangman;
        this.setText("New Game");
        this.addActionListener(new ButtonListener());
    }
    class ButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
           hangman.initNewGame();
        }
    }
}
