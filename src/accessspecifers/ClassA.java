package accessspecifers;

public class ClassA {

	public String name;
	protected int id;
	int age;
	private int ssn;
	
	
	public String getName(){
		return name;
	}
	
	public int getId(){
		return id;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int aAge){
		age = aAge;
	}
	
	public void setName(String studentName){
		name = studentName;
	}
	
	public void setId(int studentId){
		id = studentId;
	}
	
	public int getSsn(){
		return ssn;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a = new ClassA();
		
		a.name = "ABCD";
		a.setAge(100);
		a.id = 200;
		a.age = 30;
		a.ssn = 1234;
		
		System.out.println(a.name);
		System.out.println(a.getAge());
		System.out.println(a.id);
		
	}

}
