package boletin031;

public class Book extends Publication {
	
	private String author;
	
	public Book(String title, String author, int numberPages, int initialPage, boolean digitalVersion, double price) {
		super(title, numberPages, initialPage, digitalVersion, price);
		this.author = author;
		this.setMessageHeader("\nBOOK DATA\n===========\n"
				+ "Autor: " + author + "\r\n");
	}
}
