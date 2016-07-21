package hwOOP;

public class FindLargeClassroomVisitor extends Visitor{
    public int total = 0;
	@Override
	void visitBuilding(Building building) {
		for (IUniversityElement e:building.c){
			e.accept(this);
			
		}
	
	}

	@Override
	void visitCampus(Campus campus) {
		for (IUniversityElement e:campus.c){
			e.accept(this);
			
		}
	
	}

	@Override
	void visitClassroom(Classroom classroom) {
		if(classroom.getArea()>100){
			System.out.println("classroom:length="+classroom.length+",width="+classroom.width);
			total++;
		}
	
		
    }

	@Override
	void visitUniversity(University university) {
		for (IUniversityElement e:university.c){
			e.accept(this);
			
		}
		
	}
}
