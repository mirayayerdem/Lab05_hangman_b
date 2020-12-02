package GUIHangman.src;

import ConsoleHangman.src.IHangmanView;
import cs102.Hangman;

import javax.swing.*;
import java.awt.*;

/**
 * LabelsHangmanView
 *
 * @author Miray Ayerdem
 * @version  2020/12/2
 */

public class LabelsHangmanView extends JPanel implements IHangmanView
{
    Hangman hangman;
    JLabel incorrectTries, known, usedLetters, lost;
    private final int WIDTH = 400, HEIGHT = 400;

    //constructor
    public LabelsHangmanView()
    {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.PINK);
        incorrectTries = new JLabel("Incorrect Tries: ");
        incorrectTries.setBounds(20,20,400,40);
        incorrectTries.setFont(new Font("Verdana",Font.BOLD,15));
        known = new JLabel("The Secret Word: ");
        known.setBounds(20,80,400,40);
        known.setFont(new Font("Verdana",Font.BOLD,15));
        usedLetters = new JLabel("Used Letters: ");
        usedLetters.setBounds(20,140,400,40);
        usedLetters.setFont(new Font("Verdana",Font.BOLD,15));
        lost = new JLabel("Status: ");
        lost.setBounds(20,200,400,40);
        lost.setFont(new Font("Verdana",Font.BOLD,15));
        setLayout(null);
        add(incorrectTries); //adding to the panel
        add(known);
        add(usedLetters);
        add(lost);

    }
    @Override
    public void updateView(Hangman hangmanModel) //when the game is updating, texts of labels are set
    {
        this.hangman = hangmanModel;
        incorrectTries.setText("Incorrect tries: " + hangman.getNumOfIncorrectTries());
        known.setText("The secret word: " + hangman.getKnownSoFar());
        usedLetters.setText("Used letters: " + hangman.getUsedLetters());
        if(hangman.isGameOver())
        {
            if(hangman.hasLost()) //status of the player
                lost.setText("Status: You LOST buddy");

            else
                lost.setText("Status: You WIN buddy");
        }


    }
}
