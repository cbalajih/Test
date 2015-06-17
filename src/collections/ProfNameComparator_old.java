package collections;

import java.util.Comparator;

public class ProfNameComparator_old implements Comparator<Professor>{

	public int compare(Professor p1, Professor p2){
		
		return p1.getName().compareTo(p2.getName());
		
	}
	
}
