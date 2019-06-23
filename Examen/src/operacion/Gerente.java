package operacion;

public class Gerente extends Trabajador{
	private float grado;
	
	public Gerente(String nombre, int sueldo) {
		super(nombre,sueldo);
		grado = (float) 2.0;
	}
	
	public void imprimirDatos() {
		super.imprimirDatos();
		System.out.println("GRADO = "+ grado);
	}
	
	public float obtenerSueldo() {
		return sueldobase*grado;
	}

}
