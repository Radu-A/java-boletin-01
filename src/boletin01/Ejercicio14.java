package boletin01;

public class Ejercicio14 {

	public static void main(String[] args) {
		int count = 0;
		int acc = 0;
		for (int i = 1; i <=30; i++) {
			count+=1;
			int square = i*i;
			acc+=square;
		}
		System.out.printf("Suma de cuadrados de primeros %d números naturales es %d.", count, acc);
	}

}
