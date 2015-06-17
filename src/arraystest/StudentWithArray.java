package arraystest;

public class StudentWithArray {

	public static void main(String[] args) {
		
		for(int t = 0 ; t<args.length; t++){
			System.out.println(args[t]);
		}
		
		String abcd = "3";
		
		System.out.println("--------------");
		
		int marks1 = 100;
		int marks2 = 80;
		int marks3 = 90;
		
		
		int[] marks;
		
		marks = new int[4];
		
		marks[0] = 100;
		marks[1] = 80;
		marks[2] = 90;
		marks[3] = 95;
		

		int[] newMarks = {100,80,90,95};
		
		System.out.println(marks1);
		System.out.println(marks2);
		System.out.println(marks3);
		
		System.out.println("------------");
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		
		
		System.out.println(marks.length);
		
		System.out.println("------------");
		
		for(int i = 0; i < marks.length; i++){
			//System.out.println(i);
			System.out.println(marks[i]);
		}
		
		System.out.println("------------");
		
		for(int i = 0; i < newMarks.length; i++){
			//System.out.println(i);
			System.out.println(newMarks[i]);
		}
		
		String[] subs = {"S1","S2","S3","S4"};
		
		System.out.println("------------");
		
		for(int i = 0; i < subs.length; i++){
			
			System.out.println(subs[i]);
		}
		
	}

}
