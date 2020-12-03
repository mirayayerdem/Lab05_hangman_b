package GUIHangman.src;

import ConsoleHangman.src.IHangmanView;
import cs102.Hangman;
/**
 * HangmanLetterButtonsControls
 *
 * @author Miray Ayerdem
 * @version  2020/12/2
 */

public class HangmanLetterButtonControls extends LetterButtonControls implements IHangmanView {
    private String letters;
    //constructors

    public HangmanLetterButtonControls(String letters)
    {
        super(letters);
    }
    public HangmanLetterButtonControls(String letters, int row, int column)
    {
        super(letters,row,column);
    }

    @Override
    /**
     * according the status of the game buttons are disabled or enabled
     */
    public void updateView(Hangman hangmanModel)
    {
        setDisabled( hangmanModel.getUsedLetters());
        if ( hangmanModel.isGameOver() ) //if game is over, all buttons are disabled
        {
            setEnabledAll( false);
        }
        if ( hangmanModel.getUsedLetters().length() == 0 ) //if the game is news, all buttons are enabled
        {
            setEnabledAll(true);
        }
    }
}
