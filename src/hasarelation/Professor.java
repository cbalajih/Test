package hasarelation;

public class Professor {

	int id;
	String name;
	
	Address[] addrees;
	
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

		Professor p1 = new Professor();
		p1.id = 100;
		p1.name = "Prof 1";
		
		//s2.marks = new int[3];
		p1.addrees = new Address[2];
		
		//s2.marks[0] = 95;
		p1.addrees[0] = new Address("St1","100","Chicago",10000); 
		p1.addrees[1] = new Address("St2","200","New York",20000);
		
		System.out.println(p1.id);
		System.out.println(p1.name);
		
		/*
		for(int i =0; i < s2.marks.length; i++){
			System.out.println(s2.marks[i]);
		}
		*/
		
		for (int i = 0; i < p1.addrees.length; i++) {
			p1.addrees[i].printDetails();
		}
		
		
	}

}
