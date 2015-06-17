package university;

public abstract class Person implements HumanBeing {

	String name;
	int id;
	
	public String getName(){
		return name;
	}
	
	public int getId(){
		return id;
	}
	
	public void setName(String studentName){
		name = studentName;
	}
	
	public void setId(int studentId){
		id = studentId;
	}
	
		
	public abstract String getProfession();
	
	public String getDummy(){
		return "Dummy";
	}
	
	public static void main(String args[]){
		
		//Person p1 = new Person();
		
		
	}
	
	
}
