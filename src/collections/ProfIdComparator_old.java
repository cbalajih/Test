package collections;

import java.util.Comparator;

public class ProfIdComparator_old implements Comparator<Professor>{

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
