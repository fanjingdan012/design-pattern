/**
 * 
 */
package designpattern.strategy.csvimport;

import java.text.MessageFormat;

public class TestEntity {
	private String a, b, c;

	public TestEntity(String a, String b, String c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String getA() {
		return a;
	}

	public String getB() {
		return b;
	}

	public String getC() {
		return c;
	}

	@Override
	public String toString() {
		return MessageFormat.format("A:{0},B:{1},C:{2}", a, b, c);
	}

}