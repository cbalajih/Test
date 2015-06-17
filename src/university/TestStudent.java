//test
package university;

//test
public class TestStudent {

	public static void main(String[] args) {
	
		//i am creating a object of student.
		
		/* i am creating a object of student.
			i am creating a object of student.
		 */
		
		Student s1 = new Student();
		
		s1.id = 100;
		s1.setName("Student One");
		s1.setSem("Sem 1");
		s1.setMarks1(90);
		s1.marks2 = 200; 
				
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getSem());
		System.out.println(s1.getMarks1());
		System.out.println(s1.getMarks2());
		System.out.println(s1.getProfession());
		
	}

}
