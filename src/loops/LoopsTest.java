package loops;

public class LoopsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		
		a++; // a = a+1
		a--; // a = a-1
		
		int times = 10;
		
		for(int i = 1; i <= times; i++){
			
			int temp = 100;
			
			if(i == 5){
				continue;
			}
			
			//System.out.println(i);
		}
		
		
		int x = 1;
		
		for(;x <= times;){
			
			x++;
			
			if(x == 5){
				continue;
			}
			
			//System.out.println(x);
		}
	
		System.out.println("--------------------");
		int w = 11;
		while(w <= 10){
			System.out.println(w);
			w++;
		}
		
		System.out.println("--------------------");
		
		int d = 11;
		do{
			System.out.println(d);
			d++;
		}
		while(d <= 10);
		
		
	
		System.out.println("Reached End");
	}

}
