package geometria.test;

import geometria.*;

public class TestCircunferencia6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto centro = new Punto(1.3,5.6);
		//Circunferencia c1 = new CircunferenciaImpl1(centro, 0d);
		Circunferencia c2 = new CircunferenciaImpl2(centro, 10d);
		//System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		c2.setRadio(-20d);
		//System.out.println("c1: " + c1);
		System.out.println("c2: "+ c2);
	}
}
