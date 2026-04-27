package boletin0301;

public class Test {

	public static void main(String[] args) {

		Book book1 = new Book("Tender Is The Night", "F. Scott Fitgerald", 350, 3, false, 19.99);
		Magazine magazine1 = new Magazine("Hola", 50, 1, true, 3.99);
		
		Book book2 = new Book("Great Gatsby", "F. Scott Fitgerald", 350, 3, false, 19.99);
		Magazine magazine2 = new Magazine("National Geographic", 50, 1, true, 3.99);
		
		System.out.println(book1.toString());
		
		book1.show();
		magazine1.show();
		
		book2.show();
		magazine2.show();
	}

}
