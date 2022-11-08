package collection1;
import java.util.ArrayList;

public class EvenNumber {

	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<>();
		int []a=new int[3];
		a[0]=5;
		a[1]=15;
		a[2]=25;
		nums.add(15);
		nums.add(10);
		nums.add(35);
		nums.add(70);
		nums.add(85);
		nums.set(1, 8);
		nums.remove(2);
		System.out.println(nums);
		System.out.println(nums.get(3));
		System.out.println(nums.size());
		
		for(Integer x:nums) {
			if(x%2==0) {
				System.out.println(x);
			}
		}
		for(int i=0;i<nums.size();i++) {
			if(nums.get(i)%2!=0) {
				System.out.println(nums.get(i));
			}
		}
		nums.forEach(x ->System.out.println(x));
		
		//System.out.println(a[1]);
		// TODO Auto-generated method stub

	}

}
