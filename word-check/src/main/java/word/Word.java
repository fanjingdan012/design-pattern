package word;

public class Word {
	private int line;
	private int startPosition;
	private boolean isRight;
	private String word;
	public Word(int line,int startPosition,String word){
		this.setLine(line);
		this.setStartPosition(startPosition);
		this.setWord(word);
	}
	public void setLine(int line) {
		this.line = line;
	}
	public int getLine() {
		return line;
	}
	public void setStartPosition(int startPosition) {
		this.startPosition = startPosition;
	}
	public int getStartPosition() {
		return startPosition;
	}
	public void setRight(boolean isRight) {
		this.isRight = isRight;
	}
	public boolean isRight() {
		return isRight;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getWord() {
		return word;
	}
}
