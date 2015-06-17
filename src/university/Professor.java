package university;

public class Professor extends Person {

	String sub;
	
	public String getSub(){
		return sub;
	}
	
	public void setSub(String profSub){
		sub = profSub;
	}
	
	public String getCode(){
		return "P";
	}
	
	public String getProfession(){
		return "I am a Professor";
	}
	
	public static void main(String args[]){
		
		Professor p1 = new Professor();	
		
		p1.setId(100);
		p1.setName("Professor One");
		p1.setSub("Java");
		
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getSub());
	}
	
	
}
