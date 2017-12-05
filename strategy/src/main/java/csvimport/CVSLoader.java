package csvimport;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public abstract class CVSLoader<T> {

	public Collection<T> loadEntities(BufferedReader reader) throws IOException {
		Collection<T> result = new ArrayList<T>();
		//skip title
		reader.readLine();

		String curLine;
		while ((curLine = reader.readLine()) != null) {
			String[] columns = curLine.split(",");
			result.add(buildEntity(columns));
		}

		return result;
	}
	
	protected abstract T buildEntity(String[] columns);
}
