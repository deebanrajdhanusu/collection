package collection1;

public class Pencil {
	private String brand;
	private int price;
	private boolean isWritable;
	private String color;
	public Pencil(String brand, int price, boolean isWritable, String color) {
		this.brand = brand;
		this.price = price;
		this.isWritable = isWritable;
		this.color = color;
	}
	public String toString() {
		return "Pencil [brand=" + brand + ", price=" + price + ", isWritable=" + isWritable + ", color=" + color + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isWritable() {
		return isWritable;
	}
	public void setWritable(boolean isWritable) {
		this.isWritable = isWritable;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
