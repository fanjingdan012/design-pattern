package csvimport;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class CSVUtils {

	public static <T> Collection<T> loadEntities(BufferedReader reader,
			EntityBuilder<T> builder) throws IOException {
		Collection<T> result = new ArrayList<T>();
		//skip title
		reader.readLine();

		String curLine;
		while ((curLine = reader.readLine()) != null) {
			String[] columns = curLine.split(",");
			result.add(builder.buildEntity(columns));
		}

		return result;
	}
}
