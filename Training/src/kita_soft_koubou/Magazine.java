package kita_soft_koubou;

public class Magazine extends Book {
	private String coverPersonName;
	
//	Magazine(){
//		
//	}
	Magazine(String title, int price, String coverPersonName) {
		super();
		setTitle(title);
		setPrice(price);
		this.coverPersonName = coverPersonName;
	}
	public void show(){
		System.out.printf("%s%n",this.getTitle());
		System.out.printf("%s%n",this.getPrice());
		System.out.printf("%s%n",this.coverPersonName);
	}
}
