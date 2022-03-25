package chapter5.Polymorphisme;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal();
		Oiseau o = new Oiseau();
		
		Oiseau o2 = new Oiseau();
		a=o2;
		//a = o;
		o = (Oiseau)a;
		System.out.println("Fin du programme");

	}

}
