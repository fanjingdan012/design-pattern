package designpattern.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;

public class CSVUtils {
	public static <T> Collection<T> loadObjects(Reader reader,
			ICSVLine2ObjectTransformer<T> transformer) throws IOException {
		Collection<T> result = new ArrayList<T>();

		BufferedReader input = new BufferedReader(reader);
		// skip the title line
		input.readLine();

		String curLine;
		while ((curLine = input.readLine()) != null) {
			T transformResult = transformer.transform(curLine.split(","));
			if (transformResult != null)
				result.add(transformResult);
		}

		return result;
	}
}
