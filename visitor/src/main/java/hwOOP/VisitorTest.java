package hwOOP;

public class VisitorTest {

	/**
	 * @param args
	 */
	public static void main(String [] args){
		University u = new University();
		FindLargeClassroomVisitor visitor = new FindLargeClassroomVisitor();
		visitor.visitUniversity(u);
		System.out.println(visitor.total);
	}

}
