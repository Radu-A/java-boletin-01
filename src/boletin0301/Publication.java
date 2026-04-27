package boletin0301;

public class Publication {
	
	private long id;
	private static long nextId = 0;
	
	private String title;
	private int numberPages;
	private int initialPage;
	private int currentPage;
	private boolean digitalVersion;
	private double price;
	private boolean read;
	
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
		return String.format("Publication \"%s\" with %d pages and %.2f € price.", this.title, this.numberPages, this.price);
	}
	
	public void show() {
		System.out.println(this.messageHeader
				+ "Título: " + title + "\r\n"
				+ "Id: " + getId() + "\r\n"
				+ "Páginas: " + numberPages + "\r\n"
				+ "Página inicial: " + initialPage + "\r\n"
				+ "PáginaActual : " + currentPage + "\r\n"
				+ "Precio: " + price + "\r\n"
				+ "Formato digital: " + digitalVersion + "\r\n"
				+ "Leído: " + read + ""
				);;
	}
	
	// getters and setters
	protected void setId() {
		this.id = Publication.nextId;
		Publication.nextId++;
	}
	protected long getId() {
		return this.id;
	}
	
	protected void setMessageHeader(String message) {
		Publication.messageHeader = message;
	}
}
