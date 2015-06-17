package finaltest;

public class StudentStatic {

	int id;
	String name;
	
	private static final int maxMarks = 100;
	
	public int getId(){
		return id;
	}
	
	public StudentStatic(){
		
	}
	
	
	public static void print(){
		System.out.println("adasdasdasd");
	}
	
	public static int add(int a, int b){
		int total = a + b;
		System.out.println(maxMarks);
		//getId();
		print();
		return total;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(StudentStatic.maxMarks);
		System.out.println(StudentStatic.add(10,20));
		
				
		StudentStatic ss1 = new StudentStatic();
		ss1.id = 150;
		
		
		
		System.out.println(ss1.id);
		
		StudentStatic ss2 = new StudentStatic();
		ss2.id = 250;
		
		int x = 100;
		
		System.out.println(ss2.id);
		
		System.out.println(ss1.id);
		
		System.out.println("--------------------");
		
		System.out.println(ss1.maxMarks);
		System.out.println(ss2.maxMarks);
		System.out.println(StudentStatic.maxMarks);
	
		System.out.println("--------------------");
		
		//ss1.maxMarks = 300;
		
		System.out.println(ss1.maxMarks);
		System.out.println(ss2.maxMarks);
		System.out.println(StudentStatic.maxMarks);
	}

}
