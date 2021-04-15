package Ultramarinos;

public class empleado {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int anios;
	private int sexo;
	public empleado(String nombre, String apellido1, String apellido2, int anios, int sexo) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.anios = anios;
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public int getAnios() {
		return anios;
	}
	public void setAnios(int anios) {
		this.anios = anios;
	}
	public String getSexo() {
		String sex[]= {"Hombre","Mujer","No definido"};
		String sexo_s=sex[sexo];
		return sexo_s;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	public String getTodo() {
		String todo=null;
		todo=getNombre()+" "+getApellido1()+" "+getApellido2()+"; "+getAnios()+" años; "+getSexo();
		System.out.println(todo);
		return todo;
	}
}
