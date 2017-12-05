package spellchecker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import word.Word;

import dictionary.Dictionary;
import dictionary.EnglishDictionary;
import doc.TxtWordDocument;
import doc.WordDocument;

public class EnglishSpellChecker implements SpellChecker{

	@Override
	public boolean check(WordDocument doc) {
		Collection<Word> a = ((TxtWordDocument)doc).theWords;
		Dictionary dict  = new EnglishDictionary();
		for (Word word :a){
			System.out.print("checking word "+word.getWord());
			if(dict.containsValue(word.getWord())){
				word.setRight(true);
				System.out.println(" right");
			}
			else{
				word.setRight(false);
				System.out.println(" wrong at line "+word.getLine()+" , "+word.getStartPosition()+"~"+(word.getStartPosition()+word.getWord().length()));
			}
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean check() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
