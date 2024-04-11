package geometria;

public class CircunferenciaImpl2 implements Circunferencia {  // atributos
	private Punto centro;
	//private Double radio;
	private Double area;
	
	public CircunferenciaImpl2 (Punto centro, Double radio) {   // metodo constructor
		if (radio <= 0) {
			throw new IllegalArgumentException("El radio debe ser positivo");
		}
		this.centro=centro;
		//this.radio=radio;
		this.area=Math.PI*Math.pow(radio, 2);
	}	
	public Punto getCentro(){ // metodo consultor
		return this.centro;
	}
	public Double getRadio(){  // metodo consultor
		//return this.radio;
		return Math.sqrt(this.area/Math.PI);
	}
	public void setCentro(Punto c){  // metodo modificador
		this.centro=c;
	}
	public void setRadio(Double nuevoRadio){  // metodo modificador
		if (nuevoRadio <= 0) {
			throw new IllegalArgumentException("El radio debe ser positivo");
		}
		//this.radio=radio;
		this.area=Math.PI*Math.pow(nuevoRadio,2);
	}
	public String toString(){  // metodo representacion textual
		return this.centro+" R:"+this.getRadio();
	}
	public Double longitud() {
		return 2*Math.PI*this.getRadio();
	}
	public Double area() {
		//return Math.PI*Math.pow(this.getRadio(), 2);
		return this.area;
	}
	
	public boolean equals(Object o) {  //criterio de igualdad
		boolean res = false;
		if (o instanceof Circunferencia) {
			Circunferencia c = (Circunferencia)o;
			res = this.getCentro().equals(c.getCentro()) && 
				  this.getRadio().equals(c.getRadio());
		}
		return res;
	}
	public int hashcode() {
		return 19*this.getCentro().hashCode()+
			   11*this.getRadio().hashCode();
	}
	public int compareTo(Circunferencia c) {  //criterio de ordenacion
		return this.getRadio().compareTo(c.getRadio());
	}
}
