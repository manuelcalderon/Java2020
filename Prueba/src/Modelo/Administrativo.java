package Modelo;

public class Administrativo extends Usuario {
	private String area;
	private String experienciaPrevia;
	
	/**
	 * @param nombre
	 * @param fechaNacimiento
	 * @param run
	 * @param area
	 * @param experienciaPrevia
	 */
	public Administrativo(String nombre, String fechaNacimiento, int run, String area, String experienciaPrevia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
	
	
}
