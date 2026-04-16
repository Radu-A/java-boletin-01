package primerasclases;

public class TestPostIt {

	public static void main(String[] args) {
		/*
		1. Crea un postit de 50 x 50 mm rosa al que llamarás `p1` con mensaje “AA”.
		2. Crea otro postit adicional de 50 x 50 mm amarillo al que llamarás `p2` con mensaje “BB” .
		3. Crea otro postit adicional de 30 x 30 mm naranja al que llamarás `p3` con mensaje “CC” .
		4. Crea otro postit adicional de 30 x 30 mm azul al que llamarás `p4` con mensaje “DD” .
		 */
		
		PostIt p1 = new PostIt();
		p1.color = "rosa";
		p1.msg = "AA";
		p1.alto = 50;
		p1.ancho = 50;
		
		System.out.printf("PostIt %s de %d x %d: %s%n", p1.color,  p1.alto, p1.ancho, p1.msg );
		
		PostIt p2 = new PostIt();
		p2.color = "amarillo";
		p2.msg = "BB";
		p2.alto = 50;
		p2.ancho = 50;
		
		PostIt p3 = new PostIt();
		p3.color = "naranja";
		p3.msg = "CC";
		p3.alto = 30;
		p3.ancho = 30;
		
		PostIt p4 = new PostIt();
		p4.color = "azul ";
		p4.msg = "DD";
		p4.alto = 30;
		p4.ancho = 30;
	}

}
