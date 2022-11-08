package collection1;
import java.util.ArrayList;

public class UseLaptop {

	public static void main(String[] args) {
		Laptop laptop1=new Laptop("dell",30000,"black",false);
		Laptop laptop2=new Laptop("HP",40000,"white",false);
		Laptop laptop3=new Laptop("acer",32000,"ash",false);
		Laptop laptop4=new Laptop("microsoft",120000,"silver white",true);
		Laptop laptop5=new Laptop("apple",135000,"silver",false);
		Laptop laptop6=new Laptop("lenovo",80000,"ash",true);
		
		ArrayList<Laptop>laptops=new ArrayList<>();
		laptops.add(laptop1);
		laptops.add(laptop2);
		laptops.add(laptop3);
		laptops.add(laptop4);
		laptops.add(laptop5);
		laptops.add(laptop6);
		
		laptops.forEach(x->{if(x.getPrice()>40000) {
			System.out.println(x);
		}
		});
		ArrayList<Laptop>touchScreenLaps=new ArrayList<>();
		ArrayList<Laptop>nonTouchScreenLaps=new ArrayList<>();
		for(int i=0;i<laptops.size();i++) {
			if(laptops.get(i).getTouchScreen()==true) {
				touchScreenLaps.add(laptops.get(i));
			}
		}
		System.out.println(touchScreenLaps);
		for(Laptop x:laptops) {
			if(x.getTouchScreen()==false) {
				nonTouchScreenLaps.add(x);
			}
		}
		System.out.println(nonTouchScreenLaps);
		
		
		// TODO Auto-generated method stub

	}

}
