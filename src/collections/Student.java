package collections;

public class Student implements Comparable{
	
	private int id;
	private String name;

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student() {
		
	}
	public Student(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		return id + " ->" + name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		Student other = (Student) obj;
		
		if(id > other.id){
			return 1;
		}
		else if(id < other.id){
			return -1;
		}
		else{
			return 0;
		}
	}
	
	
	// if a == b true,  then a.equals(b) will be true and the a.hasCode() == b.hashCode()
	// if a.equals(b) is true then a == b may or may not be true 
	
	
	/*
	@Override
	public int hashCode() {
		
		return id * 100;
		
	}
	
	//@Override
	public boolean equals(Object obj) {
		
		Student other = (Student) obj;
		if (id == other.id){
			return true;
		}
		else{
			return false;
		}
	}
	*/
	
}
