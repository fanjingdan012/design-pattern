package csvimport;

public interface EntityBuilder<T> {

	T buildEntity(String[] columns);

}
