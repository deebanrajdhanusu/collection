package collection1;

public class Phone {
	private String brand;
	private int price;
	private String processor;
	private int ram;
	private boolean isAndroid;
	public Phone(String a,int b,String c,int d,boolean e) {
		brand=a;
		price=b;
		processor=c;
		ram=d;
		isAndroid=e;
	}
	public String toString() {
		return (brand+" "+price+" "+processor+" "+ram+" "+isAndroid);
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getProcessor() {
		return processor;
	}
	public int getRam() {
		return ram;
	}
	public boolean getIsAndroid() {
		return isAndroid;
	}

}
