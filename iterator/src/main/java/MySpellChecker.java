
public class MySpellChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		WordDocument doc = new SimpeWordDocument("first", "second");
		for(String word : doc){
			System.out.println(word);
		}

	}

}
