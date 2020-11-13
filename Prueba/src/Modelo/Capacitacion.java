/**
 * 
 */
package Modelo;

import java.sql.Time;

/**
 * @author Los Bucles
 *
 */
public class Capacitacion {
		private int identificacion;
		private int rutCliente;
		private String dia;
		private Time hora;
		private String lugar;
		private String duracion;
		private int cantidadAsistentes;
		
		
		/**
		 * @param identificacion
		 * @param rutCliente
		 * @param dia
		 * @param hora
		 * @param lugar
		 * @param duracion
		 * @param cantidadAsistentes
		 */
		public Capacitacion(int identificacion, int rutCliente, String dia, Time hora, String lugar, String duracion,
				int cantidadAsistentes) {
			this.identificacion = identificacion;
			this.rutCliente = rutCliente;
			this.dia = dia;
			this.hora = hora;
			this.lugar = lugar;
			this.duracion = duracion;
			this.cantidadAsistentes = cantidadAsistentes;
		}
		public int getIdentificacion() {
			return identificacion;
		}
		public void setIdentificacion(int identificacion) {
			this.identificacion = identificacion;
		}
		public int getRutCliente() {
			return rutCliente;
		}
		public void setRutCliente(int rutCliente) {
			this.rutCliente = rutCliente;
		}
		public String getDia() {
			return dia;
		}
		public void setDia(String dia) {
			this.dia = dia;
		}
		public Time getHora() {
			return hora;
		}
		public void setHora(Time hora) {
			this.hora = hora;
		}
		public String getLugar() {
			return lugar;
		}
		public void setLugar(String lugar) {
			this.lugar = lugar;
		}
		public String getDuracion() {
			return duracion;
		}
		public void setDuracion(String duracion) {
			this.duracion = duracion;
		}
		public int getCantidadAsistentes() {
			return cantidadAsistentes;
		}
		public void setCantidadAsistentes(int cantidadAsistentes) {
			this.cantidadAsistentes = cantidadAsistentes;
		}
		
		
		

}
