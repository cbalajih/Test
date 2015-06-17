package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudentsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> stList = new ArrayList<Student>();
		
		//Student  s1 = new Student(100, "A1");
		
		Student  s1 = new Student();
		s1.setId(100);
		s1.setName("A1");
		
		Student  s2 = new Student(200, "A2");
		
		stList.add(s1);
		stList.add(s1);
		
		stList.add(new Student(300, "A3"));
		
		stList.add(s2);
		
		for(int i =0; i<stList.size(); i++){
			
			Student x = stList.get(i);
			System.out.println(x);
			
		}
		
		System.out.println("--------------");
		
		Set<Student> studentsSet = new TreeSet<Student>();
	
		studentsSet.add(s1);
		studentsSet.add(s1);
		studentsSet.add(s2);
		studentsSet.add(new Student(300, "A3"));
		
		Student  s4 = new Student(200, "A4");
		
		studentsSet.add(s4);
		
		Iterator<Student> it = studentsSet.iterator();
		
		while(it.hasNext()){
			Student x1 = it.next();
			System.out.println(x1);
		}
		
		/*System.out.println(s2.equals(s4));
		System.out.println(s2.equals(s1));
		
		System.out.println(s2.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s1.hashCode());
		
		
		Student  s5 = new Student(500, "A5");
		Student  s6 = new Student(500, "A5");
		Student  s7 = s5;
		Student s8 = null;
		
		System.out.println("----");
		
		System.out.println((s5 == s6));
		System.out.println((s5 == s7));
		
		System.out.println(s5.equals(s6));
		System.out.println(s5.equals(s7));
		*/
		
		System.out.println(s4 instanceof Comparable);	
		
	}

}
