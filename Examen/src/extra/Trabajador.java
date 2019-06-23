package extra;

public class Trabajador {
	
	public String nombre;
	public float sueldobase;
	
	public Trabajador(String nombre, float sueldo)
	{
		this.nombre = nombre;
		this.sueldobase = sueldo;
	}
	
	public void imprimirDatos() {
		System.out.println("Nombre trabajador: " + nombre);
		System.out.println("Sueldo base: " + sueldobase);
	}
	
	
	public static void main(String[] args) {		
		Trabajador trabajador1 = new Trabajador("Juan", 2500);
		trabajador1.imprimirDatos();
	}

}
