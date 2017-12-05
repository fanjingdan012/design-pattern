import java.io.File;

import javax.swing.JOptionPane;

import doc.TxtWordDocument;
import doc.WordDocument;

import spellchecker.EnglishSpellChecker;
import spellchecker.SpellChecker;


public class Test {
	public static void main(String [] args){
		String filename = JOptionPane.showInputDialog("请输入要检查的文件");
		File file = new File(filename);
		WordDocument w = new TxtWordDocument(file);
		SpellChecker s = new EnglishSpellChecker();
		s.check(w);
		
	}

}
