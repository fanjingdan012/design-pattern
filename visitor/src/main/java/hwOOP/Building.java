package hwOOP;

import java.util.ArrayList;

public class Building implements IUniversityElement{
	ArrayList<IUniversityElement> c;
	public Building(){
		c = new ArrayList<IUniversityElement>();
		c.add(new Classroom(500,300));
		c.add(new Classroom(400, 800));
		c.add(new Classroom(2,8));
	}
	@Override
	public void accept(Visitor visitor) {

		visitor.visitBuilding(this);
		
		
	}
	

}
