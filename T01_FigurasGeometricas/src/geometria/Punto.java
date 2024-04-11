package geometria;

public class Punto {
	private Double x;
	private Double y;
	
	public Punto (Double x, Double ord){
		this.x=x;
		this.y=ord;
	}
	public Punto(){
		this.x=0d;
		this.y=0d;
	}
	public Double getX(){
		return this.x;
	}
	public Double getY(){
		return this.y;
	}
	public void setX(Double x){
		this.x=x;
	}
	public void setY(Double y){
		this.y=y;
	}
	public String toString(){
		return "("+this.x+","+this.y+")";
	}
	public Double distancia(Punto p){
		return Math.sqrt(Math.pow(this.getX()-p.getX(),2)+Math.pow(this.getY()-p.getY(),2));  
							// se puede ecribir asi sin getX? (this.x) si se puede pero asi mejor
	}
}