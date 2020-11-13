package Modelo;

import java.time.LocalDate;

public class Usuario {
	private String nombre;
	private String fechaNacimiento;
	private int run;
	
	
	/**
	 * @param nombre
	 * @param fechaNacimiento
	 * @param run
	 */
	public Usuario(String nombre, String fechaNacimiento, int run) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		
		System.out.println("Nombre Usuario: "+ this.nombre);
		System.out.println("Run Usuario: "+ this.run);
		
	}
	public void  mostrarEdad() {
		System.out.println("Edad: "+ (LocalDate.now()-this.fechaNacimiento)); 
	}
	//juan
	LocalDate hoy = LocalDate.now();   
	 LocalDate nacimiento = usuarioActivo.getFechaNacimiento().toInstant().
	           atZone(ZoneId.systemDefault()).toLocalDate(); 
	 long edad = ChronoUnit.YEARS.between(nacimiento, hoy); 

//franco	 
	 import java.time.LocalDate; // import the LocalDate class

	 public class MyClass {
	   public static void main(String[] args) {
	     LocalDate myObj = LocalDate.now(); // Create a date object
	     System.out.println(myObj); // Display the current date
	   }
	 }

	 
	 
	 
	 
	 
	 

}
