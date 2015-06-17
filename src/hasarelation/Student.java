package hasarelation;

public class Student {

	int id;
	String name;
	
	Address mailingAddr;
	Address physicalAddr;
	
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
		// TODO Auto-generated method stub
		Student s1 = new Student();
		
		int s1Id = 100;
		s1.id = s1Id;
		
		//s1.id = 100;
		
		s1.name = "Studen One";
		
		Address s1MailAddr = new Address("St1","100","Chicago",10000);
		s1.mailingAddr = s1MailAddr;
		
		s1.physicalAddr = new Address("St2","200","New York",20000); 
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		s1.mailingAddr.printDetails();
		s1.physicalAddr.printDetails();
		
		
		
		
	}

}
