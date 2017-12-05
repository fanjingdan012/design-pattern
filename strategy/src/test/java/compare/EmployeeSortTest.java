package compare;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortTest {

	public static final class NameComparator implements Comparator<Employee> {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

	static List<Employee> testData = new ArrayList<Employee>();
	static {
		testData.add(new Employee(20, "D"));
		testData.add(new Employee(21, "C"));
		testData.add(new Employee(22, "B"));
		testData.add(new Employee(23, "A"));
	}

	public static void print(Collection<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(MessageFormat.format("name:{0},age:{1}",
					employee.getName(), employee.getAge()));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("before sort:");
		print(testData);

		Collections.sort(testData, new NameComparator());
		
		System.out.println("after sort:");
		print(testData);
	}
}
