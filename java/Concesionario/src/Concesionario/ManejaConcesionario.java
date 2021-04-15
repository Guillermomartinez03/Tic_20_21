/**
 * 
 */
package Concesionario;

/**
 * @author Usuario
 *
 */
public class ManejaConcesionario {

	/**
	 * @param args
	 */
	//String marca, String modelo, String color, double puertas, double caballos,double capacidad_personas
	//String nombre, String apellido1, String apellido2, String dNI
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Coches coche1=new Coches("Mercedes", "AMG", "Azul molón", 3, 250, 2);
	Todoterreno coche2=new Todoterreno("Audi", "Q7", "Blanco", 5, 200, 7, true);
	System.out.println("Coches en el concesionario: ");
	System.out.println(coche1.getMarca()+" "+coche1.getModelo());
	System.out.println("* "+coche1.getColor()+" "+coche1.getPuertas());
	System.out.println(coche2.getMarca()+" "+coche2.getModelo());
	System.out.println("* "+"Color: "+coche2.getColor()+" Puertas: "+coche2.getPuertas()+" Caballos: "+coche2.getCaballos()+" ¿Es todoterreno? "+coche2.isTodoterreno());
	Empleados empleado1=new Empleados("Juan", "García", "Vaquero", "25479851D");
	System.out.println("Empleados: ");
	System.out.println(empleado1.getNombre()+" "+empleado1.getApellido1()+" "+empleado1.getApellido2()+ " DNI: "+empleado1.getDNI());
	}
}
