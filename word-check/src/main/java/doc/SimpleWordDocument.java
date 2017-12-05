package doc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class SimpleWordDocument implements WordDocument {

	Collection<String> theWords = new ArrayList<String>();

	public SimpleWordDocument(String... words) {
		Collections.addAll(theWords, words);
	}

	@Override
	public Iterator<String> iterator() {
		return theWords.iterator();
	}
	

}