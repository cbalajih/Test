package wrappers;

public class WrappersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "100";
		//int
		Integer iObj = new Integer(23);
		
		int i = iObj.intValue();
		
		int int1 = Integer.parseInt(x);
			
		String zz = iObj.toString();
		
		System.out.println(i);
		System.out.println(int1);
		System.out.println(zz);
		
		//Long, Boolean, Double, Character
		boolean xx111 = true; 
		Boolean bObj  = new Boolean(xx111); //TRUE
		
		System.out.println(bObj.booleanValue());
		
		Integer i100 = 100; // i100 = new Integer(100);
		Integer i200 = new Integer(200);
		
		int s124 = i200; //i200.intValue();
		
		
		int c = i100 + i200; 
		
	}

}
