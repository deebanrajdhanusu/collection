package collection1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class UsePencil {

	public static void main(String[] args) {
		Pencil p1=new Pencil("doms",25,true,"black");
		Pencil p2=new Pencil("nataraj",10,true,"green");
		Pencil p3=new Pencil("camelin",30,true,"orange");
		Pencil p4=new Pencil("apsara",40,true,"blue");
		Pencil p5=new Pencil("faberCastel",60,true,"white");
		
		HashMap<Integer,Pencil>pencils=new HashMap<>();
		pencils.put(388, p1);
		pencils.put(389, p2);
		pencils.put(958, p3);
		pencils.put(648, p4);
		pencils.put(183, p5);
		/*Iterator<Pencil>itr=pencils.values().iterator();
		while(itr.hasNext()) {
			if(itr.next().getColor().equals("black")) {
				itr.remove();
			}
		}
		pencils.values().forEach((x)->System.out.println(x));*/
		Iterator<Pencil>itr1=pencils.values().iterator();
		while(itr1.hasNext()) {
			if(itr1.next().getBrand().equals("doms")) {
				itr1.remove();
			}
		}
		pencils.values().forEach(x->System.out.println(x));

	}

}
