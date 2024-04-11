package geometria.test;

//import geometria.CircunferenciaImpl2;
//import geometria.Punto;
import geometria.*;

public class TestCircunferencia4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Punto centro=new Punto(1d,2d);
		CircunferenciaImpl1 miCircunferencia=new CircunferenciaImpl1(centro,2.5);
		
		System.out.println("Circunferencia= "+miCircunferencia);
		System.out.println("Longitud= "+miCircunferencia.longitud());
		System.out.println("Area= "+miCircunferencia.area());
		
		CircunferenciaImpl2 otroCircunferencia=new CircunferenciaImpl2(centro, 2.5);
		
		System.out.println("Circunferencia= "+otroCircunferencia);
		System.out.println("Longitud= "+otroCircunferencia.longitud());
		System.out.println("Area= "+otroCircunferencia.area());
		*/
		Circunferencia c1 = new CircunferenciaImpl1(new Punto(1d,2d),2.5);
		Circunferencia c2 = new CircunferenciaImpl2(new Punto(1d,2d),2.5);
		Circunferencia c3 = new CircunferenciaImpl1(new Punto(1d,2d),1.5);
		Circunferencia c4 = new CircunferenciaImpl1(new Punto(1.3,-2.2),2.5);
		
		System.out.println("c1.equals(c2)="+c1.equals(c2));
		System.out.println("c1.equals(c3)="+c1.equals(c3));
		System.out.println("c2.equals(c4)="+c2.equals(c4));
		System.out.println("c4.equals(c3)="+c4.equals(c3));
		
		System.out.println("hashCode c1="+c1.hashCode());
		System.out.println("hashCode c2="+c2.hashCode());
		System.out.println("hashCode c3="+c3.hashCode());
		System.out.println("hashCode c4="+c4.hashCode());
	}
}
