package collection1;
import java.util.ArrayList;

public class UseAdhaar {

	public static void main(String[] args) {
		Adhaar ad1=new Adhaar("raj","dhanush","pondy","20/09/97",172637893476L);
		Adhaar ad2=new Adhaar("suresh","ramesh","caudalore","14/09/98",283948392919l);
		Adhaar ad3=new Adhaar("keerthi","govind","trichy","25/01/95",478583473473l);
		Adhaar ad4=new Adhaar("deepika","aravind","madurai","17/03/99",643647378876l);
		Adhaar ad5=new Adhaar("lavanya","gopi","villianur","17/05/20",647848484987l);
		Adhaar ad6=new Adhaar("alia","naren","kerala","18/06/93",368492736472l);
		Adhaar ad7=new Adhaar("ragav","prem","chennai","11/07/91",273894837409l);
		
		ArrayList<Adhaar>adhaars=new ArrayList<>();
		ArrayList<Adhaar>evenNo=new ArrayList<>();
		adhaars.add(ad1);
		adhaars.add(ad2);
		adhaars.add(ad3);
		adhaars.add(ad4);
		adhaars.add(ad5);
		adhaars.add(ad6);
		adhaars.add(ad7);
		
		for(int i=0;i<adhaars.size();i++) {
			if(adhaars.get(i).getNo()%2==0) {
				evenNo.add(adhaars.get(i));
			}
		}
		System.out.println(evenNo);
		int max=0;
		Adhaar q=ad1;
		for(Adhaar x:evenNo) {
			if(x.getName().length()>max) {
				max=x.getName().length();
			}
		}
		System.out.println(q);
		adhaars.forEach(x-> {if(x.getName().length()%2!=0) {
			System.out.println(x);
		}});

	}

}
