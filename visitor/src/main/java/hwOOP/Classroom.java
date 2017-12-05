package hwOOP;

public class Classroom implements IUniversityElement{
    int length;
    int width;
    public Classroom(int l,int w){
    	length = l;
    	width = w;
    }
    public int getArea(){
    	return length * width;
    	
    }
	public void accept(Visitor visitor) {
		visitor.visitClassroom(this);
	    
	}

}
