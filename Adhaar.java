package collection1;

public class Adhaar {
	private long no;
	private String name;
	private String fatherName;
	private String address;
	private String birth;
	
	public Adhaar(String a,String b,String c,String d,long e) {
		name=a;
		fatherName=b;
		address=c;
		birth=d;
		no=e;
	}
	public String toString() {
		return (name+" "+fatherName+" "+address+" "+birth+" "+no);
	}
	 
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
