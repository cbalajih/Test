//http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

package datatypes;

public class DataTypesTest {
	
	byte bytVar = 127; // 8 bits 
	short shortVar = 12313; // 16 bits
	int intVar;// 32 bits //2147483647
	long longVar = 123142312313132L; //64
	
	float flaotVar = 123.56F;
	double dobVar = 12313.334234;
	
	boolean active; // true;
	
	char gender; 
	
	String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		DataTypesTest test = new DataTypesTest();
		
		//test.active = true;
		
		System.out.println(test.intVar);
		System.out.println(test.active);
		System.out.println(test.name);
		System.out.println(test.gender);
		
	}

}
