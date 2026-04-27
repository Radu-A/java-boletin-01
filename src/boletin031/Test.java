package boletin031;

public class Test {

	public static void main(String[] args) {
		
		Book book0 = new Book("Great Gatsby", "F. Scott Fitgerald", 350, 3, true, 19.99);
		Book book1 = new Book("Tender Is The Night", "F. Scott Fitgerald", 350, 3, true, 19.99);
		Book book2 = new Book("Cien años de soledad", "Gabriel García Márquez", 735, 3, true, 20.99);
		Book book3 = new Book("El señor de los anillos,", "J. R. R. Tolkien", 429, 5, true, 22.99);
		Book book4 = new Book("1984", "George Orwel,", 122, 3, false, 40.99);
		Book book5 = new Book("Un mundo feliz", "Aldous Huxley", 350, 3, true, 25.99);
		Book book6 = new Book("Orgullo y prejuicio", "Jane Austen", 340, 2, false, 12.99);
		Book book7 = new Book("Crimen y castigo", "Fiódor Dostoyevski", 259, 3, false, 60.99);
		
		
		Magazine magazine1 = new Magazine("Hola", 50, 1, false, 2.99);
		Magazine magazine2 = new Magazine("National Geographic", 50, 1, true, 3.99);
		Magazine magazine3 = new Magazine("Mas Allá", 50, 1, true, 3.99);
		Magazine magazine4 = new Magazine("Pronto", 50, 1, true, 2.99);
		Magazine magazine5 = new Magazine("Semanal", 40, 1, true, 0.00);
		Magazine magazine6 = new Magazine("Vogue", 70, 1, true, 4.99);
		
		book1.show();
		magazine1.show();
		
		book2.show();
		magazine2.show();
		
		Publication[] publicationArray = {book0, book1, book2, 
				book3, book4, book5, book6, book7,
				magazine1, magazine2, magazine3,
				magazine4, magazine5, magazine6 };

		System.out.println("BOOKS: ");
		for (Publication publication : publicationArray) {
			if (publication instanceof Book) {
				System.out.println(publication.getId() + ": " + publication.getTitle());
			}
		}

		System.out.println("MAGAZINES: ");
		for (Publication publication : publicationArray) {
			if (publication instanceof Magazine) {
				System.out.println(publication.getId() + ": " + publication.getTitle());
			}
		}
		
		System.out.println("BOOKS, MORE THAN 20 EURO: ");
		for (Publication publication : publicationArray) {
			if (publication instanceof Book && publication.getPrice() >= 20) {
				System.out.println(publication.getId() + ": " + publication.getTitle());
			}
		}

		System.out.println("MAGAZINES, MORE THAN 3 EURO: ");
		for (Publication publication : publicationArray) {
			if (publication instanceof Magazine && publication.getPrice() >= 3) {
				System.out.println(publication.getId() + ": " + publication.getTitle());
			}
		}
	}

}
