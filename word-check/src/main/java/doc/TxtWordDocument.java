package doc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.swing.JOptionPane;

import word.Word;

public class TxtWordDocument implements WordDocument{
	public Collection<Word> theWords = new ArrayList<Word>();
	@Override
	public Iterator<Word> iterator() {
		
		// TODO Auto-generated method stub
		return (Iterator<Word>) this.theWords;
	}
	public TxtWordDocument(File file){
		try{
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String txt = null;
			int line = 1;
			
			while((txt=reader.readLine())!=null){
				System.out.println(txt);
				String [] words = txt.split(" ");
				int endPosition=0;
				for(int i = 0;i<words.length;i++){
					endPosition+=words[i].length()+1;
					Word w = new Word(line, endPosition-words[i].length(), words[i]);
					this.theWords.add(w);
				}
				line++;
			}
		}catch(Exception ex){
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null,"该文件不存在");
			System.exit(0);
			
		}
	}
	

}
