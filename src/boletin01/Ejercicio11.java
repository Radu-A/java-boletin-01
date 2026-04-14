package boletin01;

public class Ejercicio11 {

	public static void main(String[] args) {
		String str = "";
		boolean mark = true;
		for (int i = 50; i >= 29; i--) {
			if (i%2 == 0 && mark) {
				str+=i;
			} else if (i%2 == 0) {
				str+="-"+i;
			}
			mark = false;
		}
		System.out.println(str);
	}

}
