
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class SimpeWordDocument implements WordDocument {

	Collection<String> theWords = new ArrayList<String>();

	public SimpeWordDocument(String... words) {
		Collections.addAll(theWords, words);
	}

	@Override
	public Iterator<String> iterator() {
		return theWords.iterator();
	}

}
