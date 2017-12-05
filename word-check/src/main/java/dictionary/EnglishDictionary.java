package dictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;



public class EnglishDictionary extends Dictionary{
    public EnglishDictionary(){
		String filename = "EnglishDictionary.txt";
		File dicf = new File(filename);		
		try{
		     BufferedReader br=new BufferedReader(new FileReader(dicf));    
		     String word = "";
		     while ((word = br.readLine())!=null) {
		    	 this.put(word, word);				
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null,"该文件不存在");
			System.exit(0);
		
		}
		
		
	}
	

}
