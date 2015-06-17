package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create
		//Map<Integer,String> map = new HashMap<Integer, String>();
		//Map<Integer,String> map = new LinkedHashMap<Integer, String>();
		Map<Integer,String> map = new TreeMap<Integer, String>();
		
		//add
		map.put(800, "S8");
		map.put(100, "S1");
		map.put(200, "S2");
		map.put(400, null);
		
		System.out.println(map.get(100));
		
		//size
		System.out.println(map.size());
		
		map.put(100, "S3");
		map.put(300, "S10");
		
		System.out.println(map.get(700));
		System.out.println(map.get(400));
		
		System.out.println(map.get(100));
		
		System.out.println(map.size());
		
		//remove
		map.remove(300);
		
		System.out.println(map.size());
		
		//read / get.
		int x1 = 200;
		System.out.println(map.get(x1));
		
		//read all / print all.
		
		Set<Integer> s1 = map.keySet();
		
		Iterator<Integer> it = s1.iterator();
		
		while(it.hasNext()){
			int temp = it.next();
			
			System.out.print(temp);
			System.out.print("->");
			System.out.println( map.get(temp) );
			
		}
		
	}

}
