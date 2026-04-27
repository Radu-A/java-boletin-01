package boletin031;

public abstract class Publication implements CanRead {

	private long id;
	private static long nextId = 0;

	private String title;
	private int numberPages;
	private int initialPage;
	private int currentPage;
	private boolean digitalVersion;
	private double price;
	private boolean read = false;

	private static String messageHeader;

	protected Publication(String title, int numberPages, int initialPage, boolean digitalVersion, double price) {
		this.title = title;
		this.numberPages = numberPages;
		this.initialPage = initialPage;
		this.digitalVersion = digitalVersion;
		this.price = price;
		this.setId();
	}

	public String toString() {
		return String.format("Publication \"%s\" with %d pages and %.2f € price.", this.title, this.numberPages,
				this.price);
	}

	public void show() {
		System.out.println(
				Publication.messageHeader 
				+ "Título: " + title + "\r\n" 
				+ "Id: " + id + "\r\n" 
				+ "Páginas: " + numberPages + "\r\n" 
				+ "Página inicial: " + initialPage + "\r\n" 
				+ "PáginaActual : " + currentPage + "\r\n" 
				+ "Precio: " + price + "\r\n" 
				+ "Formato digital: " + digitalVersion + "\r\n" 
				+ "Leído: " + read + ""
			);
	}

	public static void showStatic(String title, long id, int numberPages, int initialPage, int currentPage, double price, boolean digitalVersion, boolean read) {
		System.out.println(
				Publication.messageHeader
				+ "Título: " + title + "\r\n"
				+ "Id: " + id + "\r\n"
				+ "Páginas: " + numberPages + "\r\n"
				+ "Página inicial: " + initialPage + "\r\n"
				+ "PáginaActual : " + currentPage + "\r\n"
				+ "Precio: " + price + "\r\n"
				+ "Formato digital: " + digitalVersion + "\r\n"
				+ "Leído: " + read + ""
			);
	}
	
	public void readPage(boolean silenciosamente) {
		if (currentPage + 1 < numberPages) {
			System.out.printf("Page %d read of publication %s ", currentPage, title);
			currentPage+=1;
		} else if (currentPage + 1 == numberPages) {
			System.out.printf("Last page (%d) read of publication %s ", currentPage, title);
			currentPage+=1;
			read = true;
		} else {
			System.out.printf("Publication %s has been read", title);
		}
	}

	// getters and setters
	protected long getId() {
		return id;
	}
	
	protected void setId() {
		this.id = Publication.nextId;
		Publication.nextId++;
	}
	
	protected String getTitle() {
		return title;
	}
	
	protected double getPrice() {
		return price;
	}

	protected void setMessageHeader(String message) {
		Publication.messageHeader = message;
	}
}
