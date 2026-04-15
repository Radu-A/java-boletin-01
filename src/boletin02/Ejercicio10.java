package boletin02;

public class Ejercicio10 {

	public static void main(String[] args) {
		int[] numArray = { 1, 2, 3, 4, 5 };
		int length = numArray.length;
		int[] invertedArray = new int[length];
		for (int i = 0; i < length; i++) {
			invertedArray[i] = numArray[length - 1 - i];
		}
		for (int number : invertedArray) {
			System.out.printf("%d ", number);
		}
	}

}
