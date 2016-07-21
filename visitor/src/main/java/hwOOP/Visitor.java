package hwOOP;

public abstract class Visitor {
	abstract void visitUniversity(University university);
	abstract void visitCampus(Campus campus);
	abstract void visitBuilding(Building building);
	abstract void visitClassroom(Classroom classroom);
}
