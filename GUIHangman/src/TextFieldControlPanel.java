package GUIHangman.src;

import cs102.Hangman;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * TextFieldControlPanel
 *
 * @author Miray Ayerdem
 * @version  2020/12/2
 */

public class TextFieldControlPanel extends JPanel {
    //instances
    Hangman hangman;
    JTextField txt;
    ActionListener listener;

    //constructor
    public TextFieldControlPanel(Hangman hangman)
    {
        this.hangman = hangman;
        txt = new JTextField(50);
        txt.addActionListener(new MyActionListener());
        add(txt);

        }

    class MyActionListener implements ActionListener {  //listener class

        @Override
        public void actionPerformed(ActionEvent e)
        {
            String letter;
            String letters = txt.getText();
            letter = "";
            for(int i = 0 ; i < letters.length() ; i++) //when the button is tapped, call the tryThis method
            {
                hangman.tryThis(letters.charAt(i));
            }
            txt.setText(""); //set the empty text
        }
    }

    }

