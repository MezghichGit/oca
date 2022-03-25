package chapter4;

public class PassageDeParametres {

	public static void permut(int a, int b)
	{
		int aux;
		aux = a;
		a=b;
		b=aux;
	}
	
	
	public static void modifSB(StringBuilder sb)
	{
		sb.append("ocp");
	}
	
	public static void modifString(String st)
	{
		st.concat("ocp");
	}
	
	public static void modifDouble(Double x)
	{
		x++;
		System.out.println(x);
	}
	
	
	
	public static void main(String[] args) {
		Double a = new Double(12);
		modifDouble(a);
		System.out.println(a);
		//StringBuilder s = new StringBuilder("oca-");
		//String s = new String("oca-");
		//modifString(s);
		//modifSB(s);
		//System.out.println(s);
		/*int x = 10, y = 20;
		permut(x,y);
		System.out.println("x = "+x);
		System.out.println("y = "+y);*/

	}

}
