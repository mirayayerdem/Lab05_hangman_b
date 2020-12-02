package ConsoleHangman.src;

import cs102.IHangmanSetup;

/**
 * BasicSetup
 *
 * @author Miray Ayerdem
 * @version  2020/12/1
 */

public class BasicSetup implements IHangmanSetup
{
	private static String[] words = { "Broken", "Magical", "I",
									"JRobo is the best", "amazing",
									"cool", "David", "Incredible" };

	public int getMaxAllowedIncorrectTries()
	{
		return 6;
	}

	public char	getBlankChar()
	{
		return '*';
	}

	public String getCharsToPreserve()
	{
		return " ";
	}

	public String getAllLetters()
	{
		return "abcdefghijklmnopqrstuvwxyz";
	}

	public String chooseSecretWord()
	{
		int random = (int) (Math.random() * words.length );
		return words[ random];
	}
}