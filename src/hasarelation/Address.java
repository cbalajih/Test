package hasarelation;

public class Address {
	
	String stName;
	String stNo;
	String city;
	int zipCode;
	
	public Address(){
		
	}
	
	public Address(String stName, String stNo, String city, int zipCode) {
		this.stName = stName;
		this.stNo = stNo;
		this.city = city;
		this.zipCode = zipCode;
	}



	public String getStName() {
		return stName;
	}



	public void setStName(String stName) {
		this.stName = stName;
	}



	public String getStNo() {
		return stNo;
	}



	public void setStNo(String stNo) {
		this.stNo = stNo;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public int getZipCode() {
		return zipCode;
	}



	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}


	public void printDetails(){
		System.out.print(stName);
		System.out.print(" ");
		System.out.print(stNo);
		System.out.print(" ");
		System.out.print(city);
		System.out.print(" ");
		System.out.println(zipCode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
}
