package primerasclases;

public class TestVector {

	public static void main(String[] args) {
		Vector v1 = new Vector(5, 6);
		v1.show();
		
		Vector v2 = new Vector(v1);
		v2.show();
		
		v1.opera(v2, '+');
		v1.opera(v2, '-');
		v1.opera(v2, '*');
		
		System.out.println(v1.prod(2));
		v1.opera(2);
		
		Vector v3 = new Vector(2, 3);
		Vector v4 = new Vector(-3, 2);
		System.out.println(v3.esPerpendicular(v4));
		
		Vector v5 = new Vector(0, 0);
		Vector v6 = new Vector(3, 0);
		System.out.println(v5.esParalelo(v6));
	}

}
