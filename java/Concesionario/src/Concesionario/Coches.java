package Concesionario;

public class Coches {
	private String marca;
	private String modelo;
	private String color;
	private float puertas;
	private double caballos;
	private double capacidad_personas;
	public Coches(String marca, String modelo, String color, float puertas, double caballos,
			double capacidad_personas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.puertas = puertas;
		this.caballos = caballos;
		this.capacidad_personas = capacidad_personas;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the puertas
	 */
	public float getPuertas() {
		return puertas;
	}
	/**
	 * @param puertas the puertas to set
	 */
	public void setPuertas(float puertas) {
		this.puertas = puertas;
	}
	/**
	 * @return the caballos
	 */
	public double getCaballos() {
		return caballos;
	}
	/**
	 * @param caballos the caballos to set
	 */
	public void setCaballos(double caballos) {
		this.caballos = caballos;
	}
	/**
	 * @return the capacidad_personas
	 */
	public double getCapacidad_personas() {
		return capacidad_personas;
	}
	/**
	 * @param capacidad_personas the capacidad_personas to set
	 */
	public void setCapacidad_personas(double capacidad_personas) {
		this.capacidad_personas = capacidad_personas;
	}
	
}
