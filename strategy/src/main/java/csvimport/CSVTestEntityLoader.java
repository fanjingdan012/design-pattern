package designpattern.strategy.csvimport;

public class CSVTestEntityLoader extends CVSLoader<TestEntity> {

	@Override
	protected TestEntity buildEntity(String[] columns) {
		return new TestEntity(columns[0],columns[1],columns[2]);
	}

}
