package controlstructures;

public class IfTest {

	
	public static void main(String[] args) {
		
		int a = 25;
		
		if( a > 10 )
		{
			System.out.println("Greater than 10");
		}
		else
		{
			System.out.println("Less than 10");
		}

		
		int monthCode; // 1 to 4
		
		monthCode = 3;
		
		if(monthCode == 1){
			System.out.println("Jan");
		}
		else{
			if(monthCode == 2){
				System.out.println("Feb");	
			}
			else{
				if(monthCode == 3){
					System.out.println("Mar");	
				}
				else{
					if(monthCode == 4){
						System.out.println("Apr");
					}
					else{
						System.out.println("enter 1 to 4");
					}
				}
			}
		}
		
		
		if(monthCode == 1){
			System.out.println("Jan");
		}
		else if(monthCode == 2){
			System.out.println("Feb");
		}
		else if(monthCode == 3){
			System.out.println("Mar");
		}
		else if(monthCode == 4){
			System.out.println("Apr");
		}
		else {
			System.out.println("enter 1 to 4");
		}

		System.out.println("-----------");
		
		
		switch(monthCode){
		
		case 1: System.out.println("Jan");
				break;
		case 2: System.out.println("Feb");
				break;
		case 3: System.out.println("Mar");
				break;
		case 4: System.out.println("Apr");
				break;
		case 5:
		case 6: System.out.println("Value cannot be > 4");
				break;
			
		default: System.out.println("enter 1 to 4");		
		}
		
		
		int x = 12;
		String evenOrOdd="";
		
		
		// + , - , *., /, % 
		
		System.out.println("-----------");
		
		System.out.println(x % 2);
	
		System.out.println("-----------");
		
		if(x % 2 == 0){
			evenOrOdd = "Even";
			
		}
		else{
			evenOrOdd = "Odd";
		}
		
		
		evenOrOdd = (x % 2 == 0) ? "Even" : "Odd";
		
		
		
		System.out.println(evenOrOdd);
		
		System.out.println("Reached end");
		
		boolean isActive = false;
		int marks = 40;
		boolean isFullTime = true;
		
		int z =1;
		
		// a || b
		
		if( ( ( isActive || (marks > 50) )  && isFullTime)){
			System.out.println("Is Active");
		}
		else{
			System.out.println("Is In Active");
		}
		
		if(! isActive){
			System.out.println("Is In Active");
		}
		
		
		
	}

	
}
