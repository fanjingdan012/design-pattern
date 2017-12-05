/**
 * 
 */
package designpattern.strategy.compare;

public class Employee {
	private int age;
	private String name;

	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}