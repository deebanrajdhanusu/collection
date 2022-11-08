package collection1;

public class Student {
	private String name;
	private int rollNo;
	private boolean isMale;
	private String department;
	public String toString() {
		return (name+" "+rollNo+" "+isMale+" "+department);
	}
	public Student(String a,int b,boolean c,String d) {
		name=a;
		rollNo=b;
		isMale=c;
		department=d;
	}
	public void setName(String a) {
		name=a;
	}
	public void setRollNo(int a) {
		rollNo=a;
	}
	public void setIsMale(boolean a) {
		isMale=a;
	}
	public void setDepartment(String a) {
		department=a;
	}
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public String getDepartment() {
		return department;
	}

}
