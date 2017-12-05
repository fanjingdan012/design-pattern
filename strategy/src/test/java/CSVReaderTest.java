package designpattern.strategy;

import java.io.StringReader;
import java.util.Collection;

import junit.framework.TestCase;

public class CSVReaderTest extends TestCase {

	private final class TestEntityTransformer implements
			ICSVLine2ObjectTransformer<TestEntity> {
		@Override
		public TestEntity transform(String stringItems[]) {
			return new TestEntity(Integer.parseInt(stringItems[0]), Integer
					.parseInt(stringItems[1]), Integer.parseInt(stringItems[2]));
		}
	}

	public void testLoadObjects() throws Exception {

		StringReader reader = new StringReader("a,b,c\n1,2,3\n4,5,6");
		Collection<TestEntity> testEntities = CSVUtils.loadObjects(reader,
				new TestEntityTransformer());
		assertEquals(2, testEntities.size());

	}

}
