package university;

public class Student extends Person implements Test{

		
	String sem;
	
	int marks1;
	int marks2;
	

	public String getProfession(){
		return "I am a Student";
	}
	
	public String getCode(){
		return "S";
	}
	
	public String getSem(){
		return sem;
	}
	
	public void setSem(String studentSem){
		sem = studentSem;
	}
	
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int sMarks1) {
		
		marks1 = sMarks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int sMarks2) {
		marks2 = sMarks2;
	}

	public void setMarks(int sMarks1,int sMarks2){
		marks1 = sMarks1;
		marks2 = sMarks2;
	}
	
	public void setMarks(int sMarks1){
		marks1 = sMarks1;
	}
	
	public void setMarks(String sMarks1, int a){
		
	}
	
	public void setMarks( int a, String sMarks1){
		
	}
	
	public static void main(String args[]){
		
		Student s1 = new Student();
		
		s1.id = 100;
		s1.setName("Student One");
		s1.setSem("Sem 1");
		
		//s1.setMarks1(90);
		//s1.marks2 = 200;
		s1.setMarks(89);
				
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getSem());
		System.out.println(s1.getMarks1());
		System.out.println(s1.getMarks2());
		
		//Person p1 = new Student();
		//Person p2 = new Professor();
		
		//p1.getId();
		
		
	}
	
	
}
