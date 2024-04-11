package geometria;

public class CircunferenciaImpl3 implements  Circunferencia {
	private Punto centro;
	//private Double radio;
	private Double area;
	
	public CircunferenciaImpl3 (Punto centro, Double radio) { 
		this.centro=centro;
		//this.radio=radio;
		this.area=Math.PI*Math.pow(radio, 2);
	}	
	public Punto getCentro(){
		return this.centro;
	}
	public Double getRadio(){
		//return this.radio;
		return Math.sqrt(this.area/Math.PI);
	}
	public void setCentro(Punto c){
		this.centro=c;
	}
	public void setRadio(Double radio){
		//this.radio=radio;
		this.area=Math.PI*Math.pow(radio,2);
	}
	public String toString(){
		return this.centro+" R:"+this.getRadio();
	}
	public Double longitud() {
		return 2*Math.PI*this.getRadio();
	}
	public Double area() {
		//return Math.PI*Math.pow(this.getRadio(), 2);
		return this.area;
	}
	
	public int compareTo(Circunferencia c) {
		return this.getRadio().compareTo(c.getRadio());
	}
}
