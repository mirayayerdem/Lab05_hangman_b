package GUIHangman.src;

import cs102.Hangman;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldControlPanel extends JPanel {
    Hangman hangman;
    JTextField txt;
    ActionListener listener;

    public TextFieldControlPanel(Hangman hangman)
    {
        this.hangman = hangman;
        txt = new JTextField(50);
        txt.addActionListener(new MyActionListener());
        add(txt);

        }

    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String letter;
            String letters = txt.getText();
            letter = "";
            for(int i = 0 ; i < letters.length() ; i++)
            {
                hangman.tryThis(letters.charAt(i));
            }
            txt.setText("");
        }
    }

    }

