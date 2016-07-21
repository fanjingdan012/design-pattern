package hwOOP;

import java.util.ArrayList;


public class University implements IUniversityElement {
    ArrayList <IUniversityElement> c ;
    public University (){
    	Campus campus = new Campus();
    	c = new ArrayList<IUniversityElement>();
    	c.add(campus);
    }
    public void accept(Visitor visitor){
    	visitor.visitUniversity(this);    	
    }
}
