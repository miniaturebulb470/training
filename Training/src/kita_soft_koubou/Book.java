package kita_soft_koubou;

public class Book {
	private String title;
	private int price;

	public Book() {
		
	}
//	
//	public Book(String title, int price) {
//		this.title = title;
//		this.price = price;
//	}
	public String getTitle() {
		return this.title;
	}
	public int getPrice() {
		return this.price;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void show(){
		System.out.printf("%s%n",this.title);
		System.out.printf("%s%n",this.getPrice());
	}

}
