package chapter1;

public class TestVoiture {

	public static void main(String[] args) {
		String ch = null;
		System.out.println(ch.length());
		Voiture v1 = new Voiture();
		Voiture v2 = new Voiture();
		Voiture v3 = new Voiture();
		
		v1 = v2;
		v3 = null;
		System.gc();//appel au garbage collector
		
		
		System.out.println("Suite du programme");
		for(int i=0; i<500;i++)
		{
			System.out.println("i = "+i);
		}

	}

}
