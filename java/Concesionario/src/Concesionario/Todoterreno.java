package Concesionario;

public class Todoterreno extends Coches{
	private boolean todoterreno;
	public Todoterreno(String marca, String modelo, String color, float puertas, double caballos,
			double capacidad_personas, boolean todoterreno) {
		super(marca, modelo, color, puertas, caballos, capacidad_personas);
		this.todoterreno = todoterreno;
	}
	/**
	 * @return the todoterreno
	 */
	public boolean isTodoterreno() {
		return todoterreno;
	}
	/**
	 * @param todoterreno the todoterreno to set
	 */
	public void setTodoterreno(boolean todoterreno) {
		this.todoterreno = todoterreno;
	}
	
}
