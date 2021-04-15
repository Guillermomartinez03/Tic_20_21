package Concesionario;

public class dinerosEmpleados extends Empleados{
	private double gasto_total;

	public dinerosEmpleados(String nombre, String apellido1, String apellido2, String dNI, double gasto_total) {
		super(nombre, apellido1, apellido2, dNI);
		this.gasto_total = gasto_total;
	}

	/**
	 * @return the gasto_total
	 */
	public double getGasto_total() {
		return gasto_total;
	}

	/**
	 * @param gasto_total the gasto_total to set
	 */
	public void setGasto_total(double gasto_total) {
		this.gasto_total = gasto_total;
	}
}
