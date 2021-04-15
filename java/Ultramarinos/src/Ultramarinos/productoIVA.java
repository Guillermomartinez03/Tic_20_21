package Ultramarinos;

public class productoIVA extends producto{
	private boolean iva=false;
	public productoIVA(String nombre, int tipo, double precio, boolean iva) {
		super(nombre, tipo, precio);
		// TODO Auto-generated constructor stub
	}
	public void setPrecio_sin_iva(double precio) {
		if(iva==false) {
			precio=getPrecio()-getPrecio()*0.21;
		}else if(iva==true) {
			precio=getPrecio();
		}
		this.precio = precio;
	}
	public String getTodo_I() {
		setPrecio_sin_iva(getPrecio());
		String Iva=null;
		if(iva==false) {
			Iva="(No tiene I.V.A.)";
		}else if(iva==true){
			Iva="(Con I.V.A.)";
		}
		String todo_I=getNombre()+"; Precio: "+precio+"€; "+Iva;
		System.out.println(todo_I);
		return todo_I;
	}
}
