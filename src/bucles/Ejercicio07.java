package bucles;

public class Ejercicio07 {

	public static void main(String[] args) {
		int num = 1546567;
		int length = 1;
		for (int i = 10; i < num; i*=10) {
			length++;
		}
		System.out.println("La cantidad de dígitos es: " + length);
	}

}
