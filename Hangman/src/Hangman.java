import java.util.Scanner;

public class Hangman {
	private WordDatabase word_database;
	private String current_answer;
	private StringBuilder correct_answer;
	private StringBuilder char_guessed;

	public Hangman() {
		word_database = new WordDatabase();
		char_guessed = new StringBuilder();
		correct_answer = new StringBuilder();
	}
	
	/*-----------------------------------------------------
	 * NewGame
	 *     This method check if a new game can be played.
	 * Parameters: none
	 ------------------------------------------------------*/
	private boolean NewGame() {
		if (word_database.hasMoreWords()) {
			current_answer = word_database.returnCurrentString();
			char_guessed.setLength(0);
			correct_answer.setLength(0);
			for (int i = 0; i < current_answer.length(); i++) {
				correct_answer.insert(i, '_');
			}
			return true;
		}
		return false;
	}

	/*-----------------------------------------------------
	 * playGame
	 *     This method playes the game.
	 * Parameters: none
	 ------------------------------------------------------*/
	public void playGame() {
		Scanner scanner = new Scanner(System.in);
		int bad_guess_counter = 6;

		if (this.NewGame()) {
			System.out.println("Current word:");
			for (int i = 0; i < correct_answer.length(); i++) {
				System.out.print(correct_answer.charAt(i));
				System.out.print(" ");
			}
			System.out.println("");
			// loop here
			while (bad_guess_counter > 0 && !successGuess(current_answer, correct_answer)) {
				System.out.print("Enter a letter: ");
				String letterGuessed = scanner.next();
				letterGuessed = letterGuessed.toLowerCase();
				while (notLetterOrAlreadyGuessed(letterGuessed, char_guessed)) {
					System.out.println("Not a letter or you already guessed that letter!");
					System.out.print("Enter another letter: ");
					letterGuessed = scanner.next();
					letterGuessed = letterGuessed.toLowerCase();
				}
				// method check if correct letter or not
				if (correctGuess(letterGuessed, current_answer)) {
					System.out.println("You found a correct letter!");
				} else {
					bad_guess_counter--;
					System.out.println("Sorry, that's not in the word");
				}
				// method check if guess the word correctly
				if (successGuess(current_answer, correct_answer)) {
					System.out.println("You solved it: " + "\"" + current_answer + "\"" + "  Congratulations!");
				} else {

					// display updated word
					System.out.println("");
					System.out.println("Current word: ");
					for (int i = 0; i < correct_answer.length(); i++) {
						System.out.print(correct_answer.charAt(i));
						System.out.print(" ");
					}
					System.out.println("\n");

					// display the letter guessed
					char_guessed.append(letterGuessed.substring(0,1));
					System.out.print("Letters you guessed: ");
					System.out.println(char_guessed);
					System.out.println("");

					// how many chances left
					System.out.println("You are allowed " + bad_guess_counter + " more incorrect guesses\n");
				}
			}
			// method display result
			if(bad_guess_counter == 0) {
				System.out.println("Sorry, you used up all your incorrect guesses.");
				System.out.println("The answer = " + "\"" + current_answer + "\"");
			}
		}
		else {
			System.out.println("you ran out of words. QUITTING");
			System.exit(0);
		}
	}
	
	/*-----------------------------------------------------
	 * notLetterOrAlreadyGuessed
	 *     This method checks if the letter is a letter or
	 *     it is already guessed.
	 * Parameters: aLetter(String), guessedLetters(StringBuilder)
	 ------------------------------------------------------*/
	private boolean notLetterOrAlreadyGuessed(String aLetter, StringBuilder guessedLetters) {
		for (int index = 0; index < guessedLetters.length(); index++) {
			if (aLetter.charAt(0) == guessedLetters.charAt(index)) {
				return true;
			}
		}
		if (Character.isLetter(aLetter.charAt(0))) {
			return false;
		} else {
			return true;
		}
	}

	/*-----------------------------------------------------
	 * correctGuess
	 *     This method checks the player has guessed a correct letter.
	 * Parameters: aLetter(String), theWord(String)
	 ------------------------------------------------------*/
	private boolean correctGuess(String aLetter, String theWord) {
		boolean result = false;

		for (int i = 0; i < theWord.length(); i++) {
			if (aLetter.charAt(0) == theWord.charAt(i)) {
				correct_answer.setCharAt(i, theWord.charAt(i));
				result = true;
			}
		}
		return result;
	}

	/*-----------------------------------------------------
	 * successGuess
	 *     This method checks the player has guessed a correct word.
	 * Parameters: theWord(String), theAnswer(StringBuilder)
	 ------------------------------------------------------*/
	private boolean successGuess(String theWord, StringBuilder theAnswer) {
		int wordLength = theWord.length();

		for (int index = 0; index < wordLength; index++) {
			if (theWord.charAt(index) != theAnswer.charAt(index)) {
				return false;
			}
		}
		return true;
	}

}
