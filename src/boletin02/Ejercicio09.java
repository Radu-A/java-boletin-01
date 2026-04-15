package boletin02;

public class Ejercicio09 {

	public static void main(String[] args) {
		int[] multipleFive = new int[10];
		int count = 0;
		int index = 0;
		
		for (int i = 1; i <= multipleFive.length; i++) {
			multipleFive[i-1] = i*5;
			if (multipleFive[i-1] % 10 == 0) {
				count++;
			}
		}

		int[] multipleTen = new int[count];
		for (int number : multipleFive) {
			if (number % 10 == 0) {
				multipleTen[index] = number;
				index++;
			}
		}
		
		for (int number : multipleTen) {
			System.out.printf("%d ", number);
		}
	}

}
