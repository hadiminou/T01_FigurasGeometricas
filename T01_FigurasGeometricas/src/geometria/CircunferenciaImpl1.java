package geometria;

public class CircunferenciaImpl1 implements Circunferencia { // implements se usa para implementar todos los metodos que estan esctritos en la interfaz
	private Punto centro;									// Ello obligará a “programar” en la clase todos los métodos referenciados en la interfaz.
	private Double radio;							// atributos
	
	public CircunferenciaImpl1 (Punto centro, Double radio) {  // metodo constructor
		if (radio<=0) {
			throw new IllegalArgumentException("El radio debe ser positivo");
		}
		this.centro=centro;
		this.radio=radio;
	}
	
	public Punto getCentro(){ // metodo consultor
		return this.centro;
	}
	
	public Double getRadio(){  // metodo consultor
		return this.radio;
	}
	
	public void setCentro(Punto c){  // metodod modificador
		if (radio <= 0) {
			throw new IllegalArgumentException("El radio debe ser positivo");
		}
		this.centro=c;     // se peude quitar (this)
	}
	
	public void setRadio(Double radio){  // metodo modificador  // tambien en el lugar de radio se puede utilizar cualquier variable para radio ej: nuevoRadio o a entonces se puede quitar (this) porque atributo y variable no tienen mismo nombre
		this.radio=radio;
	}
	
	public String toString(){  // metodo representacion textual
		return this.centro+" R:"+this.radio;
	}
	
	public Double longitud() {
		return 2*Math.PI*this.radio;
	}
	
	public Double area() {
		return Math.PI*Math.pow(this.radio, 2);
	}
	
	public boolean equals(Object o) {
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
	
	public int compareTo(Circunferencia c) {
		return this.getRadio().compareTo(c.getRadio());
	}
}
