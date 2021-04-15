package Micodigo;

public class ManejaCirculo {
	
	public static void main(String[]args) {
		//TODO Auto-generated method stub
		Circulo miCirculito;
		miCirculito=new Circulo(10.0,3.0,4.0);
		System.out.print("El circulo de radio ");
		System.out.println(miCirculito);
		System.out.print("AREA: ");
		System.out.println(miCirculito.devuelveArea());
		Object coordenadasCentro;
		System.out.println(((Object) coordenadasCentro).getNum1());
	}

}
