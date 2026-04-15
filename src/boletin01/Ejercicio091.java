package boletin01;

public class Ejercicio091 {

	public static void main(String[] args) {
		int a = 1;
		int b = 200;
		
		int primero = (a -1) / 7 * 7 + 7;
		int ultimo = b / 7 * 7;
		
		int multiplos = (ultimo - primero) / 7 + 1;
		
		System.out.println(multiplos);
	}

}
