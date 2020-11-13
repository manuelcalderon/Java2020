package Modelo;

import java.sql.Date;

public class Profesional extends Usuario {
	private String titulo;
	private Date fechaIngreso;
	
	/**
	 * @param nombre
	 * @param fechaNacimiento
	 * @param run
	 * @param titulo
	 * @param fechaIngreso
	 */
	public Profesional(String nombre, String fechaNacimiento, int run, String titulo, Date fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
}
