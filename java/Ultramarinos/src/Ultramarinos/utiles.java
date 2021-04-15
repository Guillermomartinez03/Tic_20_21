package Ultramarinos;

public class utiles {
	String nombre;
	float anios;
	boolean uso;
	public utiles(String nombre, float anios, boolean uso) {
		super();
		this.nombre = nombre;
		this.anios = anios;
		this.uso = uso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getAnios() {
		return anios;
	}
	public void setAnios(float anios) {
		this.anios = anios;
	}
	public boolean isUso() {
		return uso;
	}
	public void setUso(boolean uso) {
		this.uso = uso;
	}
	public String getTodo() {
		String uso1 = null;
		if(uso==true) {
			uso1="Este util se utiliza";
		}else if(uso==false) {
			uso1="Este util no se utiliza";
		}
		String todo=nombre+", "+anios+" años."+uso1;
		System.out.println(todo);
		return todo;
	}
}
