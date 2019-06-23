package operacion;

public class Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo C1=new Circulo(20);
		System.out.println(C1.Obtenerdiametro());
		System.out.println(C1.Circunferencia());
		System.out.println(C1.Area());
	}
	float radio;
	public Circulo () {
		
	}
	public Circulo (float radio) {
		this.radio=radio;
	}
	public float Obtenerdiametro () {
		return radio*2;
	}
	public double Circunferencia () {
		return radio*2*Math.PI;
	}
	public double Area () {
		return Math.PI*radio*radio;
	}
}
