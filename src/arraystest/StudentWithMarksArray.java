package arraystest;

public class StudentWithMarksArray {

	int id;
	String name;
	int[] marks;
	static final String subs[] = {"Sub1", "Sub2", "Sub3"};
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		
		StudentWithMarksArray s1 = new StudentWithMarksArray();
		
		s1.id = 100;
		s1.name = "Student 1";
		s1.marks = new int[3];
		
		s1.marks[0] = 90;
		s1.marks[1] = 80;
		s1.marks[2] = 75;
		
		//System.out.println(s1.marks.length);
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		for(int i =0; i < s1.marks.length; i++){
			System.out.print(StudentWithMarksArray.subs[i]);
			System.out.print("->");
			System.out.println(s1.marks[i]);
		}
		
		System.out.println("---------");
		
		StudentWithMarksArray s2 = new StudentWithMarksArray();
		
		s2.id = 200;
		s2.name = "Student 2";
		s2.marks = new int[3];
		
		s2.marks[0] = 95;
		s2.marks[1] = 87;
		s2.marks[2] = 79;

		//System.out.println(s2.marks.length);
		System.out.println(s2.id);
		System.out.println(s2.name);
		
		for(int i =0; i < s2.marks.length; i++){
			System.out.print(StudentWithMarksArray.subs[i]);
			System.out.print("->");
			System.out.println(s2.marks[i]);
		}
	}

}
