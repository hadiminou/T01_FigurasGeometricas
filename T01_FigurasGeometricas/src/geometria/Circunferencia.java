package geometria;

public interface Circunferencia extends Comparable<Circunferencia> {
	Punto getCentro();
	Double getRadio();
	void setCentro(Punto p);
	void setRadio(Double radio);
	Double longitud();
	Double area();
	//Float pepito();  todos los metodos que estan en la clase deben estar en las funcionalidades
}
