package hwOOP;

import java.util.ArrayList;

public class Campus implements IUniversityElement{
	ArrayList<IUniversityElement> c;
    public Campus(){
    	Building building = new Building();
    	c = new ArrayList<IUniversityElement>();
    	c.add(building);
    }
    
	public void accept(Visitor visitor) {
		visitor.visitCampus(this);
	}
}
