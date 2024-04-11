package geometria.test;

//import geometria.CircunferenciaImpl2;
//import geometria.Punto;
import geometria.*;

public class TestCircunferencia3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto centro=new Punto(1d,2d);
		CircunferenciaImpl1 miCircunferencia=new CircunferenciaImpl1(centro,2.5);
		
		System.out.println("Circunferencia= "+miCircunferencia);
		System.out.println("Longitud= "+miCircunferencia.longitud());
		System.out.println("Area= "+miCircunferencia.area());
		
		CircunferenciaImpl2 otroCircunferencia=new CircunferenciaImpl2(centro, 2.5);
		
		System.out.println("Circunferencia= "+otroCircunferencia);
		System.out.println("Longitud= "+otroCircunferencia.longitud());
		System.out.println("Area= "+otroCircunferencia.area());
	}
}
