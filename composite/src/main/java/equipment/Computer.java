package equipment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Computer implements Equipment {

	Collection<Equipment> parts = new ArrayList<Equipment>();

	public Computer(Equipment... parts) {
		Collections.addAll(this.parts, parts);
	}

	@Override
	public int getPower() {
		int result = 0;
		for (Equipment part : parts) {
			result += part.getPower();
		}
		return result;
	}

	@Override
	public int getPrice() {
		int result = 0;
		for (Equipment part : parts) {
			result += part.getPrice();
		}
		return result;
	}

}
