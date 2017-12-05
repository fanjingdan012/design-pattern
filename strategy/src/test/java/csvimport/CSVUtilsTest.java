package csvimport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Collection;

public class CSVUtilsTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		StringReader stringReader = new StringReader("a,b,c\n1,2,3\n4,5,6");
		BufferedReader reader = new BufferedReader(stringReader);

		Collection<TestEntity> result = CSVUtils.loadEntities(reader,
				new EntityBuilder<TestEntity>() {

					@Override
					public TestEntity buildEntity(String[] columns) {
						return new TestEntity(columns[0], columns[1],
								columns[2]);
					}
				});
		for (TestEntity entity : result) {
			System.out.println(entity);
		}

	}

}
