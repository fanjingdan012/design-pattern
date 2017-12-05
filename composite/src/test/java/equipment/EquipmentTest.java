package equipment;

public class EquipmentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Equipment disk1 = new FloppyDisk(1, 100);
		Equipment disk2 = new FloppyDisk(2, 200);
		
		Equipment computer = new Computer(disk1,disk2);
		
		Equipment disk3 = new FloppyDisk(3, 300);
		Equipment computer1 = new Computer(disk3,computer);
		
		System.out.println(computer.getPower());
		System.out.println(disk1.getPower());

	}

}
