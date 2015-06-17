package thissuper;

public class ThisSuperTest extends SuperClass{

	int id;
	String name;
	boolean isActive;
	
	public void getProfessio(){
		super.getProfessio();
		System.out.println("Child"); 
	}
	
	public ThisSuperTest(){
		super();
		System.out.println(" Print 1");
	}
	
	public ThisSuperTest(int id){
		this();
		this.id = id;
		System.out.println(" Print 2");
	}
	
	public ThisSuperTest(int id,String name){
		//this.id = id;
		this(id);
		this.name = name;
		System.out.println(" Print 3");
	}
	

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


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getTotal(int a, int b, int c){
		
		//super.getProfessio();
		
		int totalOfAandB = doTotal(a, b);
		
		int total = doTotal(totalOfAandB, c);
		
		return total;
	}
	
	public int doTotal(int x1, int x2){
		return x1 + x2;
	}

	public void printDetails(){
		System.out.println(id);
		System.out.println(name);
	}
	
	public void printDetails(int x){
		System.out.println(id);
		System.out.println(name);
		
		System.out.println(isActive);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisSuperTest test = new ThisSuperTest();
		
		test.setName("name 1");
		
		System.out.println(test.getTotal(1, 2, 3));
		
		System.out.println("------------------");
		
		ThisSuperTest test1 = new ThisSuperTest(10);
		
		System.out.println("------------------");
		
		//ThisSuperTest test2 = new ThisSuperTest(10,"dasdasd");
		
		System.out.println("------------------");
		
		//test.getProfessio();
	}

}
