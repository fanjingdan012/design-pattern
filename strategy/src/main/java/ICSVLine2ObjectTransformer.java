package designpattern.strategy;

public interface ICSVLine2ObjectTransformer<T> {
	
	public T transform(String text[]);
	
}
