package equipment;

public class FloppyDisk implements Equipment {

	private int power;
	private int price;

	public FloppyDisk(int power, int price) {
		super();
		this.power = power;
		this.price = price;
	}

	@Override
	public int getPower() {
		// TODO Auto-generated method stub
		return power;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
