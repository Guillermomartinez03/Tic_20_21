package Ultramarinos;

public class manejaUtramarinos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		INICIO PROGRAMA
		System.out.println("Bienvenido a Ultramarinos Martínez and CO :) encantados de verle por aquí. <3");
		//		PRODUCTOS
		System.out.println("\nAquí mostramos los productos: ");
		//{"Frutería","Carnicería","Droguería","Pescadería","Congelados"};
		producto p0=new producto("Gallo", 3, 15);
		p0.getTodo();
		producto p1=new producto("Lejía", 2, 7);
		producto p2=new producto("Manzanas", 0, 2);
		producto p3=new producto("Jamón", 1, 4.5);
		producto p4=new producto("Helados", 4, 3.75);
		producto p5=new producto("Nuggets", 1, 2.99);
		producto p6=new producto("Tornillos", 2, 3.5);
		producto p7=new producto("Batidora", 2, 49.99);
		producto p8=new producto("Pulpo", 3, 12.56);
		producto p9=new producto("Bogavante",3, 14.96);
		producto p10=new producto("Pizza",4, 2.99);
		p1.getTodo();
		p2.getTodo();
		p3.getTodo();
		p4.getTodo();
		p5.getTodo();
		p6.getTodo();
		p7.getTodo();
		p8.getTodo();
		p9.getTodo();
		p10.getTodo();
		
		//		PRODUCTOS CON/SIN IVA
		System.out.println("\nAquí mostramos los productos con o sin iva: ");
		productoIVA pi0=new productoIVA("Entrada concierto Paco", 0, 7.8 , false);
		pi0.getTodo_I();
		productoIVA pi1=new productoIVA("Pulsera Ana", 0, 2.5 , false);
		productoIVA pi2=new productoIVA("Bono piscinas", 0, 20 , true);
		productoIVA pi3=new productoIVA("Bono fiestas", 0, 50 , true);
		productoIVA pi4=new productoIVA("Leche granja Juan", 0, 3.25 , false);
		pi1.getTodo_I();
		pi2.getTodo_I();
		pi3.getTodo_I();
		pi4.getTodo_I();
		
		
		//		UTILES
		System.out.println("\nAquí mostramos los útiles, usados y no usados.");
		//String nombre, float anios, boolean uso
		utiles u0=new utiles("Caja registradora", 12, true);
		u0.getTodo();
		utiles u1=new utiles("Lonchador carnicería", 5, false);
		utiles u2=new utiles("Báscula frutería", 19, true);
		utiles u3=new utiles("Horno de leña", 42, true);
		utiles u4=new utiles("Cámara frigorífica", 15, true);
		u1.getTodo();
		u2.getTodo();
		u3.getTodo();
		u4.getTodo();
		
		//		EMPLEADOS
		//String nombre, String apellido1, String apellido2, int anios, int sexo
		System.out.println("\nAquí mostramos los empleados: ");
		empleado e0=new empleado("Carlos", "Aguirre", "Echevarría", 98, 0);
		e0.getTodo();
		empleado e1=new empleado("Ester", "Vlachodymos", "López", 37, 1);
		empleado e2=new empleado("Felipe", "Anjou", "De Borbón", 42, 2);
		e1.getTodo();
		e2.getTodo();
	}

}
