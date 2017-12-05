package designpattern.strategy.csvimport;

public interface EntityBuilder<T> {

	T buildEntity(String[] columns);

}
