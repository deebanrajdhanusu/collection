package collection1;

import java.util.HashMap;
import java.util.Iterator;

public class UseEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee("raj",16,35000,"developer",123,true);
		Employee e2=new Employee("nisha",36,3000,"assistant",234,false);
		Employee e3=new Employee("dhivya",22,20000,"tester",345,false);
		Employee e4=new Employee("keerthana",16,22000,"developer",456,false);
		Employee e5=new Employee("suresh",26,28000,"assistant developer",567,true);
		HashMap<Integer,Employee>employees=new HashMap<>();
		HashMap<Integer,Employee>maleEmployees=new HashMap<>();
		employees.put(e1.getId(), e1);
		employees.put(e2.getId(), e2);
		employees.put(e3.getId(), e3);
		employees.put(e4.getId(), e4);
		employees.put(e5.getId(), e5);
		Iterator<Employee>itr=employees.values().iterator();
		Iterator<Employee>itr1=employees.values().iterator();
		/*while(itr.hasNext()) {
			if(itr.next().getName().startsWith("n")) {
				itr.remove();
			}
		}
		//employees.forEach((x,y)->System.out.println(x+" "+y));
		while(itr1.hasNext()) {
			if(itr1.next().isMale()==true) {
				itr1.remove();
				//maleEmployees.put(itr.next().getId(),itr.next());
				//itr.remove();
			}
		}
		while(itr.hasNext()) {
			if(itr.next().getRole().equals("assistant")) {
				itr.remove();
			}
		}
		while(itr.hasNext()) {
			if(itr.next().getName().length()>5) {
				itr.remove();
			}
		}*/
		//employees.values().forEach(x->System.out.println(x));
		Iterator<Integer>itr2=employees.keySet().iterator();
		while(itr2.hasNext() ) {
			if(itr2.next()==e2.getId()) {
				itr2.remove();
			}
		}
		employees.values().forEach(x->System.out.println(x));
		//System.out.println(employees);
		
		
		
		

	}

}
