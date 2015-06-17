package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import university.Student;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		
		s1.getDummy();
		
		//creating
		ArrayList myList = new ArrayList();
		//List myList = new LinkedList();
		//List myList = new Vector();
	
		System.out.println(myList.size());
		
		//add at end
		
		myList.add("Name One");
		myList.add(100); // auto boxing..
		
		System.out.println(myList.size());
		
		//add in between
		myList.add(1, true);
		myList.add("Dummy");
		myList.add("Dummy");
		System.out.println(myList.size());
		
		//remove
		myList.remove("Dummy");
		//myList.remove(new Integer(100));
		myList.remove(3);
		
		myList.add(100); 
		
		//get element at an index
		
		String name = (String) myList.get(0);
		int marks = (int)myList.get(2);
		
		System.out.println(name);
		System.out.println(myList.get(1));
		
		
		//get the size
		
		System.out.println(myList.size());
		
		
		//loop thorugh all the elements 
		
		System.out.println("-------------");
		
		for(int i = 0 ; i < myList.size(); i++){
			System.out.println(myList.get(i));
		}
		
		List tempList = new ArrayList();
		
		List<String> myStringList = new ArrayList<String>();
		
		tempList.add("asdasd");
		tempList.add(100);
		
		System.out.println("---------");
		
		myStringList.add("A");
		myStringList.add("B");
		myStringList.add("C");
		myStringList.add("D");
		
		for(int i = 0 ; i < myStringList.size(); i++){
			System.out.println(myStringList.get(i));
		}
		
		List<String> myStringListNew = new ArrayList<String>();
		myStringListNew.add("E");
		myStringListNew.add("F");
	
		/*for(int i = 0 ; i < myStringListNew.size(); i++){
			String temp = myStringListNew.get(i);
		
			myStringList.add(temp);
			
		}*/
		
		myStringList.addAll(myStringListNew);
		
		System.out.println("---------");
		for(int i = 0 ; i < myStringList.size(); i++){
			System.out.println(myStringList.get(i));
		}
		
		System.out.println(myStringList.contains("A"));
		System.out.println(myStringList.contains("X"));
		
		System.out.println(myStringList.containsAll(myStringListNew));
		
		System.out.println(myStringList.indexOf("D"));
		
		
		List<String> myStringList3 = new ArrayList<String>();
		myStringList3.add("A");
		myStringList3.add("E");
		myStringList3.add("X");
		
		//myStringList.retainAll(myStringList3);
		
		//myStringList.removeAll(myStringList3);
		
		for(int i = 0 ; i < myStringList.size(); i++){
			System.out.println(myStringList.get(i));
		}
		
		System.out.println("---");
		
		myStringList.set(3,"X");
		
		for(int i = 0 ; i < myStringList.size(); i++){
			System.out.println(myStringList.get(i));
		}
		
		//int x = 10;
		//int[] x1 = new int[5];
		
		Object[] names = myStringList.toArray();
		
		System.out.println((String)names[1]);
		
		System.out.println(myStringList.toString());
	}

}
