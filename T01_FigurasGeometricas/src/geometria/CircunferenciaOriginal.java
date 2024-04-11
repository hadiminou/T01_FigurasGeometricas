package geometria;

public class CircunferenciaOriginal { 
	private Punto centro;
	private Double radio;
	
	public CircunferenciaOriginal (Punto centro, Double radio) { 
		this.centro=centro;
		this.radio=radio;
	}	
	public Punto getCentro(){
		return this.centro;
	}
	public Double getRadio(){
		return this.radio;
	}
	public void setCentro(Punto c){
		this.centro=c;
	}
	public void setRadio(Double radio){
		this.radio=radio;
	}
	public String toString(){
		return this.centro+" R:"+this.radio;
	}
	public Double longitud() {
		return 2*Math.PI*this.radio;
	}
	public Double area() {
		return Math.PI*Math.pow(this.radio, 2);
	}
}
