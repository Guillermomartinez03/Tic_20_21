package Ultramarinos;

public class producto {
		String nombre;
		String clase[]= {"Frutería","Carnicería","Droguería","Pescadería","Congelados"};
		int tipo;
		double precio;
		public producto(String nombre, int tipo, double precio) {
			super();
			this.nombre = nombre;
			this.tipo = tipo;
			this.precio = precio;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String[] getClase() {
			return clase;
		}
		public void setClase(String[] clase) {
			this.clase = clase;
		}
		public int getTipo() {
			return tipo;
		}
		public void setTipo(int tipo) {
			this.tipo = tipo;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		public String getTodo() {
			String todo = getNombre()+", "+clase[getTipo()]+"; Precio: "+getPrecio()+"€.";
			System.out.println(todo);
			return todo;
		}
		
}
