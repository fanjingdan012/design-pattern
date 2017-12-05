package spellchecker;

import doc.WordDocument;

public interface SpellChecker {
	public boolean check();

	boolean check(WordDocument doc);

}
