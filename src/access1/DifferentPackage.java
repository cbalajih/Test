package access1;

import accessspecifers.ClassA;

public class DifferentPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassA a = new ClassA();
		
		a.name = "ABCD";
		a.setAge(100);
		
		System.out.println(a.name);
		System.out.println(a.getAge());
			
		/*a.id = 200;
		System.out.println(a.id);
		*/
		
		//a.age = 33;
		//a.ssn = 100;
		
	}

}
