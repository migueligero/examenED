package operacion;

public class Algoritmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Esmultiplo="";
		String Espar="";
		for(int i=1;i<=36;i++)
		{
			if (i%3==0)
			{
				Esmultiplo=" Es m�ltiplo de 3.";
			}
			else
			{
				Esmultiplo="No es m�ltiplo de 3.";
			}
			if (i%2==0)
			{
				Espar="Es par.";
			}
			else
			{
				Espar="";
			}
			System.out.println(i+" ->"+Esmultiplo+Espar);
		}
	}

}
