package boletin01;

public class Ejercicio10 {

	public static void main(String[] args) {
		int base = 2;
		for (int i = 1; i <= 10; i++) {
			int pow = (int)Math.pow(base, i);
			// System.out.println(base + "^" + i + " = " + (int)Math.pow(base, i));
			System.out.printf("2^%-2d = %4d%n", i, pow);
		}
	}

}
