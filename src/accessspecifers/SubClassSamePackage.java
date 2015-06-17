package accessspecifers;

public class SubClassSamePackage extends ClassA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClassSamePackage a = new SubClassSamePackage();
		
		a.name = "ABCD";
		a.setAge(100);
		
		System.out.println(a.name);
		System.out.println(a.getAge());
		
		a.id = 200;
		System.out.println(a.id);
		
		a.age=32;
		//a.ssn=1990;
	}

}
