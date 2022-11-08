package collection1;
import java.util.ArrayList;

public class MaxMin {

	public static void main(String[] args) {
		ArrayList<String>names=new ArrayList<>();
		names.add("raj");
		names.add("ramesh");
		names.add("sabith");
		names.add("pallavi");
		names.add("ranjani");
		names.add("poorna");
		names.add("vikram");
		names.add("yaser");
		int max=0;
		int z=0;
		for(int i=0;i<names.size();i++) {
			if(names.get(i).length()>=max) {
				max=names.get(i).length();
				z=i;
			}
		}
		System.out.println(names.get(z)+" "+max);
		String min=names.get(0);
		for(String x:names) {
			if(x.length()<=min.length()) {
				min=x;
			}
		}
		System.out.println(min);
		names.forEach(x->{System.out.println(x.length());});
		names.forEach(x->{if(x.length()>6) {
			System.out.println(x);}});
		// TODO Auto-generated method stub

	}

}
