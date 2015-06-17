package exceptions;

public class AmountExceededException extends Exception {

	public int amount;
	
	public AmountExceededException(){
		
	}
	
	public AmountExceededException(String message){
		super(message);
	}
	
	
	
}
