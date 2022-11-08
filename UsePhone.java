package collection1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class UsePhone {

	public static void main(String[] args) {
		Phone p1=new Phone("samsung",80000,"snapdragon 888",8,true);
		Phone p2=new Phone("apple",120000,"a1 bionic chip",6,false);
		Phone p3=new Phone("window",60000,"snapdragon 999",8,false);
		Phone p4=new Phone("oneplus",450000,"snapdragon 656",6,true);
		Phone p5=new Phone("nubia",30000,"snapdragon 686",8,true);
		Phone p6=new Phone("sony",70000,"snapdragon 858",6,true);
		/*ArrayList<Phone>phones=new ArrayList<>();
		phones.add(p1);
		phones.add(p2);
		phones.add(p3);
		phones.add(p4);
		phones.add(p5);
		phones.add(p6);
		for(int i=0;i<phones.size();i++) {
			System.out.println(phones.get(i));
		}
		for(Phone x:phones) {
			System.out.println(x);
		}
		phones.forEach(x->{System.out.println(x);});
		for(Phone x:phones) {
			System.out.println(x.getPrice());
		}
		phones.forEach(x->System.out.println(x.getPrice()));
		for(int i=0;i<phones.size();i++) {
			System.out.println(phones.get(i).getPrice());
		}
		for(int i=0;i<phones.size();i++) {
			System.out.println(phones.get(i).getBrand());
		}
		for(Phone x:phones) {
			if(x.getRam()>=8) {
				System.out.println(x);
			}
		}
		for(int i=0;i<phones.size();i++) {
			if(phones.get(i).getRam()>=8) {
				System.out.println(phones.get(i));
			}
		}
		for(Phone x:phones) {
			System.out.println(x.getBrand().length()+" "+x.getBrand());
		}
		for(int i=0;i<phones.size();i++) {
			if(phones.get(i).getBrand().length()%2==0) {
				System.out.println(phones.get(i).getBrand());
			}
		}
		int max=0;
		Phone q=p1;
		for(Phone x:phones) {
			if(x.getPrice()>max) {
				max=x.getPrice();
				q=x;
			}
		}
		System.out.println(max+" "+q.getBrand());*/
		HashMap<Integer,Phone>phones1=new HashMap<>();
		phones1.put(111, p1);
		phones1.put(153, p2);
		phones1.put(647, p3);
		phones1.put(948, p4);
		phones1.put(478, p5);
		phones1.put(939, p6);
		/*for(Phone x:phones1.values()) {
			if(x.getBrand().startsWith("s")) {
				System.out.println(x);
			}
		}
		for(Integer x:phones1.keySet()) {
			System.out.println(phones1.get(x));
		}
		phones1.keySet().forEach(x->System.out.println(x));
		for(Phone x:phones1.values()) {
			if(x.getBrand().equals("samsung")) {
				System.out.println(x);
			}
		}
		for(Integer x:phones1.keySet()) {
			if(phones1.get(x).getIsAndroid()==true) {
				System.out.println(phones1.get(x));
			}
		}
		phones1.values().forEach(x->{
			if(x.getPrice()>50000) {
				System.out.println(x);
			}
			
		});*/
		phones1.forEach((x,y)->System.out.println(x+" "+y));
		Iterator<Phone>itr=phones1.values().iterator();
		while(itr.hasNext()) {
			if(itr.next().getIsAndroid()==false) {
				itr.remove();
			}
		}
		phones1.values().forEach(x->System.out.println(x));
		
		
	

	}

}
