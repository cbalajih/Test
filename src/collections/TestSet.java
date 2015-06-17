package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating
		
		//Set<String> s1 = new HashSet<String>();
		//Set<String> s1 = new LinkedHashSet<String>();
		Set<String> s1 = new TreeSet<String>();
		
		//add
		s1.add("X");
		s1.add("G");
		s1.add("G");// will not add duplicates
		s1.add("Z");
		s1.add("C");
		s1.add("A");
		
		System.out.println(s1.size());
		 
		//remove
		s1.remove("C");
		System.out.println(s1.size());
		
		Iterator<String> it = s1.iterator();
		
		//it.hasNext();
		
		/*for(int i =0; i < s1.size(); i++){
			System.out.println(it.hasNext());
			System.out.println(it.next());
		}*/
		
		//System.out.println(it.hasNext());
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}

}
