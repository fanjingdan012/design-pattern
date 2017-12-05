

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class IteratorSamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> intList = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8,
				9, 10);

		Set<Integer> intSet = Sets.newHashSet(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		

		Iterable<String> result = Iterables.transform(intList,
				new Function<Integer, String>() {
					@Override
					public String apply(Integer arg0) {
						return arg0.toString();
					}
				});
		

		Collection<String> strResult = new ArrayList<String>();
		for (Integer aInt : intList) {
			strResult.add(aInt.toString());
		}

		printAll(intSet);

	}

	public static void printAll(Iterable<Integer> ints) {

		Iterator<Integer> i = ints.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		for (Integer aInt : ints) {
			System.out.println(aInt);
		}
	}

}
