package collection1;

public class Employee {
	private String name;
	private int salary;
	private int age;
	private String role;
	private int id;
	private boolean isMale;
	public Employee(String a,int b,int f,String c,int d,boolean e) {
		name=a;
		age=b;
		role=c;
		id=d;
		isMale=e;
		salary=f;
	}
	public String toString() {
		return (name+" "+age+" "+role+" "+id+" "+isMale);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	

}
