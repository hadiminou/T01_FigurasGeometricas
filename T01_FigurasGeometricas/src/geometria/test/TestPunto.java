package geometria.test;

import geometria.Punto;

public class TestPunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1=new Punto(1.0,2d);
		System.out.println("p1="+p1.toString());
		p1.setX(-5D);
		System.out.println("p1="+p1);
		System.out.println("Ordenada de p1="+p1.getY());
		Punto p2=new Punto(4.5,6.11);
		Punto p3=new Punto(4.0,6.0);
		System.out.println("p2 a p3="+p2.distancia(p3));
		System.out.println("p1 a p2="+p1.distancia(p2));
		Punto origen=new Punto();
		System.out.println("Origen="+origen);
		System.out.println("p1 a origen="+p1.distancia(origen));
	}
}
