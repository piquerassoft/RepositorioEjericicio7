/**
 * Clase Persona
 * @author usuario
 *
 */
public class Persona {
		/**
		 * dni de la persona
		 */
		private String dni;
		/**
		 * nombre de la persona
		 */
		private String nombre;
		/**
		 * apellidos de la persona
		 */
		private String apellidos;
		/**
		 * dirección de la persona
		 */
		private String direccion;
		/**
		 * edad de la persona
		 */
		private int edad;
		/**
		 * Constructor de la clase Persona con los siguientes parámetros
		 * @param dni
		 * @param nombre
		 * @param apellidos
		 * @param direccion
		 * @param edad
		 */
		public Persona(String dni, String nombre, String apellidos, String direccion, int edad) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.direccion = direccion;
			this.edad = edad;
		}
		
		/**
		 * Método get del dni
		 * @return
		 */
		public String getDni() {
			return dni;
		}


		/**
		 * Método set de dni
		 * @param dni
		 */
		public void setDni(String dni) {
			this.dni = dni;
		}


		/**
		 * Método get del nombre
		 * @return
		 */
		public String getNombre() {
			return nombre;
		}


		/**
		 * Método set nombre
		 * @param nombre
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		/**
		 * Método get de apellidos
		 * @return
		 */
		public String getApellidos() {
			return apellidos;
		}


		/**
		 * Método set de apellidos
		 * @param apellidos
		 */
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}


		/**
		 * Método get de dirección
		 * @return
		 */
		public String getDireccion() {
			return direccion;
		}


		/**
		 * Método set de dirección
		 * @param direccion
		 */
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}


		/**
		 * Método get de edad
		 * @return
		 */
		public int getEdad() {
			return edad;
		}


		/**
		 * Método set de edad
		 * @param edad
		 */
		public void setEdad(int edad) {
			this.edad = edad;
		}


		/**
		 * Método toString de la clase persona
		 * @return
		 */
		@Override
	    public String toString() {
	        return "DNI: " + this.dni + " Nombre: " + this.nombre + " Apellidos: " + this.apellidos + " Dirección: " + this.direccion + " Edad: " + this.edad;
	    }
}
