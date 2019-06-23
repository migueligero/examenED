package operacion;

public class Examen {
		public static void main (String args[]) {
			String[] participantes = new String[] {"José","Pepe","Manolo","Antonio"};
			int[] lanzamiento= new int[]{7,12,18,22};
			
			int i=0;
			String texto="";
			for (int j : lanzamiento) {

				if (lanzamiento[i]<10) {
					texto="Flojillo";
				} else if (lanzamiento[i]<15) {
						texto="Fuerte";
				} else if (lanzamiento[i]<20) {
						texto="Muy Fuerte";
				} else {
						texto="Mastodonte";
				}
				
				System.out.println(participantes[i] + ": " + texto);
				i+=1;
			}
		}
}
