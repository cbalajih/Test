package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
	
	static int x;
	
	
	
	private class inner{
		int innerx;
	
		public void test(){
			System.out.println(x);
		}
	}
	
	private static class ProfIdComparator implements Comparator<Professor>{

		public int compare(Professor p1, Professor p2){
			
			if(p1.getId() > p2.getId()){
				return 1;
			}
			else if(p1.getId() < p2.getId()){
				return -1;
			}
			else{
				return 0;
			}
			
		}
		
	}

	private static class ProfNameComparator implements Comparator<Professor>{

		public int compare(Professor p1, Professor p2){
			
			return p1.getName().compareTo(p2.getName());
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComparatorTest.inner obj1 = new ComparatorTest(). new inner();
		
		
		List<Professor> profArray = new ArrayList<Professor>();
		
		profArray.add(new Professor(300, "AP3"));
		profArray.add(new Professor(100, "CP1"));
		profArray.add(new Professor(200, "BP2"));
		
		for(int i = 0; i < profArray.size(); i++){
			System.out.println(profArray.get(i));
		}
		ProfIdComparator comp = new ProfIdComparator();
		
		System.out.println("-----");
		
		
		
		Collections.sort(profArray,comp);
		
		
		for(int i = 0; i < profArray.size(); i++){
			System.out.println(profArray.get(i));
		}
		
		System.out.println("-----");
		
		Collections.sort(profArray,new ProfNameComparator());
		
		
		for(int i = 0; i < profArray.size(); i++){
			System.out.println(profArray.get(i));
		} 
		
		System.out.println("----");
	
	}

}
