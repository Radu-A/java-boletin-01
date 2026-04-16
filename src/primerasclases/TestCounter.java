package primerasclases;

public class TestCounter {

	public static void main(String[] args) {
		Counter c1 = new Counter(4, "PepIn-o");
		c1.show();
		
		c1.increment();
		c1.increment();
		c1.increment();
		c1.increment();
		c1.increment();
		c1.increment();
		c1.increment();
		c1.show();
		
		c1.increment(7);
		c1.show();
		
		c1.reset();
		c1.show();
		
		c1.increment(3);
		c1.show();
		
		c1.reset();
		c1.show();
		
		Counter c2 = new Counter(12, "Rocket");
		c2.show();
		
		Counter c3 = new Counter(c2);
		c3.show();
	}

}
