package finaltest;

public class StudentFianlTest extends Parent{

	int id;
	String name;
	
	final int maxMarks;
	
	public StudentFianlTest(){
		maxMarks  = 100;
	}
	
	/*public String  getTest(){
		return "Child";
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentFianlTest s1 = new StudentFianlTest();
		
		s1.id = 100;
		s1.name ="dasds";
		
		//s1.maxMarks = 100;
		
		StudentFianlTest s2 = new StudentFianlTest();
		
		s2.id = 200;
		s2.name ="zczxc";
		
		//s2.maxMarks = 150;
		
		System.out.println(s1.maxMarks);
		System.out.println(s2.maxMarks);
		
		final int a = 100;
		
		
		
	}

}
