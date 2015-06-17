package string;

import collections.Student;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s2 = "A";
		
		System.out.println(s2 + "XYZ");
		
		s2 = s2 + "XYZ";
		
		int j = 10;
		
		System.out.println(j+1);
		
		j = j+1;
		
		System.out.println(j);
		
		
		
		String s1 = new String("A");
		
		String s3 = "A";
		
		System.out.println(s1);
		
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		String s4 = new String("Bacde");
		
		String s5 = new String("bACDE");
		
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
		System.out.println(s4 == s5);
		
		
		System.out.println( s1.equals(s2) );
		System.out.println( s2.equals(s3) );
		
		System.out.println( s4.equalsIgnoreCase(s5));
		
		System.out.println("-------------");
		
		String str1 = "ABCDEF";
		System.out.println(str1);
		
		
		//str1 = str1 + "GHI"; // similar i = i+1;
		
		str1 = str1.concat("GHI"); // same as +
		
		System.out.println(str1);
	
		System.out.println(str1.charAt(4));

		String x1 = "E";
		String x2 = "e";
		
		
		System.out.println(x1.compareToIgnoreCase(x2));
		
		System.out.println(str1.contains("BCF"));
		
		System.out.println(str1.endsWith("HI"));
		
		String t1 = "A1BCA1D";
		
		System.out.println(t1.indexOf("X"));
		
		s1 = s1.intern();
		
		System.out.println(s1 == s2); 
		
		t1 = t1.replace("A1", "X2");
		System.out.println(t1);
		
		//split and substring
		
		String namesStr = "Name1,Name2,Name3";
		
		String[] names = namesStr.split(",");
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		String hello = "Hello World Abcd";
		
		System.out.println(hello.substring(6));
		System.out.println(hello.substring(6,11));
		
		String namesArray[] = {"S1","S2","S3","S4"};
		
		//String dummyStr = "S1,S2,S3,S4,";
		
		String dummyStr = "";
		
		StringBuffer stringBuf = new StringBuffer();
		
		for (int i = 0; i < namesArray.length; i++) {
			//dummyStr = dummyStr + namesArray[i] + ",";
			stringBuf.append(namesArray[i]);
			stringBuf.append(",");
		}
		
		System.out.println(stringBuf.toString());
		
		
	}

}
