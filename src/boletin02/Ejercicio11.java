package boletin02;

public class Ejercicio11 {

	public static void main(String[] args) {
		int[] numArray = { 1, 2, 3, 4, 5 };
		int length = numArray.length;
		
		for (int i = 0; i < length / 2; i++) {
			int temp = numArray[length - 1 - i];
			numArray[length - 1 - i] = 	numArray[i];
			numArray[i] = temp;
		}
		
		for (int number : numArray) {
			System.out.printf("%d ", number);
		}
	}

}
