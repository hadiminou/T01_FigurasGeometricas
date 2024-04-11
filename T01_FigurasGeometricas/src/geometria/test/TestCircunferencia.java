package geometria.test;

import geometria.CircunferenciaOriginal;
import geometria.Punto;

public class TestCircunferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto centro=new Punto(1d,2d);
		CircunferenciaOriginal miCircunferencia=new CircunferenciaOriginal(centro, 2.5);
		System.out.println("Circunferencia= "+miCircunferencia);
		System.out.println("Longitud= "+miCircunferencia.longitud());
		System.out.println("Area= "+miCircunferencia.area());
	}
}
