package collection1;

public class StoryBook {
	private String title;
	private int pages;
	private String genre;
	private int price;
	
	public StoryBook(String a,int b,String c,int d) {
		title=a;
		pages=b;
		genre=c;
		price=d;
	}
	public String toString() {
		return (title+" "+pages+" "+genre+" "+price);
	}
	public void setTitle(String a) {
		title=a;
	}
	public void setPages(int a) {
		pages=a;
	}
	public void setGenre(String a) {
		genre=a;
	}
	public void setPrice(int a) {
		price=a;
	}
	public String getTitle() {
		return title;
	}
	public int getPages() {
		return pages;
	}
	public String getGenre() {
		return genre;
	}
	public int getPrice() {
		return price;
	}
	
	

}
