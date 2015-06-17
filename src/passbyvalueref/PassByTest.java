package passbyvalueref;

public class PassByTest {

	
	public static void passByRef(Student s1){
		
		s1 = new Student();
		
		s1.id = 200;
		
		System.out.println("Inside method: " + s1.id);
	}
	
	public static void passByValue(int x){
		x = x + 1;
		
		System.out.println("X is  " + x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		System.out.println("A is " + a);
		PassByTest.passByValue(a);
		System.out.println("new A is " + a);
		
		System.out.println("-----");
		
		Student st1 = new Student();
		st1.id = 100;
		
		System.out.println("Before Method " + st1.id);
		PassByTest.passByRef(st1);
		System.out.println("After Method " + st1.id);
		
	}

}
