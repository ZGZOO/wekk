
public class WordDatabase {
	private String[] words = {"achieve", "acoustics", "action", "activity", 
							 "afternoon", "apparel","appliance", "beginner", 
							 "boundary", "breakfast", "cabbage","calendar", 
							 "caption", "carpenter", "channel", "creature", 
							 "education","feather", "friction", "guitar", 
							 "health", "kitten", "language","locket", 
							 "lumber", "mountain", "partner", "passenger", 
							 "picture","pocket", "pollution", "railway", 
							 "reward", "squirrel", "stranger","temper", 
							 "territory", "texture", "thread", "treatment", 
							 "vacation","visitor", "volcano", "weather", 
							 "wilderness"};
	private int current_index = 0;
	
	public WordDatabase() {
		this.shuffleArray();
	}
	
	/*-----------------------------------------------------
	 * getArraySize
	 *     This method gets the size of the array of words.
	 * Parameters: none
	 ------------------------------------------------------*/
	public int getArraySize() {
		return words.length;
	}
	
	/*-----------------------------------------------------
	 * returnCurrentString
	 *     This method returns the current word to be guessed.
	 * Parameters: none
	 ------------------------------------------------------*/
	public String returnCurrentString() {
		int i = current_index;
		if(current_index < this.getArraySize()) {
			current_index++;
			return words[i];
		}	
		return null;
	}
	
	/*-----------------------------------------------------
	 * shuffleArray
	 *     This method shuffles the word array
	 * Parameters: none
	 ------------------------------------------------------*/
	public void shuffleArray() {
		int random_index;
		String temp;
		for(int index = 0; index < words.length; index++) {
			random_index = (int)(Math.random()*words.length);
			temp = words[random_index];
			words[random_index] = words[current_index];
			words[current_index] = temp;
		}
		current_index = 0;
	}
	
	/*-----------------------------------------------------
	 * hasMoreWords
	 *     This method checks if there are more words
	 * Parameters: none
	 ------------------------------------------------------*/
	public boolean hasMoreWords() {
		if(current_index < this.getArraySize())
			return true;
		else
			return false;
	}
}
