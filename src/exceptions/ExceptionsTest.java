package exceptions;

import university.Person;
import university.Professor;
import university.Student;


public class ExceptionsTest {

	Student stud;
	
	public static void doTransfer(int amount, int acc1, int acc2) throws AmountExceededException{
		
		if(amount > 1000){
			AmountExceededException ae = new AmountExceededException("Amount Cannot be > 1000");
			ae.amount = amount;
			//AmountExceededException ae = new AmountExceededException();
			throw ae;
		}
		
		System.out.println("Transfr Succeseded");
		
	}
	
	public static int divide(int a, int b) throws Exception{
		
		if(b == 0){
			Exception ae = new Exception("You are trying to divide by 0");
			throw ae;
		}
		
		int c = a / b;
		
		System.out.println("Divide complete");
		
		return c;
	}
	
	public static void main(String[] args) {
		

		System.out.println("start...");
		int x = 100;
		int y = 0;
		
		try{
			divide(x,y);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		/*
		try{
		
			System.out.println(x/y);
			System.out.println("line after divide");
			
		}
		catch(Exception e){
			System.err.println("You are trying to divide by 0, please change the values..");
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
		*/
		//ExceptionsTest.divdide(x, y);
		
		System.out.println("Start Array");
		
		int marks[] = {1,2,3};
		
		try{
			System.out.println(marks[0]);
			System.out.println(marks[1]);
			System.out.println(marks[2]);
			//System.out.println(marks[4]);
			
			System.out.println(x/y);
			
		}
		
		catch(ArithmeticException e){
			System.err.println("You are trying to divdie by 0");
			System.err.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.err.println("You are trying to access an invaid index...");
			System.err.println(e.getMessage());
		}
		catch(Exception e){
			System.err.println("Some general exception occured");
			System.err.println(e.getMessage());
		}
		finally{
			System.out.println("I will be executed all the time.");
		}
		
		
		System.out.println("finished...");
		
		//Student s1 = null;
		ExceptionsTest e1 = new ExceptionsTest();
		
		if(e1.stud != null){
			e1.stud.setId(100);
		}
		
		Person p1 = new Student();
		Person p2 = new Professor();
		
		((Student)p1).getSem();
		
		//((Professor)p2).getSub();
		
		if(p1 instanceof Student){
			((Student)p1).getSem();
		}
		else{
			((Professor)p1).getSub();
		}
		
		
		try {
			doTransfer(10001, 1, 2);
		} catch (AmountExceededException e) {
			System.out.println(e.getMessage());
			System.out.println(e.amount);
		}
	}

}
