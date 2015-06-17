package constructors;

public class Account {

	String name;
	int balance;
	
	public Account(){
		System.out.println("Iam in a constructor");
	}
	
	
	public Account(String aName){
		System.out.println("Iam in a param constructor");
		name = aName;
	}
	
	public Account(String aName, int aBalance){
		System.out.println("Iam in a param 2 constructor");
		name = aName;
		balance = aBalance;
		
	}
	
	public String getName() {
		System.out.println("I am in getName method");
		return name;
	}


	public void setName(String aName) {
		System.out.println("I am in setName method");
		name = aName;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int aBalance) {
		balance = aBalance;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1 = new  Account();
		
		a1.setName("Account 1");
		System.out.println(a1.getName());
		
		Account a2 = new  Account("Account 2");
		System.out.println(a2.getName());
		System.out.println(a2.getBalance());
		
		Account a3 = new  Account("Account 3", 1000);
		System.out.println(a3.getName());
		System.out.println(a3.getBalance());
	}
	
	

}
