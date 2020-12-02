package GUIHangman.src;

import ConsoleHangman.src.IHangmanView;
import cs102.Hangman;

import javax.swing.*;
import java.awt.*;
/**
 * GallowsHangmanView
 *
 * @author Miray Ayerdem
 * @version  2020/12/2
 */

public class GallowsHangmanView extends JPanel implements IHangmanView
{
    //instances

    private Hangman hangman;
    private final int WIDTH = 400, HEIGHT = 400;

    //constructor
    public GallowsHangmanView(Hangman hangman)
    {
        this.hangman = hangman;
        this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        this.setBackground(Color.ORANGE);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(70,30,100,20); //top rectangle
        g.setColor(Color.BLACK);
        g.fillRect(160,50,6,40); //rope
        g.setColor(Color.BLACK);
        g.fillRect(70,50,20,200); //pole
        g.setColor(Color.BLACK);
        g.fillRect(20,250,200,40); //base

        if(hangman != null) { //add the parts of the man according to the incorrect tries
            if (hangman.getNumOfIncorrectTries() >= 1)
                g.drawOval(143, 90, 40, 40); //the head
            if (hangman.getNumOfIncorrectTries() >= 2)
                g.drawLine(163, 130, 163, 175); //the body
            if (hangman.getNumOfIncorrectTries() >= 3)
                g.drawLine(163, 175, 143, 210); //left leg
            if (hangman.getNumOfIncorrectTries() >= 4)
                g.drawLine(163, 175, 183, 210); //right leg
            if (hangman.getNumOfIncorrectTries() >= 5)
                g.drawLine(163, 140, 183, 155); //right arm
            if (hangman.getNumOfIncorrectTries() >= 6)
                g.drawLine(163, 140, 143, 155); //left arm


        }


    }
    @Override
    public void updateView(Hangman hangmanModel)
    {
        repaint();
    } //calls the paintComponent method
}
