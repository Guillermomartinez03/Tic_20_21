package Micodigo;

public class Circulo {
	private double radio;
	private ParejaNumeros coordenadasCentro;
	
	public Circulo(double radio , double centro_x, double centro_y ) {
		//TODO Auto-generated method stub
		this.setRadio(radio);
		coordenadasCentro=new ParejaNumeros(centro_x,centro_y);
	}
	double devuelveArea() {
		double area;
		area=(double) (Math.PI*getRadio()*getRadio());
		return (double) (area);
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
}
