
public class Persona {
		private String dni;
		private String nombre;
		private String apellidos;
		private String direccion;
		private int edad;
		public Persona(String dni, String nombre, String apellidos, String direccion, int edad) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.direccion = direccion;
			this.edad = edad;
		}
		
		@Override
	    public String toString() {
	        return "DNI: " + this.dni + " Nombre: " + this.nombre + " Apellidos: " + this.apellidos + " Dirección: " + this.direccion + " Edad: " + this.edad;
	    }
}
