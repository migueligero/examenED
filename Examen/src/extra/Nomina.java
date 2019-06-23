package extra;

public class Nomina {

	public static void main(String[] args) {
		// Objeto Trabajador
			Trabajador trabajador1 = new Trabajador("Juan", 2500);
			trabajador1.imprimirDatos();
			System.out.println("");
		// Objeto Gerente
			Gerente gerente1 = new Gerente("Manolo", 2000);
			gerente1.sueldobase=gerente1.obtenerSueldo();
			gerente1.imprimirDatos();
			System.out.println("");

	}

}