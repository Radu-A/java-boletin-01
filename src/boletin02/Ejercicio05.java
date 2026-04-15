package boletin02;

public class Ejercicio05 {

	public static void main(String[] args) {
		int length = 10;
		int[] numArray = new int[length];
		for (int i = 0; i <= length - 1; i++) {
			numArray[i] = i % 2 == 0 ? i + 2 : i - 2;
		}
		for (int i = 0; i <= length - 1; i++) {
			if (i == 1) {
				System.out.printf("%d", numArray[i]);
			} else {
				System.out.printf(" %d", numArray[i]);
			}
		}
	}

}
