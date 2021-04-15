package Micodigo;

public class ManejaParejaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParejaNumeros misNumeros;
		int num1=3;
		int num2=5;
		misNumeros= new ParejaNumeros(num1,num2);
		System.out.println("La suma vale");
		System.out.print(misNumeros.devuelvesuma());
		System.out.println("\nLa resta vale");
		System.out.print(misNumeros.devuelveresta());
		
		System.out.println("\nLa suma de el numero ");
		System.out.print(num1);
		System.out.print(" y el numero ");
		System.out.print(num2);
		System.out.print(" es igaul a ");
		System.out.print(misNumeros.devuelvesuma());
	}
}
