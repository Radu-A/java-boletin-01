package boletin01;

public class Ejercicio15 {

	public static void main(String[] args) {
		int acc = 0;
		for (int i = 1; i <=60; i++) {
			if (i % 4 == 0 && i % 12 != 0) {
				System.out.println(i + " ");
			}
		}
	}

}
