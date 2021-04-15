package Cimuenzo;

public class Punto {
	private double coordenada_x;
	private double coordenada_y;
	public Punto(double coordenada_x, double coordenada_y) {
		super();
		this.coordenada_x = coordenada_x;
		this.coordenada_y = coordenada_y;
	}
	/**
	 * @return the coordenada_x
	 */
	public double getCoordenada_x() {
		return coordenada_x;
	}
	/**
	 * @param coordenada_x the coordenada_x to set
	 */
	public void setCoordenada_x(double coordenada_x) {
		this.coordenada_x = coordenada_x;
	}
	/**
	 * @return the coordenada_y
	 */
	public double getCoordenada_y() {
		return coordenada_y;
	}
	/**
	 * @param coordenada_y the coordenada_y to set
	 */
	public void setCoordenada_y(double coordenada_y) {
		this.coordenada_y = coordenada_y;
	}
	
}
