package collection1;
import java.util.ArrayList;

public class UseStudent {

	public static void main(String[] args) {
		Student s1=new Student("ragavendra",1,true,"cse");
		Student s2=new Student("deeban",2,true,"mech");
		Student s3=new Student("pavithra",3,false,"ece");
		Student s4=new Student("vijay",4,true,"it");
		Student s5=new Student("suresh",5,true,"mech");
		Student s6=new Student("suganya",6,false,"cse");
		Student s7=new Student("ashika",7,false,"it");
		Student s8=new Student("ranjani",8,false,"cse");
		
		ArrayList<Student>students=new ArrayList<>();
		ArrayList<Student>femaleStudents=new ArrayList<>();
		ArrayList<Integer>rollNoList=new ArrayList<>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		for(Student x:students) {
			rollNoList.add(x.getRollNo());
		}
		System.out.println(rollNoList);
		for(Student x:students) {
			if(x.getIsMale()==false) {
				femaleStudents.add(x);
			}
		}
		System.out.println(femaleStudents);

	}

}
