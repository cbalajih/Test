package access1;

import accessspecifers.ClassA;

public class SubClassInDifferentPackage extends ClassA {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClassInDifferentPackage a = new SubClassInDifferentPackage();
		
		a.name = "ABCD";
		a.setAge(100);
		
		System.out.println(a.name);
		System.out.println(a.getAge());
	
		a.id = 200;
		System.out.println(a.id);
		
		//a.age = 34;
		//a.ssn = 3456;
	}

}
