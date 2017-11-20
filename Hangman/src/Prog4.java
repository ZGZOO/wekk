//Name of program:              Hangman
//Programmer's name:            Zhijie Xu
//Current Date:                 11/17/2017
//Computer system and compiler: MacOS Sierra and JDK8
//Description:                  This Java program plays Hangman
//Variable(s):                  manOne (Hangman object variable)

import java.util.Scanner;

public class Prog4 {
	
	public Prog4() {
		Hangman manOne = new Hangman();
		System.out.println("Let's Play Hangman!\n");
		do{
			manOne.playGame();
		}while(wantPlayAgain());
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String [] args) {
		Prog4 newGame = new Prog4();
	}
	
	/*-----------------------------------------------------
	 * wantPlayAgain
	 *     This method asks the user if they want to play again
	 * Parameters: none
	 ------------------------------------------------------*/
	private boolean wantPlayAgain() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Want to play again? (y for yes): ");
		String playAgain = scanner.next();
		if(playAgain.toLowerCase().charAt(0) == 'y') {
			System.out.println("");
			return true;
		}
		return false;
	}	
}

/*
 * 
Let's Play Hangman!

Current word:
_ _ _ _ _ _ 
Enter a letter: b
Sorry, that's not in the word

Current word: 
_ _ _ _ _ _ 

Letters you guessed: b

You are allowed 5 more incorrect guesses

Enter a letter: A
Sorry, that's not in the word

Current word: 
_ _ _ _ _ _ 

Letters you guessed: ba

You are allowed 4 more incorrect guesses

Enter a letter: L
Sorry, that's not in the word

Current word: 
_ _ _ _ _ _ 

Letters you guessed: bal

You are allowed 3 more incorrect guesses

Enter a letter: C
You found a correct letter!

Current word: 
_ _ c _ _ _ 

Letters you guessed: balc

You are allowed 3 more incorrect guesses

Enter a letter: R
Sorry, that's not in the word

Current word: 
_ _ c _ _ _ 

Letters you guessed: balcr

You are allowed 2 more incorrect guesses

Enter a letter: D
Sorry, that's not in the word

Current word: 
_ _ c _ _ _ 

Letters you guessed: balcrd

You are allowed 1 more incorrect guesses

Enter a letter: M
Sorry, that's not in the word

Current word: 
_ _ c _ _ _ 

Letters you guessed: balcrdm

You are allowed 0 more incorrect guesses

Sorry, you used up all your incorrect guesses.
The answer = "pocket"
Want to play again? (y for yes): Y

Current word:
_ _ _ _ _ _ _ _ _ 
Enter a letter: T
You found a correct letter!

Current word: 
_ _ _ _ _ t _ _ _ 

Letters you guessed: t

You are allowed 6 more incorrect guesses

Enter a letter: F
Sorry, that's not in the word

Current word: 
_ _ _ _ _ t _ _ _ 

Letters you guessed: tf

You are allowed 5 more incorrect guesses

Enter a letter: B
Sorry, that's not in the word

Current word: 
_ _ _ _ _ t _ _ _ 

Letters you guessed: tfb

You are allowed 4 more incorrect guesses

Enter a letter: C
You found a correct letter!

Current word: 
_ c _ _ _ t _ c _ 

Letters you guessed: tfbc

You are allowed 4 more incorrect guesses

Enter a letter: L
Sorry, that's not in the word

Current word: 
_ c _ _ _ t _ c _ 

Letters you guessed: tfbcl

You are allowed 3 more incorrect guesses

Enter a letter: M
Sorry, that's not in the word

Current word: 
_ c _ _ _ t _ c _ 

Letters you guessed: tfbclm

You are allowed 2 more incorrect guesses

Enter a letter: E
Sorry, that's not in the word

Current word: 
_ c _ _ _ t _ c _ 

Letters you guessed: tfbclme

You are allowed 1 more incorrect guesses

Enter a letter: Q
Sorry, that's not in the word

Current word: 
_ c _ _ _ t _ c _ 

Letters you guessed: tfbclmeq

You are allowed 0 more incorrect guesses

Sorry, you used up all your incorrect guesses.
The answer = "acoustics"
Want to play again? (y for yes): Y

Current word:
_ _ _ _ _ _ _ 
Enter a letter: B
Sorry, that's not in the word

Current word: 
_ _ _ _ _ _ _ 

Letters you guessed: b

You are allowed 5 more incorrect guesses

Enter a letter: N
Sorry, that's not in the word

Current word: 
_ _ _ _ _ _ _ 

Letters you guessed: bn

You are allowed 4 more incorrect guesses

Enter a letter: C
You found a correct letter!

Current word: 
_ _ c _ _ _ _ 

Letters you guessed: bnc

You are allowed 4 more incorrect guesses

Enter a letter: A
Sorry, that's not in the word

Current word: 
_ _ c _ _ _ _ 

Letters you guessed: bnca

You are allowed 3 more incorrect guesses

Enter a letter: E
You found a correct letter!

Current word: 
_ _ c _ _ _ e 

Letters you guessed: bncae

You are allowed 3 more incorrect guesses

Enter a letter: T
You found a correct letter!

Current word: 
_ _ c t _ _ e 

Letters you guessed: bncaet

You are allowed 3 more incorrect guesses

Enter a letter: G
Sorry, that's not in the word

Current word: 
_ _ c t _ _ e 

Letters you guessed: bncaetg

You are allowed 2 more incorrect guesses

Enter a letter: S
Sorry, that's not in the word

Current word: 
_ _ c t _ _ e 

Letters you guessed: bncaetgs

You are allowed 1 more incorrect guesses

Enter a letter: M
Sorry, that's not in the word

Current word: 
_ _ c t _ _ e 

Letters you guessed: bncaetgsm

You are allowed 0 more incorrect guesses

Sorry, you used up all your incorrect guesses.
The answer = "picture"
Want to play again? (y for yes): Y

Current word:
_ _ _ _ _ _ _ _ 
Enter a letter: F
Sorry, that's not in the word

Current word: 
_ _ _ _ _ _ _ _ 

Letters you guessed: f

You are allowed 5 more incorrect guesses

Enter a letter: B
Sorry, that's not in the word

Current word: 
_ _ _ _ _ _ _ _ 

Letters you guessed: fb

You are allowed 4 more incorrect guesses

Enter a letter: C
You found a correct letter!

Current word: 
c _ _ _ _ _ _ _ 

Letters you guessed: fbc

You are allowed 4 more incorrect guesses

Enter a letter: T
You found a correct letter!

Current word: 
c _ _ _ t _ _ _ 

Letters you guessed: fbct

You are allowed 4 more incorrect guesses

Enter a letter: T
Not a letter or you already guessed that letter!
Enter another letter: ?
Not a letter or you already guessed that letter!
Enter another letter: 
{
Not a letter or you already guessed that letter!
Enter another letter: T
Not a letter or you already guessed that letter!
Enter another letter: V
Sorry, that's not in the word

Current word: 
c _ _ _ t _ _ _ 

Letters you guessed: fbctv

You are allowed 3 more incorrect guesses

Enter a letter: A
You found a correct letter!

Current word: 
c _ _ a t _ _ _ 

Letters you guessed: fbctva

You are allowed 3 more incorrect guesses

Enter a letter: E
You found a correct letter!

Current word: 
c _ e a t _ _ e 

Letters you guessed: fbctvae

You are allowed 3 more incorrect guesses

Enter a letter: R
You found a correct letter!

Current word: 
c r e a t _ r e 

Letters you guessed: fbctvaer

You are allowed 3 more incorrect guesses

Enter a letter: U
You found a correct letter!
You solved it: "creature"  Congratulations!
Want to play again? (y for yes): N
*/
