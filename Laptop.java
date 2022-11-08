package collection1;

public class Laptop {
	private String brand;
	private int price;
	private String color;
	private boolean isTouchScreen;
	public Laptop(String a,int b,String c,boolean d) {
		brand=a;
		price=b;
		color=c;
		isTouchScreen=d;
	}
	public String toString() {
		return (brand+" "+price+" "+color+" "+isTouchScreen);
	}
	public void setBrand(String a) {
		brand=a;
	}
	public void setPrice(int a) {
		price=a;
	}
	public void setColor(String a) {
		color=a;
	}
	public void setTouchScreen(boolean a) {
		isTouchScreen=a;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public boolean getTouchScreen() {
		return isTouchScreen;
	}

}
