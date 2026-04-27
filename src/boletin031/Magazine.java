package boletin031;

public class Magazine extends Publication {
	
	public Magazine(String title, int numberPages, int initialPage, boolean digitalVersion, double price) {
		super(title, numberPages, initialPage, digitalVersion, price);
		this.setMessageHeader("\nMAGAZINE DATA\n===========\n");
	}
}
